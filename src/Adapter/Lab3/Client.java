package Adapter.Lab3;

public class Client {

	public static void main(String[] args) {
	   
		
		System.out.println("===========STACK-LIFO=========");
		System.out.println("Add Items: A,B,C,D,E");
		ITargetStack stack = new  Adapter();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		System.out.println("Deleted Item:" + stack.pop());
		System.out.println("Deleted Item:" + stack.pop());
		System.out.println("Deleted Item:" + stack.pop());
		System.out.println("Deleted Item:" + stack.pop());
		System.out.println("Deleted Item:" + stack.pop());
		System.out.println("Is Empty:" + stack.isEmpty());
		System.out.println("==============================");
		
		System.out.println("===========QUEUE-FIFO=========");
		System.out.println("Add Items: A,B,C,D,E");
		ITargetQueue queue = new  Adapter();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("Deleted Item:" + queue.poll());
		System.out.println("Deleted Item:" + queue.poll());
		System.out.println("Deleted Item:" + queue.poll());
		System.out.println("Deleted Item:" + queue.poll());
		System.out.println("Deleted Item:" + queue.poll());
		System.out.println("Is Empty:" + queue.isEmpty());
		System.out.println("==============================");
		
		
		
		

	}

}
