package se_02;

public class Zeit {
	int minute;
	int stunde;

	int adds;

	public Zeit(int stunde, int minute) {
		this.stunde = stunde;
		this.minute = minute;

		if (this.minute > 59) {
			adds = (minute / 60);
			this.minute %= 60;
			this.stunde += adds;
		}
	}

	public int stunden() {
		 if (this.minute > 59) {
		 adds = (minute / 60);
		 this.minute %= 60;
		 this.stunde += adds;
		 }

		if (this.stunde > 23) {
			this.stunde %= 24;
		}

		return this.stunde;
	}

	public int minuten() {
		if (this.minute > 59) {
			adds = (minute / 60);
			this.minute %= 60;
			this.stunde += adds;
		}

		return this.minute;
	}

	void add(Zeit other) {

		this.minute += other.minute;
		this.stunde += other.stunde;

		if (this.minute > 59) {
			adds = (minute / 60);
			this.minute %= 60;
			this.stunde += adds;
		}
	}

	@Override
	public String toString() {
		this.stunde %= 24;
		String s = "";
		String m = "";

		if (this.stunde < 10) {
			s += "0";
		}

		if (this.minute < 10) {
			m += "0";
		}

		return s + this.stunde + ":" + m + this.minute;
	}

	@Override
	public boolean equals(Object other) {
		if (other.getClass() != Zeit.class)
			return false;
		return this.minute == ((Zeit) other).minute && this.stunde == ((Zeit) other).stunde;
	}

}
