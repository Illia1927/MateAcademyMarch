package mate.academy.homework10.ex2.robot;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean moved = false;
        for (int i = 0; i < 3 && !moved; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                moved = true;
            } catch (RobotConnectionException e) {
                System.err.println("Connection :" + (i + 1) + " failed...");
            }
        }
        if (moved == false) {
            throw new RobotConnectionException("Connection failed...");
        }
    }
}
