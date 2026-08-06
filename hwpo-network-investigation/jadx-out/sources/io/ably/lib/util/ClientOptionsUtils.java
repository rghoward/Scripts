package io.ably.lib.util;

import io.ably.lib.http.HttpAuth;
import io.ably.lib.network.ProxyAuthType;
import io.ably.lib.network.ProxyConfig;
import io.ably.lib.types.ClientOptions;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientOptionsUtils {

    /* JADX INFO: renamed from: io.ably.lib.util.ClientOptionsUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[HttpAuth.Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[HttpAuth.Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[HttpAuth.Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ProxyConfig convertToProxyConfig(ClientOptions clientOptions) {
        if (clientOptions.proxy == null) {
            return null;
        }
        ProxyConfig.ProxyConfigBuilder proxyConfigBuilderBuilder = ProxyConfig.builder();
        proxyConfigBuilderBuilder.host(clientOptions.proxy.host).port(clientOptions.proxy.port).username(clientOptions.proxy.username).password(clientOptions.proxy.password);
        String[] strArr = clientOptions.proxy.nonProxyHosts;
        if (strArr != null) {
            proxyConfigBuilderBuilder.nonProxyHosts(Arrays.asList(strArr));
        }
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[clientOptions.proxy.prefAuthType.ordinal()];
        if (i == 1) {
            proxyConfigBuilderBuilder.authType(ProxyAuthType.BASIC);
        } else if (i == 2) {
            proxyConfigBuilderBuilder.authType(ProxyAuthType.DIGEST);
        }
        return proxyConfigBuilderBuilder.build();
    }
}
