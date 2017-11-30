
public class BaumBinaer<T> {
	protected class Knoten {
		protected Knoten l; // linker Teilbaum
		protected Knoten r; // rechter Teilbaum
		protected T v; // Wert am Knoten

		public Knoten(T v) {
			this.v = v;
		}
	}

	protected Knoten w; // Wurzelknoten

	public BaumBinaer() {
	}

	public BaumBinaer(T v, BaumBinaer<T> bL, BaumBinaer<T> bR) {
		w = new Knoten(v);
		w.l = bL.w;
		w.r = bR.w;
	}

	public boolean isEmpty() {
		return w == null;
	}

	private int hoehe(Knoten k) {
		return k == null ? 0 : 1 + Math.max(hoehe(k.l), hoehe(k.r));
	}

	public int hoehe() {
		return hoehe(w);
	}
	// zu ergaenzen

	public int size() {

		return (int) Math.pow(2.0, (double) hoehe()) - 1;
	}

	public int total() {

		return size();
	}

}
