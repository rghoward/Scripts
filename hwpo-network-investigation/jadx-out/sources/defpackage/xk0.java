package defpackage;

import defpackage.xk0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xk0<T extends xk0<T>> {
    public final iw a;
    public final long b;
    public final ria c;
    public final ag7 d;
    public final kja e;
    public long f;
    public final iw g;

    public xk0(iw iwVar, long j, ria riaVar, ag7 ag7Var, kja kjaVar) {
        this.a = iwVar;
        this.b = j;
        this.c = riaVar;
        this.d = ag7Var;
        this.e = kjaVar;
        this.f = j;
        this.g = iwVar;
    }

    public final Integer a() {
        ria riaVar = this.c;
        if (riaVar == null) {
            return null;
        }
        l07 l07Var = riaVar.b;
        int iE = lja.e(this.f);
        ag7 ag7Var = this.d;
        return Integer.valueOf(ag7Var.a(l07Var.c(l07Var.d(ag7Var.b(iE)), true)));
    }

    public final Integer b() {
        ria riaVar = this.c;
        if (riaVar == null) {
            return null;
        }
        int iF = lja.f(this.f);
        ag7 ag7Var = this.d;
        return Integer.valueOf(ag7Var.a(riaVar.g(riaVar.b.d(ag7Var.b(iF)))));
    }

    public final Integer c() {
        int length;
        ria riaVar = this.c;
        if (riaVar == null) {
            return null;
        }
        int iP = p();
        while (true) {
            iw iwVar = this.a;
            if (iP < iwVar.u.length()) {
                int length2 = this.g.u.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long j = riaVar.j(length2);
                int i = lja.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iP) {
                    length = this.d.a(i2);
                    break;
                }
                iP++;
            } else {
                length = iwVar.u.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        ria riaVar = this.c;
        if (riaVar == null) {
            return null;
        }
        for (int iP = p(); iP > 0; iP--) {
            int length = this.g.u.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long j = riaVar.j(length);
            int i = lja.c;
            int i2 = (int) (j >> 32);
            if (i2 < iP) {
                iA = this.d.a(i2);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        ria riaVar = this.c;
        return (riaVar != null ? riaVar.h(p()) : null) != jt8.u;
    }

    public final int f(ria riaVar, int i) {
        int iP = p();
        kja kjaVar = this.e;
        if (kjaVar.a == null) {
            kjaVar.a = Float.valueOf(riaVar.c(iP).a);
        }
        l07 l07Var = riaVar.b;
        int iD = l07Var.d(iP) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= l07Var.f) {
            return this.g.u.length();
        }
        float fB = l07Var.b(iD) - 1.0f;
        Float f = kjaVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= riaVar.f(iD)) || (!e() && fFloatValue <= riaVar.e(iD))) {
            return l07Var.c(iD, true);
        }
        return this.d.a(l07Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void g() {
        kja kjaVar = this.e;
        kjaVar.a = null;
        iw iwVar = this.g;
        if (iwVar.u.length() > 0) {
            if (e()) {
                i();
                return;
            }
            kjaVar.a = null;
            if (iwVar.u.length() > 0) {
                String str = iwVar.u;
                long j = this.f;
                int i = lja.c;
                int iC = rh0.c((int) (j & 4294967295L), str);
                if (iC != -1) {
                    o(iC, iC);
                }
            }
        }
    }

    public final void h() {
        this.e.a = null;
        iw iwVar = this.g;
        String str = iwVar.u;
        String str2 = iwVar.u;
        if (str.length() > 0) {
            int iA = g2a.a(str2, lja.e(this.f));
            if (iA == lja.e(this.f) && iA != str2.length()) {
                iA = g2a.a(str2, iA + 1);
            }
            o(iA, iA);
        }
    }

    public final void i() {
        this.e.a = null;
        iw iwVar = this.g;
        if (iwVar.u.length() > 0) {
            String str = iwVar.u;
            long j = this.f;
            int i = lja.c;
            int iD = rh0.d((int) (j & 4294967295L), str);
            if (iD != -1) {
                o(iD, iD);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        iw iwVar = this.g;
        String str = iwVar.u;
        String str2 = iwVar.u;
        if (str.length() > 0) {
            int iB = g2a.b(str2, lja.f(this.f));
            if (iB == lja.f(this.f) && iB != 0) {
                iB = g2a.b(str2, iB - 1);
            }
            o(iB, iB);
        }
    }

    public final void k() {
        kja kjaVar = this.e;
        kjaVar.a = null;
        iw iwVar = this.g;
        if (iwVar.u.length() > 0) {
            if (!e()) {
                i();
                return;
            }
            kjaVar.a = null;
            if (iwVar.u.length() > 0) {
                String str = iwVar.u;
                long j = this.f;
                int i = lja.c;
                int iC = rh0.c((int) (j & 4294967295L), str);
                if (iC != -1) {
                    o(iC, iC);
                }
            }
        }
    }

    public final void l() {
        Integer numA;
        this.e.a = null;
        if (this.g.u.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numB;
        this.e.a = null;
        if (this.g.u.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void n() {
        if (this.g.u.length() > 0) {
            int i = lja.c;
            this.f = ay.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = ay.c(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = lja.c;
        return this.d.b((int) (j & 4294967295L));
    }
}
