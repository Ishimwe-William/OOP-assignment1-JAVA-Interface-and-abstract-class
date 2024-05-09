package intefaces.q4;

class CurrentAccount implements Account {
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

    public void currentMethod(){
        System.out.println("custom current method");
    }
}
