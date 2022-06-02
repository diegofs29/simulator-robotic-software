import libraries.standard as standard
import libraries.serial as Serial
import libraries.string as String
import gui.screen_updater as screen_updater
import libraries.servo as Servo


NO_LINEA = 0
LINEA = 1
MAX_COUNTER = 2
BACKWARD = String.String("B")
LEFT = String.String("L")
RIGHT = String.String("R")
FORWARD = String.String("F")
GOAL = String.String("G")
TURN_AROUND_TIME = 1500
QUARTER_BACK_TIME = 750
EXTRA_FORWARD_TIME = 225
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

countGoal = 0
scanPaths = True
perfectPath = []

iteratorPath = 0
memory = String.String("")
oldMemory = []


def setup():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	Serial.begin(9600)
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
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	readIRSensor()
	if scanPaths:
		if (((irSensorValues[0] == NO_LINEA) and (irSensorValues[3] == NO_LINEA)) and ((irSensorValues[1] == LINEA) or (irSensorValues[2] == LINEA))):
			forward()
		elif ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == NO_LINEA)) and (irSensorValues[2] == NO_LINEA)) and (irSensorValues[3] == NO_LINEA)):
			turnAround()
		elif ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == NO_LINEA)):
			detectTurnLeft()
		elif ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
			forwardMotor1(EXTRA_FORWARD_TIME)
			readIRSensor()
			memory.concat(RIGHT)
			turnRight()
		elif ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
			detectCrossOrGoal()
	elif not scanPaths:
		if (((irSensorValues[0] == NO_LINEA) and (irSensorValues[3] == NO_LINEA)) and ((irSensorValues[1] == LINEA) or (irSensorValues[2] == LINEA))):
			forward()
		elif (((irSensorValues[0] == LINEA) or (irSensorValues[3] == LINEA)) and ((irSensorValues[1] == LINEA) and (irSensorValues[2] == LINEA))):
			forwardMotor1(EXTRA_FORWARD_TIME)
			match perfectPath[iteratorPath]:
				case 'R':
					turnRight()
				case 'F':
					forwardMotor1(EXTRA_FORWARD_TIME)
				case 'L':
					turnLeft()
				case 'G':
					stopMotor()
					standard.exit(0)

			iteratorPath += 1
	Serial.print(String.String("memory: "))
	Serial.println(memory)

def readIRSensor():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	irSensorValues[0] = standard.digital_read(pinIrIzqIzq)
	irSensorValues[1] = standard.digital_read(pinIrIzq)
	irSensorValues[2] = standard.digital_read(pinIrDer)
	irSensorValues[3] = standard.digital_read(pinIrDerDer)

def forward():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
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
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	servoIzq.write(90)
	servoDer.write(90)

def forwardMotor():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	servoIzq.write(0)
	servoDer.write(180)

def forwardMotor1(xTime = 0):
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	forwardMotor()
	standard.delay(xTime)
	stopMotor()

def backwardMotor():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	servoIzq.write(180)
	servoDer.write(0)

def backwardMotor1(xTime = 0):
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	backwardMotor()
	standard.delay(xTime)

def turnAround():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	stopMotor()
	memory.concat(BACKWARD)
	servoIzq.write(0)
	servoDer.write(0)
	standard.delay(TURN_AROUND_TIME)
	forward()

def detectTurnRight():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	stopMotor()
	forwardMotor1(EXTRA_FORWARD_TIME)
	stopMotor()
	readIRSensor()
	if ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == NO_LINEA)):
		memory.concat(RIGHT)
		turnRight()
	elif ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == NO_LINEA)) and (irSensorValues[2] == NO_LINEA)) and (irSensorValues[3] == NO_LINEA)):
		memory.concat(RIGHT)
		turnRight()

def turnRight():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	servoIzq.write(0)
	servoDer.write(0)
	standard.delay(QUARTER_BACK_TIME)
	forward()

def detectTurnLeft():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	stopMotor()
	forwardMotor1(EXTRA_FORWARD_TIME)
	readIRSensor()
	if ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == NO_LINEA)):
		memory.concat(FORWARD)
		forward()
	elif ((((irSensorValues[0] == NO_LINEA) and (irSensorValues[1] == NO_LINEA)) and (irSensorValues[2] == NO_LINEA)) and (irSensorValues[3] == NO_LINEA)):
		memory.concat(LEFT)
		turnLeft()

def turnLeft():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	servoIzq.write(180)
	servoDer.write(180)
	standard.delay(QUARTER_BACK_TIME)
	forward()

def detectCrossOrGoal():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	stopMotor()
	forwardMotor1(EXTRA_FORWARD_TIME)
	readIRSensor()
	if ((((irSensorValues[0] == LINEA) and (irSensorValues[1] == LINEA)) and (irSensorValues[2] == LINEA)) and (irSensorValues[3] == LINEA)):
		memory.concat(GOAL)
		finish()
	else:
		memory.concat(RIGHT)
		turnRight()

def finish():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	stopMotor()
	simplifyPath()
	doPerfectPath()
	standard.delay(10000)

def simplifyPath():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	startSize = memory.length()
	oldMemory = memory.to_char_array(oldMemory, MEMORY_SPACE)
	memory.replace(((RIGHT + BACKWARD) + RIGHT), FORWARD)
	memory.replace(((RIGHT + BACKWARD) + FORWARD), LEFT)
	memory.replace(((RIGHT + BACKWARD) + LEFT), BACKWARD)
	memory.replace(((FORWARD + BACKWARD) + RIGHT), LEFT)
	memory.replace(((FORWARD + BACKWARD) + FORWARD), BACKWARD)
	memory.replace(((FORWARD + BACKWARD) + LEFT), RIGHT)
	memory.replace(((LEFT + BACKWARD) + RIGHT), BACKWARD)
	memory.replace(((LEFT + BACKWARD) + FORWARD), RIGHT)
	memory.replace(((LEFT + BACKWARD) + LEFT), FORWARD)
	if (startSize > memory.length()):
		simplifyPath()

def doPerfectPath():
	global NO_LINEA
	global LINEA
	global MAX_COUNTER
	global BACKWARD
	global LEFT
	global RIGHT
	global FORWARD
	global GOAL
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
	global irSensorValues
	global countGoal
	global scanPaths
	global perfectPath
	global iteratorPath
	global memory
	global oldMemory
	scanPaths = False
	perfectPath = memory.to_char_array(perfectPath, MEMORY_SPACE)
