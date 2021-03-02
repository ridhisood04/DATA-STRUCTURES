package Linked;

import java.util.NoSuchElementException;

public class CircularList {

	static ListNode last;
	int length;
	 
	static class ListNode{
		ListNode next;
		int data;
		// int length;
		public  ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public CircularList()
	{
		this.last=null;
		this.length=0;
		
	}
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void print()
	{
		ListNode first=last.next;
		if(last==null)
		{
			return ;
		}
		while(first!=last)
		{
			System.out.print(first.data+"--->");
			first=first.next;
			
		}
		System.out.print(first.data);
		
	}
	public void create()
	{
		ListNode head=new ListNode(10);

		ListNode s=new ListNode(20);
		ListNode t=new ListNode(8);
		ListNode f=new ListNode(1);

		head.next=s;
		s.next=t;
		t.next=f;
		f.next=head;
		last=f;
		
	}
	public void insert(int data)
	{
		ListNode newNode=new ListNode(data);
		if(last==null)
		{
			last=newNode;
			last.next=newNode;
		}
		else
		{
			 newNode.next=last.next;
            last.next=newNode;
           
            		
last =newNode;
}
		length++;
	}
	public void remove()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		ListNode current=last.next;
		if(last.next==last)
		{
			last=null;
		}
		else
		{
			last.next=current.next;
		}
		current.next=null;
		length--;
	}
	public static void main(String [] args)
	{
	
		CircularList sl=new CircularList();
		sl.create();
		//sl.print();
		sl.insert(134);
		
		sl.remove();
		sl.print();
		
	}
}
