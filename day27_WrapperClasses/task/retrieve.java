package day27_WrapperClasses.task;

public class retrieve {
    public static void iswhat(String a){
        String letters="";
        String Digits="";
        String specialChars="";
        char[] characters=a.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isDigit(characters[i])){
                Digits+=""+characters[i];
            } else if (Character.isLetter(characters[i])) {
                letters=""+characters[i];

            }else
                specialChars=""+characters[i];

        }
        System.out.println("letters = " + letters);
        System.out.println("Digits = " + Digits);
        System.out.println("specialChars = " + specialChars);


    }

    public static void main(String[] args) {
        iswhat("Wooden Spoon!");
    }

}
