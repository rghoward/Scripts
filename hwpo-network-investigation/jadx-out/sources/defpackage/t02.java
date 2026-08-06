package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t02 implements v21, oh4<Throwable, g2b> {
    public final o21 t;
    public final e41 u;

    public t02(o21 o21Var, e41 e41Var) {
        this.t = o21Var;
        this.u = e41Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        try {
            this.t.cancel();
        } catch (Throwable unused) {
        }
        return g2b.a;
    }

    @Override // defpackage.v21
    public final void onFailure(o21 o21Var, IOException iOException) {
        if (o21Var.isCanceled()) {
            return;
        }
        this.u.resumeWith(new av8.a(iOException));
    }

    @Override // defpackage.v21
    public final void onResponse(o21 o21Var, qu8 qu8Var) {
        this.u.resumeWith(qu8Var);
    }
}
