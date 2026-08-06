package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd9 implements jn3 {
    public final gj8 a;

    public gd9(gj8 gj8Var) {
        this.a = gj8Var;
    }

    @Override // defpackage.jn3
    public final pi8 a() throws Throwable {
        gj8 gj8Var = this.a;
        IOException iOException = null;
        while (!gj8Var.k.K) {
            try {
                fy8.b bVarD = gj8Var.d();
                if (!bVarD.b()) {
                    fy8.a aVarE = bVarD.e();
                    if (aVarE.b == null && aVarE.c == null) {
                        aVarE = bVarD.g();
                    }
                    fy8.b bVar = aVarE.b;
                    Throwable th = aVarE.c;
                    if (th != null) {
                        throw th;
                    }
                    if (bVar != null) {
                        gj8Var.p.addFirst(bVar);
                    }
                }
                return bVarD.d();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    fn3.b(iOException, e);
                }
                if (!gj8Var.b(null)) {
                    throw iOException;
                }
            }
        }
        o03.a("Canceled");
        return null;
    }

    @Override // defpackage.jn3
    public final fy8 b() {
        return this.a;
    }
}
