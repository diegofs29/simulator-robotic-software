#include <Servo.h>

int NO_LINEA = LOW; // También podría ponerse 0
int LINEA = HIGH; // También podría ponerse 1

int TURN_AROUND_TIME = 650;
int QUARTER_BACK_TIME = 625;
int EXTRA_FORWARD_TIME = 200;
int MEMORY_SPACE = 100;

Servo servoIzq;
Servo servoDer;

int pinIrIzqIzq = 10;
int pinIrIzq = 2;
int pinIrDer = 3;
int pinIrDerDer = 11;

int pinServoDer = 9;
int pinServoIzq = 8;

int irSensorValues[] = {LOW, LOW, LOW, LOW};

boolean scanPaths = true;
char perfectPath[100];
int iteratorPath = 0;

void setup(){
  //Serial.begin(9600); // Descomentar si queréis debuguear por consola
  pinMode(pinIrDer, INPUT);
  pinMode(pinIrIzq, INPUT);
  
  servoIzq.attach(pinServoIzq);
  servoDer.attach(pinServoDer);

  stopMotor();

  delay(5000);
  forward();
}

void loop(){
  readIRSensor();
  
  if(irSensorValues[0] == NO_LINEA && irSensorValues[3] == NO_LINEA && (irSensorValues[1] == LINEA || irSensorValues[2] == LINEA)){ // Avanzar por la linea corrigiendo trayectoria
    forward();
  }else if(irSensorValues[1] == NO_LINEA && irSensorValues[2] == NO_LINEA){ // Sin salida, luego media vuelta
    stopMotor();
    turnAround();    
  }else if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == NO_LINEA){ // Cruce izquierda y de frente
    forward(); // De frente pq es la regla de la mano derecha, sino sería aqui otra acción
  }else if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Cruce derecha y de frente
    turnRight(); // De frente pq es la regla de la mano derecha, sino sería aqui otra acción
  }else if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Cruce derecha, izquierda; derecha, izquierda y de frente; y meta    
    detectGoal();    
  }
}

void readIRSensor(){
  irSensorValues[0] = digitalRead(pinIrIzqIzq);
  irSensorValues[1] = digitalRead(pinIrIzq);
  irSensorValues[2] = digitalRead(pinIrDer);
  irSensorValues[3] = digitalRead(pinIrDerDer);
}

/**
 * Función que hace que se mantenga sobre la línea haciendo correciones y si se sale del todo, detiene el motor
 */
void forward(){
  if(digitalRead(pinIrIzq) == NO_LINEA && digitalRead(pinIrDer) == NO_LINEA){
    stopMotor();
  }else if(digitalRead(pinIrIzq) == NO_LINEA && digitalRead(pinIrDer) == LINEA){
    servoIzq.write(0); 
    servoDer.write(90);
  }else if(digitalRead(pinIrIzq) == LINEA && digitalRead(pinIrDer) == NO_LINEA){
    servoIzq.write(90); 
    servoDer.write(180);
  }else if (digitalRead(pinIrIzq) == LINEA || digitalRead(pinIrDer) == LINEA){
    forwardMotor();
  }
}

void stopMotor(){
  servoIzq.write(90); 
  servoDer.write(90);
}

void forwardMotor(){
  servoIzq.write(0); 
  servoDer.write(180);
}

void forwardMotor(int xTime){
  forwardMotor();
  delay(xTime);
}

void backwardMotor(){
  servoIzq.write(180); 
  servoDer.write(0);
}

void backwardMotor(int xTime){
  backwardMotor();
  delay(xTime);
}

/**
 * Media vuelta girando hacia la derecha
 */
void turnAround(){
  servoIzq.write(0); 
  servoDer.write(0);
  delay(TURN_AROUND_TIME); // Media vuelta
  forward();
}

void turnRight(){
  forwardMotor(EXTRA_FORWARD_TIME);
  servoIzq.write(0); 
  servoDer.write(0);
  delay(QUARTER_BACK_TIME); // Un cuarto de vuelta
  forward();
}

void turnLeft(){
  forwardMotor(EXTRA_FORWARD_TIME);
  servoIzq.write(180); 
  servoDer.write(180);
  delay(QUARTER_BACK_TIME); // Un cuarto de vuelta
  forward();
}

/**
 * Comprueba si es o no la meta y para ello mueve un poco hacia adelante el robot para así detectar si hay más lineas (depende del ancho del camino, claro). Si no hay es cruce, y si hay, es meta
 * Si es la meta añade GOAL y llama a finish()
 * Si no es la meta, mueve el robot hacia atrás, añade un right y gira a la derecha, pues es cruce de 4 caminos
 */
void detectGoal(){
  stopMotor();
  forwardMotor(EXTRA_FORWARD_TIME);
  readIRSensor();
  if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Meta
    finish();    
  }else{ // Cruce derecha e izquierda o derecha, izquierda y de frente
    backwardMotor(EXTRA_FORWARD_TIME);
    turnRight();
  }
}

void finish(){
  stopMotor();
  exit(0);
}


