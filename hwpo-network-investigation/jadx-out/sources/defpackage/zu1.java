package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zu1 implements jac {
    public static final k7a t = new k7a("CLOSED");
    public static final /* synthetic */ zu1 u = new zu1();

    public static final Object b(g99 g99Var, long j, ci4 ci4Var) {
        while (true) {
            if (g99Var.x >= j && !g99Var.g()) {
                return g99Var;
            }
            Object objE = g99Var.e();
            k7a k7aVar = t;
            if (objE == k7aVar) {
                return k7aVar;
            }
            g99 g99Var2 = (g99) ((av1) objE);
            if (g99Var2 == null) {
                g99Var2 = (g99) ci4Var.invoke(Long.valueOf(g99Var.x + 1), g99Var);
                if (g99Var.j(g99Var2)) {
                    if (g99Var.g()) {
                        g99Var.i();
                    }
                }
            }
            g99Var = g99Var2;
        }
    }

    public static long c(pt7 pt7Var, int i, int i2) {
        pt7Var.M(i);
        if (pt7Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = pt7Var.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || pt7Var.z() < 7 || pt7Var.a() < 7 || (pt7Var.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        pt7Var.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    public static final wja d(wja wjaVar, tq5 tq5Var) {
        int i;
        long j;
        qha qhaVar;
        int i2;
        int i3;
        int i4;
        jja jjaVar;
        ww9 ww9Var = wjaVar.a;
        mha mhaVar = yw9.d;
        mha mhaVarD = ww9Var.a.d(new xw9(0));
        long j2 = ww9Var.b;
        dka[] dkaVarArr = bka.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = yw9.a;
        }
        long j3 = j2;
        ob4 ob4Var = ww9Var.c;
        if (ob4Var == null) {
            ob4Var = ob4.y;
        }
        ob4 ob4Var2 = ob4Var;
        mb4 mb4Var = ww9Var.d;
        mb4 mb4Var2 = new mb4(mb4Var != null ? mb4Var.a : 0);
        nb4 nb4Var = ww9Var.e;
        nb4 nb4Var2 = new nb4(nb4Var != null ? nb4Var.a : 65535);
        qa4 qa4Var = ww9Var.f;
        if (qa4Var == null) {
            qa4Var = qa4.t;
        }
        qa4 qa4Var2 = qa4Var;
        String str = ww9Var.g;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        long j4 = ww9Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = yw9.b;
        }
        long j5 = j4;
        gl0 gl0Var = ww9Var.i;
        float f = gl0Var != null ? gl0Var.a : 0.0f;
        gl0 gl0Var2 = new gl0(Float.isNaN(f) ? 0.0f : f);
        oha ohaVar = ww9Var.j;
        if (ohaVar == null) {
            ohaVar = oha.c;
        }
        oha ohaVar2 = ohaVar;
        ad6 ad6VarA = ww9Var.k;
        if (ad6VarA == null) {
            ad6 ad6Var = ad6.v;
            ad6VarA = w08.a.a();
        }
        ad6 ad6Var2 = ad6VarA;
        long j6 = ww9Var.l;
        if (j6 == 16) {
            j6 = yw9.c;
        }
        long j7 = j6;
        fda fdaVar = ww9Var.m;
        if (fdaVar == null) {
            fdaVar = fda.b;
        }
        fda fdaVar2 = fdaVar;
        el9 el9Var = ww9Var.n;
        if (el9Var == null) {
            el9Var = el9.d;
        }
        el9 el9Var2 = el9Var;
        r18 r18Var = ww9Var.o;
        e73 e73Var = ww9Var.p;
        if (e73Var == null) {
            e73Var = zy3.a;
        }
        ww9 ww9Var2 = new ww9(mhaVarD, j3, ob4Var2, mb4Var2, nb4Var2, qa4Var2, str2, j5, gl0Var2, ohaVar2, ad6Var2, j7, fdaVar2, el9Var2, r18Var, e73Var);
        ss7 ss7Var = wjaVar.b;
        int i5 = ts7.b;
        int i6 = ss7Var.a;
        int i7 = 5;
        int i8 = i6 == 0 ? 5 : i6;
        int i9 = ss7Var.b;
        if (i9 != 3) {
            if (i9 == 0) {
                int iOrdinal = tq5Var.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        u.b();
                        return null;
                    }
                    i7 = 2;
                }
            } else {
                i = i9;
            }
            j = ss7Var.c;
            if ((j & 1095216660480L) == 0) {
                j = ts7.a;
            }
            qhaVar = ss7Var.d;
            if (qhaVar == null) {
                qhaVar = qha.c;
            }
            qha qhaVar2 = qhaVar;
            h18 h18Var = ss7Var.e;
            e86 e86Var = ss7Var.f;
            i2 = ss7Var.g;
            if (i2 == 0) {
                i2 = c86.b;
            }
            int i10 = i2;
            i3 = ss7Var.h;
            if (i3 == 0) {
                i4 = 1;
            } else {
                i4 = i3;
            }
            jjaVar = ss7Var.i;
            if (jjaVar == null) {
                jjaVar = jja.c;
            }
            return new wja(ww9Var2, new ss7(i8, i, j, qhaVar2, h18Var, e86Var, i10, i4, jjaVar), wjaVar.c);
        }
        int iOrdinal2 = tq5Var.ordinal();
        if (iOrdinal2 == 0) {
            i7 = 4;
        } else if (iOrdinal2 != 1) {
            u.b();
            return null;
        }
        i = i7;
        j = ss7Var.c;
        if ((j & 1095216660480L) == 0) {
            j = ts7.a;
        }
        qhaVar = ss7Var.d;
        if (qhaVar == null) {
            qhaVar = qha.c;
        }
        qha qhaVar3 = qhaVar;
        h18 h18Var2 = ss7Var.e;
        e86 e86Var2 = ss7Var.f;
        i2 = ss7Var.g;
        if (i2 == 0) {
            i2 = c86.b;
        }
        int i11 = i2;
        i3 = ss7Var.h;
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = i3;
        }
        jjaVar = ss7Var.i;
        if (jjaVar == null) {
            jjaVar = jja.c;
        }
        return new wja(ww9Var2, new ss7(i8, i, j, qhaVar3, h18Var2, e86Var2, i11, i4, jjaVar), wjaVar.c);
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((e7c) d7c.u.t.t).a());
    }
}
