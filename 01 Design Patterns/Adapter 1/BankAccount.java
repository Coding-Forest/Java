public class BankAccount {
    private String accountNo;
    private String bankName;
    private String IFSCNo;
    private String cityName;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCNo() {
        return IFSCNo;
    }

    public void setIFSCNo(String IFSCNo) {
        this.IFSCNo = IFSCNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", IFSCNo='" + IFSCNo + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
