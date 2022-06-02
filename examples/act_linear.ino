#include <Servo.h>
#define boton_pin 7 // Pin digital para el botón
#define sensor1 6 // Pin digital para el botón
#define sensor2 5 // Pin digital para el botón
#define X_pin A0 // Pin analógico para leer eje X
#define Y_pin A1 // Pin analógico para leer eje Y

boolean modo;
int estadoActual;
int estadoAnterior;
int s1;
int s2;
Servo servo;

void setup(){
 Serial.begin(9600);
 servo.attach(8);
 // Inicializar pin 7 (Entrada)
 pinMode(boton_pin, INPUT_PULLUP);
 pinMode(sensor1, INPUT); 
 pinMode(sensor2, INPUT); 
}

void loop(){
 estadoActual = digitalRead(boton_pin);
 s1 = digitalRead(6);
 s2 = digitalRead(5);
 if(estadoActual == 0 && estadoAnterior != 0){
    if(modo == 0){
      modo = 1; 
      servo.write(0);
    } else{
      modo = 0;
    }
 }

 estadoAnterior = estadoActual;

 Serial.print("Boton pulsado:");
 Serial.println(digitalRead(boton_pin));

 int valorX = analogRead(X_pin); //0-1023

 if (modo == 1) { // Automatico
  Serial.print("Sensor Crash 1: ");
  Serial.println(digitalRead(sensor1));

  Serial.print("Sensor Crash 2: ");
  Serial.println(digitalRead(sensor2));

  if(s1 == 0) {
    servo.write(0);
  }
  if(s2 == 0) {
    servo.write(180);
  }

 } else if (modo == 0) { // Controlado
  if(valorX < 520 && valorX > 480){
    servo.write(90);
  } else {
    int mapX = map(valorX,0,1023,0,180);
    Serial.print("Servo: ");
    Serial.println(mapX);
    servo.write(mapX); //0-180
  }
 Serial.print("X: ");
 Serial.println(valorX);
}
}
