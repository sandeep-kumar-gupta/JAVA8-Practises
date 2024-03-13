package SingletonDesignPattern.BillPugh;

public class Singlton {

    private Singlton(){}
    private static class SingletonHolder{
        private static final Singlton INSTANCE = new Singlton();
    }
    public static Singlton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
