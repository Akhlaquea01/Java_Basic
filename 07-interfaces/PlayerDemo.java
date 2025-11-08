/**
 * This class is used to demonstrate the use of interfaces
 * by creating and interacting with a MusicPlayer object through the Playable interface.
 */
public class PlayerDemo {

    public static void main(String[] args) {

        // --- Create a MusicPlayer object and refer to it by the Playable interface ---
        // This is a common practice that promotes flexibility and loose coupling.
        Playable myPlayer = new MusicPlayer("Bohemian Rhapsody");

        // --- Interact with the object through the interface methods ---
        myPlayer.play();
        myPlayer.pause();
        myPlayer.stop();
    }
}
