public class CheakBalance implements Runnable {
    private int balance;

    public CheakBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        if (balance > 600000)
            System.out.println(Thread.currentThread().getName() + " " + "Ваш счёт заблокирован из-за больших денег. На нем было "
                    + balance + " рублей");
        else System.out.println(Thread.currentThread().getName() + " " + "Счёт прошел проверку на нем " + balance + " рублей");
    }
}
