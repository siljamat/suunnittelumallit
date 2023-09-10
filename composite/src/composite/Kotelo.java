package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa{

	int hinta = 5;
	
	List<Laiteosa> osat = new ArrayList<>();

	public void lisaaOsa(Laiteosa laiteosa) {
		osat.add(laiteosa);
	}

	public int annaHinta() {
		int hintaYht = 0;
		for(Laiteosa l: osat) {
			hintaYht += l.annaHinta();
		}
		System.out.println("Kotelon hinta: " + hinta);
		return hintaYht + hinta;
	}
	
	

}
