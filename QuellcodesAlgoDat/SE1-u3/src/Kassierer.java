
public class Kassierer implements KassiererIF {

	float p;
	int s;
	float b;

	public Kassierer(float p, int s, float b) {
		
		this.p = Manager.getPreis();
		this.s = s;
		this.b = b;
	}

	@Override
	public float preis() {

		return p * (float) s;
	}

	@Override
	public float rueckgeld() {
		if ((b - preis()) > 0.0) {
			b -= preis();
		} else {
			b -= preis();
		}

		return b;
	}

	public String toString() {
		if (rueckgeld() < 0.0) {
			return "Noch zu zahlen: " + (-this.b);
		} else {
			return "Ihr Rueckgeld beträgt: " + this.b;
		}
	}

}
