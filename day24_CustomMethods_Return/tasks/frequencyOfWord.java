package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class frequencyOfWord {
    public static int frequency(String sentence, String word){
       int count=0;

        while (sentence.contains(word)){
           sentence=sentence.replaceFirst(word,"");
           count++;



        }
return count;







    }

    public static boolean anagram(String first, String second){
        char[] ch1=first.toCharArray();
        char[] ch2=second.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       return Arrays.equals(ch1,ch2);

    }
     public static String reversed(String name){
String rev="";
        char[] ch=name.toCharArray();
         for (int i =ch.length-1; i>=0 ; i--) {
             rev+=""+ch[i];
         }
return rev;

     }




    public static void main(String[] args) {
        System.out.println(frequency("Java java java python python", "java"));
        System.out.println(anagram("cba", "bac"));
        System.out.println(reversed("Java"));
    }
}
