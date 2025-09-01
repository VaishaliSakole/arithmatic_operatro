package com.tka.july4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  div d=new div() ;
	 int division=d.di(101);
		//find the question 
	int  a=division/10;
	      System.out.println("question:"+a);
	         
	
	      //find the unit place of number and reminder 
      a=division%10;
     System.out.println("unit place:"+a);
    
    
   
      //reverse number
      int c=division%10;
      int e=division/10;
      int f=e%10;
      int g=e/10;
     
      System.out.println("reverse number:"+c+""+f+""+g);
      
      
      
      //count the length of number
//      System.out.println(division.length());
      
      
      //palendrom number
    int pal= division/10;
    int pa=division%10;
    System.out.println("palendrom:"+pal+""+pa);
    
    
    //evenodd number
    boolean z=division%2==0;
    boolean x=division%2!=0;
    System.out.println(x+" odd");
    System.out.println(z+" even");
    
    
    //fibonanic series =]
  int  n1=0;
  int  n2=1;
  int n3=0;
  int n=10;
  System.out.println("fibonacci series");
  for( int i=0;i<n;i++) {
	   
	n3=n1+n2;
	n1=n2;
	n2=n3;
	
	System.out.println(n2);
  }
    
	}

	

}
