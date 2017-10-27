package org.coreocto.dev.hf.commonlib.util;

public interface IAes128Cbc {

    public static final int BLOCK_SIZE_IN_BYTE = 16;
    public static final String CIPHER = "AES";
    public static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public byte[] encrypt(byte[] iv, byte[] key, byte[] data);
    public byte[] decrypt(byte[] iv, byte[] key, byte[] data);
}
