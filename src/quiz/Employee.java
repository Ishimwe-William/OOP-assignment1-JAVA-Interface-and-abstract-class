package quiz;

public class Employee {
    private int id;
    private double salary;
    private int years;

    private String overdraftResponse;

    public String getOverdraftResponse() {
        return overdraftResponse;
    }

    public void setOverdraftResponse(String overdraftResponse) {
        this.overdraftResponse = overdraftResponse;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
