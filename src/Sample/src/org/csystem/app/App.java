/*----------------------------------------------------------------------------------------------------------------------
	Boolean sınıfının valueOf metodu true ve false değerlerine ilişkin Boolean nesnelerini bir ön bellekten alır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf(false);
		Boolean b4 = Boolean.valueOf(false);

		System.out.println(b1 == b2 ? "Aynı nesne" : "Farklı nesneler");
		System.out.println(b3 == b4 ? "Aynı nesne" : "Farklı nesneler");
	}
}

