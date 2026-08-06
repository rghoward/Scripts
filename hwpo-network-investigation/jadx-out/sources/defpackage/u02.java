package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u02 extends ak0 {
    private final h72 _context;
    private transient r02<Object> intercepted;

    public u02(r02<Object> r02Var) {
        this(r02Var, r02Var != null ? r02Var.getContext() : null);
    }

    @Override // defpackage.r02
    public h72 getContext() {
        h72 h72Var = this._context;
        h72Var.getClass();
        return h72Var;
    }

    public final r02<Object> intercepted() {
        r02<Object> r02VarT = this.intercepted;
        if (r02VarT == null) {
            v02 v02Var = (v02) getContext().d0(v02.a.t);
            r02VarT = v02Var != null ? v02Var.t(this) : this;
            this.intercepted = r02VarT;
        }
        return r02VarT;
    }

    @Override // defpackage.ak0
    public void releaseIntercepted() {
        r02<?> r02Var = this.intercepted;
        if (r02Var != null && r02Var != this) {
            h72.a aVarD0 = getContext().d0(v02.a.t);
            aVarD0.getClass();
            ((v02) aVarD0).v(r02Var);
        }
        this.intercepted = ip1.t;
    }

    public u02(r02<Object> r02Var, h72 h72Var) {
        super(r02Var);
        this._context = h72Var;
    }
}
