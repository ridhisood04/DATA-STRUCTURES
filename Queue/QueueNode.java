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