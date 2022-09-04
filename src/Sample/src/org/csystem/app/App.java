/*----------------------------------------------------------------------------------------------------------------------
    Dinamik büyüyen dizi (dynamic array) veri yapıları diziyiğ eklenen eleman sayısı kadar büyütmez. Dizinin
    büyütülmesi gerektiği durumda büyütme işlemini biraz fazlaca yapar. İşte bu tarz veri yapılarından dizinin
    uzunluğuna "capacity" denir. Dizide nmantıksal olarak tutulan elemöanların sayısına ise "size/count" denir. Java'da
    "size" daha çok kullanılır. size hiçbir zaman capacity değerinden büyük olamaz. Capacity değeri size değerinden büyük
    veya size değerine eşit olabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			int[] a = ArrayUtil.getRandomArray(r, count, 0, 99);

			ArrayUtil.print(2, a);

			System.out.print("Yeni eleman sayısını giriniz:");
			int newCount = Integer.parseInt(kb.nextLine());

			a = Arrays.copyOf(a, newCount);
			ArrayUtil.print(2, a);
		}
	}
}

