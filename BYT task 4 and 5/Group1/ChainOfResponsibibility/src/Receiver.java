public class Receiver {

    MathHandler add = new AddHandler();
    MathHandler sub = new SubtractHandler();
    MathHandler mul = new MulHandler();
    MathHandler div = new DivHandler();
    public Receiver(){



        add.setNextInChain(sub);
        sub.setNextInChain(mul);
        mul.setNextInChain(div);
    }
    void sendRequest(Request r){
        add.calculate(r);
    }
}
