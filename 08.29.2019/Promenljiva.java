package domaci08292019;

public class Promenljiva extends Izraz{
	private String ime;
	private int broj;

	public Promenljiva(String ime, int broj) {
		this.ime = ime;
		this.broj = broj;
	}

	@Override
	public double izracunaj() {
		return broj;
	}


}
