package dev.hdr.restaurant_review.exceptions;

public class StorageException extends BaseException {
    
    public StorageException() {
        super();
    }

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageException(Throwable cause) {
        super(cause);
    }

    // protected StorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    //     super(message, cause, enableSuppression, writableStackTrace);
    // }

}
