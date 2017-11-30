/**
 * @author ebayra2s
 */

public abstract class Person {
	private final String name;
	private int alter;
	private int groesse;
	private int gewicht;
	
	private static int anzahl;

	public Person(String name, int alter, int groesse, int gewicht) {
		this.name = name;
		this.alter = alter;
		this.groesse = groesse;
		this.gewicht = gewicht;
		
		anzahl++;
	}
	
	
	public abstract int preisHaarschnitt() ;
	public abstract String chromosomen();
	
	public String name() {
		return this.getName();
	}

	public int alter() {
		return this.getAlter();
	}

	public static int volljaehrigkeitsAlter() {
		return 18;
	}

	public boolean istVolljaehrig() {
		if (this.getAlter() >= volljaehrigkeitsAlter()) {
			return true;
		}

		return false;
	}
	
	public String toString() {
		return this.getName() + " " + chromosomen() + " " + this.getAlter() + " " + istVolljaehrig() + " " + groesse() + " " + gewicht() + " "
				+ preisHaarschnitt();
	}
	
	public static int anzahl(){
		return anzahl;
	}

	public int groesse() {
		return this.groesse;
	}


	public int gewicht() {
		return this.gewicht;
	}


	public int getAlter() {
		return alter;
	}

	public String getName() {
		return name;
	}
	
}
