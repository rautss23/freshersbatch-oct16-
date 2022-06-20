package assignment2;

abstract class bank {
	abstract public void disp();

}

class savingsAccount extends bank {
	double bal;
	double fd;

	public savingsAccount(double bal, double fd) {
		this.bal = bal;
		this.fd = fd;
	}

	public void disp() {
		System.out.println("Total money in Savings Account:" + (bal + fd));

	}

	public double get() {
		return bal + fd;
	}
}

class currentAccount extends bank {
	double bal;
	double cc;

	public currentAccount(double bal, double cc) {
		this.bal = bal;
		this.cc = cc;
	}

	public void disp() {
		System.out.println("Total money in Current Account:" + (bal + cc));
	}

	public double get() {
		return bal + cc;
	}
}

public class Problem3 {
	public static void main(String[] args) {
		savingsAccount sa = new savingsAccount(30000, 5675);
		currentAccount ca = new currentAccount(568775, 66465);
		sa.disp();
		ca.disp();
		double totalAmount = sa.get() + ca.get();
		System.out.println("Total money in bank:" + totalAmount);
	}

}
