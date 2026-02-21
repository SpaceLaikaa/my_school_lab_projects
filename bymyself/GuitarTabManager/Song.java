package bymyself.GuitarTabManager;

public class Song {
    private String band;
    private String title;
    private int guitarString;

    public Song(String band, String title, String guitarString){
        this.band = band;
        this.title = title;
        this.guitarString = Integer.parseInt(guitarString);
    }


}
