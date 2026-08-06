package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf2 implements ci4 {
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        os6.a aVar = (os6.a) obj;
        Throwable cancellationException = (Throwable) obj2;
        aVar.getClass();
        bp1 bp1Var = aVar.b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        bp1Var.B0(cancellationException);
        return g2b.a;
    }
}
