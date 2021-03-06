import java.util.*;
class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
  }
}

class QueueLinkedList
{
  public QueueNode front, rear;
int data;
  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    QueueNode newNode=new QueueNode(data);
    if(front==null)
    {
      front=newNode;
    }
      else
      {
        rear.next=newNode;
        
      }
    rear=newNode;

  }    

  /*  Function to DeQueue an element from the Queue */
  public int DeQueue()
  {
   if(front==null)
   {
     return -1;
   }
    data=front.data;
    front=front.next;
    return data;
  }    
}class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      QueueLinkedList ob1=new QueueLinkedList();
      n = Integer.parseInt(s.nextLine());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine());
        if(q1 == 1)
        {
          q2 = Integer.parseInt(s.nextLine());
          ob1.EnQueue(q2);
        }
        else
          System.out.print(ob1.DeQueue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}