public class App {
    public static void main(String[] args) {
        
        Konto konto1 = new Konto (10000*2,1234567,"Karl Heinz");
        ausgabe(konto1.account());
        ausgabe(konto1.accountNr());
        ausgabe(konto1.owner());

        Konto konto2 = new Konto(10000*3,2345678,"Heinz Karl");
        ausgabe(konto2.account());
        ausgabe(konto2.accountNr());
        ausgabe(konto2.owner());
        
        Konto konto3 = new Konto(10000*10,3456789,"Harl Keinz");
        ausgabe(konto3.account());
        ausgabe(konto3.accountNr());
        ausgabe(konto3.owner());
    }
    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);  
    }
}

