/*----------------------------------------------------------------------------------------------------------------------
	Polymorphism (Çok Biçimlilik): Polymorphism Biyoloji'den programlamaya aktarılmıştır. Biyoloji'de polymorphism
	şu şekilde tanımlanabilir: "Farklı doku ya da organların evrim süreci içerisinde temel işlevleri aynı kalmak koşuluyla,
	bu işlevi yerine getirme biçimlerinin birbirinden türeyen canlılarda değişebilmesidir". Örneğin görme davranışı (eylemi)
	birbirinden türemiş canlılar arasında farklılık gösterebilir. Ancak görev "görmektir".

	Nesne yönelimli programlama tekniğinde bu bölümde anlatılan çok biçimliliğe (ki bu da Biyoloji'den aktarılandır)
	"çalışma zamanı çok biçimliliği (runtime polymorphism)" denir. Polymorphisim dendiğinde "runtime polymorphism"
	anlaşılır. Diğer bir "polymorphism" de "derleme zamanı çok biçimliliği (compile time polymorphism)" olarak adlandırılır.
	Bu konu ileride ele alınacaktır.

	Çalışma zamanı çok biçimliliği için pek çok tanım ya da açıklama (betimleme) yapılabilse de genel olarak aşağıdaki
	3 tanıma indirgenebilir:
	1. Biyolojik Tanım: Taban sınıfın bir fonksiyonunun türemiş sınıfta yeniden gerçekleştirilmesidir
	2. Yazılım Mühendisliği Tanımı: Türden bağımsız kod yazmaktır
	3. Aşağı Seviyeli Tanım: Önceden yazılmış kodların sonradan yazılmış kodları çağırabilmesidir.


----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B.setValues(10, 20);
		System.out.printf("A.x = %d%n", A.x);
		System.out.printf("B.x = %d%n", B.x);
	}
}

class B extends A {
	public static int x;

	public static void setValues(int a, int b)
	{
		x = a; //this.x = a
		A.x = b; //**
	}
	//...
}
class A {
	public static int x;

	//...
}