public class Loops {
    public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);

        // While loop =>
        // int counter = 0;
        // while(counter<100){
        // System.out.println("Hello World");
        // counter++;

        // Print no from 1 to 10
        // int n = 1;
        // while(n <= 10){
        // System.out.print(n+" ");
        // n++;

        // }

        // Print no 1 to n
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter <= range){
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        // Print sum of 1st natural no
        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= r){
        // System.out.println(i);
        // sum = sum + i;
        // i++;

        // }
        // System.out.println(sum);


        // For Loop

        // for(int i = 0; i <=10; i++){
        //     System.out.println("Hello World");
        // }


        //Print Square pattern 

        // int n = 1;
        // for(int i = 1; i <= 4; i++){
        // System.out.println("**** ");
        // }


        // int n = 1;
        // while(n<=4){
        //     System.out.println("****");
        //     n++;

        // }


        //Print reverse of a no

        // int n = 20112004;
        // while(n>0){
        //     int lastDigit = n %10;
        //     System.out.print(lastDigit);
        //     n /=10;
            
        // }


        //Reverse the given no

        // int n = 56436;
        // int rev = 0;
        // while(n>0){
        //     int lastDigit = n%10;
        //     rev = (rev*10)+ lastDigit;
        //     n /=10;

        // }
        // System.out.println(rev);


        //do while loop

        // int n = 0;
        // do { 
        //     System.out.println("Good Morning");
        //     n++;
        // } while (n <= 10);


        //break loop 

        // for(int i = 1; i<=8; i++){
        //     if(i == 6){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am not in a loop");


        // Keep Entering no till user enters a multiple of 10

        // Scanner sc = new Scanner(System.in);
        // do { 
        //     System.out.println("Enter your number");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);


        //Continue Statement
        
        // for(int i =1; i<=40; i++){
        //     if(i==30){
        //         continue;
        //     }
        //     System.out.print(i);
        // }


        //Display all the no entered by users expect multiple of 10

        // Scanner sc = new Scanner (System.in);
        // do { 
        //     System.out.println("Enter your number");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);
        // } while (true);


        // Check if a no is prime or not

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if(n == 2){
        //     System.out.println("no is prime");

        // }else{
        //      boolean IsPrime = true;
        // for(int i = 2; i<=Math.sqrt(n); i++){
        //     if(n % i == 0){
        //          IsPrime = false;
        //     }
        // }
        // if(IsPrime == true){
        //     System.out.println("no is prime");
        // }else{
        //     System.out.println("no is not prime");

        // }
        // }

        //Practice Question

        // for(int i = 0; i<5; i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }


        // Scanner sc = new Scanner(System.in);
        // int a, b;
        // int evenSum = 0;
        // int oddSum = 0;
        // do { 
        //     System.out.print("Enter the number : ");
        //     a = sc.nextInt();

        //     if(a % 2 == 0){
        //         evenSum += a;
        //     }else{
        //         oddSum += a;
        //     }
        //     System.out.print("Do you want to continue? Press 1 for Yes or Press 0 for No : ");
        //     b = sc.nextInt();

        // } while (b == 1);
        // System.out.println("Sum of even number" + evenSum);
        // System.out.println("Sum of odd number" + oddSum);



        // Scanner sc = new Scanner(System.in);
        // int a;
        // int fact = 1;
        // System.out.print("Enter any positive number : ");
        // a = sc.nextInt();
        // for(int i = 1; i<=a; i++){
        //     fact *= i;
        // }
        // System.out.println("factorial : " + fact);


        // System.out.println("Enter number");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     System.out.println(n + "*" + i + "=" + n*i);

        // }
        // System.out.print(n);

        
        //Nested Loops

        //Print Square Pattern

        // for(int i = 1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Print Invert Star Pattern 
        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=(n-i+1); j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }


        //Print Half-Pyramid Pattern
        // int n = 100;
        // for(int i =1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //Print Character pattern
        // int n= 4;
        // char ch = 'A';
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();

        // }

        }
    }
     
    