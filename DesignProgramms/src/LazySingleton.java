
public class LazySingleton {
	private static LazySingleton lazyInstance;
	
	private LazySingleton() {}
	
	public static LazySingleton getLazyInstance() {
		if(lazyInstance == null) {
			lazyInstance = new LazySingleton(); 
		}
		return lazyInstance;
	}

}
