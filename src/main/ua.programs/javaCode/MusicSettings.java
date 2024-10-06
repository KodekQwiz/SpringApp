import MUSIC.Music;

public class MusicSettings {


    private Music music;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
