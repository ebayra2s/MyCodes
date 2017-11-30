/**
 * @author ebayra2s
 */

public class BaumAVL<T extends Comparable<T>> {
	private class Knoten {
		private Knoten l; // linker Teilbaum
		private Knoten r; // rechter Teilbaum
		private int b; // hoehe(linker TB) - hoehe(rechter TB)
		private T v; // Wert am Knoten

		public Knoten(T v) {
			this.v = v;
		}
	}

	private Knoten w; // Wurzel

	// wie in BaumBinaer:
	public boolean isEmpty() {
		return w == null;
	}

	private int hoehe(Knoten k) {
		return k == null ? 0 : 1 + Math.max(hoehe(k.l), hoehe(k.r));
	}

	public int hoehe() {
		return hoehe(w);
	}

	private int total(Knoten k) {
		// diese Methode ist unvollstaendig und daher so nicht funktionsfaehig
		throw new UnsupportedOperationException();
	}

	// wie in BaumSuch:
	public T element() {
		// diese Methode ist unvollstaendig und daher so nicht funktionsfaehig
		throw new UnsupportedOperationException();
	}

	public boolean contains(T v) {
		Knoten k = w;
		while (k != null) {
			int c = k.v.compareTo(v);
			if (c == 0) { // Element gefunden
				return true;
			} else if (c > 0) { // falls k.v > v,
				k = k.l; // dann v im linken Teilbaum
			} else { // falls k.v < v,
				k = k.r; // dann v im rechten Teilbaum
			}
		}
		return false;
	}

	public boolean insert(T v) {
		return insert(w, null, false, v) >= 0;
	}

	/**
	 * rekursives Einfuegen in einen Teilbaum
	 * 
	 * @k der Wurzelknoten des Baumes bzw. Teilbaums, in den eingefuegt wird
	 * @m Mutterknoten von k, k ist linkes oder rechtes Kind von m
	 * @istLinks gibt an, ob k das linke Kind der Mutter ist - sonst oder fuer
	 *           Wurzel: false
	 * @v der einzufuegende Wert
	 * @return -1, falls Element bereits vorhanden; 1, falls der Teilbaum durch
	 *         das Einfuegen hoeher geworden ist; 0 sonst
	 */
	private int insert(Knoten k, Knoten m, boolean istLinks, T v) {
		if (k == null) { // an leerem Teilbaum angekommen
			k = new Knoten(v); // dann wird hier ein neuer Knoten erzeugt
			if (m == null) { // nur moeglich, wenn w==null, also Baum leer
				w = k; // dann besteht der Baum jetzt aus genau einem Knoten
			} // ansonsten muessen wir untersuchen, ob der neue Knoten
			else if (istLinks) { // linkes oder rechtes Kind seiner Mutter wird.
				m.l = k;
			} else {
				m.r = k;
			}
			return 1; // Teilbaum mit k als Wurzel ist gewachsen
		}

		// Wenn wir hier angekommen sind, gilt k != null.

		int c = k.v.compareTo(v);
		if (c == 0) { // Wert v schon im Baum vorhanden
			return -1; // kein Einfuegen, keine Hoehenaenderung
		} else if (c > 0) { // k.v > v => in linken Teilbaum einfuegen
			int r = insert(k.l, k, true, v);
			if (r == 1) { // Wenn sich die Hoehe des Teilbaums aendert,
				k.b++; // erhoeht sich der balance-Wert von k.
			} else { // sonst keine Einfuegung bzw. keine Hoehenaenderung
				return r; // im Teilbaum (kein Ausgleich bei k noetig)
			}
		} else { // k.v < v => in rechten Teilbaum einfuegen
			int r = insert(k.r, k, false, v);
			if (r == 1) { // Wenn sich die Hoehe des Teilbaums aendert,
				k.b--; // verringert sich der balance-Wert von k.
			} else { // sonst keine Einfuegung bzw. keine Hoehenaenderung
				return r; // im Teilbaum (kein Ausgleich bei k noetig)
			}
		}

		// Die Hoehe des Teilbaumes, in den eingefuegt wurde, ist gewachsen.

		if (k.b == 0) { // Baum balanciert => Fall 2
			return 0; // Hoehe des Baumes mit Wurzel k ist gleich geblieben
		}

		if (k.b == 1 || k.b == -1) { // AVL Kriterium noch erfuellt => Fall 1
			return 1; // Hoehe des Baumes mit Wurzel k ist gewachsen
		}

		// Wenn wir hier angekommen sind, ist die Hoehe des Baumes mit k als
		// Wurzel erhoeht,
		// und das AVL-Kriterium ist verletzt => Fall 3

		if (k.b == 2) { // der linke Teilbaum ist hoeher als der rechte
			if (k.l.b == 1) {
				rotateLL(k, m); // Fall 3a
			} else if (k.l.b == -1) {
				rotateLR(k, m); // Fall 3b
			} else {
				assert false : "Illegaler Zustand im AVL-Baum";
			}
		} else if (k.b == -2) { // der rechte Teilbaum ist hoeher als der linke
			if (k.r.b == -1) {
				rotateRR(k, m); // Fall symmetrisch zu 3a
			} else if (k.r.b == 1) {
				rotateRL(k, m); // Fall symmetrisch zu 3b
			} else {
				assert false : "Illegaler Zustand im AVL-Baum";
			}
		} else {
			assert false : "Illegaler Zustand im AVL-Baum";
		}

		// Ausgleichsrotationen fuehren beim Einfuegen stets dazu, dass der
		// Teilbaum mit
		// k als Wurzel nicht gewachsen ist.
		return 0;
	}

