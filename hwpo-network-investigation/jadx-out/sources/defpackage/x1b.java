package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1b<T> extends i59<T> {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal<js7<h72, Object>> z;

    /* JADX WARN: Illegal instructions before constructor call */
    public x1b(r02 r02Var, h72 h72Var) {
        y1b y1bVar = y1b.t;
        super(r02Var, h72Var.d0(y1bVar) == null ? h72Var.c0(y1bVar) : h72Var);
        this.z = new ThreadLocal<>();
        if (r02Var.getContext().d0(v02.a.t) instanceof n72) {
            return;
        }
        Object objC = cla.c(h72Var, null);
        cla.a(h72Var, objC);
        H0(h72Var, objC);
    }

    @Override // defpackage.i59
    public final void E0() {
        G0();
    }

    public final boolean F0() {
        boolean z = this.threadLocalIsSet && this.z.get() == null;
        this.z.remove();
        return !z;
    }

    public final void G0() {
        if (this.threadLocalIsSet) {
            js7<h72, Object> js7Var = this.z.get();
            if (js7Var != null) {
                cla.a(js7Var.t, js7Var.u);
            }
            this.z.remove();
        }
    }

    public final void H0(h72 h72Var, Object obj) {
        this.threadLocalIsSet = true;
        this.z.set(new js7<>(h72Var, obj));
    }

    @Override // defpackage.i59, defpackage.ll5
    public final void s(Object obj) {
        G0();
        Object objB = lp1.b(obj);
        r02<T> r02Var = this.y;
        h72 context = r02Var.getContext();
        Object objC = cla.c(context, null);
        x1b<?> x1bVarC = objC != cla.a ? l72.c(r02Var, context, objC) : null;
        try {
            r02Var.resumeWith(objB);
            g2b g2bVar = g2b.a;
        } finally {
            if (x1bVarC == null || x1bVarC.F0()) {
                cla.a(context, objC);
            }
        }
    }
}
