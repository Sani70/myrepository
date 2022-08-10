package com.Mypackage;

public class MyMainClass {

	public static void main(String[] args) {

			ClassRect r = new ClassRect();
			int p = r.perimeter(10,5);
			System.out.println("Perimeter " +p);
			SimpleInterest s=new SimpleInterest();
			double si=s.CalSimInterest(20000.0, 5.0, 6.5);			
			System.out.println("Simple Interest " +si);
			CompountInterest CI=new CompountInterest();
			double c=CI.CalCompInterest(18000.0, 2, 10);			
			System.out.println("Compount Interest " +c);
			SwapNumbers samp= new SwapNumbers();
			samp.xp=10;
			samp.yp=20;
			samp.swap();
			System.out.println("xp= " +samp.xp + "    yp=" +samp.yp);
	}

}
