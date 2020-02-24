package pset1;

public class D extends C {
	int g;

	public D(int f, int g) {
		super(f);
		this.g = g;
	}

	@Override
	public boolean equals(Object o) {
		// assume this method is implemented for you
		if (o == this) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		D d = (D)o;
		return (f == d.f && g == d.g);
	}

	@Override
	public int hashCode() {
		// assume this method is implemented for you
		return f*31 ^  g*37;
	}
}
