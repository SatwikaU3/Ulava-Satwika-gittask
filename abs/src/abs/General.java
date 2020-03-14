package abs;

public abstract class General {
   public  abstract void save();
      public abstract void fix();
}
       class Icici extends General
      {
    	  public void save()
    	  {
    		  System.out.println(4);
    	  }
    	  public void fix()
    	  {
    		  System.out.println(8.5);
    	  }
      }
       class Kotak extends General
      {
    	  public void save()
    	  {
    		  System.out.println(6);
    	  }
    	  public void fix()
    	  {
    		  System.out.println(9);
    	  }
      }


      class A 
      {
      public static void main(String[] args)
      {
    	  Icici ob1=new Icici();
    	  Kotak ob2=new Kotak();
    	  General ob3=new Kotak();
    	  
	      ob3.save();
	      ob3.fix();
      }
      }

