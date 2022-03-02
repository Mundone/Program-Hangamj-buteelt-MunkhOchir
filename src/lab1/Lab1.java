package lab1;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		OurQueue queue = new OurQueue();
		queue.add(11);
		queue.add(12);
		queue.add(15);
		
		System.out.println("1. isEmpty \n2. length\n3. add\n4. remove\n5. isExist\n6. toString\n7. getFrontElement\n8. getRearElement\n9. end");

		for(;;) {
			System.out.print("\nТа сонголтоо оруулна уу.: ");
			int songolt = scn.nextInt();
			
			switch(songolt) {
			
				case 1:
					break;
				case 2:
					System.out.println("Queue-ын урт: " + queue.getLength());
					break;
				case 3:{
					System.out.println("Та нэмэх элементээ бичнэ үү.");
					queue.add(scn.next());
					break;
				}
				case 4:{
					queue.remove();
					System.out.println("Амжилттай устгалаа.");
					break;
				}
				case 5:{
					System.out.println("Та шалгах элементээ бичнэ үү.");
					if(queue.isExist(scn.next()))
						System.out.println("Таны оруулсан элемент энэ queue-д БАЙНА.");
					else
						System.out.println("Таны оруулсан элемент энэ queue-д БАЙХГҮЙ.");
					break;
				}
					
				case 6:{
					System.out.println(queue.toString());
					break;
				}
				case 7:
					break;
				case 8:
					break;
				case 9:{
					scn.close();
					System.exit(0); 
					break;
				}
				default: 
					System.out.println("Буруу утга орууллаа. Та дахин оролдоно уу."); 
					break;
			}
		}
	}
}
