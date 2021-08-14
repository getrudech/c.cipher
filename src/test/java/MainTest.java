import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void encrypt_data_encryptABCtoFGH_FGH()
    {
        Encrypt encrypt = new Encrypt();
        encrypt.setEncryption_key(5);
        encrypt.setEncrypt_this("ABC");
        //System.out.println("Original Content: " + encrypt.getEncrypt_this());
        //System.out.println("Encrypted Content: " +encrypt.encrypt_data());
        assertEquals("FGH",encrypt.encrypt_data());
    }

    @Test
    public void decrypt_data_decryptFGHtoABC()
    {

        Decrypt decrypt = new Decrypt();
        decrypt.setDecryption_key(5);6
        decrypt.setDecrypt_this("FGH");
        //System.out.println("Decrypted Content: " +decrypt.decrypt_data());
        assertEquals("ABC",decrypt.decrypt_data());
    }
}