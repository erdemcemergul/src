package day28_ArrayList.tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class grades {
    public static void main(String[] args) {
        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i)>=90)
                gradeOfA.add(i);
            else if (scores.get(i)<90&&scores.get(i)>=80) {
                gradeOfB.add(i);

            }
            else if (scores.get(i)<80&&scores.get(i)>=70) {
                gradeOfC.add(i);

            }
            else if (scores.get(i)<70&&scores.get(i)>=60) {
                gradeOfD.add(i);

            }else gradeOfF.add(i);

        }
        System.out.println("gradeOfA.size() = " + gradeOfA.size());
        System.out.println("gradeOfB.size() = " + gradeOfB.size());
        System.out.println("gradeOfC.size() = " + gradeOfC.size());
        System.out.println("gradeOfD.size() = " + gradeOfD.size());
        System.out.println("gradeOfF.size() = " + gradeOfF.size());

    }

}
