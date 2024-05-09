package quiz;

public class Overdraft {

    double minSalary = 800000;
    double maxSalary = 1000000;
    double interestRate = 14.5;
    int maturity = 5;


    public String validateInput(double salary, int yrs){
        if(salary < minSalary || salary > maxSalary){
            return "Salary not in range!";
        }
        if (yrs> 5 || yrs < 1){
            return "Years not in range!";
        }
        return null;
    }

    public String calculateLoan(double salary, int yrs) {
        
        return null;
    }
}
