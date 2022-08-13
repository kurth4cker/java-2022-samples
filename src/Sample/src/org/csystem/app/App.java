/*----------------------------------------------------------------------------------------------------------------------
	String sınıfı immutable olduğundan WeatherInfo sınıfı ile  String sınıfı ilişki ne aggregation, ne de composition
	ilişkisidir. İkisine de belirli ölçüde yakın olsa da tam olarak uymamaktadır. Bu özel bir durumdur ve genel ilişkileri
	etkilemez. Bu ilişkiye isim verilmesi de gerekmez
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String name = "Any place";
		double lat = 30.4;
		double lng = 34.9;

		WeatherInfo wi = new WeatherInfo(name, lat, lng);
		System.out.println(wi.toString());

		name = "Other place";

		System.out.println(wi.toString());
	}
}

class WeatherInfo {
	private String m_place;
	private double m_latitude;
	private double m_longitude;

	//...

	public WeatherInfo(String place, double latitude, double longitude)
	{
		m_place = place;
		m_latitude = latitude;
		m_longitude = longitude;
	}

	//...

	public String toString()
	{
		return String.format("%s:(%f, %f)", m_place, m_latitude, m_longitude);
	}
}
