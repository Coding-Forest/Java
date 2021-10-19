public class PowerPlug {

    String country;
    String type;
    int voltage;
    int frequency;

    public PowerPlug(String[] countryProfile) {
        this.country = countryProfile[0];
        this.type = countryProfile[1];
        this.voltage = Integer.parseInt(countryProfile[2].replace(" V", ""));
        this.frequency = Integer.parseInt(countryProfile[3].replace(" Hz", ""));
    }

    @Override
    public String toString() {
        return "PowerPlug{" +
                "country = " + country +
                ", type = " + type +
                ", voltage =" + voltage + " V" +
                ", frequency =" + frequency +
                " Hz }";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
