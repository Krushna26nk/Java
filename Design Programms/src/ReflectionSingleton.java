import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EagerInitialised instanceOne = EagerInitialised.getEagerInstance();
		EagerInitialised instanceTwo =null;
		
		try {
			Constructor[] constructors = EagerInitialised.class.getDeclaredConstructors();
			
			for(Constructor constructor: constructors) {
			
				// will destroy the singleton pattern
				
				constructor.setAccessible(true);
				instanceTwo = (EagerInitialised)constructor.newInstance();
				break;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}

}
