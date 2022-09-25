package fak;
import java.util.Scanner;
public class fak {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir n sayı giriniz");
		int n=scanner.nextInt();
		System.out.println("Bir r sayı giriniz");
		int r=scanner.nextInt();
		int top=1,toplam=1,tot=1;
		int f=n-r;
		
		
		for(int k=1;k<=n;k++)
		{
			top=top*k;
			
		}
		for(int t=1;t<=r;t++)
		{
		toplam=toplam*t;
			
		}
		
		for(int z=1;z<=f;z++)
		{
			tot=tot*z;
			
		}
		int com=top/(toplam*(tot));
		System.out.println("n! = "+top);
		System.out.println("r! = "+toplam);
		System.out.println("(n-r)! = "+tot);
		System.out.println("n'in r'li kombinasyonu = "+com);
	}

}
