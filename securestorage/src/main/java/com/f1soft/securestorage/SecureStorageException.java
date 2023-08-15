package com.f1soft.securestorage;

public class SecureStorageException extends Exception {
    public final ExceptionType type;

    /**
     * @param detailMessage Exception message that will be shown to developer when it is thrown
     * @param cause         Cause of the throwable that has been caught (can be null)
     * @param type          Type of exception that should be thrown
     * @see ExceptionType
     */
    public SecureStorageException(String detailMessage, Throwable cause, ExceptionType type) {
        super(detailMessage, cause);
        this.type = type;
    }

    /**
     * Used for throwing exceptions with a type that makes more sense to the developer based on the cause
     */
    public enum ExceptionType {
        /**
         * If this exception type is defined you cannot use the keystore / this library on the current device. This is fatal and most likely due to native key store issues.
         */
        KEYSTORE_EXCEPTION,
        /**
         * If this exception type is defined a problem during encryption has occurred. Most likely this is due to using an invalid key for encryption or decryption.
         */
        CRYPTO_EXCEPTION,
        /**
         * If this exception type is set it means simply that the keystore cannot be used on the current device as it is not supported by this library. This probably means that you are targeting a device prior to api 23 or any not supported fingerprint sensors of Samsung
         */
        KEYSTORE_NOT_SUPPORTED_EXCEPTION,
        /**
         * If this exception type is set it means that something with this library is wrong.
         */
        INTERNAL_LIBRARY_EXCEPTION
    }
}
