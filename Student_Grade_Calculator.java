import java.util.*;
public class Student_Grade_Calculator {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("!~~~~~***********&  W.L.C.O.M.E. .T.O. .Y.O.U.R. .S.T.U.D.E.N.T. .G.R.A.D.E. .C.A.L.C.U.L.T.O.R.  &**********~~~~~!");
        System.out.println("In here you can calculate your percentage, total marks and corresponding grade to your percentage.");
        
        while(true){

            System.out.println("Enter the number of your subjects: ");
            int sub= scan.nextInt();
            System.out.println("Enter your marks correctly and the Student Grade Calculator will calculate your grade.");

            int total_marks=0;
            for(int j= 1; j<= sub; j++){

                System.out.println("Enter the marks of your " + j + " subject out of 100: ");
                int marks= scan.nextInt();
                total_marks += marks; 

            }
            
            int avg_per= (total_marks / sub);
            if (avg_per>= 91 && avg_per<= 100){
                System.out.println("Your grade is (A-1) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 81 && avg_per<= 90){
                System.out.println("Your grade is (A-2) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 71 && avg_per<= 80){
                System.out.println("Your grade is (B-1) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 61 && avg_per<= 70){
                System.out.println("Your grade is (B-2) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 51 && avg_per<= 60){
                System.out.println("Your grade is (C-1) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 41 && avg_per<= 50){
                System.out.println("Your grade is (C-2) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 33 && avg_per<= 40){
                System.out.println("Your grade is (D) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
            }
            else if (avg_per>= 21 && avg_per<= 32){
                System.out.println("Your grade is (F-1) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
                System.out.println("Sorry! But you have failed in your exam!");
            }
            else if (avg_per>= 0 && avg_per<= 20){
                System.out.println("Your grade is (F-2) and your percentage is: " + avg_per + "% and your total marks obtained is: "+ total_marks);
                System.out.println("Sorry! But you have failed in your exam!");
            }

            System.out.print("Do you want to calculate again? [YES|NO]: ");
            String anothercalculation = scan.next();

            if (!anothercalculation.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Thankyou for using Student Grade Calculator!");


    }
}
