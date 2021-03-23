package org.coreocto.dev.hf.commonlib.crypto;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IHashFunc {
    public byte[] getHash(String s) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    public byte[] getHash(byte[] data) throws NoSuchAlgorithmException;
}
