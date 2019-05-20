
public class StaticBlockSingleton {
	private static StaticBlockSingleton staticInstance;
	
	private StaticBlockSingleton() {}
	
//	static block initialisation fro exception handling
	
	static {
		try {
			staticInstance = new StaticBlockSingleton();
		}
		catch(Exception e) {
			throw new RuntimeException("Exception occured while creating instance.");
		}
	}
	public static StaticBlockSingleton getStaticInstance() {
		return  staticInstance;
	}

}
