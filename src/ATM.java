
import java.util.*;

class Account{
    private int CN;
    private int PN;
    
    void setCustomerNumber(int cn){ // setter
        CN = cn;
    }

    void setPINNumber(int pn){ // setter
        PN = pn;
    }

    int getCustomerNumber(){ //getter
        return CN;
    }

    int getPINNumber(){ // getter
        return PN;
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
        setPINNumber(sc.nextInt());

        int P = getCustomerNumber();
        int Q = getPINNumber();

        if (data.containsKey(P) && data.get(P) == Q) {
            System.out.println("login successful");
        }
        else{
            System.out.println("wrong");
        }
    }
}



public class ATM extends OptionMenu{
    public static void main(String[] args) throws Exception {
        OptionMenu op = new OptionMenu();
        op.getLogin();
    }
}
