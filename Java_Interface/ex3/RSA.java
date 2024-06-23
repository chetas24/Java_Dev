package Java_Interface.ex3;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;


public class RSA implements Encryptable {
    private static final String RSA_ALGORITHM = "RSA";

    // Declaring KeyPair to Store public and private key
    private KeyPair keyPair;

    // Constructor to initialize the Encryption
    public RSA()
    {
        try {
            KeyPairGenerator keygen = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            keygen.initialize(2048);
            keyPair = keygen.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implement the "encrypt" method required by the Encryptable interface
    @Override
    public String encrypt(String data)
    {
        try {
            PublicKey publicKey = keyPair.getPublic();
            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            // data.getBytes(): Converts the input string to a byte array.
            // cipher.doFinal(byte[] input): Encrypts the byte array using the AES algorithm and the previously initialized secretKey.
            // byte[] encryptedBytes: Holds the resulting encrypted data as a byte array.
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Implement the "decrypt" method required by the Encryptable interface
    @Override
    public String decrypt(String encryptedData)
    {
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
