package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k7b {
    public oh4<? super k7b, g2b> a;

    public abstract void a(d73 d73Var);

    public oh4<k7b, g2b> b() {
        return this.a;
    }

    public final void c() {
        oh4<k7b, g2b> oh4VarB = b();
        if (oh4VarB != null) {
            oh4VarB.invoke(this);
        }
    }

    public void d(ap4.a aVar) {
        this.a = aVar;
    }
}
