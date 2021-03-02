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
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = s.nextInt();
    while(t>0)
    {
      QueueArray ob1=new QueueArray();
      n = s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1)
        {
          q2 = s.nextInt();
          ob1.enqueue(q2);
        }
        else
          System.out.print(ob1.dequeue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}