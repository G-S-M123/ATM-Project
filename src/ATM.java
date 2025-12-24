
import java.util.Scanner;

class Account{
    int CN;
    void setCustomerNumber(int cn){
        CN = cn;
    }
}
class OptionMenu extends Account{
    Scanner sc = new Scanner(System.in);
    void getLogin(){
        System.out.println("Welcome to the RCOEM ATM");
        System.out.print("\nEnter Custormer Number: ");
        setCustomerNumber(sc.nextInt());
    }
}



public class ATM extends OptionMenu{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
