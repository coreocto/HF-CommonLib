package org.coreocto.dev.hf.commonlib.crypto;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface IHashFunc {
    public byte[] getHash(String s) throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException;

    public byte[] getHash(byte[] data) throws NoSuchAlgorithmException, InvalidKeyException;
}
