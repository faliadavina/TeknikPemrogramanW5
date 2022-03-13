package kasus2;

import java.util.*;

public class Restaurant {
	private setGetResto[] menu;
	public static byte id=1; 

	public Restaurant() {
		menu = new setGetResto[10];
		for(int i = 0; i<10; i++) {
			menu[i] = new setGetResto();
		}
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menu[id].setNama_makanan(nama);
		this.menu[id].setHarga_makanan(harga);;
		this.menu[id].setStok(stok);
	}
	
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
				}
			}
		}
	
	public void penguranganStok(int id, int banyak_pesanan) {
		int stok = 0;
		stok = menu[id].getStok() - banyak_pesanan;
		menu[id].setStok(stok);
	}
	
	public int pesanMakanan() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n          PESAN MAKANAN");
		System.out.println("+====================================+");
		System.out.println("Banyak Pesanan : ");
		int banyakPesanan = input.nextInt();
		for(int i = 0; i < banyakPesanan; i++) {
			System.out.println("Input ID Makanan (1/2/3)     : ");
			int kode_makanan = input.nextInt();
			System.out.println("Jumlah Makanan yang Dipesan  :");
			int jumlah_makanan = input.nextInt();
		System.out.println("+====================================+\n");

			
			penguranganStok(kode_makanan, jumlah_makanan);
			
		}
		return banyakPesanan;
	}
	
	public boolean isOutOfStock(int id){
		if(menu[id].getStok() == 0){
			return true;
		}else{
			return false;
			}
		}
	
	public static void nextId(){
		id++;
		}


}
