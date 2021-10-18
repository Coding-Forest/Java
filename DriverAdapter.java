public class DriverAdapter extends TaxiDriver implements Driver {

    private Person person;

    public DriverAdapter(Person person) {
        this.person = person;
        this.adaptData();    // converts person's data into driver object's.
    }

    private void adaptData() {
        this.setCarNo(person.getCarNo());
        this.setLicenseNo(Integer.valueOf(person.getLicenseNo()));
        String[] personBankAccount = person.getBankAccount().split(",");

        BankAccount driverBankAccount = new BankAccount();
        driverBankAccount.setAccountNo(personBankAccount[0]);
        driverBankAccount.setBankName(personBankAccount[1]);
        driverBankAccount.setIFSCNo(personBankAccount[2]);
        driverBankAccount.setCityName(personBankAccount[3]);
        this.setBankAccount(driverBankAccount);
    }

    @Override
    public String getCarNo() {
        return this.person.getCarNo();
    }

    @Override
    public Integer getLicenseNo() {
        return Integer.valueOf(this.person.getLicenseNo());
    }

    @Override
    public BankAccount getBankACcount() {

        String[] personBankAccount = this.person.getBankAccount().split(",");

        BankAccount driverBankAccount = new BankAccount();
        driverBankAccount.setAccountNo(personBankAccount[0]);
        driverBankAccount.setBankName(personBankAccount[1]);
        driverBankAccount.setIFSCNo(personBankAccount[2]);
        driverBankAccount.setCityName(personBankAccount[3]);
        return driverBankAccount;
    }
}
