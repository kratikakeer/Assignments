package com.te.stringmethods;

public class FinalizeExample {
	 
	     public static void main(String[] args)   
	    {   
	        FinalizeExample obj = new FinalizeExample();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	           
	        System.gc();   
	        System.out.println("end of garbage collection");   
	  
	    }   
	    @Override  
	    protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
	  

}
