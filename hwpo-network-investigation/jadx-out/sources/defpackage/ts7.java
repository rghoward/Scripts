package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ts7 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        dka[] dkaVarArr = bka.b;
        a = bka.c;
    }

    public static final ss7 a(ss7 ss7Var, int i, int i2, long j, qha qhaVar, h18 h18Var, e86 e86Var, int i3, int i4, jja jjaVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        qha qhaVar2 = qhaVar;
        h18 h18Var2 = h18Var;
        e86 e86Var2 = e86Var;
        int i7 = i3;
        int i8 = i4;
        jja jjaVar2 = jjaVar;
        if (i5 == 0 || i5 == ss7Var.a) {
            dka[] dkaVarArr = bka.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (bka.a(j3, ss7Var.c)) {
                }
            }
            if ((qhaVar2 == null || qhaVar2.equals(ss7Var.d)) && ((i6 == 0 || i6 == ss7Var.b) && ((h18Var2 == null || h18Var2.equals(ss7Var.e)) && ((e86Var2 == null || e86Var2.equals(ss7Var.f)) && ((i7 == 0 || i7 == ss7Var.g) && ((i8 == 0 || i8 == ss7Var.h) && (jjaVar2 == null || jjaVar2.equals(ss7Var.i)))))))) {
                return ss7Var;
            }
        } else {
            j2 = 0;
        }
        dka[] dkaVarArr2 = bka.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = ss7Var.c;
        }
        if (qhaVar2 == null) {
            qhaVar2 = ss7Var.d;
        }
        if (i5 == 0) {
            i5 = ss7Var.a;
        }
        if (i6 == 0) {
            i6 = ss7Var.b;
        }
        h18 h18Var3 = ss7Var.e;
        if (h18Var3 != null && h18Var2 == null) {
            h18Var2 = h18Var3;
        }
        if (e86Var2 == null) {
            e86Var2 = ss7Var.f;
        }
        if (i7 == 0) {
            i7 = ss7Var.g;
        }
        if (i8 == 0) {
            i8 = ss7Var.h;
        }
        if (jjaVar2 == null) {
            jjaVar2 = ss7Var.i;
        }
        return new ss7(i5, i6, j3, qhaVar2, h18Var2, e86Var2, i7, i8, jjaVar2);
    }
}
