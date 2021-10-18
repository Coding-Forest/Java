public class Person {
    private String carNo;
    private String licenseNo;
    private String bankAccount;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "carNo='" + carNo + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
}
