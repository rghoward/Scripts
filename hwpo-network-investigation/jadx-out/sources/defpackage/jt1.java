package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface jt1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final C0187a a = new C0187a();

        /* JADX INFO: renamed from: jt1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0187a {
            public final String toString() {
                return "Empty";
            }
        }
    }

    boolean A(int i, boolean z);

    void B();

    void C(Object obj);

    default int D() {
        return Long.hashCode(v());
    }

    bj4.b E();

    <T> T F(hf8 hf8Var);

    void G();

    void H();

    void I();

    boolean J(Object obj);

    void K(int i);

    xj8 a();

    void b(ci4 ci4Var, Object obj);

    default boolean c(boolean z) {
        return c(z);
    }

    void d();

    void e(int i);

    Object f();

    default boolean g(float f) {
        return g(f);
    }

    default boolean h(int i) {
        return h(i);
    }

    default boolean i(long j) {
        return i(j);
    }

    default boolean j(Object obj) {
        return J(obj);
    }

    <T> void k(mh4<? extends T> mh4Var);

    boolean l();

    void m(Object obj);

    void n(boolean z);

    bj4 o(int i);

    void p(int i, Object obj);

    void q();

    boolean r();

    p20<?> s();

    void t(vj8 vj8Var);

    void u();

    long v();

    void w(mh4<g2b> mh4Var);

    h72 x();

    kw7 y();

    void z();
}
