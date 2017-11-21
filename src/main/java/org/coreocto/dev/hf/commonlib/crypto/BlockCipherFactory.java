package org.coreocto.dev.hf.commonlib.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BlockCipherFactory {

    public static final String CIPHER_AES = "AES";
    public static final String CIPHER_DES = "DES";
    public static final String CIPHER_DESede = "DESede";
    public static final String MODE_CBC = "CBC";
    public static final String MODE_ECB = "ECB";
    public static final String PADDING_PKCS5 = "PKCS5Padding";
    public static final String SEP = "/";

    public static Cipher getCipher(String cipher, String cipherTransform, int mode, byte[] key, byte[] iv) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, cipher);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Cipher result = Cipher.getInstance(cipherTransform);
        result.init(mode, secretKeySpec, ivParameterSpec);
        return result;
    }

    public static Cipher getCipher(String cipher, String cipherTransform, int mode, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, cipher);
        Cipher result = Cipher.getInstance(cipherTransform);
        result.init(mode, secretKeySpec);
        return result;
    }
}
