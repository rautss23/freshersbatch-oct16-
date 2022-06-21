package assignment2;

public class Problem1 {
	public static void main(String[] args) {
		ex object = ex.return_obj();
	}
}

class ex {
	static ex object = new ex();

	private ex() {

	}

	public static ex return_obj() {
		return object;
	}
}
