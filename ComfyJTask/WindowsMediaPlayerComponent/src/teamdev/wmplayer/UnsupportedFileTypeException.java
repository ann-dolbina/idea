package teamdev.wmplayer;

/**
 * An exception which is thrown if the player cannot open and play the file.
 */
public class UnsupportedFileTypeException extends RuntimeException {
    /**
     * Constructs and initializes the instance of UnsupportedFileTypeException.
     *
     * @param message The detail message.
     */
    public UnsupportedFileTypeException(String message) {
        super(message);
    }
}
