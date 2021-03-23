package org.coreocto.dev.hf.commonlib.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFuncFactory {
    public static MessageDigest getMessageDigest(String algorithm) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(algorithm);
    }
}
