package assignment2;

abstract class employee {
	abstract public void salary();
}

class manager extends employee {
	int salary, incentive;

	public manager(int salary, int incentive) {
		this.salary = salary;
		this.incentive = incentive;
	}

	public void salary() {
		System.out.println("Manager's Salary:" + (salary + incentive));

	}

	public int get() {
		return salary + incentive;
	}
}

class labour extends employee {
	int overtime;
	int labourSalary;

	public labour(int overtime, int labourSalary) {
		this.labourSalary = labourSalary;
		this.overtime = overtime;
	}

	public void salary() {
		System.out.println("Labour's Salary:" + (labourSalary + overtime));
	}

	public int get() {
		return labourSalary + overtime;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		manager m = new manager(500, 100);
		labour l = new labour(150, 50);
		m.salary();
		l.salary();
		int totalSalary = m.get() + l.get();
		System.out.println("Total Salary of all employees:" + totalSalary);
	}
}