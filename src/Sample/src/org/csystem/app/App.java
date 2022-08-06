/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki "association" ilişkisi
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b1 = new B(/*...*/);
		B b2 = new B(/*...*/);
		A a = new A();

		a.doWork(b1);

		//...

		a.doWork(b2);
	}
}


class A {
	//...

	public void doWork(B b)
	{
		b.doSomething();
		//...
	}
}

class B {
	//...
	public void doSomething()
	{
		//...
	}
}
