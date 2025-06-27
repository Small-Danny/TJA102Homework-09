package hw5;

public class InkBrush extends Pen {

	public InkBrush(String brand, int price) {
		super(brand, price);
	}

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
		// TODO Auto-generated method stub
	}

	@Override
	public int getPrice() {
		return (int) (price * 0.8);
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		Pen InkBrush1=new InkBrush("好大的",50);
		InkBrush1.write();
		System.out.println(InkBrush1.getPrice());
	}
}
