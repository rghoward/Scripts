package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj1 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ yj1(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[LOOP:0: B:13:0x002e->B:23:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[SYNTHETIC] */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                w60 w60Var = (w60) obj;
                w60Var.getClass();
                ((ci4) obj3).invoke(((ya) obj2).t(), w60Var);
                break;
            default:
                x07 x07Var = (x07) obj2;
                if (((Set) obj3).contains(obj)) {
                    c37<Object, Object> c37Var = x07Var.b;
                    d37<sc9<g2b>> d37Var = x07Var.d;
                    Object objD = c37Var.d(obj);
                    if (objD != null) {
                        if (objD instanceof d37) {
                            d37 d37Var2 = (d37) objD;
                            Object[] objArr = d37Var2.b;
                            long[] jArr = d37Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j) < 128) {
                                                d37Var.a((sc9) objArr[(i2 << 3) + i4]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    } else if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        } else {
                            d37Var.a((sc9) objD);
                        }
                    }
                }
                break;
        }
        return g2b.a;
    }
}
