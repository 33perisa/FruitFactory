package zadaci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Glavna {
	private Voce[] ucitajVoce (String fajl) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fajl));
		int n = Integer.parseInt(br.readLine().trim());
		
		Voce[] voce = new Voce[n];
		for (int i = 0; i < n; i++) {
			String[] linija = br.readLine().split(",");
			String naziv = linija[0].trim();
			double zapremina = Double.parseDouble(linija[1].trim());
			
			if(linija.length == 3) {
				boolean crvljiva = linija[2].trim().equals("da");
				voce[i] = new Jabuka (zapremina, crvljiva);
				
			}
			else if (naziv.equals("Ananas")) {
				voce[i] = new Ananas (zapremina);
		}
		else {
			voce[i] = new Voce(naziv, zapremina);
		}
	}
	br.close();
	Arrays.sort(voce);
	return voce;

}
	public static void main(String[] args) throws IOException {
		
		Sokovnik sokovnik = new Sokovnik(1, 0, new Glavna().ucitajVoce("src\\zadatak1interface\\Voce.txt,"));
		sokovnik.cedi();
		System.out.println(sokovnik.zapremina());
		System.out.println(sokovnik.komada());
		
	}
	
}
