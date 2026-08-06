package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uh7 implements Comparator<qr5> {
    public static final uh7 t = new uh7();

    @Override // java.util.Comparator
    public final int compare(qr5 qr5Var, qr5 qr5Var2) {
        qr5 qr5Var3 = qr5Var;
        qr5 qr5Var4 = qr5Var2;
        int iB = xj5.b(qr5Var4.I, qr5Var3.I);
        return iB != 0 ? iB : xj5.b(qr5Var3.hashCode(), qr5Var4.hashCode());
    }
}
