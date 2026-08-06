package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xoa<U, T extends U> extends i59<T> implements Runnable {
    public final long z;

    public xoa(long j, u02 u02Var) {
        super(u02Var, u02Var.getContext());
        this.z = j;
    }

    @Override // defpackage.ll5
    public final String k0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.k0());
        sb.append("(timeMillis=");
        return fh0.b(sb, this.z, ')');
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0027, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        String strL;
        h72 h72Var = this.x;
        zv2 zv2VarC = bw2.c(h72Var);
        cw2 cw2Var = zv2VarC instanceof cw2 ? (cw2) zv2VarC : null;
        long j = this.z;
        if (cw2Var != null) {
            l93.a aVar = l93.u;
            o93.g(j, q93.MILLISECONDS);
            strL = cw2Var.L();
            if (strL == null) {
                strL = "Timed out waiting for " + j + " ms";
            }
        } else {
            strL = "Timed out waiting for " + j + " ms";
        }
        z(new woa(strL, this));
    }
}
