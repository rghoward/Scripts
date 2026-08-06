package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends o3 {
    public static r3 e;
    public static final jt8 f = jt8.u;
    public static final jt8 g = jt8.t;
    public ria c;
    public ub9 d;

    @Override // defpackage.o3
    public final int[] b(int i) {
        int iE;
        if (d().length() > 0 && i < d().length()) {
            try {
                ub9 ub9Var = this.d;
                if (ub9Var == null) {
                    xj5.e("node");
                    throw null;
                }
                sk8 sk8VarG = ub9Var.g();
                int iRound = Math.round(sk8VarG.d - sk8VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                ria riaVar = this.c;
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                int iD = riaVar.b.d(i);
                ria riaVar2 = this.c;
                if (riaVar2 == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                float f2 = riaVar2.b.f(iD) + iRound;
                ria riaVar3 = this.c;
                if (riaVar3 == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                l07 l07Var = riaVar3.b;
                float f3 = l07Var.f(l07Var.f - 1);
                ria riaVar4 = this.c;
                if (f2 < f3) {
                    if (riaVar4 == null) {
                        xj5.e("layoutResult");
                        throw null;
                    }
                    iE = riaVar4.b.e(f2);
                } else {
                    if (riaVar4 == null) {
                        xj5.e("layoutResult");
                        throw null;
                    }
                    iE = riaVar4.b.f;
                }
                return c(i, g(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.o3
    public final int[] e(int i) {
        int iE;
        if (d().length() > 0 && i > 0) {
            try {
                ub9 ub9Var = this.d;
                if (ub9Var == null) {
                    xj5.e("node");
                    throw null;
                }
                sk8 sk8VarG = ub9Var.g();
                int iRound = Math.round(sk8VarG.d - sk8VarG.b);
                int length = d().length();
                if (length <= i) {
                    i = length;
                }
                ria riaVar = this.c;
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                int iD = riaVar.b.d(i);
                ria riaVar2 = this.c;
                if (riaVar2 == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                float f2 = riaVar2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    ria riaVar3 = this.c;
                    if (riaVar3 == null) {
                        xj5.e("layoutResult");
                        throw null;
                    }
                    iE = riaVar3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == d().length() && iE < iD) {
                    iE++;
                }
                return c(g(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int g(int i, jt8 jt8Var) {
        ria riaVar = this.c;
        if (riaVar == null) {
            xj5.e("layoutResult");
            throw null;
        }
        int iG = riaVar.g(i);
        ria riaVar2 = this.c;
        if (riaVar2 == null) {
            xj5.e("layoutResult");
            throw null;
        }
        jt8 jt8VarH = riaVar2.h(iG);
        ria riaVar3 = this.c;
        if (jt8Var != jt8VarH) {
            if (riaVar3 != null) {
                return riaVar3.g(i);
            }
            xj5.e("layoutResult");
            throw null;
        }
        if (riaVar3 != null) {
            return riaVar3.b.c(i, false) - 1;
        }
        xj5.e("layoutResult");
        throw null;
    }
}
