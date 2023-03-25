import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class QuesSeventeen {
 
    private static final String filepath="D:\\singh.txt.txt";
    public static void main(String args[]) {
        QuesSeventeen objectIO = new QuesSeventeen();
        Student student = new Student("Prabhjyot","Singh",19);
        objectIO.WriteObjectToFile(student);
    }
 public void WriteObjectToFile(Object serObj) {
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
class Student implements Serializable {
	 
    private static final long serialVersionUID = 1L;
    private String first_name;
    private String last_name;
    private int age;
    public Student(String fname, String lname, int age){
        this.first_name = fname;
        this.last_name  = lname;
        this.age        = age;
    }
    public void setFirstName(String fname) {
        this.first_name = fname;
    }

    public String getFirstName() {
        return this.first_name;
    }
    public void setLastName(String lname) {
        this.first_name = lname;
    }
    public String getLastName() {
        return this.last_name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return new StringBuffer(" First Name: ").append(this.first_name)
                .append(" Last Name : ").append(this.last_name).append(" Age : ").append(this.age).toString();
    }
 
}
