package q1;

public class supervisor extends worker {
    private String division;

    public supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    public supervisor(String name, double wage) {
        super(name, wage);
    }

    public String getDivision() {
        return division;
    }


    @Override
    public String toString() {
        return "Supervisor Name: " + getName() + ", Division: " + division + ", Wage: $" + getWage();
    }
}
