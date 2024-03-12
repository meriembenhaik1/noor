package circle;

public class Cercle {
private float xd;
private float xf;
private float yd;
private float yf;
public Cercle(/*float xd,float xf,float yd,float yf*/) {
	this.xd=xd;
	this.xf=xf;
	this.yd=yd;
	this.yf=yf;
}
public float getXd() {
	return xd;
}
public void setXd(float xd) {
	this.xd = xd;
}
public float getXf() {
	return xf;
}
public void setXf(float xf) {
	this.xf = xf;
}
public float getYd() {
	return yd;
}
public void setYd(float yd) {
	this.yd = yd;
}
public float getYf() {
	return yf;
}
public void setYf(float yf) {
	this.yf = yf;
}
public double surface() {
	double s;
	s=(Math.pow((Math.sqrt(Math.pow((xf-xd),2)+Math.pow((yd-yf),2))),2))*3.14;
	return s;
}
public double perimetre() {
	double p;
	p=(Math.sqrt(Math.pow((xf-xd),2)+Math.pow((yd-yf),2))/2)*2*3.14;
	return p;
}


}
