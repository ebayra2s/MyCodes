
public class Tag {

	private String was;
	private int prioritaet;

	public Tag() {

		this(null, 0);
	}

	public Tag(String was, int prioritaet) {
		this.was = was;
		this.prioritaet = prioritaet;
	}

	public void eintragen(String was, int prioritaet) {

		this.was = was;
		this.prioritaet = prioritaet;

	}

	public String getVerabredung() {
		return was;
	}

	public int getPrioritaet() {
		return prioritaet;
	}

}
