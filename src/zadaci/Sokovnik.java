package zadaci;

public class Sokovnik implements Kontejner, Cediljka {
	private double ukupnaZapremina;
	private int brojVoca;
	private Voce[] voce;
	
	
	
	public Sokovnik(double ukupnaZapremina, int brojVoca, Voce[] voce) {
		super();
		this.ukupnaZapremina = ukupnaZapremina;
		this.brojVoca = 0;
		this.voce = new Voce[voce.length];
		
		double ubaceno = 0.0;
		
		for (int i = 0; i < voce.length && ubaceno + 
				voce[brojVoca].getZapremina() <= ukupnaZapremina; i++)
			if (voce[i] instanceof Jabuka &&
				((Jabuka) voce[i]).isCrvljiva()) {
				continue;
			} else {
				this.voce[brojVoca++] = voce[i];
				ubaceno += voce[i].getZapremina();
			
		}
	}
	@Override
	public void cedi() {
		System.out.println("Cedim...");
		int i = 0;
		while (i < brojVoca && voce[i] != null) {
			System.out.println(voce[i++]);
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public double zapremina() {
		// TODO Auto-generated method stub
		return ukupnaZapremina;
	}
	@Override
	public int komada() {
		// TODO Auto-generated method stub
		return brojVoca;
	}

}
