package Linked;

import java.util.NoSuchElementException;

public class DoubleLink {
     
	static ListNode head;
	static ListNode tail;
	int length;
	
	static class ListNode
	{
		int data;
		ListNode previous;
		static ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			
		}
	}
	public DoubleLink()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
		
	}
	public boolean isEmpty()
	{
		
		return length==0;
		
	}
	public int length()
	{
		return length;
	}
	
	public void insert(int value)
	{
		ListNode newNode=new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
			
		}
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	public  void display(ListNode head)
	{
		if(head==null)
			return ;
		ListNode curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
	
		}
		System.out.print("Null");

		System.out.print("\n");

	}
	//public void reverse()


	public static void main(String[] args)
	
	{
		DoubleLink dl=new DoubleLink();
		dl.insert(10);
		dl.insert(8);
        dl.insert(21);
		dl.insert(11);

		//dl.display();
		//dl.displayrev();
		//dl.display(head);
		
			//ListNode m=
	//	dl.reverse();
		dl.display(head);
		

	}
}
