package org.coreocto.dev.hf.commonlib.sse.suise.util;

import org.coreocto.dev.hf.commonlib.crypto.IKeyedHashFunc;
import org.coreocto.dev.hf.commonlib.util.Util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class SuiseUtil {

    public byte[] H(byte[] searchToken, byte[] pseudorandomVal, IKeyedHashFunc keyedHashFunc) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] c = new byte[searchToken.length + pseudorandomVal.length];
        System.arraycopy(searchToken, 0, c, 0, searchToken.length);
        System.arraycopy(pseudorandomVal, 0, c, searchToken.length, pseudorandomVal.length);

        return keyedHashFunc.getHash(searchToken, pseudorandomVal);
    }

    public void setRandomBytes(byte[] bytes, int seed) {
        Random rnd = new Random(seed);
        rnd.nextBytes(bytes);
    }

    public byte[] g(int noOfBytes) {
        byte[] randomBytes = new byte[noOfBytes];
        Util.fillRandomBytes(randomBytes);
        return randomBytes;
    }
}
