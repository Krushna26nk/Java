import java.io.Serializable;

public class SerialisedSingleton implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;

	private SerialisedSingleton() {}
	
	private static class SingletonHelper{
		private static final SerialisedSingleton serialInstance = new SerialisedSingleton();
	}
	public static SerialisedSingleton getInstance() {
		return SingletonHelper.serialInstance;
	}
	
}
