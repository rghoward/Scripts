package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class od extends wa implements ci4<Exception, r02<? super g2b>, Object> {
    @Override // defpackage.ci4
    public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
        Exception exc2 = exc;
        gd gdVar = (gd) this.receiver;
        if (exc2 instanceof CancellationException) {
            gd.a aVar = gd.Companion;
            gdVar.getClass();
        } else {
            boolean z = gdVar.C.length() == 0;
            if (z) {
                gdVar.e(pb.f.a);
            } else {
                if (z) {
                    u.b();
                    return null;
                }
                gdVar.e(pb.i.a);
                gdVar.f(new rb(gdVar.B.a(exc2)));
            }
        }
        return g2b.a;
    }
}
