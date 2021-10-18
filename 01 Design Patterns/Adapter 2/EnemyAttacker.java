// The class which the client expects to work with.
// It is the Adapter's job to make new classes compatible with this interface being created here (Target).
public interface EnemyAttacker {

    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);

}
