import simulator.libraries.standard as standard
import simulator.libraries.serial as serial
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
	standard.pin_mode(pinIrDer, 0)
	standard.pin_mode(pinIrIzq, 0)
	servoIzq.attach(pinServoIzq)
	servoDer.attach(pinServoDer)

def loop():
	if standard.digital_read(pinIrIzq) == LINEA and standard.digital_read(pinIrDer) == LINEA:
		avanzar(90)
	elif standard.digital_read(pinIrIzq) == NO_LINEA and standard.digital_read(pinIrDer) == NO_LINEA:
		espiral()
		izquierda(30)
	elif standard.digital_read(pinIrDer) == NO_LINEA:
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
		inicioCuentaTiempo = standard.millis()
		while standard.millis() - inicioCuentaTiempo <= tiempoEspiral:
			if standard.digital_read(pinIrIzq) == LINEA or standard.digital_read(pinIrDer) == LINEA:
				perdido = False
				detener()
				break
		if perdido:
			tiempoEspiral += 1000
			derecha(30)
			standard.delay(850)

def izquierda(v):
	velocidad = 90 - v
	servoDer.write(velocidad)
	servoIzq.write(velocidad)
