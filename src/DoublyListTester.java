
import java.util.Random;

/*
 * Method to Test the Doubly LinkedList
 */
public class DoublyListTester {
	
		
		private static Random random = new Random(20010);
		
		public static void test2() {
			
			//Creating a new doubly linked list of type string
			 DoublyLinkedList<String>ll = new DoublyLinkedList<String>();
			
			String[]data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
			
			for(int i=0; i<50; i++) {
				ll.addLast(data[random.nextInt(data.length)]);
			}
			
			 int N = 100;
			 
			 String[] procs = {"addFirst", "addLast", "removeFirst", "removeLast", "addBefore", "remove"};
		
		    for(int i=0; i<N; i++) {
		    	
		    	String s = data[random.nextInt(data.length)];
		    	
		    	switch(procs[random.nextInt(procs.length)]) {
		    	/*
		    	 * Switch case to test out all the functions of the doubly linked list:
		    	 */
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
		    	
		    	 case "removeLast":
		    		 if(!ll.isEmpty()) {
		    			  ll.removeLast();
		    		  }
		    		  System.out.println("removed Last ");
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
		    
		 //main method calls the test 2 function of the doubly linked list
		   public static void main(String[] args) {
			   test2();
			  
		   }
		



}
