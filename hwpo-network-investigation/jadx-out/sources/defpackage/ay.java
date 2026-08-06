package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ay implements e5a, jac {
    public static final /* synthetic */ ay t = new ay();

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            vc5.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = lja.c;
        return j;
    }

    public static final long d(int i, long j) {
        int i2 = lja.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().a());
    }

    @Override // defpackage.e5a
    public r9a b(Object obj) {
        return caa.e(Boolean.TRUE);
    }
}
