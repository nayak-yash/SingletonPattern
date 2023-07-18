public class EagerInitialization {

    private static final EagerInitialization eagerInit
            = new EagerInitialization();

    private EagerInitialization() {
        System.out.println("Object getting created via eager initialization");
    }

    public static EagerInitialization getEagerInit() {
        System.out.println("Static instance of EagerInitialization is returned");
        return eagerInit;
    }

}

 /*
 * if we are working with an object that we know
 * will be used every time the application is started,
 * and if the object's creation is expensive, in terms of system resources,
 * then it's better to use eager instantiation.
 *
 * object initializes at the time of load.
 */