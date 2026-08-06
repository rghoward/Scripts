package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg extends wa implements ci4<Exception, r02<? super g2b>, Object> {
    @Override // defpackage.ci4
    public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
        Exception exc2 = exc;
        pg pgVar = (pg) this.receiver;
        if (exc2 instanceof CancellationException) {
            pg.b bVar = pg.Companion;
            pgVar.getClass();
        } else {
            boolean z = pgVar.L.length() == 0;
            if (z) {
                pgVar.e(ef.f.a);
            } else {
                if (z) {
                    u.b();
                    return null;
                }
                pgVar.e(ef.i.a);
                pgVar.f(new jf(pgVar.B.a(exc2)));
            }
        }
        return g2b.a;
    }
}
