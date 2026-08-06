package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class us3 implements jac {
    public static final /* synthetic */ int u = 0;
    public static final float t = 56.0f;
    public static final /* synthetic */ us3 v = new us3();

    public static final void b(final ox6 ox6Var, final oh4 oh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-932836462);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            b47.b(bj4VarO, z63.c(ox6Var, oh4Var));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v41
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    us3.b(ox6Var, oh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().O());
    }
}
