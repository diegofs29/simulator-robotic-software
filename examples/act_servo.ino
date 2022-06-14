#include <Servo.h>

Servo servo;

void setup(){
 Serial.begin(9600);
 servo.attach(8);
}

void loop(){
 Serial.println("Enviar: giro en sentido 1");
 servo.write(0);
}