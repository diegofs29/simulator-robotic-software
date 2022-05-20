import simulator.libraries.standard as standard
import simulator.libraries.serial as Serial
boton_pin = 8
X_pin = 14
Y_pin = 15

def setup():
	Serial.begin(9600)
	standard.pin_mode(boton_pin, 2)

def loop():
	Serial.print("Boton pulsado:")
	Serial.println(standard.digital_read(boton_pin))
	valorX = standard.analog_read(X_pin)
	Serial.print("X: ")
	Serial.println(valorX)
	valorY = standard.analog_read(Y_pin)
	Serial.print("Y: ")
	Serial.println(valorY)
	standard.delay(100)
