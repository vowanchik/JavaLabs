class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Пополнение на сумму " + amount + " руб. Баланс: " + balance + " руб.");
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие на сумму " + amount + " руб. Баланс: " + balance + " руб.");
        } else {
            System.out.println("Недостаточно денежных средств на счете.");
        }
    }
}

class BankThread implements Runnable {
    private final BankAccount account;

    public BankThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int amount = generateRandomAmount();
                if (Math.random() < 0.5) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private int generateRandomAmount() {
        return (int) (Math.random() * 100) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        BankThread thread1 = new BankThread(account);
        BankThread thread2 = new BankThread(account);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}