package Zaman;

public class TimeTest {

	public static void main(String[] args) {
		/*
		Time saat=new Time();
		saat.setTime(12, 45, 50);
		System.out.println(saat.saat());
		saat.setTime(30, 60, 100);
		System.out.println("Set sayisi: "+Time.getCount());
		System.out.println(saat.hour);
		System.out.println(Time.hour);
	*/
	Time2 saat2=new Time2();
		saat2.setSaatDakika(9, 30);
		System.out.println(saat2.saat());
		Time2 saat3=new Time2(3, 45, 55);
		System.out.println(saat3.saat());
	}
	

}
