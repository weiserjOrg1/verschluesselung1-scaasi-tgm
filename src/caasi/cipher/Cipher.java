package caasi.cipher;

/**
 * Cipher is used as interface for the functionality of
 * the class MonoAlphabeticCipher.
 * @author caasi
 * @version 19-10-2018
 */
public interface Cipher {
    public String encrypt(String text);
    public String decrypt(String text);
}
