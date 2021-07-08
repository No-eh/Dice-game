import java.util.Random;
class Dice{
    public static void main(String[] args){
	Random r=new Random();
	
	int die1=r.nextInt(6)+1;
	int die2=r.nextInt(6)+1;
	System.out.println("Rolling the Dice...");
	System.out.println("Die 1: "+die1);
	System.out.println("Die 2: "+die2);
	int total=die1+die2;
	System.out.println("Total value: "+total);
	if(total>7) {
	    System.out.println("You won");
	}
	else System.out.println("You lost");
    }
}
