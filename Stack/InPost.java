import java.util.*;

class InPost
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public InPost(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
    }
    else
    {
      stackArray[++top] = j; // increment top, insert item
    }
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; // access item, decrement top
    }
  }
}

class Main
{

static String infixToPostfix(InPost s, String exp)
{
   Stack<Character> stack=new Stack<>();
  String r=new String("");
  for(int i=0;i<exp.length();i++)
  {
    char x=exp.charAt(i);
    if(Character.isLetterOrDigit(x))
      r+=x;
    else if(x=='(')
      stack.push(x);
    
    else if(x==')')
    {
      while(!stack.isEmpty() && stack.peek()!='(')
      r+=stack.pop();
      
       stack.pop();
      
      }
    else
    {
      while(!stack.isEmpty() && Pres(x)<=Pres(stack.peek()))
            {
            r+=stack.pop();
            }
            stack.push(x);
    }
  }
      while(!stack.isEmpty())
  {
    if(stack.peek()=='(')
     return "1";
    r+=stack.pop();
  }
     return r;
  
  
}
static int Pres(char ch)
{
  switch(ch)
  {
    case '+':
    case '-':
      return 1;
    case '*':
      case'/':
      return 2;
    case '^':
      return 3;
  }
  return -1;
}
public static void main(String[] args)
  {
    InPosttheStack = new InPost(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    String st;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      st = s.nextLine();
      st = infixToPostfix(theStack, st);
      System.out.println(st);
      t--;
    }
  }
}