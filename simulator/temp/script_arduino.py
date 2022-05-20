import simulator.libraries.standard as standard
import simulator.libraries.serial as Serial

def setup():
	Serial.begin(9600)
	standard.pin_mode(6, 0)

def loop():
	Serial.print("Sensor Crash: ")
	Serial.println(standard.digital_read(9))
