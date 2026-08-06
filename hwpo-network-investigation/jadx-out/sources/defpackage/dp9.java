package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dp9<T> {
    public final t72 a;
    public final og2 b;
    public final zx0 c = da1.a(Integer.MAX_VALUE, 6, null);
    public final i60 d = new i60();

    public dp9(t72 t72Var, final sf2 sf2Var, final tf2 tf2Var, og2 og2Var) {
        this.a = t72Var;
        this.b = og2Var;
        el5 el5Var = (el5) t72Var.getCoroutineContext().d0(el5.a.t);
        if (el5Var != null) {
            el5Var.j0(new oh4() { // from class: bp9
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    sf2Var.invoke(th);
                    zx0 zx0Var = this.c;
                    zx0Var.p(th, false);
                    while (true) {
                        Object objA = ga1.a(zx0Var.d());
                        if (objA == null) {
                            return g2b.a;
                        }
                        tf2Var.invoke(objA, th);
                    }
                }
            });
        }
    }
}
