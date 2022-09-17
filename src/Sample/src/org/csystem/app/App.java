/*----------------------------------------------------------------------------------------------------------------------
    CSDArrayList sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Random random = new Random();
		Scanner kb = new Scanner(System.in);
		CSDArrayList numbers = new CSDArrayList();

		System.out.print("Kaç tane sayı üretmek istersiniz?");
		int count = Integer.parseInt(kb.nextLine());
		for (int i = 0; i < count; ++i)
			numbers.add(random.nextInt(100));

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());

		int size = numbers.size();

		for (int i = 0; i < size; ++i)
			System.out.printf("%d ", (int)numbers.get(i));

		System.out.println();


		numbers.trimToSize();

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());
		size = numbers.size();

		for (int i = 0; i < size; ++i)
			System.out.printf("%d ", (int)numbers.get(i));

		System.out.println();


		numbers.clear();
		numbers.trimToSize();

		System.out.printf("Capacity:%d%n", numbers.capacity());
		System.out.printf("Size:%d%n", numbers.size());
		size = numbers.size();

		for (int i = 0; i < size; ++i)
			System.out.printf("%d ", (int)numbers.get(i));

		System.out.println();

	}
}