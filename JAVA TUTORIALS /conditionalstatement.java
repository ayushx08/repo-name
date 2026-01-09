import java.util.Scanner;

public class conditionalstatement {
    public static void main (String args []){


       
    //    int a = 20;
    //    int b = 30;
    //    if(a>=b){
    //     System.out.println("a is greater than b"); 
    //    }
    //    if((a<=b) && (a==b)){
    //     System.out.println("a is less than b");
    //    }
    //    else{
    //     System.out.println("b is less than a");
    //    }

    //Print the largest of 2
    // int A = 1;
    // int B = 3;
    // if (A>=B){
    //     System.out.println("A is largest of 2");
    // }
    // else{ 
    //     System.out.println("B is largest of 2"); 
    // }

    //Print if a number is odd or even

    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();

    // if(number % 2 == 0){
    //     System.out.println("Even");

    // }else{
    //     System.out.println("Odd");

    // }

    // int age = 20;

    // if (age >= 21){
    //     System.out.println("adult");

    // }
    // else if(age >= 13 && age <18){
    //     System.out.println("teenager");
    // }
    // else{
    //     System.out.println("Not adult");


    //Income tax Calculator 
    // Scanner sc = new Scanner(System.in);
    // int income = sc.nextInt();
    // int tax;

    // if(income < 500000){
    //   tax = 0;
    // }
    // else if(income >= 500000 && income < 1000000){
    //   tax = (int)(income * 0.2);


    // }else{
    //   tax = (int) (income *0.3);
    // }

    // System.out.println("Your tax is " + tax);



    // Print the largest no of 3 
    // A = 1, B = 3, C = 6;

    // int A = 1;
    // int B = 3;
    // int C = 6;
    // if((A >= B) && (A >= C)){
    //   System.out.println("largest is A");
    // }else if(B >= C){
    //   System.out.println("largest is B ");
    // }else{
    //   System.out.println(" largest is C");
    // }


    //Ternary operator 

    // int larger = (99>1)?99 : 1;
    // System.out.println(larger);

    // int number = 4;

    // String type = ((number % 5 == 0))? "even" : "odd";
    // System.out.println(type);


    //Check if a student will pass or fail

    // Scanner sc = new Scanner(System.in);
    // int marks = sc.nextInt();
    // String reportcard = (marks >= 33) ? "Pass" : "Fail"; 
    // System.out.println(reportcard);
    // // String progressreport  = (marks < 33) ? "Pass" : "Fail"; 
    // // System.out.println(progressreport);



    //Switch Case statement

    // char xyz = 'F';
    // switch (xyz){  
    //     case 'A' : System.out.println("Avinash Kumar");
    //     break;
    //     case 'B' : 
    //     System.out.println("Ayush Gupta");
    //     break;
    //     case 'C': System.out.println("Anuj Lodu");
    //     break;
    //     case 'D' : System.out.println("Manoj Chutiya");
    //     break;
    //     case 'E' : System.out.println("Mahendra Chodu");
    //     break;
    //     default : System.out.println("Reality What is it");

    // }

    //Calculator

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a value of a : ");
//    int a = sc.nextInt();
//    System.out.println("Enter a value of b : ");
//    int b = sc.nextInt();
//    System.out.println("Enter a operator which you prefer ");
//    char operator = sc.next().charAt(0);


//    switch(operator){
//     case '+' : System.out.println(a+b);
//     break;
//     case '-' : System.out.println(a-b);
//     break;
//     case '*' : System.out.println(a*b);
//     break;
//     case '/' : System.out.println(a/b);
//     break;
//     case '%' : System.out.println(a%b);
//     break;
//     default : System.out.println("Wrong Operator"); 
//     }


//    Question Answer 


//Question No 1;

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// if(a>0){
//     System.out.println("a is greater than 0");
// }else{
//     System.out.println("a is less than or equal to 0");
// }


//Question No 2;
// Scanner sc = new Scanner(System.in);

// double temp = sc.nextInt();
// if(temp>100){
//     System.out.println("You have a fever");
// }
// else{
//     System.out.println("You don't have fever");

    
// }



//Question 3;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a week as per your choice");
// int week = sc.nextInt();
// switch(week){
//     case 1: System.out.println("Monday");
//     break;
//     case 2: System.out.println("Tuesday");
//     break;
//     case 3: System.out.println("Wednesday");
//     break;
//     case 4: System.out.println("Thursday");
//     break;
//     case 5: System.out.println("Friday");
//     break;
//     case 6: System.out.println("Saturday");
//     break;
//     case 7: System.out.println("Sunday");
//     break;
//     default: System.out.println("Invalid input! Please enter week number between 1-7");
// }



//Question 4: 
// int a = 63, b = 36;
// boolean x = ( a < b) ? true: false;
// System.out.println(x);

// int y = (a > b) ? a : b;
// System.out.println(y);


//Question 5;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year as per your choice");
int year = sc.nextInt();

boolean x = (year % 4 ) == 0;
boolean y = (year % 100) != 0;
boolean z = (year % 400 == 0) && (year % 100 ==0 );

if(x & (y || z)){
    System.out.println(year + "is a leap year");

}else{
    System.out.println(year + " is not a leap year");
}

  


}

}




