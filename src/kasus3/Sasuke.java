package kasus3;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	Itachi i = new Itachi();
	
	void printDojutsu() {
		i.printDojutsu();
		System.out.println(this.Dojutsu);
	}

}
