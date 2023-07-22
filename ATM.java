package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Atm_interfac{
    public static double available_balance=0;
    double withdraw;
    double deposit;
    int account_number;
    double money;
    Scanner vv = new Scanner(System.in);
    Map <Double, String> transaction_history = new HashMap<>();


    public  void deposit() {
        System.out.println("Your available balance is :"+available_balance);
        System.out.println("Enter the amount you have to deposit :");
        deposit = vv.nextDouble();
        available_balance=available_balance + deposit;
        System.out.println(deposit + " Rs. deposited successfully");
        System.out.println("your available balnace is now :"+available_balance);
        transaction_history.put(deposit, "Amount Deposited");
    }

    public  void witdraw() {
        System.out.println("There is your available balance :"+available_balance);
        System.out.println("you want withdraw money is :");
        withdraw = vv.nextDouble();
        if(withdraw > available_balance) {
            System.out.println("you haven't withdraw your money");
        }
        else {
            available_balance-=withdraw;
            System.out.println("you withdraw money is :"+withdraw);
            System.out.println("your current balance is :"+available_balance);
            transaction_history.put(withdraw, "Amount Transferred to account ");
        }
    }
    public  void transfer() {
        System.out.println("you have to transfer money in accountnumber:");
        account_number=vv.nextInt();
        System.out.println("The money is :");
        money = vv.nextDouble();
        available_balance=available_balance-money;
        System.out.println("you have transfer "+money+" money in the account_number "+account_number);
        transaction_history.put(money, "Amount Transferred to account ");
    }
    public  void transaction_history() {
        System.out.println("Your Account Transaction History : ");
        for(Map.Entry<Double, String> m:transaction_history.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("you have total left amount is :"+available_balance);
//		System.out.println("you withdraw the amount is :"+withdraw);
//		System.out.println("you have transfer "+money+" in the account in the " +account_number);
    }
    public  void Quit() {
        System.out.println("you are disclosed the ATM");
        System.exit(0);
    }
}
class vivin{
    public static void roh() {
        Atm_interfac at = new Atm_interfac();
        Scanner l = new Scanner(System.in);
        while(true) {
            System.out.println("1. deposit. \n2. withdraw.  \n3. Transfer. \n4. Transaction History. \n5. Exit.");
            System.out.println("enter the choise:");
            int choise=l.nextInt();

            switch(choise) {
                case 1:
                    at.deposit();
                    break;
                case 2:
                    at.witdraw();
                    break;
                case 3:
                    at.transfer();
                    break;
                case 4:
                    at.transaction_history();
                    break;
                case 5:
                    at.Quit();
                    break;
                default:
                    System.out.println("please enter the valid choise");
            }
        }
    }

}

public class ATM {
    public static void main (String[]args) {
        String c;
        int i=0;
        Scanner ss = new Scanner(System.in);
        System.out.println("*ATM MACHINE*");
        System.out.println("enter the Username:");
        c=ss.next();
        System.out.println("enter the Pinnumber:");
        i = ss.nextInt();
        if(i==1234) {
            System.out.println("You are entered in ATM :");
            vivin y = new vivin();
            y.roh();
        }
        else {
            System.out.println("your entered detail is incorrect");
            System.exit(0);
        }
    }

}