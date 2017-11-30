
public class Manager implements ManagerIF {
	float p;

	public Manager(float p) {
		this.p = p;

	}

	@Override
	public float preis() {

		return this.p;
	}

	public float getPreis() {
		return preis();
	}

}