	public boolean remove(T v) {
		return remove(w, null, false, null, v) >= 0;
	}

	/**
	 * rekursives Entfernen aus einem Teilbaum
	 * 
	 * @k der Wurzelknoten des Baumes bzw. Teilbaums, aus dem entfernt wird
	 * @m Mutterknoten von k, k ist linkes oder rechtes Kind von m
	 * @istLinks gibt an, ob k das linke Kind der Mutter ist - sonst oder fuer
	 *           Wurzel: false
	 * @kAlt zu entfernender innerer Knoten (in Fall (c) des Entfernens aus
	 *       einem Suchbaum)
	 * @v der zu entfernende Wert
	 * @return -1, falls Element nicht vorhanden; 1, falls der Teilbaum durch
	 *         das Entfernen niedriger geworden ist; 0 sonst
	 */
	private int remove(Knoten k, Knoten m, boolean istLinks, Knoten kAlt, T v) {
		if (k == null) { // an leerem Teilbaum angekommen
			return -1; // Element nicht vorhanden: fertig, keine Hoehenaenderung
		}

		// Wenn wir hier angekommen sind, gilt k != null.

		if (kAlt != null) { // zum Ersetzen groesstes Element des Teilbaums
							// loeschen
			if (k.r == null) { // k enthaelt groesstes Element, wird entfernt
				// k ist Blatt oder hat links Blatt als Kind
				kAlt.v = k.v; // ueberschreibe zu loeschenden Wert
				// m ist nicht null, da wir im linken Teilbaum von kAlt sind
				if (m == kAlt) {
					m.l = k.l; // k ist linkes Kind von kAlt
				} else {
					m.r = k.l; // k liegt auf rechtem Pfad im linken Teilbaum
				}
				return 1; // Hoehe des Teilbaums hat sich geaendert
			} else { // suche weiter nach groesstem Element
				int r = remove(k.r, k, false, kAlt, null);
				if (r == 1) { // aendert sich Hoehe des Teilbaums,
					// <hier Code einfuegen>
				} else {
					return r; // Element nicht vorhanden oder Hoehe ist gleich
								// geblieben
				}
			}
		} else { // v suchen und entfernen
			int c = k.v.compareTo(v);
			if (c == 0) { // Wert v gefunden
				if (k.l == null || k.r == null) { // k ist Blatt oder hat nur 1
													// Kind
					Knoten kind = (k.l == null) ? k.r : k.l;
					if (m == null) { // k ist w
						w = kind;
					} else { // k hat Mutter
						if (istLinks) {
							m.l = kind;
						} else {
							m.r = kind;
						}
					}
					return 1; // Hoehe des Teilbaums hat sich geaendert
				} else { // k hat 2 Teilbaeume => Fall (c)
					// entferne den groessten Wert im linken Teilbaum
					// Verbesserungsmoeglichkeit: entferne kleinsten Wert im
					// rechten, falls dieser hoeher ist
					int r = remove(k.l, k, true, k, null);
					if (r == 1) { // aendert sich Hoehe des Teilbaums,
						k.b--; // verringert sich der balance-Wert von k.
					} else {
						return r; // Hoehe des Baumes mit Wurzel k ist gleich
									// geblieben
					}
				}
			} else if (c > 0) { // k.v > v => aus linkem Teilbaum entfernen
				int r = remove(k.l, k, true, null, v);
				if (r == 1) { // Wenn sich die Hoehe des Teilbaums aendert,
					k.b--; // verringert sich der balance-Wert von k.
				} else {
					return r; // Hoehe des Baumes mit Wurzel k ist gleich
								// geblieben
				}
			} else { // k.v < v => aus rechtem Teilbaum entfernen
				// <hier Code einfuegen>
			}
		}

		// Die Hoehe des Teilbaumes, aus dem entfernt wurde, hat sich
		// verringert.

		if (k.b == 0) { // Baum balanciert => Fall 2
			// <hier Code einfuegen>
		}

		if (k.b == 1 || k.b == -1) { // AVL Kriterium noch erfuellt => Fall 1
			// <hier Code einfuegen>
		}

		// Das AVL-Kriterium ist verletzt => Fall 3

		// Fall 3a/b/c
		if (k.b == 2) { // der linke Teilbaum ist hoeher als der rechte
			if (k.l.b == 1) {
				rotateLL(k, m); // Fall 3a
			} else if (k.l.b == -1) {
				rotateLR(k, m); // Fall 3b
			} else if (k.l.b == 0) {
				rotateLL(k, m); // Fall 3c
				return 0; // keine Hoehenaenderung fuer Teilbaum mit Wurzel k
			} else {
				assert false : "Illegaler Zustand im AVL-Baum";
			}
		} else if (k.b == -2) { // der rechte Teilbaum ist hoeher als der linke
			// <hier Code einfuegen>
		} else {
			assert false : "Illegaler Zustand im AVL-Baum";
		}

		// Ausgleichsrotationen (ausser fuer Fall 3c) fuehren beim Entfernen
		// stets dazu, dass sich die
		// Hoehe des Teilbaum mit k als Wurzel verringert.
		return 1;
	}

