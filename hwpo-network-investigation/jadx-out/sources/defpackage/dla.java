package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dla {
    public static final ThreadLocal<pm3> a = new ThreadLocal<>();

    public static pm3 a() {
        ThreadLocal<pm3> threadLocal = a;
        pm3 pm3Var = threadLocal.get();
        if (pm3Var != null) {
            return pm3Var;
        }
        kr0 kr0Var = new kr0(Thread.currentThread());
        threadLocal.set(kr0Var);
        return kr0Var;
    }
}
