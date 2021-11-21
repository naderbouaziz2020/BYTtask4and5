public class SubtractHandler implements MathHandler {

    MathHandler next;

    @Override
    public void setNextInChain(MathHandler handler) {
        this.next = handler;
    }

    @Override
    public void calculate(Request request) {

        if(request.operation == '-'){
            System.out.println(request.a - request.b);
        }
        else{
            this.next.calculate(request);
        }

    }
}