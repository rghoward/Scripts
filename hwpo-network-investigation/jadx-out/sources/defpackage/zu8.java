package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zu8 extends yu8 implements ni4<Object> {
    public final int t;

    public zu8(int i, r02<Object> r02Var) {
        super(r02Var);
        this.t = i;
    }

    @Override // defpackage.ni4
    public final int getArity() {
        return this.t;
    }

    @Override // defpackage.ak0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ll8.a.getClass();
        return ml8.a(this);
    }
}
