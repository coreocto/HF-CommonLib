package org.coreocto.dev.hf.commonlib.util;

import org.coreocto.dev.hf.commonlib.crypto.IBlockCipherCbc;
import org.coreocto.dev.hf.commonlib.crypto.IHashFunc;

public class Registry {
    private IBlockCipherCbc blockCipherCbc;
    private IBase64 base64;
    private ILogger logger;
    private IHashFunc hashFunc;

    public Registry() {
    }

    public Registry(IBlockCipherCbc blockCipherCbc, IBase64 base64, ILogger logger, IHashFunc hashFunc) {
        this.blockCipherCbc = blockCipherCbc;
        this.base64 = base64;
        this.logger = logger;
        this.hashFunc = hashFunc;
    }

    public IBlockCipherCbc getBlockCipherCbc() {
        return blockCipherCbc;
    }

    public void setBlockCipherCbc(IBlockCipherCbc blockCipherCbc) {
        this.blockCipherCbc = blockCipherCbc;
    }

    public IBase64 getBase64() {
        return base64;
    }

    public void setBase64(IBase64 base64) {
        this.base64 = base64;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public IHashFunc getHashFunc() {
        return hashFunc;
    }

    public void setHashFunc(IHashFunc hashFunc) {
        this.hashFunc = hashFunc;
    }
}
