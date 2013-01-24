//Three aspects to a Singleton pattern: a private constructor,
//  a static accessor method and a static member variable.
//  In multithreaded applications, the accessor should be synchronized

public class S1
{
  private static final Singleton1 aSingleton = new Singleton1();

  Singleton1()
  {//this is to prohibit use of new
  ;}

  public static synchronized Singleton1 getSingleton()
  {
    return Singleton1.aSingleton;  
  }

  public static void main(String[] argv)
  {
    Singleton1 aSingleton = Singleton1.getSingleton();
    System.out.println("got a singleton: "  );
  }
}//end-class Singleton1

  
