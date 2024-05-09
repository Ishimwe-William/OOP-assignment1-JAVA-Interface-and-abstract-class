package intefaces.q4;

class SavingsAccount implements Account {
    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public double viewBalance() {
        return 0;
    }

    public void savingMethod(){
        System.out.println("custom saving method");
    }
}
