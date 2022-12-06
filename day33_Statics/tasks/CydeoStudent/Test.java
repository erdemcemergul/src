package day33_Statics.tasks.CydeoStudent;

public class Test {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy", 25, 'C', 16, 'M', 14, 39);

        CydeoStudent student2 = new CydeoStudent("Kathy", 25, 'A', 13, 'F', 15, 29);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();
    }
}