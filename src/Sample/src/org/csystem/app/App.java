/*----------------------------------------------------------------------------------------------------------------------
	Bir referans değişkenin iki tane türü vardır: static, dynamic

	- static type: Referansın bildirildiği türdür. "Referansın türü" dendiğinde static tür anlaşılır. Derleme zamanına
	ilişkin bir bilgidir ve değişmez.

	- dynamic type: Referansın gösterdiği nesnenin gerçek türüdür. Çalışma zamanına ilişkindir ve değişebilir

	Anahtar Notlar: Bir referansın dinamik türü String olarak aşağıdaki genel biçimi biçimi verilen çağrı ile elde
	edilebilir.
		<referans>.getClass().getName();
	Buna göre x bir referans olmak üzere x referansının dinamik türü şu şekilde ekrana yazdırılabilir:
		System.out.println(x.getClass().getName());
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a;
	}
}

class A {
	//...
}
