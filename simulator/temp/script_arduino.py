import simulator.libraries.standard as standard
import simulator.libraries.serial as Serial
import simulator.gui.screen_updater as screen_updater
import simulator.libraries.servo as Servo


NO_LINEA = 0
LINEA = 1
TURN_AROUND_TIME = 650
QUARTER_BACK_TIME = 625
EXTRA_FORWARD_TIME = 200
MEMORY_SPACE = 100
servoIzq = Servo.Servo(standard.board)
servoDer = Servo.Servo(standard.board)
pinIrIzqIzq = 10
pinIrIzq = 2
pinIrDer = 3
pinIrDerDer = 11
pinServoDer = 9
pinServoIzq = 8
irSensorValues = [0, 0, 0, 0]

scanPaths = True
perfectPath = []

iteratorPath = 0

def setup():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	standard.pin_mode(pinIrDer, 0)
	standard.pin_mode(pinIrIzq, 0)
	servoIzq.attach(pinServoIzq)
	servoDer.attach(pinServoDer)
	stopMotor()
	standard.delay(5000)
	forward()

def loop():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	readIRSensor()
	if (((irSensorValues[0] == NO_LINEA) and (irSensorValues[3] == NO_LINEA)) and ((irSensorValues[1] == LINEA) or (irSensorValues[2] == LINEA))):
		forward()
	elif ((irSensorValues[1] == NO_LINEA) and (irSensorValues[2] == NO_LINEA)):
		stopMotor()
		turnAround()
	elif ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == NO_LINEA)):
		forward()
	elif ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
		turnRight()
	elif ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
		detectGoal()

def readIRSensor():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	irSensorValues[0] = standard.digital_read(pinIrIzqIzq)
	irSensorValues[1] = standard.digital_read(pinIrIzq)
	irSensorValues[2] = standard.digital_read(pinIrDer)
	irSensorValues[3] = standard.digital_read(pinIrDerDer)

def forward():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	if ((standard.digital_read(pinIrIzq) == NO_LINEA) and (standard.digital_read(pinIrDer) == NO_LINEA)):
		stopMotor()
	elif ((standard.digital_read(pinIrIzq) == NO_LINEA) and (standard.digital_read(pinIrDer) == LINEA)):
		servoIzq.write(0)
		servoDer.write(90)
	elif ((standard.digital_read(pinIrIzq) == LINEA) and (standard.digital_read(pinIrDer) == NO_LINEA)):
		servoIzq.write(90)
		servoDer.write(180)
	elif ((standard.digital_read(pinIrIzq) == LINEA) or (standard.digital_read(pinIrDer) == LINEA)):
		forwardMotor()

def stopMotor():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	servoIzq.write(90)
	servoDer.write(90)

def forwardMotor():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	servoIzq.write(0)
	servoDer.write(180)

def forwardMotor1(xTime = 0):
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	forwardMotor()
	standard.delay(xTime)

def backwardMotor():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	servoIzq.write(180)
	servoDer.write(0)

def backwardMotor1(xTime = 0):
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	backwardMotor()
	standard.delay(xTime)

def turnAround():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	servoIzq.write(0)
	servoDer.write(0)
	standard.delay(TURN_AROUND_TIME)
	forward()

def turnRight():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	forwardMotor1(EXTRA_FORWARD_TIME)
	servoIzq.write(0)
	servoDer.write(0)
	standard.delay(QUARTER_BACK_TIME)
	forward()

def turnLeft():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	forwardMotor1(EXTRA_FORWARD_TIME)
	servoIzq.write(180)
	servoDer.write(180)
	standard.delay(QUARTER_BACK_TIME)
	forward()

def detectGoal():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	stopMotor()
	forwardMotor1(EXTRA_FORWARD_TIME)
	readIRSensor()
	if ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
		finish()
	else:
		backwardMotor1(EXTRA_FORWARD_TIME)
		turnRight()

def finish():
	global NO_LINEA
	global LINEA
	global TURN_AROUND_TIME
	global QUARTER_BACK_TIME
	global EXTRA_FORWARD_TIME
	global MEMORY_SPACE
	global servoIzq
	global servoDer
	global pinIrIzqIzq
	global pinIrIzq
	global pinIrDer
	global pinIrDerDer
	global pinServoDer
	global pinServoIzq
	global scanPaths
	global iteratorPath
	stopMotor()
	standard.exit(0)
