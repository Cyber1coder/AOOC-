import java.util.Scanner;

class BankAccount 
{
    int accBlc;
    Scanner sc = new Scanner(System.in); 

    void deposit() {
        System.out.println("Enter amount you want to deposit");
        accBlc = sc.nextInt();
    }
    void withdraw() {
        System.out.println("Enter amount you want to withdraw");
        int wamt = sc.nextInt();
        if (accBlc >= wamt) 
	    {
            accBlc -= wamt;
            System.out.println("Your amount is withdraw: " + accBlc);
        } else 
	    {
            System.out.println("Insufficient balance");
        }
    }
}
class SavingAccount extends BankAccount {
    void withdraw() {
        System.out.println("Enter amount you want to withdraw");
        int wamt = sc.nextInt();
        if (accBlc < 100) {
            System.out.println("You cannot withdraw amount. you require atleast 100 rupees on your account");
        } else if (accBlc >= wamt) {
            accBlc -= wamt;
            System.out.println("Your amount is withdraw " + accBlc);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Bank {
    public static void main(String args[]) {
        SavingAccount sv = new SavingAccount();
        sv.deposit();
        sv.withdraw();
    }
}