public class BillPughInitialization {

    private BillPughInitialization() {
        System.out.println("Object getting created via Bill Pugh initialization");
    }

    //static inner class, its object will not be created during load time

    private static class BillPughSingleton {
        private static final BillPughInitialization INSTANCE = new BillPughInitialization();
    }

    public static BillPughInitialization getBillPughInit() {
        System.out.println("Static instance of BillPughInitialization is returned");
        return BillPughSingleton.INSTANCE;
    }

}
 /*
 * Notice the private inner static class that contains the instance of the
 * singleton class. When the singleton class is loaded, BillPughSingleton class
 * is not loaded into memory and only when someone calls the getBillPughInit() method,
 * this class gets loaded and creates the singleton class instance
 */