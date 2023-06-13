
public class TestTrapezoid {

	public static void main(String[] args) {
		Trapezoid t1 = new Trapezoid();
		
		System.out.println("t1 ID: " + t1.getID());
		System.out.println("t1 Base1: " + t1.getBase1());
		System.out.println("t1 Base2: " + t1.getBase2());
		System.out.println("t1 Height: " + t1.getHeight());
		System.out.println("t1 Area: " + t1.getArea());
		System.out.println();
		
		t1.setBase1(2);
		t1.setBase2(3);
		t1.setHeight(4);
		
		System.out.println("After changes t1");
		System.out.println("t1 ID: " + t1.getID());
		System.out.println("t1 Base1: " + t1.getBase1());
		System.out.println("t1 Base2: " + t1.getBase2());
		System.out.println("t1 Height: " + t1.getHeight());
		System.out.println("t1 Area: " + t1.getArea());
		System.out.println();
		
		Trapezoid t2 = new Trapezoid();
		
		System.out.println("t2 ID: " + t2.getID());
		System.out.println("t2 Base1: " + t2.getBase1());
		System.out.println("t2 Base2: " + t2.getBase2());
		System.out.println("t2 Height: " + t2.getHeight());
		System.out.println("t2 Area: " + t2.getArea());
		System.out.println();
		
		t2.setBase1(5);
		t2.setBase2(6);
		t2.setHeight(7);
		
		System.out.println("After changes t2");
		System.out.println("t2 ID: " + t2.getID());
		System.out.println("t2 Base1: " + t2.getBase1());
		System.out.println("t2 Base2: " + t2.getBase2());
		System.out.println("t2 Height: " + t2.getHeight());
		System.out.println("t2 Area: " + t2.getArea());
		System.out.println();
		
		Trapezoid t3 = new Trapezoid(8,9,10);
		
		System.out.println("t3 ID: " + t3.getID());
		System.out.println("t3 Base1: " + t3.getBase1());
		System.out.println("t3 Base2: " + t3.getBase2());
		System.out.println("t3 Height: " + t3.getHeight());
		System.out.println("t3 Area: " + t3.getArea());
		System.out.println();
		
		t3.setBase1(11);
		t3.setBase2(12);
		t3.setHeight(13);
		
		System.out.println("After changes t3");
		System.out.println("t3 ID: " + t3.getID());
		System.out.println("t3 Base1: " + t3.getBase1());
		System.out.println("t3 Base2: " + t3.getBase2());
		System.out.println("t3 Height: " + t3.getHeight());
		System.out.println("t3 Area: " + t3.getArea());
		System.out.println();
		
		Trapezoid t4 = new Trapezoid(14,15,16);
		
		System.out.println("t4 ID: " + t4.getID());
		System.out.println("t4 Base1: " + t4.getBase1());
		System.out.println("t4 Base2: " + t4.getBase2());
		System.out.println("t4 Height: " + t4.getHeight());
		System.out.println("t4 Area: " + t4.getArea());
		System.out.println();
		
		t4.setBase1(17);
		t4.setBase2(18);
		t4.setHeight(19);
		
		System.out.println("After changes t4");
		System.out.println("t4 ID: " + t4.getID());
		System.out.println("t4 Base1: " + t4.getBase1());
		System.out.println("t4 Base2: " + t4.getBase2());
		System.out.println("t4 Height: " + t4.getHeight());
		System.out.println("t4 Area: " + t4.getArea());
		System.out.println();
	}
}
