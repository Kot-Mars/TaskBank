import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<Integer> balance;

    public Bank() {
        this.balance = new ArrayList<>();
    }
    public ArrayList<Integer> getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance.add(balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(balance, bank.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}
