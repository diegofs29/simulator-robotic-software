#include <Servo.h>

int NO_LINEA = LOW; // También podría ponerse 0
int LINEA = HIGH; // También podría ponerse 1

int MAX_COUNTER = 2; // Valor máximo de detecciones inválidas del contador

String BACKWARD = "B";
String LEFT = "L";
String RIGHT = "R";
String FORWARD = "F";
String GOAL = "G";

int TURN_AROUND_TIME = 1250;
int QUARTER_BACK_TIME = 625;
int EXTRA_FORWARD_TIME = 200; // Este tiempo, si es alto, hace que se salte el cruce y que tenga problemas en la detección de la meta, si es bajo, da problemas de giro y detecta como meta cualquier cruce de 3/4
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

int countGoal = 0;

boolean scanPaths = true;
char perfectPath[100];
int iteratorPath = 0;

String memory = "";
char oldMemory[100];

void setup(){
  /*scanPaths = false;//
  memory = "RFFLG";//
  memory.toCharArray(perfectPath, MEMORY_SPACE);*/
  Serial.begin(9600); // Descomentar si queréis debuguear por consola
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

  if(scanPaths){
    if(irSensorValues[0] == NO_LINEA &&  irSensorValues[3] == NO_LINEA && (irSensorValues[1] == LINEA || irSensorValues[2] == LINEA)){ // Avanzar por la linea corrigiendo trayectoria
      forward();
    }else if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == NO_LINEA && irSensorValues[2] == NO_LINEA && irSensorValues[3] == NO_LINEA){ // Sin salida, luego media vuelta
      turnAround();
    }else if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == NO_LINEA){ // Curva izquierda, o Cruce izquierda y de frente
      detectTurnLeft(); // Este va mal
    }else if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Curva derecha, o Cruce derecha y de frente
      forwardMotor(EXTRA_FORWARD_TIME);
      readIRSensor();
      memory.concat(RIGHT);
      turnRight();
      //detectTurnRight();
    }else if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Cruce derecha e izquierda; derecha, izquierda y de frente; o meta/salida
      detectCrossOrGoal();
    }
  }else if(!scanPaths){
    if(irSensorValues[0] == NO_LINEA && irSensorValues[3] == NO_LINEA && (irSensorValues[1] == LINEA || irSensorValues[2] == LINEA)){ // Avanzar por la linea corrigiendo trayectoria
      forward();
    }else if((irSensorValues[0] == LINEA || irSensorValues[3] == LINEA) && (irSensorValues[1] == LINEA && irSensorValues[2] == LINEA)){ // Detecta cruce, pero no giro normal (no contemplado, pues no se guardan pq es seguir la línea)
      // Pues cuando hago la detección los muevo hacia adelante para concoer los cruces, pero eso no lo hago en los métodos de giro
      forwardMotor(EXTRA_FORWARD_TIME);
      switch(perfectPath[iteratorPath]){        
        case 'R':
          turnRight();
          break;
        case 'F':          
          forwardMotor(EXTRA_FORWARD_TIME); // Si hago un forward normal, detecta un cruce extra en el cruce de 4 y hay problemas, por eso el del tiempo
          break;
        case 'L':
          turnLeft();
          break;        
        case 'G':
          stopMotor();
          exit(0); // Termina el programa
          break;
      }
      iteratorPath++;
    }
  }
  Serial.print("memory: ");
  Serial.println(memory);
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
  if(digitalRead(pinIrIzq) == NO_LINEA && digitalRead(pinIrDer) == NO_LINEA){ // Esta comprobación tal vez podría suprimirse, pues ya se verifica antes y se para
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
  stopMotor();
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
  stopMotor();
  memory.concat(BACKWARD);
  servoIzq.write(0); 
  servoDer.write(0);
  delay(TURN_AROUND_TIME); // Media vuelta
  forward();
}

// funciona mal, corregirlo, aunq tiene lógica
void detectTurnRight(){
  stopMotor(); // Posible necesario, pq si no sigue de frente en el cruce
  forwardMotor(EXTRA_FORWARD_TIME);
  stopMotor(); // Posible necesario, pq si no sigue de frente en el cruce
  readIRSensor();
  if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == NO_LINEA){ // Cruce derecha o de frente
    memory.concat(RIGHT);
    turnRight(); // Derecha pq es la regla de la mano derecha, sino sería aqui otra acción   
  }else if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == NO_LINEA && irSensorValues[2] == NO_LINEA && irSensorValues[3] == NO_LINEA){ // Curva derecha
    memory.concat(RIGHT); // Es seguir el camino, luego, pero como puede llevar a un sin salida, hay que guardarlo ¿o no? El gaurdarlo o no peude llevar a más reglas de simplificación
    turnRight();
  }
}

