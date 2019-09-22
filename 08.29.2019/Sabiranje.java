package domaci08292019;

public class Sabiranje extends BinarnaOperacija{
	public Sabiranje(Izraz levi, Izraz desni) {
		super(levi, desni);
	}

	public double izracunaj() {
		double vrednostLevogIzraza = levi.izracunaj();
		double vrednostDesnogIzraza = desni.izracunaj();
		return vrednostLevogIzraza + vrednostDesnogIzraza;
	}

}
