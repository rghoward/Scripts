package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km8 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ km8(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[Catch: all -> 0x0028, LOOP:0: B:16:0x0035->B:28:0x0070, LOOP_END, TryCatch #0 {all -> 0x0028, blocks: (B:6:0x0017, B:8:0x001b, B:10:0x0025, B:29:0x0073, B:13:0x002a, B:16:0x0035, B:18:0x0045, B:20:0x0051, B:22:0x005a, B:24:0x0065, B:25:0x0068, B:28:0x0070), top: B:44:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0073 A[SYNTHETIC] */
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        sc9<? super g2b> sc9Var = null;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                i19 i19Var = (i19) obj3;
                k19 k19Var = (k19) obj;
                h37 h37Var = (h37) obj2;
                if (!(h37Var instanceof uu9)) {
                    z90.a("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                uu9 uu9Var = (uu9) h37Var;
                Object objC = i19Var.c(k19Var, uu9Var.getValue());
                if (objC == null) {
                    return null;
                }
                wu9 wu9VarA = uu9Var.a();
                wu9VarA.getClass();
                return new dt7(objC, wu9VarA);
            default:
                sq9 sq9Var = (sq9) obj3;
                Set set = (Set) obj;
                synchronized (sq9Var.a) {
                    try {
                        d37<Object> d37Var = sq9Var.d;
                        if (d37Var != null) {
                            Object[] objArr = d37Var.b;
                            long[] jArr = d37Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < i3) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i2 << 3) + i4])) {
                                                    j >>= 8;
                                                    i4++;
                                                } else {
                                                    sc9Var = sq9Var.f;
                                                }
                                            } else if (i3 == 8) {
                                                if (i2 != length) {
                                                    i2++;
                                                }
                                            }
                                        }
                                    } else if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        } else if (th1.u(set, sq9Var.b)) {
                            sc9Var = sq9Var.f;
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (sc9Var != null) {
                    sc9Var.n(g2b.a);
                }
                return g2b.a;
        }
    }
}
