import java.sql.SQLOutput;


// The register registers individuals (class Person) as a driver (class Driver).
// The DriverAdapter converts the target person's attributes into a driver's attributes.
public class Register {

    public static void main(String[] args) {
        // here we create a Person object with the ability to drive.
        // The occupation is not specified here.
        Person person = new Person();
        person.setCarNo("DC3354");
        person.setLicenseNo("15425465");
        person.setBankAccount("AccountNo254, SBI, 2234, Auckland");

        // With the adaption by the DriverAdapter, the person now becomes a Driver.
        Driver driver = new DriverAdapter(person);

        System.out.println("Car no: " + driver.getCarNo());
        System.out.println("License no: " + driver.getLicenseNo());
        System.out.println("Bank name: " + driver.getBankACcount().getBankName());
        System.out.println(driver.getBankACcount());
    }
}
