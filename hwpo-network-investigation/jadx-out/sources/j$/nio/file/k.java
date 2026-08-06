package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void b(String str, int i) {
        throw new j$.time.b(str + i);
    }

    public static /* synthetic */ void c(String str, int i, Object obj) {
        throw new j$.time.b(str + i + obj);
    }

    public static /* synthetic */ void d(String str, Object obj) {
        throw new j$.time.temporal.s(str + obj);
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException(str + obj + obj2);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new j$.time.b(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Throwable th) {
        throw new j$.time.b(str + obj + ((Object) " of type ") + obj2, th);
    }

    public static /* synthetic */ void h(String str) {
        throw new j$.time.b(str);
    }

    public static /* synthetic */ void i(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void j(String str, Object obj) {
        throw new j$.time.b(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new ClassCastException(str + obj + ((Object) ", actual: ") + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, int i) {
        throw new IllegalArgumentException(str + ((char) i));
    }
}
