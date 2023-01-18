import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class key {


    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Generate a 256 bit = 32 byte long AES key");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println("secretKey: " + secretKey);
        // the key is a 32 bytes long byte array
        byte[] aesKey = secretKey.getEncoded();
        System.out.println("aesKey length: " + aesKey.length);
        System.out.println("aesKey:" + aesKey);
        // convert to a base64 encoded String
        String aesKeyBase64 = Base64.getEncoder().encodeToString(aesKey);
        System.out.println("aesKeyBase64: " + aesKeyBase64);
    }
}
