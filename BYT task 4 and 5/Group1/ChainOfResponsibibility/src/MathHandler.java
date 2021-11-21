public interface MathHandler {

    public void setNextInChain(MathHandler Handler);
    public void calculate(Request request);
}
