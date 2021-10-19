public class UniversalChargeStation {

    public static void main(String[] args) {

        AdapterCatalogue catalogue = new AdapterCatalogue();

        PowerPlug qatarPlug = new PowerPlug(catalogue.searchCountry("Qatar"));
        PlugAdapter qatar2KoreaAdapter = new KoreaAdapter(qatarPlug);

        System.out.println(qatarPlug.toString());
        System.out.println(qatar2KoreaAdapter.toString());

    }
}


/*

PowerPlug{country = Qatar, type = G, voltage =240 V, frequency =50 Hz }
Qatar plug specs converted as follows for use in South Korea:
from 240 to 220
from 50 to 60

*/
