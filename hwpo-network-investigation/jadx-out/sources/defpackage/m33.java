package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m33 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ m33 u = new m33();

    public static final int b(long j, long j2) {
        boolean zE = e(j);
        if (zE != e(j2)) {
            return zE ? -1 : 1;
        }
        int iSignum = (int) Math.signum(c(j) - c(j2));
        if (Math.min(c(j), c(j2)) >= 0.0f && d(j) != d(j2)) {
            return d(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return (j & 2) != 0;
    }

    public static final boolean e(long j) {
        return (j & 1) != 0;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().B());
    }
}
