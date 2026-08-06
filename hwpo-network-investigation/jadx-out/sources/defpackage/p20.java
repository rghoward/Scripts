package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface p20<N> {
    N a();

    default void b(ci4<? super N, Object, g2b> ci4Var, Object obj) {
        ci4Var.invoke(a(), obj);
    }

    void c(int i, N n);

    void d(N n);

    default void e() {
        N nA = a();
        ls1 ls1Var = nA instanceof ls1 ? (ls1) nA : null;
        if (ls1Var != null) {
            ls1Var.p();
        }
    }

    void f(int i, int i2, int i3);

    void g(int i, int i2);

    void h();

    void i(int i, N n);

    default void j() {
    }
}
