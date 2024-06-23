package Java_Interface.ex3;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class AES implements Encryptable {
    // Defining AES Algorithm as Constant
    private static final String AES_ALGORITHM = "AES";

    // Declaring SecretKey to Store Encryption Key
    private SecretKey secretKey;

    // Constructor to initialize the Encryption
    public AES()
    {
        try {
            KeyGenerator keygen = KeyGenerator.getInstance(AES_ALGORITHM);
            keygen.init(128);
            secretKey = keygen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implement the "encrypt" method required by the Encryptable interface
    @Override
    public String encrypt(String data)
    {
        try {
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

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
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
