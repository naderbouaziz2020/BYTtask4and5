public class TemplateMethodTester {

    public static void main(String args[]){
        Tea t = new Tea();
        t.prepare();

        Coffee c = new Coffee();
        c.prepare();
    }
}
