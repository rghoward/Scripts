package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p6a extends u02 implements ni4<Object> {
    private final int arity;

    public p6a(int i, r02<Object> r02Var) {
        super(r02Var);
        this.arity = i;
    }

    @Override // defpackage.ni4
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.ak0
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ll8.a.getClass();
        return ml8.a(this);
    }

    public p6a(int i) {
        this(i, null);
    }
}
