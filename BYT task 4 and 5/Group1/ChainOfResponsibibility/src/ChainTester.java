import java.util.Scanner;

public class ChainTester {

    public static void main(String args[]) {

        //Scanner op = new Scanner(System.in);
        //System.out.println("Enter the operation :");
        //char opr = op.next().charAt(0);
        Request r = new Request(10, 5, '+');
        Receiver rec = new Receiver();
        rec.sendRequest(r);
    }
}
