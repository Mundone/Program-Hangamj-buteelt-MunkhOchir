import java.util.*;
public class TestCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    Calculator mycalc = new Calculator();
	    System.out.println("Эхний нэмэгдэхүүн");
	      int x = sc.nextInt();
	    System.out.println("Хоёрдугаар нэмэгдэхүүн");
	      int y = sc.nextInt();
	    System.out.println("Нийлбэр:" + mycalc.add(x, y));
	    sc.close();
	}
}