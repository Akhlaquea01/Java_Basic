/**
 * This interface defines a contract for objects that can be "played".
 * An interface is a completely abstract type that specifies a set of methods that a class must implement.
 * It is a way to achieve full abstraction in Java.
 */
public interface Playable {

    // --- Abstract Methods ---
    // All methods in an interface are implicitly public and abstract.

    /**
     * Starts the playback of the object.
     */
    void play();

    /**
     * Pauses the playback.
     */
    void pause();

    /**
     * Stops the playback.
     */
    void stop();
}
