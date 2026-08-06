package defpackage;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ru8<T> {
    public final qu8 a;
    public final T b;
    public final su8 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ru8(qu8 qu8Var, Object obj, tu8 tu8Var) {
        this.a = qu8Var;
        this.b = obj;
        this.c = tu8Var;
    }

    public static ru8 a(NetworkResponse networkResponse) {
        qu8.a aVar = new qu8.a();
        aVar.c = 200;
        aVar.d = "OK";
        aVar.b = gf8.HTTP_1_1;
        jp8.a aVar2 = new jp8.a();
        aVar2.d("http://localhost/");
        aVar.a = new jp8(aVar2);
        return b(networkResponse, aVar.a());
    }

    public static <T> ru8<T> b(T t, qu8 qu8Var) {
        if (qu8Var.J) {
            return new ru8<>(qu8Var, t, null);
        }
        z90.a("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
