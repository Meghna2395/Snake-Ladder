import java.util.Scanner;
public class SnakeLadder{
 public static void main(String args[]){
  System.out.println("Welcome to the Snake Ladder");
  int a1 = 0;
  int a2 = 0;
  int b1 = 0;
  int b2 = 0;
  int c1;
  int c2;
  
  for(int i=1;i<=2;i++){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the CHANCE to PLAY: ");
   int player = sc.nextInt();
   switch(player){
   case 1:
   while(a1 <100){
    int run =(int) Math.floor(Math.random()*10)%3;
    c1 = (int) Math.floor(Math.random()*10)%6;
    switch(run){
     case 1:
      
      a1 += c1;
      b1++;
      if (a1 >100) 
       a1 -= c1;
      
      break;
     case 2:
      
      if (a1 >= c1){
       a1 -= c1;
      }else {
       a1 = 0;
      }
   
     b1++;
     break;
     default:
      
      b1++;
     }
    }
    System.out.println("Player1 is at "+a1+"th position");
    System.out.println("finished in "+b1+" rolls");
    break;
   case 2:
   while(a2 <100){
    int run =(int) Math.floor(Math.random()*10)%3;
    c2 = (int) Math.floor(Math.random()*10)%6;
    switch(run){
     case 1:
      
      a2 += c2;
      b2++;
      if (a2 >100) 
       a2 -= b2;
      
      break;
     case 2:
      
      if (a2 >= c2){
       a2 -= c2;
      }else {
       a2 = 0;
      }
      
      b2++;
      break;
     default:
      
      b2++;
    }
    }
    System.out.println("Player2 is at "+a2+"th position");
    System.out.println("finished in "+b2+" rolls");
    break;
   }
  }
  if (a1 > a2){
   System.out.println("Player1 is the winner");
  }else {
   System.out.println("Player2 is the winner");
   }
 }
}
