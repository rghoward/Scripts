package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr5 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qr5 qr5Var = (qr5) obj;
        qr5 qr5Var2 = (qr5) obj2;
        float f = qr5Var.Z.p.Y;
        float f2 = qr5Var2.Z.p.Y;
        return f == f2 ? xj5.b(qr5Var.J(), qr5Var2.J()) : Float.compare(f, f2);
    }
}
