package defpackage;

import android.content.Context;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qv6 extends v0 implements l03 {
    public final Window t;
    public final dt7 u;
    public boolean v;

    public qv6(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.t = window;
        this.u = bl7.i(wr1.a);
    }

    @Override // defpackage.v0
    public final void Content(jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(576708319);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            ((ci4) this.u.getValue()).invoke(bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: pv6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    this.t.Content((jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    @Override // defpackage.v0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.v;
    }

    @Override // defpackage.l03
    public final Window getWindow() {
        return this.t;
    }
}
