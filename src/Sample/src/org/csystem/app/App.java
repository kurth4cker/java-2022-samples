/*----------------------------------------------------------------------------------------------------------------------
	Sınıflararası İlişkiler:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.datetime.DateApp;

import java.util.Arrays;

class App {
	public static void main(String [] args)
	{
		DateApp.run();
	}
}

class Color {
	private static final Color [] COLORS =
			{new Color(0), new Color(1), new Color(2), new Color(3), new Color(4)};
	public static final Color RED = COLORS[0];
	public static final Color GREEN = COLORS[1];
	public static final Color BLUE = COLORS[2];
	public static final Color WHITE = COLORS[3];
	public static final Color BLACK = COLORS[4];
	private final int m_ordinal;

	private Color(int ordinal)
	{
		m_ordinal = ordinal;
	}

	public static Color [] values()
	{
		return Arrays.copyOf(COLORS, COLORS.length);
	}

	public int ordinal()
	{
		return m_ordinal;
	}

	//...

}

enum MyColor {
	RED, GREEN, BLUE, WHITE, BLACK
}
