package Songs;

public class Song {

	String SongName;
	double Duration;
	
	
	public Song(String SongName, double Duration) {
		this.SongName = SongName;
		this.Duration = Duration;
	}


	public String getSongName() {
		return SongName;
	}

	public double getDuration() {
		return Duration;
	}


	@Override
	public String toString() {
		return "Song [SongName=" + SongName + ", Duration=" + Duration + "]";
	}
	
	
	
	
	
}
