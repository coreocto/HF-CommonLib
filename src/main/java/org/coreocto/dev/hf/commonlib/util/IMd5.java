package org.coreocto.dev.hf.commonlib.util;

public interface IMd5 {
    public byte[] getHash(String s);

    public byte[] getHash(byte[] data);
}
