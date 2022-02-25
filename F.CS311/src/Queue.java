import java.util.Scanner;
public class Queue {
  int SIZE = 6;
  int items[] = new int[SIZE];
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

  void enQueue(int element) {
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

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue хоосон байна !");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } // 1 l element uldvel queue-g reset hiine
      else {
        front++;
      }
      System.out.println("Queue гээс амжилттай гаргалаа. Гарсан элемент =  " + element);
      return (element);
    }
  }
  
  int peek() {
	  int element;
	    if (isEmpty()) {
	      System.out.println("Queue is empty");
	      return (-1);
	    } else {
	      element = items[front];
	      }
	      System.out.println("Queue-гийн хамгийн урд талын элемент = " + element);
	      return (element);
	    }
  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      //System.out.println("\nУрд талын index-> " + front);
      System.out.println("Элементүүд -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      //System.out.println("\nХойд талын index-> " + rear);
    }
  }

 
}