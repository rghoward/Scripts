package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp7 implements ei4 {
    public final /* synthetic */ dr7 t;
    public final /* synthetic */ tq5 u;

    public /* synthetic */ wp7(dr7 dr7Var, tq5 tq5Var) {
        this.t = dr7Var;
        this.u = tq5Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        dr7 dr7Var = this.t;
        boolean zB = wq7.b(dr7Var, fFloatValue);
        char c = 0;
        if (dr7Var.n().c() != fl7.t) {
            if (this.u != tq5.t) {
                zB = !zB;
            }
        }
        int iG = dr7Var.n().g();
        float fA = iG == 0 ? 0.0f : wq7.a(dr7Var) / iG;
        float f = fA - ((int) fA);
        if (Math.abs(fFloatValue) >= dr7Var.n.U0(400.0f)) {
            c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
        }
        if (c == 0) {
            if (Math.abs(f) <= 0.5f) {
                float fAbs = Math.abs(fA);
                tx2 tx2Var = dr7Var.n;
                hr7.b bVar = hr7.a;
                if (fAbs < Math.abs(Math.min(tx2Var.U0(56.0f), dr7Var.p() / 2.0f) / dr7Var.p()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zB) {
                    fFloatValue2 = fFloatValue3;
                }
            } else if (zB) {
                fFloatValue2 = fFloatValue3;
            }
        } else if (c == 1) {
            fFloatValue2 = fFloatValue3;
        } else if (c != 2) {
            fFloatValue2 = 0.0f;
        }
        return Float.valueOf(fFloatValue2);
    }
}
