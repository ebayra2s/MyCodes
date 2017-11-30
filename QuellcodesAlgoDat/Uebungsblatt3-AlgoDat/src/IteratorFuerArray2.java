/**
 * @author ebayra2s
 */

import java.util.Iterator;

public class IteratorFuerArray2<T> implements Iterator<T> {

	private T[][] array2;
	private boolean istZeilenweise;
	private boolean istVorwaerts;
	private int zStart;
	private int sStart;
	private int zPos;
	private int sPos;
	private int size;
	int anzahl;

	public IteratorFuerArray2(T[][] a) {
		this(a, true, true, 0, 0);
	}

	public IteratorFuerArray2(T[][] a, boolean iZ) {
		this(a, iZ, true, 0, 0);
	}

	public IteratorFuerArray2(T[][] a, boolean iZ, boolean iV) {
		array2 = a;
		istZeilenweise = iZ;
		istVorwaerts = iV;
		if (iV) {
			zPos = zStart = 0;
			sPos = sStart = 0;
		} else {
			zPos = zStart = array2.length - 1;
			sPos = sStart = array2[0].length - 1;
		}
		size = array2.length * array2[0].length;
		anzahl = 0;

	}

	public IteratorFuerArray2(T[][] a, boolean iZ, boolean iV, int zS, int sS) {
		array2 = a;
		istZeilenweise = iZ;
		istVorwaerts = iV;
		zPos = zStart = zS;
		sPos = sStart = sS;
		size = array2.length * array2[0].length;
		anzahl = 0;

	}

	@Override
	public boolean hasNext() {
		
		return (anzahl < size);
	}

	@Override
	public T next() {
		
		try {
			if (hasNext()) {
				return (auslese());
			}
		} catch (IndexOutOfBoundsException e) {
		}
		throw new java.util.NoSuchElementException();
	}

	public T auslese() {
		int zNext;
		int sNext;
		if (istZeilenweise) {
			if (istVorwaerts) {
				if (sPos == array2[0].length - 1) {
					sNext = 0;
					if (zPos == array2.length - 1) {
						zNext = 0;
					} else {
						zNext = zPos + 1;
					}
				} else {
					sNext = sPos + 1;
					if (zPos == array2.length - 1) {
						zNext = zPos;
					} else {
						zNext = zPos;
					}
				}
			} else {
				if (sPos == 0) {
					sNext = array2[0].length - 1;
					if (zPos == 0) {
						zNext = array2.length - 1;
					} else {
						zNext = zPos - 1;
					}
				} else {
					sNext = sPos - 1;
					if (zPos == 0) {
						zNext = zPos;
					} else {
						zNext = zPos;
					}
				}
			}
		} else {
			if (istVorwaerts) {
				if (zPos == array2.length - 1) {
					zNext = 0;
					if (sPos == array2[0].length - 1) {
						sNext = 0;
					} else {
						sNext = sPos + 1;
					}
				} else {
					zNext = zPos + 1;
					if (sPos == array2[0].length - 1) {
						sNext = sPos;
					} else {
						sNext = sPos;
					}
				}
			} else {
				if (zPos == 0) {
					zNext = array2.length - 1;
					if (sPos == 0) {
						sNext = array2[0].length - 1;
					} else {
						sNext = sPos - 1;
					}
				} else {
					zNext = zPos - 1;
					if (sPos == 0) {
						sNext = sPos;
					} else {
						sNext = sPos;
					}
				}
			}
		}
		int zPosalt = zPos;
		int sPosalt = sPos;
		zPos = zNext;
		sPos = sNext;
		anzahl++;
		return array2[zPosalt][sPosalt];
	}

}
