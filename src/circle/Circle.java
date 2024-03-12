package circle;

public class Circle {
private double radius;
private String color;
public void setRadius(double r) {
	radius=r;
}
public double getRadius() {
	return radius;
}
public void setColor(String c) {
	color=c;
}
public String getColor() {
	return color;
}
//
public double getArea(int radius) {
	double ar=radius*radius*3.14;
	return ar;
}
public double getPeri(int radius) {
	double p=2*radius*3.14;
	return p;
}
public void afficher() {
	System.out.println("le radius est "+radius);
	System.out.println("la couleur est "+color);
}
	public static void main(String[] args) {
		Circle cir1=new Circle();
		cir1.setColor("rouge");
		cir1.setRadius(3);
		cir1.getArea(3);
		cir1.getPeri(3);
		cir1.afficher();
		System.out.println(cir1.getArea(3));
		System.out.println(cir1.getPeri(3));
	}

}
