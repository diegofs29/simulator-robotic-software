import libraries.standard as standard
import libraries.serial as Serial
import libraries.string as String
import graphics.screen_updater as screen_updater
PWMpin = 10

def setup():
	global PWMpin
	pass

def loop():
	global PWMpin
	i = 0
	while True:
		i += 1
		j = i
		screen_updater.update()
		if (i < 5):
			break

	for i in range(k = 0(k <= 255)k += 1:
		standard.analog_write(PWMpin, k)
		standard.delay(10)
		screen_updater.update()

	var = 0
	while (var < 200):
		var += 1
		screen_updater.refresh()

	myString
	myString.reserve(26)
	standard.random_seed(standard.analog_read(0))
	Serial.write(45)
