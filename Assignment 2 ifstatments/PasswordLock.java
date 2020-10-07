import java.util.Scanner;

class PasswordLock{
    
    
    
    public static void Main (String[] args){
    Scanner s = new Scanner (System.in);
    System.out.println("What is the password!?");
    String password = s.next();
     if(password.equals("dragon")){
           System.out.println("Correct! The cake is a lie");
        }else{
            System.out.println("Incorrect! My secret is safe");
        }
        
}
    
    
    
    
    
}