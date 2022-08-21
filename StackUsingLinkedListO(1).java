class StackEmptyException extends Exception{

}
class Node<T>{
	int data;
	Node<T> next;
	Node(int data){
		this.data=data;
		next=null;
	}

	
}
public class StackUsingLinkedList<T>{
	private Node<T> head;
	private int count;
	StackUsingLinkedList(){
		head=null;
		count=0;
	}
	public void push(int elem){
		Node<T> newNode=new Node<T>(elem);
		newNode.next=head;
		head=newNode;
		count++;
		
	}
	
	public int pop() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e=new StackEmptyException();
			throw  e;
		}
		int temp=head.data;
		head=head.next;
		count--;
		return temp;
	}
	
	public boolean isEmpty() {
		return(head==null);
	}
	public int top() {
		if(isEmpty())
			return -1;
	return head.data;	
	}
public int size() {
	return count;
}
