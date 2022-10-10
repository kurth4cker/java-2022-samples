/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf başka bir sınıftan türetilip istediği kadar arayüzü destekleyebilir. Bu durumda extends'in başta olmnası
	gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class A extends B implements IX, IY {
	//...
}

class B {
	//...
}
interface IX {
	//...
}

interface IY {
	//...
}