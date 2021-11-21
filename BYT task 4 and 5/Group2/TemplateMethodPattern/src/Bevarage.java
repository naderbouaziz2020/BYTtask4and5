public abstract class Bevarage {

    final void prepare(){
        boilWater();
        addMainComponent();
        addWaterToCup();
        additions();
    }

    protected void boilWater(){
        System.out.println("Boiling Water");
    }
    protected void addWaterToCup(){
        System.out.println("Adding Boiled Water To Cup");
    }
    protected abstract void addMainComponent();
    protected abstract void additions();
}
