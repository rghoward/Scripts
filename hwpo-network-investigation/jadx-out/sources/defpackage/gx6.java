package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gx6 {
    public static final void a(final mh4 mh4Var, final long j, final cx6 cx6Var, final qt qtVar, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        long j2;
        cx6 cx6Var2;
        Object obj;
        tq5 tq5Var;
        int i3;
        int i4;
        Object obj2;
        bj4 bj4VarO = jt1Var.o(766784632);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= bj4VarO.i(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            cx6Var2 = cx6Var;
            i2 |= bj4VarO.J(cx6Var2) ? 256 : 128;
        } else {
            cx6Var2 = cx6Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bj4VarO.J(qtVar) : bj4VarO.j(qtVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 16384 : 8192;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
            tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
            tq5 tq5Var2 = (tq5) bj4VarO.F(qu1.n);
            bj4.b bVarE = bj4VarO.E();
            h37 h37VarJ = bl7.j(fr1Var, bj4VarO);
            Object[] objArr = new Object[0];
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                o22 o22Var = new o22(1);
                bj4VarO.C(o22Var);
                obj = o22Var;
            } else {
                obj = objF;
            }
            UUID uuid = (UUID) mm8.d(objArr, (mh4) obj, bj4VarO, 48);
            Object objF2 = bj4VarO.f();
            Object objA = objF2;
            if (objF2 == c0187a) {
                c33 c33Var = wd3.a;
                objA = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var = (t72) objA;
            boolean zJ = bj4VarO.J(view) | bj4VarO.J(tx2Var);
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a) {
                tq5Var = tq5Var2;
                i3 = 1;
                i4 = 0;
                rv6 rv6Var = new rv6(mh4Var, cx6Var2, j2, view, tq5Var, tx2Var, uuid, qtVar, t72Var);
                fr1 fr1Var2 = new fr1(true, -1051373467, new fx6(h37VarJ));
                qv6 qv6Var = rv6Var.B;
                qv6Var.setParentCompositionContext(bVarE);
                qv6Var.u.setValue(fr1Var2);
                qv6Var.v = true;
                qv6Var.createComposition();
                bj4VarO.C(rv6Var);
                obj2 = rv6Var;
            } else {
                tq5Var = tq5Var2;
                i3 = 1;
                i4 = 0;
                obj2 = objF3;
            }
            final rv6 rv6Var2 = (rv6) obj2;
            boolean zJ2 = bj4VarO.j(rv6Var2);
            Object objF4 = bj4VarO.f();
            Object obj3 = objF4;
            if (zJ2 || objF4 == c0187a) {
                hx5 hx5Var = new hx5(i3, rv6Var2);
                bj4VarO.C(hx5Var);
                obj3 = hx5Var;
            }
            wd3.a(rv6Var2, (oh4) obj3, bj4VarO);
            int i5 = i2;
            int i6 = (bj4VarO.j(rv6Var2) ? 1 : 0) | ((i2 & 14) == 4 ? i3 : i4) | ((i5 & 896) == 256 ? i3 : i4) | ((i5 & 112) == 32 ? i3 : i4) | (bj4VarO.h(tq5Var.ordinal()) ? 1 : 0);
            Object objF5 = bj4VarO.f();
            Object obj4 = objF5;
            if (i6 != 0 || objF5 == c0187a) {
                final tq5 tq5Var3 = tq5Var;
                mh4 mh4Var2 = new mh4() { // from class: dx6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        rv6Var2.d(mh4Var, cx6Var, j, tq5Var3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(mh4Var2);
                obj4 = mh4Var2;
            }
            bj4VarO.w((mh4) obj4);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ex6
                @Override // defpackage.ci4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    gx6.a(mh4Var, j, cx6Var, qtVar, fr1Var, (jt1) obj5, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }
}
