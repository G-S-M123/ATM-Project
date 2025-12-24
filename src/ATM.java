
import java.util.*;

class Account{
    private int CN;
    private int PN;
    
    void setCustomerNumber(int cn){
        CN = cn;
    }

    void setPinNumber(int pn){
        PN = pn;
    }
}
class OptionMenu extends Account{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void getLogin(){

        data.put(11111, 111);
        data.put(11112, 222);
        data.put(11113, 333);
        data.put(11114, 444);
        data.put(11115, 111);
        
        System.out.println("Welcome to the RCOEM ATM");

        System.out.print("\nEnter Custormer Number  : ");
        setCustomerNumber(sc.nextInt());

        System.out.print("Enter Pin Number        : ");
        setPinNumber(sc.nextInt());
    }
}



public class ATM extends OptionMenu{
    public static void main(String[] args) throws Exception {
        OptionMenu op = new OptionMenu();
        op.getLogin();
    }
}
