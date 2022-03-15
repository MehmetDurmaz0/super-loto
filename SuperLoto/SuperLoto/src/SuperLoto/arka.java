package SuperLoto;

import java.util.Random;

public class arka {
	Random rand=new Random();
	private int a,b,c,d,e;
	public int trueDeger=0;
	
	public arka() {
		this.a=rand.nextInt(10);
		this.b=rand.nextInt(10);
		this.c=rand.nextInt(10);
		this.d=rand.nextInt(10);
		this.e=rand.nextInt(10);
	}
public void print () {
	System.out.println("Lotaya Çıkan Rakmalar: "+a+""+b+""+c+"" +d+""+e);
}
public int aKontrol(int inputa) {
	if(inputa==a) {
	trueDeger++;	
	}
	return a;
} 
public int bKontrol(int inputb) {
	if(inputb==b) {
	trueDeger++;	
	}
	return b;
	}
public int cKontrol(int inputc) {
	if(inputc==c) {
	trueDeger++;	
	}
	return c;
	}
public int dKontrol(int inputd) {
	if(inputd==d) {
	trueDeger++;	
	}
	return d;
	}
public int eKontrol(int inpute) {
	if(inpute==e) {
	trueDeger++;	
	}
	return e;
	}

public void  trueDegeri() {
	System.out.println(trueDeger+" :Kadar Bildiniz");
}
}