package domaci08292019;

public abstract class BinarnaOperacija {
	protected Izraz levi, desni;

	public BinarnaOperacija(Izraz levi, Izraz desni) {
		this.levi = levi;
		this.desni = desni;
	}

}
