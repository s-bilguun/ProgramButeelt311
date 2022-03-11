
public class Queue<G> {
  public int SIZE = 100;
 
  @SuppressWarnings("unchecked")
G[] items =  (G[]) new Object[SIZE];
  
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }
  

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(G element) {
    if (isFull()) {
      System.out.println("Queue дүүрсэн байна!");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Оруулсан: " + element);
    }
  }

  G deQueue() {
    G element;
    if (isEmpty()) {
      System.out.println("Queue хоосон байна !");

    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } // 1 l element uldvel queue-g reset hiine
      else {
        front++;
      }
      System.out.println("Queue гээс амжилттай гаргалаа.  Гарсан элемент =  " + element);
      return (element);
    }
	return null;
	
  }
  
  G peek() {
	  G element;
	    if (isEmpty()) {
	      System.out.println("Queue хоосон байна !");
	      return null;
	    } else {
	      element = items[front];
	      }
	      System.out.println("Queue-гийн хамгийн урд талын элемент = " + element);
	      return element;
	    }

  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Queue хоосон байна");
    } else {
      //System.out.println("\nУрд талын index-> " + front);
      System.out.println("Элементүүд : ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      //System.out.println("\nХойд талын index-> " + rear);
    }
  }


 
}
