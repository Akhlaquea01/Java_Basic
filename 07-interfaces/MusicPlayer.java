/**
 * This class represents a music player and implements the Playable interface.
 * By implementing an interface, a class agrees to provide a concrete implementation
 * for all the abstract methods defined in that interface.
 */
public class MusicPlayer implements Playable {

    private String currentTrack;

    public MusicPlayer(String track) {
        this.currentTrack = track;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Music paused: " + currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Music stopped: " + currentTrack);
    }
}
