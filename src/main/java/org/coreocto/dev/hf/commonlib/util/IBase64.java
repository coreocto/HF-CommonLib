package org.coreocto.dev.hf.commonlib.util;

public interface IBase64 {
    public String encodeToString(byte[] data);

    public byte[] decodeToByteArray(String base64Str);
}
