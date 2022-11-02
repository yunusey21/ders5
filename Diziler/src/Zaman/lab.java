package Zaman;
import java.util.ArrayList;
import java.util.Scanner;
public class lab {
/* 31/10/22 */
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	ArrayList<String> sorunlar = new ArrayList<String>();
	sorunlar.add("sorun1");
	sorunlar.add("sorun2");
	sorunlar.add("sorun3");
	sorunlar.add("sorun4");
	sorunlar.add("sorun5");
	int [][] cevaplar = (0,0,0,0,0,0,0,0,0);
	System.out.println("**************");
	System.out.println("Hosgeldiniz");
	System.out.println("**************");
	while(true) {
	System.out.println("1/sisteme gir 2/sistemden cık");
	int kontrol=0;
	kontrol=scanner.nextInt();
	if(kontrol==1) {
		for(int i=0;i<5;i++) {
			System.out.println(sorunlar.get(i)+"sizin icin ne kadar onemli");
			int sayac=scanner.nextInt();
			if(sayac==1)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==2)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==3)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==4)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==5)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==6)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==7)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==8)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else if(sayac==9)
			{
				cevaplar[i]=cevaplar[i]+1;
			}
			else
			{
				cevaplar[i]=cevaplar[i]+1;
				}
			
				}
		 
			}
		}
	}
}
	


