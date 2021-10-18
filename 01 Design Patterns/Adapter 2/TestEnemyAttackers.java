public class TestEnemyAttackers {
    public static void main(String[] args) {

        EnemyTank m1917 = new EnemyTank();
        EnemyRobot steveTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(steveTheRobot);

        // Robot is a robot.
        System.out.println("The Robot");
        steveTheRobot.reactToHuman("Derek");
        steveTheRobot.smashWithHands();
        steveTheRobot.walkForward();

        // Tank implemented Attacker interface (tank) and is a tank.
        System.out.println("\nThe Enemy Tank");
        m1917.assignDriver("Frank");
        m1917.driveForward();
        m1917.fireWeapon();

        // Adapter implemented Attacker interface (tank) but functions like a Robot.
        System.out.println("\nThe Robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
