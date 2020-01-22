import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args){
        String yesOrNot = "Y";
        Scanner scan = new Scanner(System.in);
          while(yesOrNot.equalsIgnoreCase("Y") ) {
              System.out.print("Enter an exam score: ");
              int examScore = scan.nextInt();


              if (examScore > 96)
                  System.out.println("Great job. Your grade is A+.");
              else if (examScore >= 94)
                  System.out.println("Great job. Your grade is A.");
              else if (examScore >= 90)
                  System.out.println("Great job. Your grade is A-");
              else if (examScore >= 87)
                  System.out.println("Good job. Your grade is B+.");
              else if (examScore >= 84)
                  System.out.println("Good job. Your grade is B");
              else if (examScore >= 80)
                  System.out.println("Good job. Your grade is B-");
              else if (examScore >= 77)
                  System.out.println("Nice job. Your grade is C+");
              else if (examScore >= 74)
                  System.out.println("Nice job. Your grade is C");
              else if (examScore >= 70)
                  System.out.println("Nice job. Your grade is C-");
              else if (examScore >= 60)
                  System.out.println("Well done. Your grade is D");
              else {
                  System.out.println("Go back to School if you get below 60");
              }
              System.out.println("Do you want to enter another score (Y/N)?");
              yesOrNot = scan.next();
          }
    }
}
