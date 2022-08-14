/*----------------------------------------------------------------------------------------------------------------------
	instanceof operatörü birinci operandına ilişkin referansın dinamik türünün ikinci operandına ilişkin türü kapsayıp
	kapsamadığına bakar. Buradaki kapsama şüphesiz nesnesel kapsamadır. Aşağıdaki programı çalıştırıp durumu gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		SampleAFactory factory = new SampleAFactory();

		A a;

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		while (count-- > 0) {
			System.out.println("-----------------------------------------------------------");
			a = factory.getRandomA();
			System.out.println(a.getClass().getName());
			if (a instanceof B b)
				b.foo();
			else
				System.out.println("B veya B'den türemiş bir tür değil");
			System.out.println("-----------------------------------------------------------");
		}
	}
}

class SampleAFactory {
	private final Random m_random = new Random();

	public A getRandomA()
	{
		int val = m_random.nextInt(5);

		return switch (val) {
			case 0 -> new B();
			case 1 -> new C();
			case 2 -> new D();
			case 3 -> new E();
			default -> new F();
		};
	}
}

class F extends E {
	//...
}

class E extends A {
	//...
}

class D extends B {
	//...
}

class C extends B {
	//...
}

class B extends A {
	//...
	public void foo()
	{
		System.out.println("B.foo");
	}
}

class A {
	//...
}
