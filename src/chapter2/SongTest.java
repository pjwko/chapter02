package chapter2;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum("real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		song.show();
		
		Song song2 = new Song("봄바람", "워너원", "", "", 0, 0);
		song2.show();

		Song song3 = new Song("가끔", "EXO", "", "", 0, 0);
		song3.show();
		
		Song song4 = new Song("너를만나", "폴킴");
		song4.show();
	}

}
