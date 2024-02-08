package ProblemClass4;

public class Song {
	public String title;
	public String artist;
	public String album;
	public String composer;
	public String year;
	public int track;
	
	public void setSongInfo(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.println("타이틀 명: " + title);
		System.out.println("가수: " + artist);
		System.out.println("앨범 제목: " + album);
		System.out.println("작곡가: " + composer);
		System.out.println("노래가 발표된 연도: " + year);
		System.out.println("트랙 번호: " + track);

	}
	
}
