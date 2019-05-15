
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadInstance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getThreadInstance() {
		if(threadInstance == null) {
			threadInstance = new ThreadSafeSingleton();
		}
		return threadInstance;
	}
	
	// above thread safety  reduces the performances because of cost associated with the 
	// Synchronized method....
	
	
	// using double locking to avoid extra time
	
	public static ThreadSafeSingleton getThreadInstanceUsingDoubleLocking() {
		if(threadInstance == null) {
			synchronized (ThreadSafeSingleton.class) {
				threadInstance = new ThreadSafeSingleton();
			}
		}
		return threadInstance;
	}

}
