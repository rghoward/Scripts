package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ an(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.t;
        Object obj = this.u;
        switch (i2) {
            case 0:
                bn bnVar = (bn) obj;
                boolean zD = bnVar.d();
                cm cmVar = bnVar.t;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        cmVar.a(true);
                        e27<vb9> e27Var = bnVar.D;
                        int[] iArr = e27Var.b;
                        long[] jArr = e27Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!bnVar.c().a(i6)) {
                                                bnVar.w.add(new uy1(i6, bnVar.C, vy1.u, null));
                                                bnVar.A.n(g2b.a);
                                            }
                                        }
                                        j >>= 8;
                                        i5++;
                                        i3 = i3;
                                    }
                                    int i7 = i3;
                                    if (i4 == 8) {
                                        i = i7;
                                    }
                                } else {
                                    i = i3;
                                }
                                if (i != length) {
                                    i3 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            bnVar.f(cmVar.getSemanticsOwner().a(), bnVar.E);
                            g2b g2bVar = g2b.a;
                            Trace.endSection();
                            bnVar.b(bnVar.c());
                            bnVar.k();
                            bnVar.F = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                return;
            default:
                w50 w50Var = (w50) obj;
                synchronized (w50Var.a) {
                    try {
                        if (w50Var.m) {
                            return;
                        }
                        long j2 = w50Var.l - 1;
                        w50Var.l = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 >= 0) {
                            w50Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (w50Var.a) {
                            w50Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
