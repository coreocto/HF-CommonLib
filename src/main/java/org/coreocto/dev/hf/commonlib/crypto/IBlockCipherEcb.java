package org.coreocto.dev.hf.commonlib.crypto;

@Deprecated
public interface IBlockCipherEcb {
    public byte[] encrypt(byte[] key, byte[] data);

    public byte[] decrypt(byte[] key, byte[] data);
}
