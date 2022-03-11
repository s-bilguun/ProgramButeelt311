import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		  
		 Scanner scanner = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
	    Queue q = new Queue();
	    
	    boolean swtch = true;
	 
	    while(swtch) {
	    	
	    	System.out.println("\nҮйлдлээ сонгоно уу: \n"
	    	+ "0. Queue-ийн хэмжээгээ сонгох      1. Enqueue\n" 
	    	+ "2. Dequeue                         3. Peek\n"
	    	+ "4. Display                         5. IsEmpty\n"
	    	+ "6. IsFull                          7. Shutdown program"); 
	    switch(scanner.nextInt()) {
	    
	    case 0: System.out.println("Queue-гийн хэмжээгээ тохируулна уу");
	    	q.SIZE = scanner.nextInt();
	    	break;
	    case 1:
	    	System.out.println("Queue-д нэмэх элементээ оруулна уу: ");
			q.enQueue(scanner.next()); 
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
			System.out.println("Програм хаагдлаа !");
			break;
	    }
	    }
	 
	  }
}
