/*----------------------------------------------------------------------------------------------------------------------
	Throwable parametreli catch bloğu ile tüm fırlatılan exception nesneleri yakalanabilir. Şüphesiz Throwable parametreli
	catch bloğunun tüm catch bloklarından sonra yazılması gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		try {
			Scanner kb = new Scanner(System.in);
			System.out.print("Bir sayı giriniz:");
			double val = Double.parseDouble(kb.nextLine());
			double result = MathUtil.log10(val);

			System.out.printf("log10(%f) = %f%n", val, result);
		}
		catch (IndeterminateException ex) {
			System.out.println("Belirsiz");
		}
		catch (UndefinedException ex) {
			System.out.println("Tanımsız");
		}
		catch (Throwable ex) {
			System.out.println("Exception oluştu");
		}

		System.out.println("Tekrar yapıyor musunuz?");
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
