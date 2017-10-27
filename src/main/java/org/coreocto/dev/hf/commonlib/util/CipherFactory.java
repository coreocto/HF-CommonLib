package org.coreocto.dev.hf.commonlib.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CipherFactory {
    public Cipher getCipher(byte[] iv, byte[] key, String cipher, String transform, int mode) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, cipher);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        Cipher result = null;

        try {
            result = Cipher.getInstance(IAes128Cbc.CIPHER_TRANSFORMATION);
            result.init(mode, secretKeySpec, ivParameterSpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
