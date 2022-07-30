/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problemlere ilişkin sınıflar Java 5 ile eklenen ve detayları ileride açıklanacak olan "enum sınıflar (enum classes)"
	kullanılarak daha yalın hale getirilebilir. Üstelik enum class'lar yukarıdaki Direction gibi sınıflardan daha fazla
	özelliğe sahiptir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		GameApp.run();
	}
}

class GameApp {
	public static void run()
	{
		GameObject go = new GameObject();

		//...

		go.move(Direction.RIGHT);
		go.move(Direction.TOP);
		go.move(Direction.LEFT);
		go.move(Direction.BOTTOM);
	}
}

enum Direction {
	RIGHT, TOP, LEFT, BOTTOM
}


class GameObject {
	public static final int RIGHT = 0;
	public static final int TOP = 1;
	public static final int LEFT = 2;
	public static final int BOTTOM = 3;
	//...
	public void move(Direction direction)
	{
		//...
	}
}
