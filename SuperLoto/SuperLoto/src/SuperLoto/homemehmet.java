package SuperLoto;

import java.util.Scanner;

public class homemehmet {

	public static void main(String[] args) {
		Scanner md=new Scanner(System.in);
         arka Arka01=new arka();
System.out.println("1.deger girin");
int a=md.nextInt();
Arka01.aKontrol(a);
System.out.println("2.deger girin");
int b=md.nextInt();
Arka01.bKontrol(b);
System.out.println("3.deger girin");
int c=md.nextInt();
Arka01.cKontrol(c);
System.out.println("4.deger girin");
int d=md.nextInt();
Arka01.dKontrol(d);
System.out.println("5.deger girin");
int e=md.nextInt();
Arka01.eKontrol(e);
Arka01.trueDegeri();
Arka01.print();
System.out.print("Bizim Girdigimiz Rakamlar: "+a+""+b+""+c+""+d+""+e);
	}

}
