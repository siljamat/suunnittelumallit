package singleton;

public class Main {

	public static void main(String[] args) {
		 Asetukset asetukset = Asetukset.getInstance();

		 String kieli = asetukset.getKieli();
	     int fonttikoko = asetukset.getFonttikoko();

	     System.out.println("Sovelluksen kieli: " + kieli);
	     System.out.println("Fonttikoko: " + fonttikoko);
	
	     asetukset.setKieli("Englanti");
	     asetukset.setFonttikoko(14);

	     kieli = asetukset.getKieli();
	     fonttikoko = asetukset.getFonttikoko();

	     System.out.println("Sovelluksen kieli: " + kieli);
	     System.out.println("Fonttikoko: " + fonttikoko);
	}

}
