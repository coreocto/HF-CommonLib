package org.coreocto.dev.hf.commonlib.crypto;

public interface IHashFunc {
    public byte[] getHash(String s);

    public byte[] getHash(byte[] data);
}
