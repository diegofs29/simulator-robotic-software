import simulator.libraries.standard as standard
import simulator.libraries.serial as Serial
import simulator.gui.screen_updater as screen_updater

def setup():
	pass

def loop():
	s = "hola"
	Serial.print(s[1])
