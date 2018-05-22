package RunnbleInterface;


public class TestMe 
{
  public static void main(String[] args)
  {
      
      Runnable r = new Runnable()
      {
          public void run()
          {
              System.out.println("I am child");
          }
      };
      
  }
}