package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.g2b;
import defpackage.jp8;
import defpackage.oh4;
import defpackage.p21;
import defpackage.qu8;
import defpackage.ru8;
import defpackage.u21;
import defpackage.voa;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseCall<S> implements p21<NetworkResponse<? extends S>> {
    public static final int $stable = 8;
    private final p21<S> delegate;
    private final oh4<Throwable, g2b> onClientError;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseCall(p21<S> p21Var, oh4<? super Throwable, g2b> oh4Var) {
        p21Var.getClass();
        oh4Var.getClass();
        this.delegate = p21Var;
        this.onClientError = oh4Var;
    }

    @Override // defpackage.p21
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // defpackage.p21
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NetworkResponseCall<S> m18clone() {
        p21<S> p21VarM18clone = this.delegate.m18clone();
        p21VarM18clone.getClass();
        return new NetworkResponseCall<>(p21VarM18clone, this.onClientError);
    }

    @Override // defpackage.p21
    public void enqueue(final u21<NetworkResponse<S>> u21Var) {
        u21Var.getClass();
        this.delegate.enqueue(new u21<S>() { // from class: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall.enqueue.1
            @Override // defpackage.u21
            public void onFailure(p21<S> p21Var, Throwable th) {
                NetworkResponse clientError;
                p21Var.getClass();
                th.getClass();
                if (th instanceof IOException) {
                    clientError = new NetworkResponse.NetworkError((IOException) th);
                } else {
                    ((NetworkResponseCall) this).onClientError.invoke(new Exception("Client error on ".concat(p21Var.request().a.b()), th));
                    clientError = new NetworkResponse.ClientError(th);
                }
                u21Var.onResponse(this, ru8.a(clientError));
            }

            @Override // defpackage.u21
            public void onResponse(p21<S> p21Var, ru8<S> ru8Var) {
                p21Var.getClass();
                ru8Var.getClass();
                S s = ru8Var.b;
                qu8 qu8Var = ru8Var.a;
                int i = qu8Var.w;
                boolean z = qu8Var.J;
                u21<NetworkResponse<S>> u21Var2 = u21Var;
                if (!z) {
                    u21Var2.onResponse(this, ru8.a(new NetworkResponse.ServerError(i)));
                    return;
                }
                NetworkResponseCall<S> networkResponseCall = this;
                if (s != null) {
                    u21Var2.onResponse(networkResponseCall, ru8.a(new NetworkResponse.Success(s)));
                } else {
                    u21Var2.onResponse(networkResponseCall, ru8.a(new NetworkResponse.ClientError(new Throwable())));
                }
            }
        });
    }

    public ru8<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // defpackage.p21
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // defpackage.p21
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // defpackage.p21
    public jp8 request() {
        jp8 jp8VarRequest = this.delegate.request();
        jp8VarRequest.getClass();
        return jp8VarRequest;
    }

    @Override // defpackage.p21
    public voa timeout() {
        voa voaVarTimeout = this.delegate.timeout();
        voaVarTimeout.getClass();
        return voaVarTimeout;
    }
}
