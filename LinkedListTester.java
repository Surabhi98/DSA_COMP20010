import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/*
 * Method to test out the Singly linked list class
 */
public class LinkedListTester{
	
	private static Random random = new Random(20010);
	
	public static void test1() {
		
		//Creates a new singly linked list:
		SinglyLinkedList<String>ll = new SinglyLinkedList<String>();
		
		
		String[]data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		for(int i=0; i<50; i++) {
			ll.addLast(data[random.nextInt(data.length)]);
		}
		
		 int N = 100;
		 
		 String[] procs = {"addFirst", "addLast", "removeFirst", "removeLast", "addBefore", "remove"};
	
	    for(int i=0; i<N; i++) {
	    	
	    	String s = data[random.nextInt(data.length)];
	    	/*
	    	 * Switch case for implementing the different methods of the linked list
	    	 */
	    	switch(procs[random.nextInt(procs.length)]) {
	    	
	    	case "addFirst":
	    		  ll.addFirst(s);
	    		  System.out.println("addFirst: " + s);
	    		  break;
	    	case "addLast":
	    		  ll.addLast(s);
	    		  System.out.println("addLast: " + s);
	    		  break;
	    	case "removeFirst":
	    		  if(!ll.isEmpty()) {
	    			  ll.removeFirst();
	    		  }
	    		  System.out.println("removed First ");
	    		  break;
	    	
	    	 default:
	    		  System.out.println("unknown");
	    		  break;
	    		  	  
	    		  
	    	}
	    	
	    	
	    	}
	    
	    System.out.println("size(ll): " + ll.size());
	    for(String s: ll) {
	    	System.out.println("ll ->" + s);
	    }
	}
	    
	/*
	 * Main method to call the test1 function: 
	 */
   public static void main(String[] args) {
	   test1();
	  
   }
   
 
   
}
	
	

