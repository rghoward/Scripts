package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends o3 {
    public static q3 d;
    public static final jt8 e = jt8.u;
    public static final jt8 f = jt8.t;
    public ria c;

    @Override // defpackage.o3
    public final int[] b(int i) {
        int iD;
        if (d().length() > 0 && i < d().length()) {
            ria riaVar = this.c;
            jt8 jt8Var = e;
            if (i < 0) {
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                iD = riaVar.b.d(0);
            } else {
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                int iD2 = riaVar.b.d(i);
                iD = g(iD2, jt8Var) == i ? iD2 : iD2 + 1;
            }
            ria riaVar2 = this.c;
            if (riaVar2 == null) {
                xj5.e("layoutResult");
                throw null;
            }
            if (iD < riaVar2.b.f) {
                return c(g(iD, jt8Var), g(iD, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.o3
    public final int[] e(int i) {
        int iD;
        if (d().length() > 0 && i > 0) {
            int length = d().length();
            ria riaVar = this.c;
            jt8 jt8Var = f;
            if (i > length) {
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                iD = riaVar.b.d(d().length());
            } else {
                if (riaVar == null) {
                    xj5.e("layoutResult");
                    throw null;
                }
                int iD2 = riaVar.b.d(i);
                iD = g(iD2, jt8Var) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return c(g(iD, e), g(iD, jt8Var) + 1);
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
