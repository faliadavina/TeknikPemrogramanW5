package kasus2;

public class setGetResto {
	private String nama_makanan; //Asalnya public, ganti jadi private
	private double harga_makanan; //Asalnya public, ganti jadi private
	private int stok; //Asalnya public, ganti jadi private
	
	public String getNama_makanan() {
		return nama_makanan;
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}

}
