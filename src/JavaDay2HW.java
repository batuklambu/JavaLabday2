import java.util.Scanner;

public class JavaDay2HW {

    public static void main(String[] args) {

// Write a program that declares 1 integer variable x, and then assigns 7 to it.
// Write an if statement to print out “Less than 10” if x is less than 10.
// Change x to equal 15, and notice the result (console should not display anything).

//                int x =7 ;
//
//                if (x < 10) {
//                    System.out.println("Less than 10");
//                }
//                x = 15;

//2. Write a program that declares 1 integer variable x, and then assigns 7 to it
// Write an if-else statement that prints out “Less than 10” if x is less than 10
// and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.

//     int x = 7;
//
//     if(x < 10){
//         System.out.println("Less than 10");
//     }else{
//         System.out.println("Greater than 10");
//     }
//
//    x = 15;

// 3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
// Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
// “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20”
// if x is greater than or equal to 20. Change x to 50 and notice the result.

//        int x =15;
//
//        if(x < 10){
//            System.out.println("Less than 10");
//        }
//         else if (x > 10 && x < 20 ) {
//            System.out.println("x is greater than 10 but less than 20");
//        }else{
//            System.out.println("Greater than or euqal to 20");
//        }
//        x = 50;
//we change the value of x to 50, but since there's no further code to execute, the console won't display anything.
// When this code is executed, the console will display "Greater than or euqal to 20 `" because 50 is more than 15.




//4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
// Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
// and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
// Change x to 5 and notice the result.


//we change the value of x to 5, but since there's no further code to execute, the console won't display anything.
// When this code is executed, the console will display "Out of range" because 5 is less than 10.

//5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: <60
//Use the Scanner class to accept a number score from the user to determine the letter grade.
// print out “Score out of range” if the score is less than 0 or greater than 100.

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number score : ");

        int score = myObj.nextInt();

        if(score < 0 || score > 100 ){
            System.out.println("Score out of range");
        } else if (score >=90 && score <= 100) {
            System.out.println("Score Grade is A");
        } else if (score >=80 && score <= 89) {
            System.out.println("Score Grade is B");
        } else if (score >=70 && score <= 79) {
            System.out.println("Score Grade is C");
        } else if (score >=60 && score <= 69) {
            System.out.println("Score Grade is D");
        }else {
            System.out.println("score Grade is F");
        }


//6. Write a program that accepts an integer between 1 and 7 from the user.
// Use a switch statement to print out the corresponding weekday.
// Print “Out of range” if the number is less than 1 or greater than 7.
// Do not forget to include “break” statements in each of your cases.


        Scanner sc=new Scanner(System.in);
		System.out.println("Enter week number(1-7):");
		int weekno = sc.nextInt();

        switch(weekno)
        {
            case 1 : System.out.println("Sunday");break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday");break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
            case 7 : System.out.println("Saturday"); break;
            default : System.out.println("Out of range");
        }


















        }
        }
