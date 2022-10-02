/*----------------------------------------------------------------------------------------------------------------------
	checked bir exception throw edilen metot içerisinde eğer exception ele alınmayacaksa (handling) throws bildirimi
	yapılmalıdır. Aksi durumda error oluşur. Aşağıdaki örneği inceleyiniz
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
		catch (Throwable ex) {
			ex.printStackTrace();
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}



class MathUtil {
	public static double log10(double val) throws MathException
	{
		if (val < 0)
			throw new MathException("Indeterminate", MathExceptionStatus.INDETERMINATE);

		if (Math.abs(val - 0) < 0.0001)
			throw new MathException("Undefined", MathExceptionStatus.UNDEFINED);

		return Math.log10(val);
	}
}

enum MathExceptionStatus {
	ZERO, NEGATIVE, UNDEFINED, INDETERMINATE, NAN
}

class MathException extends Exception {
	private final MathExceptionStatus m_status;

	public MathException(String message, MathExceptionStatus status)
	{
		super(message);
		m_status = status;
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status:%s", super.getMessage(), m_status);
	}

	public MathExceptionStatus getStatus()
	{
		return m_status;
	}
}

