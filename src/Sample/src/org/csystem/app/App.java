/*----------------------------------------------------------------------------------------------------------------------
	Arayüzler (Interfaces):
	Bilindiği gibi Java'da sınıf ve enum bildirimi bir tür bildirimidir (user defined types). Java'da interface
	anahtar sözcüğü ile arayüz (interface) bildirimi yapılabilmektedir.Arayüz bildirimi de bir tür bildirimidir.

	Arayüzler daha çok abstract sınıflara benzese de şüphesiz farklı özelliklere sahiptir

	Anahtar Notlar: interface isimlerini diğer tür bildirimlerinden ayırmak için biz kendi interface'lerimizin isimlerini
	"I" ile başlatacağız. JavaSE içerisindeki arayüzlerde bu kurala uyulmamıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.datetime.DateApp;

class App {
	public static void main(String [] args)
	{
		DateApp.run();
	}
}

interface ISample {
	//...
}
