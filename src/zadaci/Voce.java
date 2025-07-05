package zadaci;

public class Voce implements Comparable<Voce> {
	private String naziv;
	private double zapremina;
	public Voce(String naziv, double zapremina) {
		this.naziv = naziv;
		this.zapremina = zapremina;
	}
	public double getZapremina() {
		return zapremina;
	}
	@Override
	public String toString() {
		return "Voce" + naziv + " ima zapremina=" + getZapremina();
	}
	@Override
	public int compareTo(Voce o) {
		// TODO Auto-generated method stub
		return Double.compare(this.zapremina, o.getZapremina());
	}
	
	
	
	
}
