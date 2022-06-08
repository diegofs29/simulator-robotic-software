import libraries.standard as standard
import libraries.serial as Serial
import libraries.string as String
import graphics.screen_updater as screen_updater
import libraries.servo as Servo


NO_LINE = 0
LINE = 1
servoLeft = Servo.Servo(standard.board)
servoRight = Servo.Servo(standard.board)
pinIrCentralDer = 3
pinIrCentralIzq = 2
pinIrIzq = 10
pinIrDer = 11
pinServoRight = 9
pinServoLeft = 8

def setup():
	global NO_LINE
	global LINE
	global servoLeft
	global servoRight
	global pinIrCentralDer
	global pinIrCentralIzq
	global pinIrIzq
	global pinIrDer
	global pinServoRight
	global pinServoLeft
	Serial.begin(9600)
	standard.pin_mode(pinIrDer, 0)
	standard.pin_mode(pinIrIzq, 0)
	standard.pin_mode(pinIrCentralIzq, 0)
	standard.pin_mode(pinIrCentralDer, 0)
	servoLeft.attach(pinServoLeft)
	servoRight.attach(pinServoRight)
	standard.delay(5000)

def loop():
	global NO_LINE
	global LINE
	global servoLeft
	global servoRight
	global pinIrCentralDer
	global pinIrCentralIzq
	global pinIrIzq
	global pinIrDer
	global pinServoRight
	global pinServoLeft
	Serial.println(String.String("Sensor izq: "))
	Serial.println(standard.digital_read(pinIrIzq))
	Serial.println(String.String("Sensor der: "))
	Serial.println(standard.digital_read(pinIrDer))
	Serial.println(String.String("Sensor central izq: "))
	Serial.println(standard.digital_read(pinIrCentralIzq))
	Serial.println(String.String("Sensor central der: "))
	Serial.println(standard.digital_read(pinIrCentralDer))
	if ((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == LINE)):
		Serial.println(String.String("Hacia alante"))
		servoLeft.write(0)
		servoRight.write(180)
	if ((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == NO_LINE)):
		servoLeft.write(180)
		servoRight.write(180)
	if ((standard.digital_read(pinIrCentralIzq) == NO_LINE) and (standard.digital_read(pinIrCentralDer) == LINE)):
		servoLeft.write(0)
		servoRight.write(0)
	if ((((standard.digital_read(pinIrCentralIzq) == NO_LINE) and (standard.digital_read(pinIrCentralDer) == NO_LINE)) and (standard.digital_read(pinIrIzq) == NO_LINE)) and (standard.digital_read(pinIrDer) == NO_LINE)):
		finCamino()
	if (((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == LINE)) and (standard.digital_read(pinIrIzq) == LINE)):
		servoLeft.write(180)
		servoRight.write(180)
	if (((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == LINE)) and (standard.digital_read(pinIrDer) == LINE)):
		servoLeft.write(0)
		servoRight.write(180)
	if ((((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == LINE)) and (standard.digital_read(pinIrIzq) == LINE)) and (standard.digital_read(pinIrDer) == LINE)):
		servoLeft.write(0)
		servoRight.write(180)
		standard.delay(250)
		servoLeft.write(180)
		servoRight.write(180)
		standard.delay(300)
		if ((((standard.digital_read(pinIrCentralIzq) == LINE) and (standard.digital_read(pinIrCentralDer) == LINE)) and (standard.digital_read(pinIrIzq) == LINE)) and (standard.digital_read(pinIrDer) == LINE)):
			servoLeft.write(0)
			servoRight.write(180)
			standard.delay(200)
			servoLeft.write(90)
			servoRight.write(90)
			standard.delay(5000)
		servoLeft.write(180)
		servoRight.write(180)

def finCamino():
	global NO_LINE
	global LINE
	global servoLeft
	global servoRight
	global pinIrCentralDer
	global pinIrCentralIzq
	global pinIrIzq
	global pinIrDer
	global pinServoRight
	global pinServoLeft
	servoLeft.write(0)
	servoRight.write(0)
