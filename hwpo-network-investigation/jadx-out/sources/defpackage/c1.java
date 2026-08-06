package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, b1 b1Var, long j, b1.k kVar, b1.k kVar2) {
        while (!unsafe.compareAndSwapObject(b1Var, j, kVar, kVar2)) {
            if (unsafe.getObject(b1Var, j) != kVar) {
                return false;
            }
        }
        return true;
    }
}
