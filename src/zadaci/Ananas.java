package zadaci;

public class Ananas extends Voce {

	public Ananas(double zapremina) {
		super("Ananas", zapremina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getZapremina() {
		// TODO Auto-generated method stub
		return super.getZapremina() * 0.5;
	}
	
}
