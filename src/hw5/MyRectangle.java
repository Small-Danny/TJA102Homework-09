package hw5;

public class MyRectangle {
	double width;
	double depth;
	
	public void setWidth(double width) {
		this.width=width;
	} //將收到的引數指定給width屬性
	public void setDepth(double depth) {
		this.depth=depth;
	}//將收到的引數指定給depth屬性
	public double getArea() {
		return this.width*this.depth;
	}  //能計算該長方形的面積


	public MyRectangle(){} //不帶參數也無內容的建構子
	public MyRectangle(double width, double depth) {
		this.width=width;this.depth=depth;
	}

}