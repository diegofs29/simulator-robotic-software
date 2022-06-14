void setup() {
 //1.-
 Serial.begin(9600);
 pinMode(6, INPUT);
}
void loop() {
 //2.-
 Serial.print("Sensor Crash: ");
 Serial.println(digitalRead(6));
}