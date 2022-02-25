import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		  
		 Scanner scanner = new Scanner(System.in);
	    Queue q = new Queue();
	    
	    boolean swtch = true;
	 try { 
	    while(swtch) {

	    System.out.println("\nҮйлдлээ сонгоно уу:\n" +
	    		"1. Enqueue\n"
				+ "2. Dequeue\n"
				+ "3. Peek\n"
				+ "4. Display\n"
				+ "5. isEmpty\n"
				+ "6. isFull\n"
				+ "7. Program shutdown"); 
	    switch(scanner.nextInt()) {
	    case 1:
	    	System.out.println("Queue-д нэмэх элементээ оруулна уу: ");
			q.enQueue(scanner.nextInt()); 
			break;
		case 2:
			q.deQueue(); 
			break;
		case 3:
			q.peek();
			break;
		case 4:
			System.out.println("Queue-гийн бүх элементийг харах: ");
			q.display();
			break;
		case 5:
			System.out.println("Queue хоосон уу = " + q.isEmpty());
			
			break;
		case 6:
			System.out.println("Queue дүүрсэн үү = " + q.isFull());
			break;
		case 7:
			swtch = false;
			break;
	    }
	    }
	 } catch (Exception e) {
		 System.out.println("Алдаа гарлаа!");
	 }
	  }
}
