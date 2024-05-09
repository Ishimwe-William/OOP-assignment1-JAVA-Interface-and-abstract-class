package intefaces.q4;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    void addAccount(Account account) {
        accounts.add(account);
    }
}
