import java.util.Random;
import java.util.Scanner;

class Dice{
    public static void main(String[] args){
	Random r=new Random();
	Scanner s=new Scanner(System.in);

	System.out.println("What is your name?");
	String name=s.next();
	s.close();
	System.out.println("Hello,"+name+"!");
	
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
