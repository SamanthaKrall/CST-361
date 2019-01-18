package business;

import java.util.List;

import javax.ejb.Local;

import beans.Song;

@Local
public interface BusinessInterface {
	public void test();
	public List<Song> getSongs();
	public void setSongs(List<Song> songs);
}
