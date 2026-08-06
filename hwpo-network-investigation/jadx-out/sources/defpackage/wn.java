package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wn {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(mh4 mh4Var, f03 f03Var, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        int i3;
        f03 f03Var2;
        int i4;
        boolean z;
        f03 f03Var3;
        xj8 xj8VarW;
        View view;
        tx2 tx2Var;
        tq5 tq5Var;
        bj4.b bVarE;
        h37 h37VarJ;
        Object objF;
        jt1.a.C0187a c0187a;
        UUID uuid;
        boolean zH;
        Object objF2;
        m03 m03Var;
        boolean zJ;
        Object objF3;
        boolean z2;
        boolean zH2;
        Object objF4;
        int i5;
        bj4 bj4VarO = jt1Var.o(826668973);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f03Var2 = f03Var;
                i3 |= bj4VarO.J(f03Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bj4VarO.j(fr1Var)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i4 & 1, z)) {
                if (i6 != 0) {
                    f03Var3 = new f03(7);
                } else {
                    f03Var3 = f03Var2;
                }
                view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
                tx2Var = (tx2) bj4VarO.F(qu1.h);
                tq5Var = (tq5) bj4VarO.F(qu1.n);
                bVarE = bj4VarO.E();
                h37VarJ = bl7.j(fr1Var, bj4VarO);
                Object[] objArr = new Object[0];
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = tn.u;
                    bj4VarO.C(objF);
                }
                uuid = (UUID) mm8.d(objArr, (mh4) objF, bj4VarO, 48);
                zH = bj4VarO.h(f03Var3.g) | bj4VarO.J(view) | bj4VarO.J(tx2Var) | bj4VarO.J(null);
                objF2 = bj4VarO.f();
                if (zH || objF2 == c0187a) {
                    m03 m03Var2 = new m03(mh4Var, f03Var3, view, tq5Var, tx2Var, uuid);
                    fr1 fr1Var2 = new fr1(true, -1338939603, new sn(h37VarJ));
                    yz2 yz2Var = m03Var2.A;
                    yz2Var.setParentCompositionContext(bVarE);
                    yz2Var.u.setValue(fr1Var2);
                    yz2Var.y = true;
                    yz2Var.createComposition();
                    bj4VarO.C(m03Var2);
                    objF2 = m03Var2;
                }
                m03Var = (m03) objF2;
                zJ = bj4VarO.j(m03Var);
                objF3 = bj4VarO.f();
                if (zJ || objF3 == c0187a) {
                    objF3 = new on(m03Var);
                    bj4VarO.C(objF3);
                }
                wd3.a(m03Var, (oh4) objF3, bj4VarO);
                boolean zJ2 = bj4VarO.j(m03Var);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH2 = zJ2 | z2 | ((i4 & 112) == 32) | bj4VarO.h(tq5Var.ordinal());
                objF4 = bj4VarO.f();
                if (zH2 || objF4 == c0187a) {
                    objF4 = new pn(m03Var, mh4Var, f03Var3, tq5Var);
                    bj4VarO.C(objF4);
                }
                bj4VarO.w((mh4) objF4);
            } else {
                bj4VarO.u();
                f03Var3 = f03Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new qn(mh4Var, f03Var3, fr1Var, i, i2);
            }
        }
        i3 |= 48;
        f03Var2 = f03Var;
        if ((i & 384) == 0) {
            if (bj4VarO.j(fr1Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i4 & 1, z)) {
            if (i6 != 0) {
                f03Var3 = new f03(7);
            } else {
                f03Var3 = f03Var2;
            }
            view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
            tx2Var = (tx2) bj4VarO.F(qu1.h);
            tq5Var = (tq5) bj4VarO.F(qu1.n);
            bVarE = bj4VarO.E();
            h37VarJ = bl7.j(fr1Var, bj4VarO);
            Object[] objArr2 = new Object[0];
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = tn.u;
                bj4VarO.C(objF);
            }
            uuid = (UUID) mm8.d(objArr2, (mh4) objF, bj4VarO, 48);
            zH = bj4VarO.h(f03Var3.g) | bj4VarO.J(view) | bj4VarO.J(tx2Var) | bj4VarO.J(null);
            objF2 = bj4VarO.f();
            if (zH) {
                m03 m03Var3 = new m03(mh4Var, f03Var3, view, tq5Var, tx2Var, uuid);
                fr1 fr1Var3 = new fr1(true, -1338939603, new sn(h37VarJ));
                yz2 yz2Var2 = m03Var3.A;
                yz2Var2.setParentCompositionContext(bVarE);
                yz2Var2.u.setValue(fr1Var3);
                yz2Var2.y = true;
                yz2Var2.createComposition();
                bj4VarO.C(m03Var3);
                objF2 = m03Var3;
            } else {
                m03 m03Var4 = new m03(mh4Var, f03Var3, view, tq5Var, tx2Var, uuid);
                fr1 fr1Var4 = new fr1(true, -1338939603, new sn(h37VarJ));
                yz2 yz2Var3 = m03Var4.A;
                yz2Var3.setParentCompositionContext(bVarE);
                yz2Var3.u.setValue(fr1Var4);
                yz2Var3.y = true;
                yz2Var3.createComposition();
                bj4VarO.C(m03Var4);
                objF2 = m03Var4;
            }
            m03Var = (m03) objF2;
            zJ = bj4VarO.j(m03Var);
            objF3 = bj4VarO.f();
            if (zJ) {
                objF3 = new on(m03Var);
                bj4VarO.C(objF3);
            } else {
                objF3 = new on(m03Var);
                bj4VarO.C(objF3);
            }
            wd3.a(m03Var, (oh4) objF3, bj4VarO);
            boolean zJ3 = bj4VarO.j(m03Var);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zH2 = zJ3 | z2 | ((i4 & 112) == 32) | bj4VarO.h(tq5Var.ordinal());
            objF4 = bj4VarO.f();
            if (zH2) {
                objF4 = new pn(m03Var, mh4Var, f03Var3, tq5Var);
                bj4VarO.C(objF4);
            } else {
                objF4 = new pn(m03Var, mh4Var, f03Var3, tq5Var);
                bj4VarO.C(objF4);
            }
            bj4VarO.w((mh4) objF4);
        } else {
            bj4VarO.u();
            f03Var3 = f03Var2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new qn(mh4Var, f03Var3, fr1Var, i, i2);
        }
    }

    public static final void b(ox6 ox6Var, ci4 ci4Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1090521195);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = un.a;
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 6) & 14));
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new vn(ox6Var, ci4Var, i);
        }
    }
}
