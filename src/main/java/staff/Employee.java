package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected double salary;

    public Employee ( String name, String niNumber, double salary) {

        this.name = setName(name);
        this.niNumber = niNumber;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        if (newName != null) {
            return this.name = newName;
        }
        return this.name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment) {
        if (increment >= 0){
        this.salary += increment;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
