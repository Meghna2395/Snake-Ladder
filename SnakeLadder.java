public class SnakeLadder{
public static void main(String args[]){
       System.out.println("Welcome to the Snake Ladder");
      int a = 0;
      int c = 0;
      int b;
			
		
		while(a<100){
		int run =(int) Math.floor(Math.random()*10)%3;
                b = (int) Math.floor(Math.random()*10)%6;
		switch(run){
		case 1:
                	
			a += b;
			c++;
			if (a>100) 
				a -= b;
                	System.out.println(a);
			break;
		case 2:
                	
			if (a >= b){
			a -= b;
			}else {
			a = 0;
			}
                	System.out.println(a);
			c++;
			break;
		default:
			System.out.println("playing not allowed");
			c++;
		}
		}
		System.out.println(a);
                System.out.println(c);
	}
}
		
