package org.coreocto.dev.hf.commonlib.crypto;

public interface IKeyedHashFunc {
    public byte[] getHash(String key, String s);

    public byte[] getHash(byte[] key, byte[] data);
}
