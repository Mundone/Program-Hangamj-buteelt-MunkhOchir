package RGB_7004;
import java.util.*;
public class RGB_7004 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Өгөгдсөн кубын эзэлхүүн ба гүйцэд гадаргуугийн талбайг ол.");
        int a = sc.nextInt();
        System.out.println("Эзлэхүүн = " + Math.pow(a, 3));
        System.out.println("Гүйцэт гадаргуун талбай = " + Math.pow(a, 2) * 6);
	}

}
