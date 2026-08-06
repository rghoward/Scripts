package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bzb implements s02 {
    public static final /* synthetic */ bzb t = new bzb();
    public static String[] u;

    public static final void b(final long j, final wja wjaVar, final ci4 ci4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-684938728);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.i(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(wjaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            u93 u93Var = mia.a;
            nu1.b(new kf8[]{zy1.a.a(new uh1(j)), u93Var.a(((wja) bj4VarO.F(u93Var)).d(wjaVar))}, ci4Var, bj4VarO, ((i2 >> 3) & 112) | 8);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jf8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bzb.b(j, wjaVar, ci4Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    @Override // defpackage.s02
    public Object a(r9a r9aVar) {
        Intent intent = (Intent) ((Bundle) r9aVar.j()).getParcelable("notification_data");
        if (intent != null) {
            return new jg1(intent);
        }
        return null;
    }
}
