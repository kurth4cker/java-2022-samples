/*----------------------------------------------------------------------------------------------------------------------
	try-finally yani catch bloksuz try deyimi ile exception nesnesi yakalanmadan ve aynı zamanda exception fırlatılsa da
	fırlatılmasa da yapılacak bir işleme yönelik kod yazılabilir. Aşağıdaki örneği çeşitli değerler ile çalıştırarak
	sonuçları gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		try {
			Util.doWork();
		}
		catch (IndeterminateException ex) {
			System.out.println("Belirsiz");
		}
		catch (UndefinedException ex) {
			System.out.println("Tanımsız");
		}
		finally {
			System.out.println("main:finally");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void doWork()
	{
		try {
			Scanner kb = new Scanner(System.in);
			System.out.print("Bir sayı giriniz:");
			double val = Double.parseDouble(kb.nextLine());
			double result = MathUtil.log10(val);

			System.out.printf("log10(%f) = %f%n", val, result);
		}
		finally {
			System.out.println("doWork:finally");
		}

		System.out.println("doWork sonu");
	}
}

class MathUtil {
	public static double log10(double val)
	{
		if (val < 0)
			throw new IndeterminateException();

		if (Math.abs(val - 0) < 0.0001)
			throw new UndefinedException();

		return Math.log10(val);
	}
}

class IndeterminateException extends RuntimeException {
	//...
}


class UndefinedException extends RuntimeException {
	//...
}
