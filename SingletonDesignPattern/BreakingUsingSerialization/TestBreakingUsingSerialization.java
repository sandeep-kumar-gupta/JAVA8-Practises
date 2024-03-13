
package SingletonDesignPattern.BreakingUsingSerialization;


import java.io.*;

public class TestBreakingUsingSerialization {
    public static void main(String[] args) throws IOException {


        ObjectOutput objectOutput = null;
        Singleton s1 = Singleton.getInstance();
        try {
            objectOutput = new ObjectOutputStream(new FileOutputStream("Singleton.ser"));
            objectOutput.writeObject(s1);
            objectOutput.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objectOutput != null) {
                objectOutput.close();
            }
        }
        ObjectInput objectInput = null;
        Singleton s2 = Singleton.getInstance();

        try {
            objectInput = new ObjectInputStream(new FileInputStream("Singleton.ser"));
            Object readObject = objectInput.readObject();
            s2 = (Singleton) readObject;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objectInput != null) {
                objectInput.close();
            }
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
} 

