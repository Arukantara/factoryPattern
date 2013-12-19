package dssfactory.dssfactory;

public class PrimeraGuerraMundial extends Guerra {

	@Override
	public Avion crearAvion() {
		return new AvionPrimeraGM();
	}

}
