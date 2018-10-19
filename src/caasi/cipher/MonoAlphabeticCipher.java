package caasi.cipher;

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
