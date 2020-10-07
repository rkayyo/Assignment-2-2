import java.util.Scanner;

class Magic8Ball{
    public static void Main(String[] args){
        Scanner s = new Scanner (System.in);
        
        
        int answer = (int) ((Math.random() * 21) + 1 );
        
        System.out.println("Ask a yes or no question FOOL!");
        String question = s.next();
        
        String a1 = "Chrisopher Schidmt";
        String a2 = "Niels Morizur";
        String a3 = "Shake again";
        String a4 = "Yes...";
        String a5 = "No...";
        String a6 = "Potentially :D";
        String a7 = "Sucks to be you";
        String a8 = "HUNDO P";
        String a9 = "Most likely";
        String a10 = "Absofruitly not";
        String a11 = "Not right now chief";
        String a12 = "No?";
        String a13 = "Don't count on it";
        String a14 = "Doubt it";
        String a15 = "Signs point to yes";
        String a16 = "Signs point to no";
        String a17 = "I'm counting on it";
        String a18 = "I hope so";
        String a19 = "Evan Carson";
        String a20 = "Duncan Maclennan";
        String a21 = "1 more time";
        
        
        if(answer == 1){
         System.out.println(a1);   
        }else if(answer == 2){
         System.out.println(a2);
        }else if(answer == 3){
         System.out.println(a3);
        }else if(answer == 4){
         System.out.println(a4);
        }else if(answer == 5){
         System.out.println(a5);
        }else if(answer == 6){
         System.out.println(a6);
        }else if(answer == 7){
         System.out.println(a7);
        }else if(answer == 8){
         System.out.println(a8);
        }else if(answer == 9){
         System.out.println(a9);
        }else if(answer == 10){
         System.out.println(a10);
        }else if(answer == 11){
         System.out.println(a11);
        }else if(answer == 12){
         System.out.println(a12);
        }else if(answer == 13){
         System.out.println(a13);
        }else if(answer == 14){
         System.out.println(a14);
        }else if(answer == 15){
         System.out.println(a15);
        }else if(answer == 16){
         System.out.println(a16);
        }else if(answer == 17){
         System.out.println(a17);
        }else if(answer == 18){
         System.out.println(a18);
        }else if(answer == 19){
         System.out.println(a19);
        }else if(answer == 20){
         System.out.println(a20);
        }else if(answer == 21){
         System.out.println(a21);
        }
            
        
        
        
        
        
        
        
    }
    
    
    
}