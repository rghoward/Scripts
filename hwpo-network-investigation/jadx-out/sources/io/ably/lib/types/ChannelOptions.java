package io.ably.lib.types;

import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ChannelOptions {
    public boolean attachOnSubscribe = true;
    public Object cipherParams;
    public boolean encrypted;
    public ChannelMode[] modes;
    public Map<String, String> params;

    @Deprecated
    public static ChannelOptions fromCipherKey(String str) {
        return fromCipherKey(Base64Coder.decode(str));
    }

    public static ChannelOptions withCipherKey(byte[] bArr) {
        ChannelOptions channelOptions = new ChannelOptions();
        channelOptions.encrypted = true;
        channelOptions.cipherParams = Crypto.getDefaultParams(bArr);
        return channelOptions;
    }

    public synchronized Crypto.CipherParams getCipherParamsOrDefault() {
        Crypto.CipherParams cipherParamsCheckCipherParams;
        cipherParamsCheckCipherParams = Crypto.checkCipherParams(this.cipherParams);
        if (this.cipherParams == null) {
            this.cipherParams = cipherParamsCheckCipherParams;
        }
        return cipherParamsCheckCipherParams;
    }

    public int getModeFlags() {
        int mask = 0;
        for (ChannelMode channelMode : this.modes) {
            mask |= channelMode.getMask();
        }
        return mask;
    }

    public boolean hasModes() {
        ChannelMode[] channelModeArr = this.modes;
        return (channelModeArr == null || channelModeArr.length == 0) ? false : true;
    }

    public boolean hasParams() {
        Map<String, String> map = this.params;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @Deprecated
    public static ChannelOptions fromCipherKey(byte[] bArr) {
        return withCipherKey(bArr);
    }

    public static ChannelOptions withCipherKey(String str) {
        return withCipherKey(Base64Coder.decode(str));
    }
}
