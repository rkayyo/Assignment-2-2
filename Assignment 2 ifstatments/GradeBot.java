import java.util.Scanner;

class GradeBot{
    
 public static void Main(String[] args){
     
     Scanner s = new Scanner(System.in);
     String letterGrade = "A";
     
     System.out.println("What was your test out of?");
     double totalScore = s.nextDouble();
     System.out.println("What score did you get on the test");
     double Score = s.nextDouble();
     
     double Percent =  100 * (Score/totalScore);
     
     if(totalScore > 0 && Score <= totalScore){
        if(Percent >= 86){
         letterGrade = "A";
        }else if(Percent <= 85 && Percent >= 73){
         letterGrade = "B"; 
        }else if(Percent <= 72 && Percent >= 67){
         letterGrade = "C+";
        }else if(Percent <= 66 && Percent >= 60){
         letterGrade  = "C";  
        }else if(Percent <= 59 && Percent >= 50){
         letterGrade =  "C";
        }else if(Percent <= 49 && Percent >= 0){
         letterGrade = "F";
        }
    }else{
       System.out.println("Foolish child thats not possible"); 
    }
     System.out.println("Your score on this test is " + Percent + " %. Your letter grade is " + letterGrade);
    }
    
}