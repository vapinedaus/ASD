package Singleton.doublecheckedlock;

public class Singleton {

	 /*The volatile keyword ensures that the multiple threads 
	  * handle unique instance variable correctly when it is being initialized to a singleton instance */
	 private volatile static Singleton uniqueInstance;
	 
	 private Singleton()
	 {}
	 
	 public static Singleton getInstance() {
		 /*Check for an instance and if thre isn't one,
		   enter a synchronized block */
		 if (uniqueInstance == null)
		 {
			 /*Note we only synchronize the first time*/
			 synchronized (Singleton.class)
			 {
				/* once the block check for
				null again then create an instance*/
				 if (uniqueInstance == null)
				 {
					 uniqueInstance = new Singleton();
				 }
			 }
		 }
		 
		 return uniqueInstance;
	 }
}
