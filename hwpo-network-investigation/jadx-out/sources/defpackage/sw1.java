package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1<T> {
    public final a0a a;
    public final rw1 b;

    public sw1(int i) {
        a0a a0aVarB = b0a.b(new js7(Integer.MIN_VALUE, null));
        this.a = a0aVarB;
        this.b = new rw1(a0aVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(T t) {
        t.getClass();
        a0a a0aVar = this.a;
        js7 js7Var = new js7(Integer.valueOf(((Number) ((js7) a0aVar.getValue()).t).intValue() + 1), t);
        a0aVar.getClass();
        a0aVar.l(null, js7Var);
    }
}