	private void rotateLL(Knoten k, Knoten m) { // Fall 3a/c
		Knoten v = k.l;
		Knoten a1 = v.l;
		Knoten a2 = v.r;
		Knoten b = k.r;

		if (m == null) { // wenn Rotation an Wurzel
			w = v; // dann haben wir jetzt eine neue Wurzel
		} else if (k == m.l) { // ansonsten hat m ein neues linkes oder rechtes
								// Kind
			m.l = v;
		} else {
			m.r = v;
		}

		// Verweise umhaengen
		v.r = k;
		v.l = a1;
		k.l = a2;
		k.r = b;

		if (v.b == 1) { // Fall 3a
			v.b = 0; // beide Teilbaeume sind jetzt ausgeglichen
			k.b = 0;
		} else if (v.b == 0) { // Fall 3c
			v.b = -1;
			k.b = 1;
		} else {
			assert false : "Illegaler Zustand im AVL-Baum";
		}
	}

	private void rotateRR(Knoten k, Knoten m) { // symmetrisch zu Fall 3a/c
		Knoten v = k.r;
		Knoten a1 = v.r;
		Knoten a2 = v.l;
		Knoten b = k.l;

		if (m == null) {
			w = v;
		} else if (k == m.r) {
			m.r = v;
		} else {
			m.l = v;
		}

		v.l = k;
		v.r = a1;
		k.r = a2;
		k.l = b;

		if (v.b == 1) { // Fall 3a
			v.b = 0; // beide Teilbaeume sind jetzt ausgeglichen
			k.b = 0;
		} else if (v.b == 0) { // Fall 3c
			v.b = -1;
			k.b = 1;
		} else {
			assert false : "Illegaler Zustand im AVL-Baum";
		}

	}

	private void rotateLR(Knoten k, Knoten m) { // Fall 3b
		Knoten v = k.l;
		Knoten u = v.r;
		Knoten a1 = v.l;
		Knoten a2 = u.l;
		Knoten a3 = u.r;
		Knoten b = k.r;
		int bAlt = u.b; // alte balance von u sichern, da u sich aendert

		if (m == null) { // wenn Rotation an Wurzel
			w = u; // dann haben wir jetzt eine neue Wurzel
		} else if (k == m.l) { // ansonsten hat m ein neues linkes oder rechtes
								// Kind
			m.l = u;
		} else {
			m.r = u;
		}

		u.l = v;
		u.r = k;
		v.l = a1;
		v.r = a2;
		k.l = a3;
		k.r = b;

		switch (bAlt) {
		case 0: // hoehe(A2)=hoehe(A3)=h-1
			v.b = 0;
			k.b = 0;
			break;
		case 1: // hoehe(A2)=h-1, hoehe(A3)=h-2
			v.b = 0;
			k.b = -1;
			break;
		case -1: // hoehe(A2)=h-2, hoehe(A3)=h-1
			v.b = 1;
			k.b = 0;
			break;
		}
		u.b = 0;
	}

	private void rotateRL(Knoten k, Knoten m) { // symmetrisch zu Fall 3b
		// <hier Code einfuegen>
		Knoten v = k.r;
		Knoten u = v.l;
		Knoten a1 = v.r;
		Knoten a2 = u.r;
		Knoten a3 = u.l;
		Knoten b = k.l;
		int bAlt = u.b; // alte balance von u sichern, da u sich aendert

		if (m == null) { // wenn Rotation an Wurzel
			w = u; // dann haben wir jetzt eine neue Wurzel
		} else if (k == m.r) { // ansonsten hat m ein neues linkes oder rechtes
								// Kind
			m.r = u;
		} else {
			m.l = u;
		}

		u.r = v;
		u.l = k;
		v.r = a1;
		v.l = a2;
		k.r = a3;
		k.l = b;

		switch (bAlt) {
		case 0: // hoehe(A2)=hoehe(A3)=h-1
			v.b = 0;
			k.b = 0;
			break;
		case 1: // hoehe(A2)=h-1, hoehe(A3)=h-2
			v.b = 0;
			k.b = -1;
			break;
		case -1: // hoehe(A2)=h-2, hoehe(A3)=h-1
			v.b = 1;
			k.b = 0;
			break;
		}
		u.b = 0;
	}
	// <hier Methode toString einfuegen>

	public String toString() {
		if (w.l == null && w.r == null) {
			return "(()" + w.v + "())";
		} else if (w.l == null && w.r != null) {
			return "(()" + w.v + "(" + w.l.v + "))";
		}
		return "((" + w.r.v + ")" + w.v + "())";
	}

}
