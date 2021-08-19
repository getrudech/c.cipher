import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void encrypt_data_encryptABCtoFGH_FGH()
            throws IllegalKey, IllegalCharacter
    {
        Encrypt encrypt = new Encrypt();
        encrypt.setEncryption_key(5);
        encrypt.setEncrypt_this("ABC");
        assertEquals("FGH",encrypt.encrypt_data());
    }

    @Test
    public void decrypt_data_decryptFGHtoABC()
            throws IllegalKey, IllegalCharacter
    {

        Decrypt decrypt = new Decrypt();
        decrypt.setDecryption_key(5);
        decrypt.setDecrypt_this("FGH");
        assertEquals("ABC",decrypt.decrypt_data());
    }
}/;t