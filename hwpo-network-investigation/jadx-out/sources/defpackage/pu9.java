package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pu9 implements jac {
    public static final /* synthetic */ pu9 t = new pu9();

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ boolean c(int i, x8d x8dVar, StringBuilder sb) {
        if (i - 1 != 0 || x8dVar == x8d.a) {
            return false;
        }
        sb.append(x8dVar.a());
        sb.append('.');
        sb.append(x8dVar.b());
        sb.append(':');
        sb.append(x8dVar.c());
        return true;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().j());
    }
}
