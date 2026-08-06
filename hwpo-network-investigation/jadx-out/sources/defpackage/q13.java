package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q13 extends q9a {
    public final /* synthetic */ u13 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q13(u13 u13Var, String str) {
        super(str, true);
        this.e = u13Var;
    }

    @Override // defpackage.q9a
    public final long a() {
        u13 u13Var = this.e;
        synchronized (u13Var) {
            try {
                if (!u13Var.F || u13Var.G) {
                    return -1L;
                }
                try {
                    u13Var.J();
                } catch (IOException unused) {
                    u13Var.H = true;
                }
                try {
                    if (u13Var.u()) {
                        u13Var.E();
                        u13Var.C = 0;
                    }
                } catch (IOException unused2) {
                    u13Var.I = true;
                    mi8 mi8Var = u13Var.A;
                    if (mi8Var != null) {
                        vtb.b(mi8Var);
                    }
                    u13Var.A = new mi8(new vq0());
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
