package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d4a extends wp5 implements mh4<g2b> {
    public final /* synthetic */ f4a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4a(f4a f4aVar) {
        super(0);
        this.u = f4aVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:7:0x0024->B:17:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[EDGE_INSN: B:28:0x005d->B:18:0x005d BREAK  A[LOOP:0: B:7:0x0024->B:17:0x005a], SYNTHETIC] */
    @Override // defpackage.mh4
    public final g2b invoke() {
        xr5 xr5VarA = this.u.a();
        qr5 qr5Var = xr5VarA.t;
        if (xr5VarA.G != ((k37.a) qr5Var.C()).t.v) {
            c37<qr5, xr5.b> c37Var = xr5VarA.y;
            Object[] objArr = c37Var.c;
            long[] jArr = c37Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((xr5.b) objArr[(i << 3) + i3]).d = true;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            if (qr5Var.A != null) {
                if (!qr5Var.Z.e) {
                    qr5.e0(qr5Var, false, 7);
                }
            } else if (!qr5Var.E()) {
                qr5.g0(qr5Var, false, 7);
            }
        }
        return g2b.a;
    }
}
