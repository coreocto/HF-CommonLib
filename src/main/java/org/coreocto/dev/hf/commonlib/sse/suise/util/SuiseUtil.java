package org.coreocto.dev.hf.commonlib.sse.suise.util;

import org.coreocto.dev.hf.commonlib.util.Registry;
import org.coreocto.dev.hf.commonlib.util.Util;

import java.util.Random;

public class SuiseUtil {

    private Registry registry;

    public SuiseUtil(Registry registry) {
        this.registry = registry;
    }

    public Registry getRegistry() {
        return registry;
    }

    public byte[] H(byte[] searchToken, byte[] pseudorandomVal) {
        byte[] c = new byte[searchToken.length + pseudorandomVal.length];
        System.arraycopy(searchToken, 0, c, 0, searchToken.length);
        System.arraycopy(pseudorandomVal, 0, c, searchToken.length, pseudorandomVal.length);

        return registry.getHashFunc().getHash(c);
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
