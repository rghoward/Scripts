package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s5d extends y3d {
    public final g3c a;

    public s5d(mwc mwcVar) {
        this.a = mwcVar;
    }

    @Override // defpackage.y3d
    public final b1 a(final IOException iOException, le2 le2Var) {
        if (!(iOException.getCause() instanceof k2c)) {
            return ti4.j1(iOException);
        }
        t85 t85VarK1 = ti4.k1(this.a);
        final z4d z4dVar = (z4d) le2Var.a;
        x40 x40Var = new x40() { // from class: x4d
            @Override // defpackage.x40
            public final ListenableFuture apply(Object obj) throws IOException {
                z4d z4dVar2 = z4dVar;
                z4dVar2.c((Uri) ti4.i1(z4dVar2.b), obj);
                return t85.u;
            }
        };
        int i = v7d.a;
        return ti4.h1(ti4.n1(t85VarK1, new m7d(m6d.a(), x40Var), z4dVar.d), IOException.class, new x40() { // from class: r5d
            @Override // defpackage.x40
            public final /* synthetic */ ListenableFuture apply(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, y03.t);
    }
}
