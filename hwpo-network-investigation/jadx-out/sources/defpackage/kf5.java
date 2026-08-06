package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf5<T> implements ResponseHandler<T> {
    public final ResponseHandler<? extends T> a;
    public final zoa b;
    public final ba7 c;

    public kf5(ResponseHandler<? extends T> responseHandler, zoa zoaVar, ba7 ba7Var) {
        this.a = responseHandler;
        this.b = zoaVar;
        this.c = ba7Var;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) {
        this.c.k(this.b.a());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = ca7.a(httpResponse);
        if (lA != null) {
            this.c.j(lA.longValue());
        }
        String strB = ca7.b(httpResponse);
        if (strB != null) {
            this.c.h(strB);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}
