/*----------------------------------------------------------------------------------------------------------------------
	Pair sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;
import org.csystem.util.tuple.Pair;

import java.util.ArrayList;
import java.util.Random;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		ArrayList<Pair<String, Sensor>> sensors = new ArrayList<>();
		int count = Console.readInt("Bir sayı giriniz:");

		for (int i = 0; i < count; ++i) {
			String name = StringUtil.getRandomTextTR(r, 10);
			sensors.add(Pair.of(name, new Sensor(i + 1, name, Util.getRandomHost(r))));
		}

		for (Pair<String, Sensor> pair : sensors)
			System.out.println(pair.getSecond());
	}
}

class Util {
	public static String getRandomHost(Random r)
	{
		return r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
	}
}

class Sensor {
	private int m_id;
	private String m_name;
	private String m_host;

	public Sensor(int id, String name, String host)
	{
		m_id = id;
		m_name = name;
		m_host = host;
	}

	public int getId()
	{
		return m_id;
	}

	public void setId(int id)
	{
		m_id = id;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public String getHost()
	{
		return m_host;
	}

	public void setHost(String host)
	{
		m_host = host;
	}

	public String toString()
	{
		return String.format("[%d]%s %s", m_id, m_name, m_host);
	}
}