
import java.text.DecimalFormat;
import java.util.*;
import jdk.jshell.TypePrinter;

class Account {

    Scanner sc = new Scanner(System.in);

    DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
    DecimalFormat df2 = new DecimalFormat("###,##0.00' Doller'");

    private int CN;
    private int PN;

    double CB = 2000;
    double SB = 1000;

    void setCustomerNumber(int cn) { // setter
        CN = cn;
    }

    void setPINNumber(int pn) { // setter
        PN = pn;
    }

    int getCustomerNumber() { //getter
        return CN;
    }

    int getPINNumber() { // getter
        return PN;
    }

    void getCurrentBalance(){
        System.out.println("\nCurrent Account Balance: " + df1.format(CB));
    }

    void getSavingBalance(){
        System.out.println("\nSaving Account Balance: " + df2.format(SB));
    }

    void getCurrentWithdrawInput(){
        System.out.println("\nCurrent Account Balance: " + df1.format(CB));
        System.out.print("\nEnter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if ((CB - amount) >= 0){ // CB >= amount
            System.out.println("\nTransaction Successfull.");
            calcCurrentWithdraw(amount);
            System.out.println("New Current Account Balance: " + df1.format(CB));
        }
        else{
            System.err.println("\nInsufficient Balance\n");
        }
    }

    double calcCurrentWithdraw(double amt){
        CB = CB - amt;
        return CB;
    }
}

class OptionMenu extends Account {

    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void getLogin() {
        do {
            try {
                data.put(11111, 111);
                data.put(11112, 222);
                data.put(11113, 333);
                data.put(11114, 444);
                data.put(11115, 111);

                System.out.println("Welcome to the RCOEM ATM");

                System.out.print("\nEnter Custormer Number  : ");
                setCustomerNumber(sc.nextInt());

                System.out.print("Enter PIN Number        : ");
                setPINNumber(sc.nextInt());

                int P = getCustomerNumber();
                int Q = getPINNumber();

                if (data.containsKey(P) && data.get(P) == Q) {
                    getAccountType();
                } else {
                    System.err.println("\nWrong Customer Number or PIN Number");
                    System.out.println("Enter the VALID Customer Number or PIN Number \n");
                }
            } catch (InputMismatchException e) {
                System.err.println("\nEnter Only Numbers.");
                System.out.println("Characters and Symbols not allowed.\n");
                sc.next();
            }
        } while (true);

    }

    void getAccountType() {
        System.out.println("\nACCOUNT TYPE");
        System.out.println("\nType 1: Current Account");
        System.out.println("Type 2: Saving Account");
        System.out.println("Type 3: Exit");
        System.out.print("\nChoice :");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("\nThank you for VISITING");
                System.out.println("VISIT AGAIN\n");
                break;
            default:
                System.err.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                getAccountType(); // Recursion
                break;
        }
    }

    void getCurrent(){
        System.out.println("\nCURRENT ACCOUNT");
        System.out.println("\nType 1: Balance Enquiry");
        System.out.println("Type 2: Withdraw Money");
        System.out.println("Type 3: Deposit Money");
        System.out.println("Type 4: Exit");
        System.out.print("\nChoice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                getCurrentBalance();
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("\nThank you for VISITING");
                System.out.println("VISIT AGAIN\n");
                break;
            default:
                System.err.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                getCurrent(); // Recursion
                break;
        }
    }

    void getSaving(){
        System.out.println("\nSAVING ACCOUNT");
        System.out.println("\nType 1: Balance Enquiry");
        System.out.println("Type 2: Withdraw Money");
        System.out.println("Type 3: Deposit Money");
        System.out.println("Type 4: Exit");
        System.out.print("\nChoice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                getSavingBalance();
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("\nThank you for VISITING");
                System.out.println("VISIT AGAIN\n");
                break;
            default:
                System.err.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                getSaving(); // Recursion
                break;
        }
    }
}

public class ATM extends OptionMenu {

    public static void main(String[] args) throws Exception {
        OptionMenu op = new OptionMenu();
        op.getLogin();
    }
}
