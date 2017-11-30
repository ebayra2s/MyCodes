/**
 * @author ebayra2s
 */

public interface Funktion {
	boolean hatWertFuer(double x);

	double wert(double x) throws ValueOutOfRangeException;
}
