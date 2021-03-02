class LinkStack
{
  private LinkList top; // ref to first item on list
  public LinkStack() // constructor
  {
    top=null;
  }

  public boolean isEmpty()
  {
    return (top==null);
  }

  public void push(int dd)
  {
    LinkList newNode=new LinkList(dd);
    newNode.next=top;
    top=newNode;
  }

  public int pop()
  {
   if(isEmpty())
   {
     return -1;
   }
    else
    {
      int temp = top.data; // save reference to link
    top = top.next; // delete it: first-->old next
  //  System.out.println(temp.dData + " popped from stack");
    return temp; // return deleted link
    }
  }
  }
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      LinkStack theStack = new LinkStack(); // make new stack
      n= Integer.parseInt(s.nextLine());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine());
        if(q1 == 1){
          q2 = Integer.parseInt(s.nextLine());
          theStack.push(q2);
        }
        else
          System.out.print(theStack.pop() + " ");
        n--;
      }
      System.out.print("\n");
      theStack = null;
      t--;
    }
  }
}