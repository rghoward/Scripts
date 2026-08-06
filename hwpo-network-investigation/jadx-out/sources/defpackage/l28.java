package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l28 extends x2 {
    public boolean a;
    public boolean b;
    public w28 c;
    public String d;
    public float e;

    @Override // defpackage.x2, defpackage.fsb
    public final void d(rrb rrbVar, float f) {
        rrbVar.getClass();
        this.e = f;
    }

    @Override // defpackage.x2, defpackage.fsb
    public final void e(rrb rrbVar, x28 x28Var) {
        rrbVar.getClass();
        int iOrdinal = x28Var.ordinal();
        if (iOrdinal == 2) {
            this.b = false;
        } else if (iOrdinal == 3) {
            this.b = true;
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.b = false;
        }
    }

    @Override // defpackage.x2, defpackage.fsb
    public final void f(rrb rrbVar, w28 w28Var) {
        rrbVar.getClass();
        if (w28Var == w28.v) {
            this.c = w28Var;
        }
    }

    @Override // defpackage.x2, defpackage.fsb
    public final void g(rrb rrbVar, String str) {
        rrbVar.getClass();
        this.d = str;
    }
}
