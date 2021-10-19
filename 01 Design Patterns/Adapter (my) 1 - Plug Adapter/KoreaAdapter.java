public class KoreaAdapter implements PlugAdapter {

    AdapterCatalogue cat = new AdapterCatalogue();
    PowerPlug koreaPlug = new PowerPlug(cat.searchCountry("Korea"));
    PowerPlug plug;

    public KoreaAdapter(PowerPlug plug) {
        this.plug = plug;
    }

    @Override
    public void convertVoltage(int voltage) {
        plug.setVoltage(koreaPlug.voltage);
    }

    @Override
    public void convertFrequency(int frequency) {
        plug.setFrequency(koreaPlug.frequency);
    }

    @Override
    public String toString() {

        String origin = plug.getCountry();
        String dest = koreaPlug.getCountry();

        return  origin + " plug specs converted as follows for use in " + dest + ":\n" +
                "from " + String.valueOf(plug.getVoltage()) + " to " + String.valueOf(koreaPlug.getVoltage()) + "\n" +
                "from " + String.valueOf(plug.getFrequency()) + " to " + String.valueOf(koreaPlug.getFrequency());
    }
}
