package strings_and_dialogs;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) {
		Robot MyRobot = new Robot();
		MyRobot.setSpeed(1000);
		MyRobot.penDown();
		MyRobot.turn(35);
		MyRobot.move(200);
		MyRobot.turn(125);
		MyRobot.move(200);
		MyRobot.turn(180);
		MyRobot.move(100);
		MyRobot.turn(-60);
		MyRobot.move(400);
	}
}