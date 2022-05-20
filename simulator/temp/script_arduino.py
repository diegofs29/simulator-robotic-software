import simulator.libraries.standard as standard
import simulator.libraries.serial as Serial
import simulator.libraries.servo as Servo


boton_pin = 7
sensor1 = 6
sensor2 = 5
X_pin = 14
Y_pin = 15
modo = False
estadoActual = 0
estadoAnterior = 0
s1 = 0
s2 = 0
servo = Servo.Servo(standard.board)

def setup():
	global modo
	global estadoActual
	global estadoAnterior
	global s1
	global s2
	global servo
	Serial.begin(9600)
	servo.attach(8)
	standard.pin_mode(boton_pin, 2)
	standard.pin_mode(sensor1, 0)
	standard.pin_mode(sensor2, 0)

def loop():
	global modo
	global estadoActual
	global estadoAnterior
	global s1
	global s2
	global servo
	estadoActual = standard.digital_read(boton_pin)
	s1 = standard.digital_read(6)
	s2 = standard.digital_read(5)
	if estadoActual == 0 and estadoAnterior != 0:
		if modo == 0:
			modo = 1
			servo.write(0)
		else:
			modo = 0
	estadoAnterior = estadoActual
	Serial.print("Boton pulsado:")
	Serial.println(standard.digital_read(boton_pin))
	valorX = standard.analog_read(X_pin)
	if modo == 1:
		Serial.print("Sensor Crash 1: ")
		Serial.println(standard.digital_read(sensor1))
		Serial.print("Sensor Crash 2: ")
		Serial.println(standard.digital_read(sensor2))
		if s1 == 0:
			servo.write(0)
		if s2 == 0:
			servo.write(180)
	elif modo == 0:
		if valorX < 520 and valorX > 480:
			servo.write(90)
		else:
			mapX = standard.map(valorX, 0, 1023, 0, 180)
			Serial.print("Servo: ")
			Serial.println(mapX)
			servo.write(mapX)
		Serial.print("X: ")
		Serial.println(valorX)
