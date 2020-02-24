package pset1;

public class C {
	int f;

	public C(int f) {
		this.f = f;
	}

	@Override
	public boolean equals(Object o) {
		// assume this method is implemented for you
		if (o == this) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		C c = (C)o;
		return (f == c.f);
	}

	@Override
	public int hashCode() {
		// assume this method is implemented for you
		return f*31;
	}
}
