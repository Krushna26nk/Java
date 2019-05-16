import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class SerialisedSingletonTest {

	public static void main(String[] args) throws IOException ,ClassNotFoundException, FileNotFoundException {
		// TODO Auto-generated method stub
		SerialisedSingleton instanceOne = SerialisedSingleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("one.txt"));
		
		out.writeObject(instanceOne);
		out.close();
		
		// deserialised From file to object.
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("one.txt"));
		SerialisedSingleton instanceTwo =  SerialisedSingleton.getInstance();
		
		in.readObject();
		in.close();
		System.out.println("Instance One Hashcode "+instanceOne.hashCode());
		System.out.println("Instance Two Hashcode "+instanceTwo.hashCode());
		
	}

}
