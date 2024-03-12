package circle;

public class Main {

	public static void main(String[] args) {
		Cercle c1 =new Cercle(/*72,75,15,20*/);
		c1.setXd(72);
		c1.getXd();
		c1.setXf(75);
		c1.getXf();
		c1.setYd(15);
		c1.getYd();
		c1.setYf(20);
		c1.getYf();
		double s;
		double p;
        s=c1.surface();
        p=c1.perimetre();
		System.out.println("la surface est"+s);
		System.out.println("le perimetre est"+p);
	
		
	}

}

