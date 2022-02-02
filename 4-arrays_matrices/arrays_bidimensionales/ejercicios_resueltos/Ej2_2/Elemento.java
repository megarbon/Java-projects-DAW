package matrices.Ej2_2;

public class Elemento {
	int i, j;

	public Elemento(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "Elemento [i=" + i + ", j=" + j + "]";
	}
}
