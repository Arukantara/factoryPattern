package dssfactory.dssfactory;

public class SegundaGuerraMundial extends Guerra {

	@Override
	public Avion crearAvion() {
		return new AvionSegundaGM();
	}

}
