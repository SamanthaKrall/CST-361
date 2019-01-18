package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Song {
	String artist = "";
	String album = "";
	String song1 = "";
	String song2 = "";
	String song3 = "";
	String song4 = "";
	String song5 = "";
	String song6 = "";
	String song7 = "";
	String song8 = "";
	String song9 = "";
	String song10= "";
	String song11 = "";
	String song12 = "";
	String song13 = "";
	public Song(String album, String artist, String song1, String song2, String song3, String song4, String song5, String song6, String song7, String song8, String song9, String song10, String song11, String song12, String song13) {
		this.album = album;
		this.artist = artist;
		this.song1 = song1;
		this.song2 = song2;
		this.song3 = song3;
		this.song4 = song4;
		this.song5 = song5;
		this.song6 = song6;
		this.song7 = song7;
		this.song8 = song8;
		this.song9 = song9;
		this.song10 = song10;
		this.song11 = song11;
		this.song12 = song12;
		this.song13 = song13;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getSong1() {
		return song1;
	}
	public void setSong1(String song1) {
		this.song1 = song1;
	}
	public String getSong2() {
		return song2;
	}
	public void setSong2(String song2) {
		this.song2 = song2;
	}
	public String getSong3() {
		return song3;
	}
	public void setSong3(String song3) {
		this.song3 = song3;
	}
	public String getSong4() {
		return song4;
	}
	public void setSong4(String song4) {
		this.song4 = song4;
	}
	public String getSong5() {
		return song5;
	}
	public void setSong5(String song5) {
		this.song5 = song5;
	}
	public String getSong6() {
		return song6;
	}
	public void setSong6(String song6) {
		this.song6 = song6;
	}
	public String getSong7() {
		return song7;
	}
	public void setSong7(String song7) {
		this.song7 = song7;
	}
	public String getSong8() {
		return song8;
	}
	public void setSong8(String song8) {
		this.song8 = song8;
	}
	public String getSong9() {
		return song9;
	}
	public void setSong9(String song9) {
		this.song9 = song9;
	}
	public String getSong10() {
		return song10;
	}
	public void setSong10(String song10) {
		this.song10 = song10;
	}
	public String getSong11() {
		return song11;
	}
	public void setSong11(String song11) {
		this.song11 = song11;
	}
	public String getSong12() {
		return song12;
	}
	public void setSong12(String song12) {
		this.song12 = song12;
	}
	public String getSong13() {
		return song13;
	}
	public void setSong13(String song13) {
		this.song13 = song13;
	}
	public Song() {
		super();
	}
}
