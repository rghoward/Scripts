package defpackage;

import android.os.Trace;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zb9 implements jac {
    public static final /* synthetic */ int v = 0;
    public static final sk8 t = new sk8(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Object u = new Object();
    public static final /* synthetic */ zb9 w = new zb9();

    public static final void b(fx9 fx9Var) {
        int i = fx9Var.w;
        int[] iArr = fx9Var.u;
        Object[] objArr = fx9Var.v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != u) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        fx9Var.t = false;
        fx9Var.w = i2;
    }

    public static final e27 c(yb9 yb9Var, oh4 oh4Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            ub9 ub9VarA = yb9Var.a();
            qr5 qr5Var = ub9VarA.c;
            if (qr5Var.j() && qr5Var.e()) {
                sk8 sk8VarG = ub9VarA.g();
                e27 e27Var = new e27(48);
                jb9 jb9Var = new jb9();
                jb9Var.d(qk1.d(sk8VarG));
                f(oh4Var, e27Var, new jb9(), jb9Var, ub9VarA, ub9VarA);
                return e27Var;
            }
            e27 e27Var2 = ag5.a;
            e27Var2.getClass();
            return e27Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void d(oh4 oh4Var, e27 e27Var, jb9 jb9Var, jb9 jb9Var2, ub9 ub9Var, ub9 ub9Var2) {
        qr5 qr5Var = ub9Var2.c;
        qr5 qr5Var2 = ub9Var2.c;
        if (!qr5Var.j() || !qr5Var2.e() || jb9Var2.a.isEmpty()) {
            if (ub9Var2.o()) {
                e(e27Var, ub9Var, ub9Var2);
                return;
            }
            return;
        }
        sk8 sk8VarM = ub9Var2.m();
        if (sk8VarM.f()) {
            qb9 qb9VarF = ub9Var2.f();
            if (qb9VarF == null) {
                fd5 fd5Var = qr5Var2.Y.c;
                sk8VarM = rq5.d(fd5Var).Z(fd5Var, false);
            } else {
                ox6.c cVarQ = qb9VarF.q();
                Object objD = ub9Var2.d.t.d(kb9.b);
                if (objD == null) {
                    objD = null;
                }
                sk8VarM = rb9.a(cVarQ, objD != null, false);
            }
        }
        gg5 gg5VarD = qk1.d(sk8VarM);
        jb9Var.d(gg5VarD);
        if (jb9Var.c(jb9Var2)) {
            int i = ub9Var2.f;
            if (i == ub9Var.f) {
                i = -1;
            }
            e27Var.i(i, new xb9(ub9Var2, jb9Var.b()));
            List listJ = ub9.j(4, ub9Var2);
            for (int size = listJ.size() - 1; -1 < size; size--) {
                if (!((Boolean) oh4Var.invoke(listJ.get(size))).booleanValue()) {
                    d(oh4Var, e27Var, jb9Var, jb9Var2, ub9Var, (ub9) listJ.get(size));
                }
            }
            if (h(ub9Var2)) {
                jb9Var2.a(gg5VarD);
            }
        }
    }

    public static final void e(e27 e27Var, ub9 ub9Var, ub9 ub9Var2) {
        qr5 qr5Var;
        ub9 ub9VarL = ub9Var2.l();
        sk8 sk8VarG = (ub9VarL == null || (qr5Var = ub9VarL.c) == null || !qr5Var.j()) ? t : ub9VarL.g();
        int i = ub9Var2.f;
        if (i == ub9Var.f) {
            i = -1;
        }
        e27Var.i(i, new xb9(ub9Var2, qk1.d(sk8VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0182  */
    public static final void f(oh4 oh4Var, e27 e27Var, jb9 jb9Var, jb9 jb9Var2, ub9 ub9Var, ub9 ub9Var2) {
        jb9 jb9Var3;
        jb9 jb9Var4;
        boolean z;
        boolean z2;
        sk8 sk8VarA;
        oh4 oh4Var2 = oh4Var;
        jb9 jb9Var5 = jb9Var2;
        ub9 ub9Var3 = ub9Var;
        int i = ub9Var3.f;
        qr5 qr5Var = ub9Var2.c;
        lb9 lb9Var = ub9Var2.d;
        qr5 qr5Var2 = ub9Var2.c;
        int i2 = ub9Var2.f;
        boolean z3 = (qr5Var.j() && qr5Var2.e()) ? false : true;
        if (!jb9Var5.a.isEmpty() || i2 == i) {
            if (!z3 || ub9Var2.o()) {
                gg5 gg5VarD = qk1.d(ub9Var2.m());
                jb9 jb9Var6 = jb9Var;
                jb9Var6.d(gg5VarD);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!jb9Var.c(jb9Var2)) {
                    if (ub9Var2.o()) {
                        e(e27Var, ub9Var3, ub9Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            e27Var.i(i2, new xb9(ub9Var2, jb9Var.b()));
                            return;
                        }
                        return;
                    }
                }
                e27Var.i(i2, new xb9(ub9Var2, jb9Var6.b()));
                List listJ = ub9.j(4, ub9Var2);
                if (lb9Var.v) {
                    ub9 ub9VarL = ub9Var2.l();
                    while (true) {
                        if (ub9VarL == null) {
                            z = true;
                            ub9VarL = null;
                            break;
                        }
                        c37<gc9<?>, Object> c37Var = ub9VarL.d.t;
                        z = true;
                        if (c37Var.b(ac9.w) || c37Var.b(ac9.v)) {
                            break;
                        } else {
                            ub9VarL = ub9VarL.l();
                        }
                    }
                    if (ub9VarL == null) {
                        z2 = false;
                    } else {
                        mb7 mb7VarD = ub9Var2.d();
                        if (mb7VarD == null) {
                            mb7VarD = null;
                        } else {
                            if (!mb7VarD.g1().G) {
                                mb7VarD = null;
                            }
                            if (mb7VarD == null) {
                                mb7VarD = null;
                            }
                        }
                        mb7 mb7VarD2 = ub9VarL.d();
                        if (mb7VarD2 == null) {
                            mb7VarD2 = null;
                        } else {
                            if (!mb7VarD2.g1().G) {
                                mb7VarD2 = null;
                            }
                            if (mb7VarD2 == null) {
                                mb7VarD2 = null;
                            }
                        }
                        if (mb7VarD == null || mb7VarD2 == null) {
                            z2 = false;
                        } else {
                            sk8 sk8VarZ = mb7VarD2.Z(mb7VarD, false);
                            z2 = !sk8VarZ.equals(sk8VarZ.e(tk8.a(0L, c43.c(mb7VarD2.v))));
                        }
                    }
                    if (z2) {
                        jb9 jb9Var7 = new jb9();
                        qb9 qb9VarF = ub9Var2.f();
                        if (qb9VarF == null) {
                            fd5 fd5Var = qr5Var2.Y.c;
                            sk8VarA = rq5.d(fd5Var).Z(fd5Var, false);
                        } else {
                            ox6.c cVarQ = qb9VarF.q();
                            Object objD = lb9Var.t.d(kb9.b);
                            sk8VarA = rb9.a(cVarQ, (objD == null ? null : objD) != null ? z : false, false);
                        }
                        jb9Var7.d(qk1.d(sk8VarA));
                        int size = listJ.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) oh4Var2.invoke(listJ.get(size))).booleanValue()) {
                                d(oh4Var2, e27Var, new jb9(), jb9Var7, ub9Var3, (ub9) listJ.get(size));
                            }
                            size--;
                            ub9Var3 = ub9Var;
                        }
                    }
                    jb9Var4 = jb9Var5;
                    if (h(ub9Var2)) {
                        jb9Var4.a(gg5VarD);
                    }
                }
                int size2 = listJ.size() - 1;
                while (-1 < size2) {
                    if (((Boolean) oh4Var2.invoke(listJ.get(size2))).booleanValue()) {
                        jb9Var3 = jb9Var5;
                    } else {
                        jb9 jb9Var8 = jb9Var6;
                        jb9Var3 = jb9Var5;
                        f(oh4Var2, e27Var, jb9Var8, jb9Var3, ub9Var, (ub9) listJ.get(size2));
                    }
                    size2--;
                    oh4Var2 = oh4Var;
                    jb9Var5 = jb9Var3;
                    jb9Var6 = jb9Var;
                }
                jb9Var4 = jb9Var5;
                if (h(ub9Var2)) {
                    jb9Var4.a(gg5VarD);
                }
            }
        }
    }

    public static final boolean g(ub9 ub9Var) {
        mb7 mb7VarD = ub9Var.d();
        c37<gc9<?>, Object> c37Var = ub9Var.d.t;
        return (mb7VarD != null ? mb7VarD.G1() : false) || c37Var.b(ac9.q) || c37Var.b(ac9.p);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean h(ub9 ub9Var) {
        if (!g(ub9Var)) {
            lb9 lb9Var = ub9Var.d;
            if (lb9Var.v) {
                return true;
            }
            c37<gc9<?>, Object> c37Var = lb9Var.t;
            Object[] objArr = c37Var.b;
            Object[] objArr2 = c37Var.c;
            long[] jArr = c37Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((gc9) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().p0());
    }
}
