public class SnakeLadder{
public static void main(String args[]){
       System.out.println("Welcome to the Snake Ladder");
      int a = 0;
      int c = 0;
      int b;
		
		int run =(int) Math.floor(Math.random()*10)%3;
		switch(run){
		case 1:
                	b = (int) Math.floor(Math.random()*10)%6;
			a += b;
			b++;
			break;
		case 2:
                	b = (int) Math.floor(Math.random()*10)%6;
			if (a >= b){
			a -= b;
			}else {
			a = 0;
			}
			c++;
			break;
		default:
			System.out.println("playing not allowed ");
	        	c++;
		}
		System.out.println(a);
                System.out.println(c);
	}
}
