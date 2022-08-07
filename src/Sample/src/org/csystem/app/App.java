/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B x = new B();
		System.out.println("----------------------------------------");
		B y = new B(10);
		System.out.println("----------------------------------------");
		C z = new C();
		System.out.println("----------------------------------------");
		C t = new C(10);
	}
}

class C extends B {
	public C()
	{
		System.out.println("I am a default ctor of C");
	}

	public C(int x)
	{
		System.out.println("I am a ctor of C with parameter int");
	}
}

class B extends A {
	public B()
	{
		System.out.println("I am a default ctor of B");
	}

	public B(int x)
	{
		System.out.println("I am a ctor of B with parameter int");
	}
}

class A {
	//...
	public A()
	{
		System.out.println("I am a default ctor of A");
	}
}