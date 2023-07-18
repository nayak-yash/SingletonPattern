public class ThreadSafeInitialization {

    private static ThreadSafeInitialization threadSafeInit = null;

    private ThreadSafeInitialization() {
        System.out.println("Object getting created via thread safe initialization");
    }

    public static ThreadSafeInitialization getThreadSafeInit() {
        System.out.println("Static instance of ThreadSafeInitialization is returned");
        if(threadSafeInit == null) {
            synchronized (ThreadSafeInitialization.class) {
                threadSafeInit = new ThreadSafeInitialization();
            }
        }
        return threadSafeInit;
    }

}
 /*
 * when multiple threads invoke getters, if one thread has taken control
 * then other threads have to wait for getting that single instance
 *
 * system becomes slow when multiple threads access same instance
 */