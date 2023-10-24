import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //variables
        //Data Type

        //syntax
//
//        String name="Majd";
//        int age=20;
//        boolean isValid=true;
//        double GPA=4.90;
//        char gender='F';

//        System.out.println(name);
//        System.out.println(age);
//        System.out.println("the name is "+ name +" age :"+ age);

        //operators:
        //1 arithmetic operators : + - / % *

//        int number1=10;
//        int number2=4;

//        System.out.println(number1+number2);

        // 2 comparison operators  == !=   <  >  <=  >=

//        System.out.println(number1<number2);


        // 3 logical  :  ||  && !
//
//        boolean result=number2==number1;
//
//        System.out.println(number1<number2||result);


        //methods of String  : length   equals

//
//       String full_name="Majd Naser";
//
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.replace("M","m"));
//        System.out.println(name.equals("Maha"));

        //Scanner

//
        Scanner s=new Scanner(System.in);
//        System.out.println("please enter your first number");
//        int firstNumber=s.nextInt();
//        System.out.println("please enter second number");
//        int second_number=s.nextInt();
//
//        System.out.println("total is "+ (firstNumber + second_number));



        //Day 3
        //conditional statement :


        // if

//        System.out.println("please enter your age");
//        int age=s.nextInt();
//        if(age>18){
//            System.out.println("valid user");
//        }else System.out.println("invalid user");






//        System.out.println("please enter username");
//        String username=s.next();

//        System.out.println("please enter your password");
//        String password=s.next();

//        if(username.equals("Majd")&&password.equals("1234")){
//            System.out.println("welcome back");
//        }else System.out.println("wrong username or password");





//        System.out.println("please enter your password");
//        String password=s.next();
//
//
//        if(password.length()>=8){
//            System.out.println("strong password");
//        }else System.out.println("weak password");

//        System.out.println("please enter your name");
//        String name=s.next();
//
//        if(name.startsWith("A")){
//            System.out.println("your name start with A");
//        }else System.out.println(name.charAt(0));


        System.out.println("please enter number");
        int number=s.nextInt();

        if(number<0){
            System.out.println("negative number");
        } else if (number>0) {
            System.out.println("positive number");
        }else System.out.println("0 ");


        // else


        System.out.println("please enter a number");
        int num=s.nextInt();


        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


        // else if


        //switch


        System.out.println("please enter 1 to enquire your balance");
        System.out.println("please enter 2 to enquire your username");
        System.out.println("please enter 3 to enquire your password");
        System.out.println("please enter 4 to calling customer service");

        int n=s.nextInt();

        switch (n){
            case 1 :
                System.out.println("your balance is 100000");
                break;

            case 2:
                System.out.println("your username is majd");
                break;
            case 3:
                System.out.println("your password is 12334");
                break;
            case 4:
                System.out.println("calling customer service now");
                break;
            default:
                System.out.println("please enter number from 1-4");
        }







    }
}