/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz. Örnek durumu göstermek için yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();
		System.out.println(s.getValue());
		System.out.println("-------------------------");
		Sample k = new Sample(10);
		System.out.println(k.getValue());
	}
}

class Sample {
	private static final Random RANDOM = new Random();
	private int m_value;

	{
		m_value = RANDOM.nextInt(100);
		System.out.printf("value:%d%n", m_value);
	}

	public Sample()
	{

	}

	public Sample(int a)
	{
		m_value += a;
	}

	public int getValue()
	{
		return m_value;
	}
}