package Linked;
import java.util.Scanner;

import Linked.SingleList.ListNode;
class SingleLi{
	
	
	static class ListNode

	{
		 int data;
		 ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	public void display(ListNode head)
	{
		if(head==null)
			return;
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println(current);
		}
	
	

	public ListNode reverse(ListNode head)
	
	{
	
		ListNode current=head;

		ListNode previous=null;

		ListNode next=null;
		while(current!=null)
		{
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		

	}
		return previous;
		}
	
	public static void main(String [] args)
	{
		ListNode head = new ListNode(10);
		ListNode s=new ListNode(21);
		ListNode t=new ListNode(2);
		ListNode f=new ListNode(8);
		
		head.next=s;
		s.next=t;
		t.next=f;
		
		SingleLi sl=new SingleLi();
		ListNode n=sl.reverse(head);
		sl.display(n);
		}
		
       
      //
       
	}
	