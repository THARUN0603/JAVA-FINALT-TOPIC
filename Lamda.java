package Finaltopic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Maeker Interface
class Save implements Serializable{
	int i;
}

//lambda Expression
@FunctionalInterface 
interface deliveres{
	void deliver();
}

public class Lamda {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		deliveres d=()-> System.out.println("Deliver this order quickly...");
		d.deliver();
		
//Serializable
		Save s=new Save();
		s.i=20;
		File f=new File("My file.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
//Deserialization
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save s1=(Save)ois.readObject();
		System.out.println("Value of Object 2 (S1) is " +s1.i);
	}

}
