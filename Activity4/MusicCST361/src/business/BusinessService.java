package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Song;

@Stateless
@Local(BusinessInterface.class)
@Alternative
public class BusinessService implements BusinessInterface {
	List<Song> songs = new ArrayList<Song>();
	
	@Override
	public void test() {
		System.out.println("---Business Service---");
	}

	@Override
	public List<Song> getSongs() {
		return songs;
	}

	@Override
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	public BusinessService() {

		songs.add(new Song("Houses of the Holy", "Led Zeppelin", "1. The song remains the same", "2. The rain song", "3. Over the hills and far away", "4. The crunge", "5. Dancing days", "6. D'yer Mak'er", "7. No Quarter", "8. The ocean", "", "", "", "", ""));
		songs.add(new Song("Physical Graffiti", "Led Zeppelin", "1. Custard pie", "2. The rover", "3. In my time of dying", "4. Houses of the holy", "5. Trampled under foot", "6. Kashmir", "7. In the light", "8. Bron-Yr-Aur", "9. Down by the seaside", "10. Ten years gone", "11. Night flight", "12. The wanton song", ""));
		songs.add(new Song("Rubber Soul", "The Beatles", "1. I've just seen a face", "2. Norwegian wood", "3. You won't see me", "4. Think for yourself", "5. The word", "6. Michelle", "7. Girl", "8. I'm looking through you", "9. In my life", "10. Wait", "11. Run for your life", "", ""));
		songs.add(new Song("Revolver", "The Beatles", "1. Taxman", "2. Eleanor Rigby", "3. I'm only sleeping", "4. Love you to", "5. Here, there and everywhere", "6. Yellow submarine", "7. She said she said", "8. Good day sunshine", "9. And your bird can sing", "10. For no one", "11. Doctor Robert", "12. I want to tell you", ""));
		songs.add(new Song("Meliora", "Ghost", "1. Spirit", "2. From the pinnacle to the pit", "3. Cirice", "4. Spoksonat", "5. He is", "6. Mummy dust", "7. Majesty", "8. Devil church", "9. Absolution", "10. Deus in absentia", null, null, null));
	}
	public void add(Song song) {
		songs.add(song);
	}
	public void printAll() {
		System.out.println("---");
		for(Song song: songs) {
			System.out.println("Album: " + song.getAlbum() + "\nArtist: " + song.getArtist() 
					+ "\n" + song.getSong1() + "\n" + song.getSong2() 
					+ "\n" + song.getSong3() + "\n" + song.getSong4()
					+ "\n" + song.getSong5() + "\n" + song.getSong6()
					+ "\n" + song.getSong7() + "\n" + song.getSong8()
					+ "\n" + song.getSong9() + "\n" + song.getSong10()
					+ "\n" + song.getSong11() + "\n" + song.getSong12()
					+ "\n" + song.getSong13());
		}
	}
}
