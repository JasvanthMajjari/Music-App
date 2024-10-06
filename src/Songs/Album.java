package Songs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String AlbumName;
	private String ArtistName;
	private ArrayList<Song> Songs;
	
	
	public Album(String AlbumName, String ArtistName) {
		this.AlbumName = AlbumName;
		this.ArtistName = ArtistName;
		this.Songs = new ArrayList<Song>();
	}
	
	public Album() {
		
		
	}
	
	public Song findSong(String SongName) {
		
		for(Song checkedSong : Songs) {
			if(checkedSong.getSongName().equals(SongName)) return checkedSong;
		}
		
		return null;
	}
	
	public boolean addSong(String SongName,double Duration) {
		if(findSong(SongName) == null) {
			Songs.add(new Song(SongName,Duration));
			System.out.println(SongName + " successfully added to the list");
			return true;
		} else {
			System.out.println("Song with Name "+SongName+" already exist in the list");
			return false;
		}
		
	}
	
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber - 1;
		if(index > 0 && index <= this.Songs.size()) {
			playList.add(this.Songs.get(index));
			return true;
		}
		
		System.out.println("This album doesn't have song with tracknumber "+trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String SongName, LinkedList<Song> Playlist) {
		for(Song checkedSong : this.Songs) {
			if (checkedSong.getSongName().equals(SongName)) {
				Playlist.add(checkedSong);
				return true;
			}
		}
		
		System.out.println(SongName+ " there is no such song in Album..");
		return false;
	}
	
}
