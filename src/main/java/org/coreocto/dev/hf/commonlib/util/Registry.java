package org.coreocto.dev.hf.commonlib.util;

public class Registry {
    private IAes128Cbc aes128Cbc;
    private IBase64 base64;
    private ILogger logger;
    private IMd5 md5;

    public Registry() {
    }

    public Registry(IAes128Cbc aes128Cbc, IBase64 base64, ILogger logger, IMd5 md5) {
        this.aes128Cbc = aes128Cbc;
        this.base64 = base64;
        this.logger = logger;
        this.md5 = md5;
    }

    public IAes128Cbc getAes128Cbc() {
        return aes128Cbc;
    }

    public void setAes128Cbc(IAes128Cbc aes128Cbc) {
        this.aes128Cbc = aes128Cbc;
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

    public IMd5 getMd5() {
        return md5;
    }

    public void setMd5(IMd5 md5) {
        this.md5 = md5;
    }
}
