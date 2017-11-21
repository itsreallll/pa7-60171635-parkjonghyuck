
public interface Drawable {
	void draw();
}

class Text implements Drawable {

	public Text(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Sample Text");
	}
	
}