/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının toString metodu [ ile ] arasında yazıları elde etmek için toString metodunu çağrırır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.DateUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());

		ArrayList dates = new ArrayList();
		ArrayList numbers = new ArrayList();

		for (int i = 0; i < count; ++i) {
			dates.add(DateUtil.randomDate(r, 1900, 2100));
			numbers.add(r.nextInt(0, 99));
		}

		System.out.println(dates);
		System.out.println(numbers);
	}
}

