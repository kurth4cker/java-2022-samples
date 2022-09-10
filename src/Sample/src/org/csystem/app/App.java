/*----------------------------------------------------------------------------------------------------------------------
	ArrayList/Vector sınıfının ensureCapacity metodu capacity değerini aşağıdaki şekilde büyütmeye çalışır: (else if
	biçiminde düşününüz)
	- Yeni capacity değeri o anki capacity değerinden küçük veya eşitse değişiklik yapmaz.
	- Yeni capacity değeri o anki capacity değerinin artması gereken değerinden küçük veya eşit ise artması gereken
	capacity değerine çeker
	- Yeni capacity değeri o anki capacity değerinin artması gereken değerinden büyükse yeni capacity değerine çeker

	Özetle bu metot en az o anki capacity değerinin artması gereken kadar artırabilir. O anki capacity değerini azaltmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class App {
	public static void main(String [] args)
	{
		Random random = new Random();
		Scanner kb = new Scanner(System.in);
		Vector numbers = new Vector();

		for (int i = 0; i < 11; ++i)
			numbers.add(random.nextInt(100));

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());
		System.out.println(numbers.toString());

		numbers.ensureCapacity(15);

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());

		numbers.ensureCapacity(34);

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());

		numbers.ensureCapacity(85);

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());
	}
}

