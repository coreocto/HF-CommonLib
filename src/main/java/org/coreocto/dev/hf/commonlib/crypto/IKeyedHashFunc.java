package org.coreocto.dev.hf.commonlib.crypto;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface IKeyedHashFunc {
    public byte[] getHash(String key, String s) throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException;

    public byte[] getHash(byte[] key, byte[] data) throws InvalidKeyException, NoSuchAlgorithmException;
}