void turnRight(){
  servoIzq.write(0); 
  servoDer.write(0);
  delay(QUARTER_BACK_TIME); // Un cuarto de vuelta
  forward();
}

void detectTurnLeft(){
  stopMotor(); // Posible necesario por lo mismo que en detectTurnRight
  forwardMotor(EXTRA_FORWARD_TIME);
  readIRSensor();
  if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == NO_LINEA){ // Cruce izquierda o de frente
    memory.concat(FORWARD);
    forward(); // De frente pq es la regla de la mano derecha, sino sería aqui otra acción   
  }else if(irSensorValues[0] == NO_LINEA && irSensorValues[1] == NO_LINEA && irSensorValues[2] == NO_LINEA && irSensorValues[3] == NO_LINEA){ // Curva izquierda
    memory.concat(LEFT); // Es seguir el camino, luego, pero como puede llevar a un sin salida, hay que guardarlo ¿o no? El gaurdarlo o no peude llevar a más reglas de simplificación
    turnLeft();
  }
}

void turnLeft(){
  servoIzq.write(180); 
  servoDer.write(180);
  delay(QUARTER_BACK_TIME); // Un cuarto de vuelta
  forward();
}

/*
void continueForward(){
  forwardMotor(EXTRA_FORWARD_TIME);
  delay(QUARTER_BACK_TIME); // Un cuarto de vuelta
  forward();
}
*/

/**
 * Comprueba si es o no la meta y para ello mueve un poco hacia adelante el robot para así detectar si hay más lineas (depende del ancho del camino, claro). Si no hay es cruce, y si hay, es meta
 * Si es la meta añade GOAL y llama a finish()
 * Si no es la meta, mueve el robot hacia atrás, añade un right y gira a la derecha, pues es cruce de 4 caminos
 */
void detectCrossOrGoal(){
  stopMotor(); // Posible necesario, pq si no sigue de frente en el cruce
  forwardMotor(EXTRA_FORWARD_TIME);  
  readIRSensor();  
  if(irSensorValues[0] == LINEA && irSensorValues[1] == LINEA && irSensorValues[2] == LINEA && irSensorValues[3] == LINEA){ // Meta/Salida
    memory.concat(GOAL);
    finish();
  }else{ // Cruce derecha e izquierda o derecha, izquierda y de frente
    memory.concat(RIGHT); 
    turnRight();    
  }
}

void finish(){
  stopMotor();
  simplifyPath();
  doPerfectPath();
  delay(1000);
}

/**
 * Mejor aplciar la función al final porque es donde más s epeude reducir que si se aplica después de cada pasada, pues entonces se encesitarían varias pasadas
 * Esta función es recursiva
 */
void simplifyPath(){
  // entero: rrrbfbrrrbfg
  // 1 rbf y rbf: rr L brr L g
  // 2: rr B rLg
  // 3: r F Lg
  // corto: rflg

  int startSize = memory.length();

  memory.toCharArray(oldMemory, MEMORY_SPACE);

  // Giros a la derecha
  memory.replace(RIGHT+BACKWARD+RIGHT, FORWARD);
  memory.replace(RIGHT+BACKWARD+FORWARD, LEFT);
  memory.replace(RIGHT+BACKWARD+LEFT, BACKWARD);

  // De frente  
  memory.replace(FORWARD+BACKWARD+RIGHT, LEFT);
  memory.replace(FORWARD+BACKWARD+FORWARD, BACKWARD);
  memory.replace(FORWARD+BACKWARD+LEFT, RIGHT);

  // Giros a la izquierda
  memory.replace(LEFT+BACKWARD+RIGHT, BACKWARD); // Esta puede salir por simplificación de la de RBF = L
  memory.replace(LEFT+BACKWARD+FORWARD, RIGHT);
  memory.replace(LEFT+BACKWARD+LEFT, FORWARD);

  // Otras especiales que podrían darse


  if(startSize > memory.length()){
    simplifyPath();
  }
  
}

void doPerfectPath(){  
  scanPaths = false;
  //memory = "FRFLG";//
  memory.toCharArray(perfectPath, MEMORY_SPACE);
}


