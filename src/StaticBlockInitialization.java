public class StaticBlockInitialization {

    private static StaticBlockInitialization staticBlockInit = null;

    static {
        try {
            staticBlockInit = new StaticBlockInitialization();
        }
        catch (Exception e) {
            throw new RuntimeException("Exception in creating singleton object");
        }
    }

    private StaticBlockInitialization() {
        System.out.println("Object getting created via static block initialization");
    }

    public static StaticBlockInitialization getStaticBlockInit() {
        System.out.println("Static instance of StaticBlockInitialization is returned");
        return staticBlockInit;
    }

}

 /*
 * static block initialization implementation is similar to eager initialization,
 * except that instance of the class is created in the static block
 * that provides the option for exception handling.
 *
 * object initializes at the time of load.
 */