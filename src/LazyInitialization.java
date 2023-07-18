public class LazyInitialization {

    private static LazyInitialization lazyInit = null;

    private LazyInitialization() {
        System.out.println("Object getting created via lazy initialization");
    }

    public static LazyInitialization getLazyInit() {
        System.out.println("Static instance of LazyInitialization is returned");
        if(lazyInit == null) {
            lazyInit = new LazyInitialization();
        }
        return lazyInit;
    }

}
 /*
 * instead of initializing an object or a value at the time of declaration,
 * you can defer it until the point of use. This way, you can save memory and
 * processing time, and avoid errors or exceptions that might occur during initialization.
 *
 * shortcoming comes when multiple threads invoke getters, create multiple instances
 * which violates singleton property
 */