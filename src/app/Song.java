/*Song Library
 * 
 * by Vamsi Kurkhal and Armin Grossrieder
 * 
 */

package app;

public class Song {
	String myTitle;
	String myArtist;
	String myAlbum;
	int myYear;
	
	public Song(String title, String artist, String album, int year){
		this.myTitle=title;
		this.myArtist=artist;
		this.myAlbum=album;
		this.myYear=year;
	}
	
	public void setTitle(String newTitle){
		myTitle=newTitle;
	}
	
	public void setArtist(String newArtist){
		myArtist=newArtist;
	}
	
	public void setAlbum(String newAlbum){
		myAlbum=newAlbum;
	}
	
	public void setYear(int newYear){
		myYear=newYear;
	}
}



