package io.ably.lib.network;

import defpackage.dy8;
import defpackage.f55;
import defpackage.g01;
import defpackage.ja0;
import defpackage.jp8;
import defpackage.lg7;
import defpackage.ol8;
import defpackage.qp8;
import defpackage.qu8;
import defpackage.ua1;
import defpackage.wq6;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.network.OkHttpUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpUtils {
    public static void injectProxySetting(ProxyConfig proxyConfig, lg7.a aVar) {
        if (proxyConfig == null) {
            return;
        }
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
        if (!proxy.equals(aVar.n)) {
            aVar.D = null;
        }
        aVar.n = proxy;
        if (proxyConfig.getUsername() == null || proxyConfig.getAuthType() != ProxyAuthType.BASIC) {
            return;
        }
        final String username = proxyConfig.getUsername();
        final String password = proxyConfig.getPassword();
        ja0 ja0Var = new ja0() { // from class: ng7
            @Override // defpackage.ja0
            public final jp8 a(dy8 dy8Var, qu8 qu8Var) {
                return OkHttpUtils.lambda$injectProxySetting$0(username, password, dy8Var, qu8Var);
            }
        };
        if (ja0Var != aVar.p) {
            aVar.D = null;
        }
        aVar.p = ja0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jp8 lambda$injectProxySetting$0(String str, String str2, dy8 dy8Var, qu8 qu8Var) {
        str.getClass();
        str2.getClass();
        Charset charset = ua1.e;
        charset.getClass();
        byte[] bytes = (str + ':' + str2).getBytes(charset);
        bytes.getClass();
        String strConcat = "Basic ".concat(new g01(bytes).a());
        jp8.a aVarB = qu8Var.t.b();
        aVarB.b(HttpConstants.Headers.PROXY_AUTHORIZATION, strConcat);
        return new jp8(aVarB);
    }

    public static jp8 toOkhttpRequest(HttpRequest httpRequest) {
        jp8.a aVar = new jp8.a();
        URL url = httpRequest.getUrl();
        url.getClass();
        String string = url.toString();
        string.getClass();
        f55.a aVar2 = new f55.a();
        qp8 qp8VarCreate = null;
        wq6 wq6VarA = null;
        aVar2.d(null, string);
        aVar.a = aVar2.a();
        if (httpRequest.getBody() != null) {
            byte[] content = httpRequest.getBody().getContent();
            String contentType = httpRequest.getBody().getContentType();
            ol8 ol8Var = wq6.e;
            contentType.getClass();
            try {
                wq6VarA = wq6.a.a(contentType);
            } catch (IllegalArgumentException unused) {
            }
            qp8VarCreate = qp8.create(content, wq6VarA);
        }
        aVar.c(httpRequest.getMethod(), qp8VarCreate);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                key.getClass();
                str.getClass();
                aVar.c.a(key, str);
            }
        }
        return new jp8(aVar);
    }
}
