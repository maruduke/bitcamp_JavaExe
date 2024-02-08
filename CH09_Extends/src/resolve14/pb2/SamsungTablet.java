package resolve14.pb2;

public class SamsungTablet implements ITablet{

	private String movie;
	private String music;
	private String readBook;
	
	SamsungTablet(String movie, String music, String readBook) {
		this.movie = movie;
		this.music = music;
		this.readBook = readBook;
	}
	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("samsung: " + movie);
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("samsung: " + music);
		
	}

	@Override
	public void readBook() {
		// TODO Auto-generated method stub
		System.out.println("samsung: " + readBook);
	}

}
