package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String niNumber, double salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public double payBonus(){
        return this.salary * 0.02;
    }
}
