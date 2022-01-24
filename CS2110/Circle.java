/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
public class Circle {

	private Point point;
	private double radius;
	
	public Circle(Point c, double rad){
		point = c;
		radius = rad;
	}
	
	public Circle(){
		point = new Point(0,0);
		radius = 1;
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Circle)
		{
			Circle cir = (Circle) obj;
			return (getRadius() == cir.getRadius() && getPoint().equals(cir.getPoint()));			
		}
			return false;
	}
	
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
	
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		System.out.println(c);
		
		String s = "3.1415";
		double pi = Double.parseDouble(s);
		System.out.println(pi * 5);
		
		Point z = new Point(1,1);
		Point j = new Point(3,4);
		Circle h = c;
		Circle f = new Circle(z, 3);
		Circle w = new Circle(j,7);
		
		System.out.println(c.equals(h));   //Comparing two references to the same circle
		System.out.println(c.equals(f));   //different objects but same values
		System.out.println(c.equals(w));   //different values
	}
	
	@Override
	public String toString(){
		return "<" + point + ", " + "radius: " + radius +">";
	}
}

/*   Output
<(1.0, 1.0), radius: 3.0>
15.707500000000001
true
true
false
*/