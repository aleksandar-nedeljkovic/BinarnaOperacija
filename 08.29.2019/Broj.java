package domaci08292019;

public class Broj extends Izraz{
	private int vrednost;

	public Broj(int vrednost) {
		this.vrednost = vrednost;
	}

	public double izracunaj() {
		return vrednost;
	}

}
