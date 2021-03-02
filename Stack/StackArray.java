class StackArray
{
  public int maxSize; // size of stack array
  public int[] arr;
  public int top; // top of stack

  public StackArray(int s) // constructor
  {
    maxSize=s;
   top=-1;
    arr=new int[maxSize];
    
  }

  public void push(int j) // put item on top of stack
  {
     if (top >= (maxSize - 1)) {
           System.out.println("-1");
       // return -1;
        }
        else {
            arr[++top] = j;
          //  System.out.println(x + " pushed into stack");
           // return true;
        }
    }
 
  
  public int pop() // take item from top of stack
  {if (top < 0) 
  {
           // System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int j = arr[top--];
            return j;
        }
    }
 
  public boolean isEmpty() // true if stack is empty
  {
    return (top==-1);
  }

  public boolean isFull() // true if stack is full
  {
    return (top==maxSize-1);
  }
}
class Main
{
  public static void main(String[] args)
  {
    StackArraytheStack = new StackArray(10); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      theStack.top = -1;
      n= Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine().trim());
        if(q1 == 1){
          q2 = Integer.parseInt(s.nextLine().trim());
          theStack.push(q2);
        }
        else
          System.out.print(theStack.pop() + " ");
        n--;
      }
      System.out.print("\n");
      t--;
    }
  }
}