import libraries.standard as standard
import libraries.serial as Serial
import libraries.string as String
import gui.screen_updater as screen_updater

def setup():
	pass

def loop():
	Serial.flush()
	str = String.String("hola")
	str.reserve()
