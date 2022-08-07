/*----------------------------------------------------------------------------------------------------------------------
	Date sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.Month;

class App {
	public static void main(String [] args)
	{
		Date date = new Date(7, Month.AUG, 2022);

		System.out.println(date.toLongDateStringTR());
	}
}

