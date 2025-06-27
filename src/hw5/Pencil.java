package hw5;

public class Pencil extends Pen {

	public Pencil(String brand, int price) {
		super(brand, price);
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
		// TODO Auto-generated method stub

	}
	@Override
	public int getPrice() {
		return (int) (price * 0.8);
	}
	
	public static void main(String[] args) {
		Pen pencil1=new Pencil("2b",10);
		pencil1.write();
		System.out.println(pencil1.getPrice());
	}
}
