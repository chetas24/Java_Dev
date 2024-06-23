package Java_Interface.ex3;

public class ex3 {
    public static void main(String[] args) {
        Encryptable aes = new AES();

        System.out.println("AES Encryption and Decryption");
        String encryptedDataAES = aes.encrypt("Hello World");
        System.out.println("AES Encrypted: " + encryptedDataAES);

        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES Decrypted: " + decryptedDataAES);

        Encryptable rsa = new RSA();

        System.out.println("RSA Encryption and Decryption");
        String encryptedDataRSA = rsa.encrypt("Hello World");
        System.out.println("RSA Encrypted: " + encryptedDataRSA);

        String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
        System.out.println("RSA Decrypted: " + decryptedDataRSA);
    }
}
