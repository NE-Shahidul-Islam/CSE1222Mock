package q1;

public class director extends  supervisor{

    public director(String name, double wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        return "Director Name: " + getName() + ", Division: " + getDivision() + ", Wage: $" + getWage();
    }
}
