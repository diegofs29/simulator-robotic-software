import libraries.standard as standard
import libraries.serial as Serial
import libraries.string as String
import gui.screen_updater as screen_updater
import libraries.servo as Servo


OUTSIDE = 0
INSIDE = 1
leftServ = Servo.Servo(standard.board)
rightServ = Servo.Servo(standard.board)
RIGHT_SERV = 9
LEFT_SERV = 8
FAR_RIGHT_IR = 11
FAR_LEFT_IR = 10
RIGHT_IR = 3
LEFT_IR = 2
TRIGGER = 4
ECHO = 5

def setup():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	standard.pin_mode(RIGHT_IR, 0)
	standard.pin_mode(LEFT_IR, 0)
	standard.pin_mode(FAR_RIGHT_IR, 0)
	standard.pin_mode(FAR_LEFT_IR, 0)
	standard.pin_mode(TRIGGER, 1)
	standard.pin_mode(ECHO, 0)
	leftServ.attach(LEFT_SERV)
	rightServ.attach(RIGHT_SERV)

def loop():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	if ((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == OUTSIDE)):
		left()
	elif ((standard.digital_read(LEFT_IR) == OUTSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)):
		right()
	elif ((((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)) and (standard.digital_read(FAR_LEFT_IR) == OUTSIDE)) and (standard.digital_read(FAR_RIGHT_IR) == OUTSIDE)):
		forward()
	elif ((((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)) and (standard.digital_read(FAR_LEFT_IR) == OUTSIDE)) and (standard.digital_read(FAR_RIGHT_IR) == INSIDE)):
		stop()
		standard.delay(500)
		if ((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)):
			forward()
			standard.delay(300)
			if ((standard.digital_read(LEFT_IR) != INSIDE) and (standard.digital_read(RIGHT_IR) != INSIDE)):
				right()
				standard.delay(400)
	elif ((((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)) and (standard.digital_read(FAR_LEFT_IR) == INSIDE)) and (standard.digital_read(FAR_RIGHT_IR) == OUTSIDE)):
		stop()
		standard.delay(500)
		if (standard.digital_read(FAR_LEFT_IR) == INSIDE):
			left()
			standard.delay(400)
			forward()
			standard.delay(300)
			left()
			standard.delay(100)
		else:
			forward()
			standard.delay(300)
	elif ((((standard.digital_read(LEFT_IR) == OUTSIDE) and (standard.digital_read(RIGHT_IR) == OUTSIDE)) and (standard.digital_read(FAR_LEFT_IR) == OUTSIDE)) and (standard.digital_read(FAR_RIGHT_IR) == OUTSIDE)):
		while ((standard.digital_read(LEFT_IR) != INSIDE) and (standard.digital_read(RIGHT_IR) != INSIDE)):
			left()
			screen_updater.refresh()

	elif ((((standard.digital_read(LEFT_IR) == INSIDE) and (standard.digital_read(RIGHT_IR) == INSIDE)) and (standard.digital_read(FAR_LEFT_IR) == INSIDE)) and (standard.digital_read(FAR_RIGHT_IR) == INSIDE)):
		stop()

def forward():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	leftServ.write(0)
	rightServ.write(180)

def left():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	leftServ.write(180)
	rightServ.write(180)

def right():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	leftServ.write(0)
	rightServ.write(0)

def stop():
	global OUTSIDE
	global INSIDE
	global leftServ
	global rightServ
	global RIGHT_SERV
	global LEFT_SERV
	global FAR_RIGHT_IR
	global FAR_LEFT_IR
	global RIGHT_IR
	global LEFT_IR
	global TRIGGER
	global ECHO
	leftServ.write(90)
	rightServ.write(90)
