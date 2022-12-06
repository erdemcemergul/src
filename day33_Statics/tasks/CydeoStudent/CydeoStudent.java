package day33_Statics.tasks.CydeoStudent;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public int grade;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";
    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, int grade){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }


public void study(){
    System.out.println(name+" is studying");
}
public void attendClass(){
    System.out.println(name+" is attending class");
}
public static void printSchoolName(){
    System.out.println(schoolName);
}
public static void printProgLanguage(){
    System.out.println(programmingLanguage);
}


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }

}

