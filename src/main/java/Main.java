import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalCharacter, IllegalKey
    {
        Scanner aScanner = new Scanner(System.in);
        String plainText;
        Integer shiftKey;

        System.out.println("Enter Content: ");
        plainText = aScanner.nextLine();

        System.out.println("Enter Key: ");
        shiftKey = aScanner.nextInt();

        System.out.println();

        Encrypt encrypt = new Encrypt();
        encrypt.setEncryption_key(shiftKey);
        encrypt.setEncrypt_this(plainText);
        System.out.println("Original Content: " + encrypt.getEncrypt_this());
        System.out.println("Encrypted Content: " +encrypt.encrypt_data());

        Decrypt decrypt = new Decrypt();
        decrypt.setDecryption_key(encrypt.getEncryption_key());
        decrypt.setDecrypt_this(encrypt.getEncrypted_data());
        System.out.println("Decrypted Content: " +decrypt.decrypt_data());
    }
}
