public class Main {
    public static void main(String[] args) {
        GeneratorBalance generatorBalance = new GeneratorBalance();
        Thread generatorThread = new Thread(generatorBalance, "Generator");
        generatorThread.start();
        Bank bank = new Bank();
        bank.setBalance(generatorBalance.getBalance());
        CheakBalance cheakBalance = new CheakBalance(bank.getBalance().get(0));
        Thread cheakThread = new Thread(cheakBalance, "Cheak");
        cheakThread.start();
    }
}
