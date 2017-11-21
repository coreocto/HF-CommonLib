package org.coreocto.dev.hf.commonlib.crypto;

public interface IBlockCipherCbc {
    public byte[] encrypt(byte[] iv, byte[] key, byte[] data);
    public byte[] decrypt(byte[] iv, byte[] key, byte[] data);
}