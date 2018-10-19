package caasi.cipher;

/**
 * MonoAlphabeticCipher
 * encrypts and decrypts Text given from the User.
 * @author caasi
 * @version 19-10-2018
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet;

    public MonoAlphabeticCipher(){
        this.secretAlphabet = "";
    }

    public String getSecretAlphabet(){
        return this.secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet){
        this.secretAlphabet = secretAlphabet;
    }

    public String encrypt(String text){

    }

    public String decrypt(String text){

    }
}
