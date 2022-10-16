/*----------------------------------------------------------------------------------------------------------------------
	Generic'ler:
	Derleme zamanında türden bağımsız kod yazabilmek için kullanılır (compile time polymorphism). Programcı generi bir tür
	ya da metodu türden bağımsız yazar.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a = new C();
		IX ix;

		ix = (IX)a; //Haklı dönüşüm

		a = new B();

		ix = (IX)a; //Haksız dönüşüm


		System.out.printf("Tekrar yapıyor musunuz?");

	}
}

class C extends A implements IX {
	//...
}
class B extends A {
	//...
}

class A {
	//...
}

interface IX {
	//...
}