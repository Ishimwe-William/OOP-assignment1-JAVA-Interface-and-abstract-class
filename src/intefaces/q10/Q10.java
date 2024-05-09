/**
 * 10. Write a  program to create an interface Encryptable with methods
 * encrypt (String data) and decrypt (String encryptedData) that define
 * encryption and decryption operations. Create two classes AES and RSA
 * that implement the Encryptable interface and provide their own encryption
 * and decryption algorithms.
 */

package intefaces.q10;

public class Q10 {
    public static void main(String[] args) {
        RSA rsa = new RSA();
        AES aes = new AES();

        System.out.println("Encrypt: "+rsa.encrypt("data") + " Decrypt: "+rsa.decrypt("data"));
        System.out.println("Encrypt: "+aes.encrypt("data") + " Decrypt: "+aes.decrypt("data"));
    }
}
