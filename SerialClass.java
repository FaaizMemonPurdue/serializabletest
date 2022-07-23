import java.io.*;
import java.util.ArrayList;

public class SerialClass {
    // Serialize today's date to a file.
    public static void main(String[] args) throws Exception {
        /*FileOutputStream f = new FileOutputStream("tmp");
        ObjectOutput s = new ObjectOutputStream(f);
        //s.writeObject("Today");
        s.writeObject(new Date("July", 29));
        s.flush();*/
        SerialClass serial = new SerialClass();
        /*Date writeDate1 = new Date("Dec", 25);
        writeDate1.setHoliday(new Holiday("Crimas"));
        ArrayList<Birthday> crimasBdays = new ArrayList<>();
        crimasBdays.add(new Birthday("jesus", 2022));
        crimasBdays.add(new Birthday("john", 22));
        writeDate1.setBirthdaysToday(crimasBdays);
        serial.WriteObjectToFile("tmp9", writeDate1);*/


        Date readDate1 = (Date) serial.ReadObjectFromFile("tmp9");
        readDate1.getBirthdaysToday().add(new Birthday("greg", 20));
        //Date currDate = new Date("Brown", 29);
        System.out.println(readDate1);


        //Date date = (Date) serial.WriteObjectToFile("tmp");
        //System.out.println(date);

    }

    public void WriteObjectToFile(String filepath,Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Object ReadObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
