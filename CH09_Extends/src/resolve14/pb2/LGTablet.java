package resolve14.pb2;

public class LGTablet implements ITablet{

	private String movie;
	private String music;
	private String readBook;
	
	LGTablet(String movie, String music, String readBook) {
		this.movie = movie;
		this.music = music;
		this.readBook = readBook;
	}
	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("영화가 시작됩니다.");
		System.out.println("LG: " + movie);
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("음악이 시작됩니다.");
		System.out.println("LG: " + music);
		
	}

	@Override
	public void readBook() {
		// TODO Auto-generated method stub
		System.out.println("책읽기가 시작됩니다.");
		System.out.println("LG: " + readBook);
	}


}
