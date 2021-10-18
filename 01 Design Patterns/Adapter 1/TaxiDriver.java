// this is the actual class that will be used
// during registration.
public class TaxiDriver implements Driver{
    private String carNo;
    private Integer licenseNo;
    private BankAccount bankAccount;

    @Override
    public String getCarNo() {
        return null;
    }

    @Override
    public Integer getLicenseNo() {
        return null;
    }

    @Override
    public BankAccount getBankACcount() {
        return null;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public void setLicenseNo(Integer licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
