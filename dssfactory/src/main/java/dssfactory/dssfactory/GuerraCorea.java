package dssfactory.dssfactory;

public class GuerraCorea extends Guerra {

	@Override
	public Avion crearAvion() {
		return new AvionGuerraCorea();
	}

}
