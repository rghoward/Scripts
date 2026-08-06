package io.ably.lib.types;

import io.ably.lib.http.HttpAuth;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyOptions {
    public String host;
    public String[] nonProxyHosts;
    public String password;
    public int port;
    public HttpAuth.Type prefAuthType = HttpAuth.Type.BASIC;
    public String username;
}
