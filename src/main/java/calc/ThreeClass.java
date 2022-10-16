package calc;

class Calculator{
	public void calculate(int a,int b) {
	System.out.println("calculating sum: "+ (a+b));
	}
}
class ScCalculator{
	public void calculate(int a,int b) {
		System.out.println("calculating sum: "+ Math.sin(a+b));
		}
}
class HybridCalculator{
	public void calculate(int a,int b) {
		System.out.println("calculating sum: "+ (a+b));
		System.out.println("calculating sum: "+ Math.sin(a+b));
		}
}

public class ThreeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Calculator c=new Calculator();
   c.calculate(1,1);
   ScCalculator sc=new ScCalculator();
   sc.calculate(1,1);
   HybridCalculator hc=new HybridCalculator();
   hc.calculate(1,1);
	}

}
