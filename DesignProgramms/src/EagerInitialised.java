
public class EagerInitialised {

	private static final EagerInitialised eagerInstance = new EagerInitialised();
	
	// private constructor to avoid client application to use constructor
	private EagerInitialised() {}
	
	public static EagerInitialised getEagerInstance() {
		return eagerInstance;
	}
}
