package org.coreocto.dev.hf.commonlib.suise.util;

import org.coreocto.dev.hf.commonlib.util.IBase64;
import org.coreocto.dev.hf.commonlib.util.IMd5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Random;

public class SuiseUtil {

    private final static char[] hexArray = "0123456789abcdef".toCharArray();

    private IBase64 base64;
    private IMd5 md5;

    public SuiseUtil(IBase64 base64, IMd5 md5) {
        this.base64 = base64;
        this.md5 = md5;
    }

    public IBase64 getBase64() {
        return base64;
    }

    public IMd5 getMd5() {
        return md5;
    }

    public String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public byte[] hexToBytes(String hexString) {
        byte[] bytes = new byte[hexString.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hexString.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    public String H(String searchToken, String pseudorandomVal) {
        byte[] a = base64.decodeToByteArray(searchToken);
        byte[] b = base64.decodeToByteArray(pseudorandomVal);

        byte[] c = new byte[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        byte[] digest = md5.getHash(c);

        if (digest == null) {
            return null;
        }

        return base64.encodeToString(digest);
    }

    public void setRandomBytes(byte[] bytes, int seed) {
        Random rnd = new Random(seed);
        rnd.nextBytes(bytes);
    }

    public String g(int noOfBytes) {
        byte[] randomBytes = new byte[noOfBytes];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(randomBytes);
        return base64.encodeToString(randomBytes);
    }

    public void copy(int bufferSize, InputStream is, OutputStream os) throws IOException {
        int i;
        byte[] b = new byte[bufferSize];
        while ((i = is.read(b)) != -1) {
            os.write(b, 0, i);
        }
    }
}
