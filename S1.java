public class S1
{
  private static final S1 aSingleton = new S1();

  S1()
  {//this is to prohibit use of new
  ;}

  public static synchronized S1 getSingleton()
  {
    return S1.aSingleton;  
  }

  public static void main(String[] argv)
  {
    S1 aSingleton = S1.getSingleton();
    System.out.println("got a singleton: "  );
  }
}//end-class S1

  
