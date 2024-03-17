package linkedList;


public class Runner {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		
		list.insertAtStart(11);
		
		list.insertAt(0, 10);
		list.insertAt(4, 14);
		
		list.deleteAt(4);
		
		
		list.show();

		
		
	}

}
