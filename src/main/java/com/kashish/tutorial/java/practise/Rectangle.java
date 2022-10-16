package com.kashish.tutorial.java.practise;

 class Rectangle {
public int length;
public  int breadth;
 
 
 public Rectangle(int l,int b){
	 this.length=l;
	 this.breadth=b;
	 System.out.println("I am a constructor.");
 }
   

    public int getArea() {
    	return length*breadth;
    }
    public void setArea(int l,int b) {
    	System.out.println("I am inside set area");
    }
 
	static class Cuboid extends Rectangle{
 public int height;
		public Cuboid(int l,int b,int h){
			super(l, b);
			this.length=l;
			this.breadth=b;
			this.height=h;
			
			// TODO Auto-generated constructor stub
			
		}
		public int volume(int l,int b,int h) {
			return l*b*h;
		}
      
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r=new Rectangle(1,2);
r.setArea(1,2);
System.out.print(r.getArea());

		Cuboid c =new Cuboid(1,2,3);
		System.out.println(c.volume(1, 2, 3));
		
		
	}


	

}
