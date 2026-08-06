package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.p21;
import defpackage.q21;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseAdapter<S> implements q21<S, p21<NetworkResponse<? extends S>>> {
    public static final int $stable = 8;
    private final oh4<Throwable, g2b> onClientError;
    private final Type successType;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseAdapter(Type type, oh4<? super Throwable, g2b> oh4Var) {
        type.getClass();
        oh4Var.getClass();
        this.successType = type;
        this.onClientError = oh4Var;
    }

    @Override // defpackage.q21
    public p21<NetworkResponse<S>> adapt(p21<S> p21Var) {
        p21Var.getClass();
        return new NetworkResponseCall(p21Var, this.onClientError);
    }

    @Override // defpackage.q21
    public Type responseType() {
        return this.successType;
    }
}
