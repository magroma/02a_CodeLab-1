public class Konto {

    private int kontostand;
    private int kontoNummer;
    private String kontoOwner;

    public Konto (int kontostand, int kontoNummer, String kontoOwner) {
        this.kontostand = kontostand;
        this.kontoNummer = kontoNummer;
        this.kontoOwner = kontoOwner;
    }

    public String account() {
        return Integer.toString(this.kontostand);
    }
    public String accountNr() {
        return Integer.toString(this.kontoNummer);
    }

    public String owner() {
        return this.kontoOwner;        
    }


    // public String acountData(String checkStr) {
    //     switch (checkStr) {
    //         case "#stand":
    //         return Integer.toString(this.kontostand);
    //         case "#knummer":
    //         return Integer.toString(this.kontoNummer);
    //         case "#owner":
    //         return this.kontoOwner;
        
    //         default:
    //             break;
    //     }
    // }
        
}
