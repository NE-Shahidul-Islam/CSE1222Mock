package q1;

public class worker {
    private String name;
    private double wage;

    public worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return "Worker Name: " + name + ", Wage: $" + wage;
    }
}
