import json


class RobotDataReader:

    def __init__(self):
        """
        Constructor for robot data reader
        """
        with open("robot_data.json", "r") as file:
            self.data = json.load(file)
        self.robots = self.data['robots']
        self.circuits = self.data['circuits']

    def parse_circuit(self, circuit_name):
        """
        Parses circuit's straights and obstacles
        Arguments:
            circuit_name: the name of the circuit
        Returns:
            A tuple with the straights and the obstacles
        """
        straights = []
        obstacles = []
        for circuit in self.circuits:
            if circuit_name == circuit['name']:
                if circuit['name'] == circuit_name:
                    if 'parts' in circuit:
                        straights = self.__read_straights(circuit['parts'])
                    if 'obstacles' in circuit:
                        obstacles = self.__read_obstacles(circuit['obstacles'])
        return (straights, obstacles)

    def __read_straights(self, parts):
        """
        Reads the straights from the file
        Arguments:
            parts: the straights with the orientation
            an the length
        Returns:
            A list with the straights orientation and length
        """
        straights = []
        for part in parts:
            straights.append(
                {
                    part['orient']: part['dist']
                }
            )
        return straights

    def __read_obstacles(self, obstacles):
        """
        Reads the obstacles from the file
        Arguments:
            obstacles: a map with the obstacles, whose
            keys are x, y, width and height
        Returns:
            A list with the obstacle properties
        """
        list_obs = []
        for obs in obstacles:
            list_obs.append(
                obs
            )
        return list_obs


if __name__ == "__main__":
    RobotDataReader()