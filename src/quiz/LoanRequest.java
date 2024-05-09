package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoanRequest {
    public static void main(String[] args) {
        Overdraft overdraft = new Overdraft();
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            Employee emp = new Employee();
            System.out.println("Enter details for Employee " + i);
            emp.setId(i);
            try {
                System.out.println("Your salary: ");
                double salary = scanner.nextDouble();
                emp.setSalary(salary);

                System.out.println("How many year you want to pay this overdraft?");
                int yrs = scanner.nextInt();
                emp.setYears(yrs);
                String validatedInput = overdraft.validateInput(salary, yrs);
                ;
                if (validatedInput == null) {
                    String response = overdraft.calculateLoan(salary, yrs);
                    if (response != null) {
                        emp.setOverdraftResponse(response);
                    } else return;
                    employees.add(emp);
                } else {
                    System.out.println(validatedInput);
                    return;
                }
            } catch (Exception e) {
                System.out.println("Ensure you entered valid data in valid format!");
            }
        }

        for (Employee employee1 : employees) {
            System.out.println("Employee with " + employee1.getId() + "'s response:\n" + employee1.getOverdraftResponse());
        }
    }
}
