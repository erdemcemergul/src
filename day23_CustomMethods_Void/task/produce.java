package day23_CustomMethods_Void.task;

public class produce {
    public static void oddnum(){
        for (int i = 1; i <=100 ; i++) {
            if (i%2==1)
                System.out.print(i+"\t");

        }

    }
    public static void evennum(){
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0)
                System.out.print(i+"\t");

        }

    }
    public static void alcohol(boolean a){
        if (a)
            System.out.println("The person is eligible to buy alcohol");
        else System.out.println("The person is not eligible to buy alcohol");


    }
    public static void vote(int age, String citizenship){
        if (age>=21&&citizenship.equalsIgnoreCase("USA"))
            System.out.println("You are eligible to vote! \n");
        else System.out.println("You are not eligible to vote! \n");



    }

    public static void grade(int not){
        if (not>=85)
            System.out.println("A");
        else if (not<85&&not>=70) {
            System.out.println("B");            
        } else if (not<70&&not>=60) {
            System.out.println("C");
        }
        else if (not<60&&not>=50) {
            System.out.println("D");
        }
        else
            System.out.println("Fail");

    }

    public static void square(int length){
        int Square=length*length;
        System.out.println(Square);
    }
    public static void convert(double dolar,double currency){

        double lira=dolar*currency;
        System.out.println(lira);
    }
    public static void convert(double kg){
        double lb =kg*1004;
        System.out.println(lb);


    }

    public static String number(int num){
        if (num<0)
            return "negative";
        else if (num==0) {
            return "zero";

        }
        else
            return "positive";

    }
            public static  void printEachChar(String word){
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(word.charAt(i)+ "\t");

                }


            }


            public static void printEachElement(int[] num){


                for (int i = 0; i < num.length ; i++) {
                    System.out.println(num);
                }
            }
            public static void calculatoR(int num1,int num2,char operator){
        int result=0;
switch (operator)
{
    case '+':
        result=num1+num2;
        break;
    case '-':
        result=num1-num1;
        break;
    case '*':
        result=num1*num2;
        break;
    case '/':
        result =num1/num2;
        break;
}
                System.out.println(result);

            }
        public static void fullName(String name,String name2) {
        String newname1=""+name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        String newname2=""+name2.substring(0,1).toUpperCase()+name2.substring(1).toLowerCase();
        String newname=""+newname1+" "+newname2;
            System.out.println(newname);

        }
        public static void anagram(String word,String revword){
        String rev="";
        for (int i=revword.length()-1;i>=0;i--)

            rev+=""+revword.charAt(i);
        if (word.equalsIgnoreCase(rev))
            System.out.println("silent and listen are anagram");
        else System.out.println("silent and listen are not anagram");

        }





    public static void main(String[] args) {
        oddnum();
        evennum();
        alcohol(true);
        vote(18,"USA");
        grade(75);
        convert(500,18.53);
        convert(303.52);
        System.out.println(number(12));
        printEachChar("erdem");
        calculatoR(25,15,'+');
        fullName("erDEM","ERGül");
anagram("erdem","medre");
    }
}
