import simulator.libraries.servo as servo


NO_LINEA = 0
LINEA = 1
servoIzq: servo.Servo = None
servoDer: servo.Servo = None
pinAnalog = 14
pinIrDer = 3
pinIrIzq = 2
pinServoDer = 9
pinServoIzq = 8
global_arr_3d = [[1, 2, 3], [4, 5, 6], [7, 8, 8], [10, 11, 12]], [[13, 14, 15], [16, 17, 18], [19, 20, 21], [22, 23, 24]]

def setup():
	pinMode(pinIrDer, 0)
	pinMode(pinIrIzq, 0)
	servoIzq.attach(pinServoIzq)
	servoDer.attach(pinServoDer)

def loop():
	if digitalRead(pinIrIzq) == LINEA and digitalRead(pinIrDer) == LINEA:
		avanzar(90)
	elif digitalRead(pinIrIzq) == NO_LINEA and digitalRead(pinIrDer) == NO_LINEA:
		espiral()
		izquierda(30)
	elif digitalRead(pinIrDer) == NO_LINEA:
		derecha(30)
	else:
		izquierda(30)

def detener():
	servoIzq.write(90)
	servoDer.write(90)

def avanzar(v):
	velocidadI = 90 - v
	servoIzq.write(velocidadI)
	velocidadD = 90 + v
	servoDer.write(velocidadD)

def retroceder(v):
	velocidadI = 90 + v
	servoIzq.write(velocidadI)
	velocidadD = 90 - v
	servoDer.write(velocidadD)

def derecha(v):
	velocidad = 90 + v
	servoDer.write(velocidad)
	servoIzq.write(velocidad)

def espiral():
	perdido = True
	tiempoEspiral = 1000
	while perdido:
		avanzar(90)
		inicioCuentaTiempo = millis()
		while millis() - inicioCuentaTiempo <= tiempoEspiral:
			if digitalRead(pinIrIzq) == LINEA or digitalRead(pinIrDer) == LINEA:
				perdido = False
				detener()
				break
		if perdido:
			tiempoEspiral += 1000
			derecha(30)
			delay(850)

def izquierda(v):
	velocidad = 90 - v
	servoDer.write(velocidad)
	servoIzq.write(velocidad)
