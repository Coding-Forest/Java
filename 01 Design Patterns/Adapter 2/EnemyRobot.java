import java.util.Random;

// adaptee class
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " damage with its hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " units");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot tramps on " + driverName);
    }

}
