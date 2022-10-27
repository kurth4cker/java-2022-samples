/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar açılım (instantiation) ile kullanılabilir. Açılım ilgili generic parametreni türünü belirtir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A< as; //A'nın String açılımı
		A<Integer> ai; //A'nın Integer açılımı
		B<String, Integer, Boolean> b; //B'ninn String, Integer, Boolean açılımı

		//...
	}
}


class A<T> { //T generic parametre
	private T m_t;
	//...
}

abstract class B<T, K, L> { //T, K ve L generic parametreler
	public abstract T foo(K k, L l);
	//...
}