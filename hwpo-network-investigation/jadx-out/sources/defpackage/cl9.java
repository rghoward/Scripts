package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cl9 extends fx0 {
    public bva a;
    public long b = 9205357640488583168L;

    @Override // defpackage.fx0
    public final void a(float f, long j, cs7 cs7Var) {
        bva bvaVar = this.a;
        if (bvaVar == null || !cr9.a(this.b, j)) {
            if (cr9.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                bvaVar = null;
            } else {
                bvaVar = this.a;
                if (bvaVar == null) {
                    bvaVar = new bva();
                    this.a = bvaVar;
                }
                bvaVar.a = b(j);
                this.a = bvaVar;
                this.b = j;
            }
        }
        long jC = cs7Var.c();
        long j2 = uh1.b;
        if (!uh1.c(jC, j2)) {
            cs7Var.f(j2);
        }
        if (!xj5.a(cs7Var.e(), bvaVar != null ? bvaVar.a : null)) {
            cs7Var.d(bvaVar != null ? bvaVar.a : null);
        }
        if (cs7Var.a() == f) {
            return;
        }
        cs7Var.b(f);
    }

    public abstract Shader b(long j);
}
