package dssfactory.dssfactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Guerra g1 = new PrimeraGuerraMundial();
        Guerra g2 = new SegundaGuerraMundial();
        Guerra gc = new GuerraCorea();
        
        Avion a1 = g1.crearAvion();
        Avion a2 = g2.crearAvion();
        Avion ac = gc.crearAvion();
        
        a1.draw();
        a1.weapon();
        a2.draw();
        a2.weapon();
        ac.draw();
        ac.weapon();
    }
}
