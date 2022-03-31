package lab1;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		OurQueueObject queue = new OurQueueObject();
		queue.add(11);
		queue.add(12);
		queue.add(15);
		
		System.out.println("1. isEmpty \n2. length\n3. add\n4. remove\n5. isExist\n6. toString\n7. getFrontElement\n8. getRearElement\n9. end");

		for(;;) {
			System.out.print("\nТа сонголтоо оруулна уу.: ");
			int songolt = scn.nextInt();
			
			switch(songolt) {
			
				case 1:
					if(queue.getLength() == 0)
					System.out.println("Хоосон байна");
					else
						System.out.println("Хоосон биш байна");
					break;
				case 2:
					System.out.println(queue.toString()+"Queue-ын урт: " + queue.getLength());
					break;
				case 3:{
					System.out.println("Та нэмэх элементээ бичнэ үү.");
					queue.add(scn.next());
					System.out.println("Queue-д Амжилттай нэмэгдлээ: "+ queue.toString());
					break;
				}
				case 4:{
					System.out.println("Queue-д байсан элементүүд:\n"+ queue.toString());
					if(queue.remove())
					System.out.println("Амжилттай устгалаа Одоо байгаа элементүүд:\n"+ queue.toString());
					else
						System.out.println("Устгаж чадсангүй. Элемент хоосон байна");
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
					System.out.println("Эхний элемент: " + queue.getFrontElement());
					break;
				case 8:
					System.out.println("Арын элемент: " + queue.getRearElement());
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
