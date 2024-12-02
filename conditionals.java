public class conditionals {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//        boolean c = a!=b;
//        char a = 'b';
//        char b = 'd';
//        System.out.println('a' + 0);
//        System.out.println('b' + 0);
//        boolean c = a>b;
//        System.out.println(c);

//        String str1 = "pool";
//        String str2 = "pool";
//        System.out.println(str1 == str2);

        //exam - 100 -> 33, age -> 18

//        int ramMarks = 35;
//        int ramAge = 18;
//        System.out.println(ramMarks>= 33 || ramAge >= 20);
//        int age = 31;
//        if(age>= 18){
//            System.out.println("you can vote");
//        }
//        else {
//            System.out.println("you can't vote");
//        }

      //  int age = 18;
//        int marks = 35;
//        if(age>=17 && marks>=33){
//            System.out.println("you are pass");
//        }
//        else {
//            System.out.println("you are not pass");
//        }
//      int marks = 75;
//      if(marks>=90){
//          System.out.println("grade A");
//      } else if (marks >=75 && marks<=90) {
//          System.out.println("grade B");
//
//      } else if (marks >=60 && marks<=75) {
//          System.out.println("grade C");
//      }
//      else {
//          System.out.println("grade D");
//      }



        //byte
        //short
        //char
        //int
        //string
        //Enum types we can use switch case
        int day = 6;

       switch (day){
           case 1: {
               System.out.println("monday");
               break;
           }
           case 2:{
               System.out.println("tuesday");
               break;
           }
           case 3:{
               System.out.println("wednesday");
               break;
           }
           case 4:{
               System.out.println("thursday");
               break;
           }
           case 5:{
               System.out.println("friday");
               break;
           }
           case 6:{
               System.out.println("saturday");
               break;
           }
           case 7: {
               System.out.println("sunday");
               break;
           }
           default:{
               System.out.println("invalid day");
               break;
           }
       }

    }
}
