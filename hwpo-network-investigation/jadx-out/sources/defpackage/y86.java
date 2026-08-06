package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y86<K> extends ln4 {
    public final wn5<K> x;
    public final K y;
    public final ln4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y86(wn5<K> wn5Var, K k, ln4 ln4Var) {
        super(24);
        wn5Var.getClass();
        k.getClass();
        ln4Var.getClass();
        this.x = wn5Var;
        this.y = k;
        this.z = ln4Var;
    }

    @Override // defpackage.ln4
    public final Object G0(sd1 sd1Var) {
        return sd1Var.equals(this.x) ? me3.b(sd1Var).cast(this.y) : this.z.G0(sd1Var);
    }

    @Override // defpackage.ln4
    public final ln4 U0(sd1 sd1Var, Object obj) {
        wn5<K> wn5Var = this.x;
        boolean zEquals = sd1Var.equals(wn5Var);
        ln4 ln4Var = this.z;
        if (!zEquals) {
            ln4 ln4VarU0 = ln4Var.U0(sd1Var, null);
            if (ln4VarU0 != ln4Var) {
                this = new y86<>(wn5Var, this.y, ln4VarU0);
            }
            ln4Var = this;
        }
        return obj != null ? new y86(sd1Var, obj, ln4Var) : ln4Var;
    }

    @Override // defpackage.ln4
    public final String toString() {
        return th1.F(th1.M(cd9.e(ed9.d(this, new w86(0)))), null, "{", "}", new x86(0), 25);
    }
}
