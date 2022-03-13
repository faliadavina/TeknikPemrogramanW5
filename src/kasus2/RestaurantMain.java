package kasus2;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant menu = new Restaurant();
		
		System.out.println("               M E N U");
		System.out.println("+====================================+");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);

		menu.tampilMenuMakanan();
		System.out.println("+====================================+");
		
		menu.pesanMakanan();
		menu.tampilMenuMakanan();
	}

}
