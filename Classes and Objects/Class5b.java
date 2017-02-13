
class Singleton {

   private static Singleton s1 = new Singleton();
   private int x =1;
   
   private Singleton(){ }
   
   
   public static Singleton getInstance( ) {
      return s1;
   }
  
   protected static void demoMethod( ) {

      System.out.println("demoMethod for singleton"); 
   }
   public void check()
	{
	  s1.x++;
	 System.out.println(" X ="+x);
	}

}


public class Class5b {
   public static void main(String[] args) {
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod();
      tmp.check(); 

      Singleton tmp1 = Singleton.getInstance(); 
      tmp1.demoMethod();
      tmp1.check();
   }
}
