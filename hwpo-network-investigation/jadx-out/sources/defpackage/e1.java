package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, b1 b1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(b1Var, j, obj, obj2)) {
            if (unsafe.getObject(b1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
