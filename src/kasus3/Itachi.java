package kasus3;

public class Itachi extends Rikado{
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		this.setDojutsu();
		System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}

}
