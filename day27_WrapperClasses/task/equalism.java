package day27_WrapperClasses.task;

public class equalism {
    public static boolean equal(String a){
        char[] cases=a.toCharArray();
        int lowerc=0;
        int upperc=0;
        for (int i = 0; i < cases.length; i++) {
            if (Character.isLowerCase(cases[i]))
                lowerc++;
            else if (Character.isUpperCase(cases[i]))
                upperc++;
else continue;
        }
        if (upperc == lowerc) {
            return  true;

        }else return false;



    }

    public static void main(String[] args) {
        System.out.println(equal("JAVA java"));
    }


}
