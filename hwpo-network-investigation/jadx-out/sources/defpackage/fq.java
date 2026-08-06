package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fq {
    public static final u93 a = new u93(b.u);
    public static final u93 b = new u93(a.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<Boolean> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<String> {
        public static final b u = new b(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:104:0x022e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0255  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:111:0x0263  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x0200  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable, r02] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void a(l68 l68Var, mh4 mh4Var, m68 m68Var, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        int i3;
        mh4 mh4Var2;
        m68 m68Var2;
        int i4;
        boolean z;
        mh4 mh4Var3;
        xj8 xj8VarW;
        mh4 mh4Var4;
        View view;
        tx2 tx2Var;
        String str;
        tq5 tq5Var;
        bj4.b bVarE;
        h37 h37VarJ;
        Object objF;
        jt1.a.C0187a c0187a;
        UUID uuid;
        boolean zBooleanValue;
        Object objF2;
        String str2;
        ?? r9;
        boolean z2;
        d68 d68Var;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zJ;
        Object objF3;
        boolean z5;
        boolean z6;
        boolean zJ2;
        Object objF4;
        boolean z7;
        Object objF5;
        boolean zJ3;
        Object objF6;
        boolean zJ4;
        Object objF7;
        boolean zJ5;
        Object objF8;
        fl6 fl6Var;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        int i7;
        int i8;
        l68 l68Var2 = l68Var;
        bj4 bj4VarO = jt1Var.o(-1772091631);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(l68Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                mh4Var2 = mh4Var;
                i3 |= bj4VarO.j(mh4Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                m68Var2 = m68Var;
                if (bj4VarO.J(m68Var2)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            } else {
                m68Var2 = m68Var;
            }
            if ((i & 3072) == 0) {
                if (bj4VarO.j(fr1Var)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i4 & 1, z)) {
                if (i9 != 0) {
                    mh4Var4 = null;
                } else {
                    mh4Var4 = mh4Var2;
                }
                view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
                tx2Var = (tx2) bj4VarO.F(qu1.h);
                str = (String) bj4VarO.F(a);
                tq5Var = (tq5) bj4VarO.F(qu1.n);
                bVarE = bj4VarO.E();
                h37VarJ = bl7.j(fr1Var, bj4VarO);
                Object[] objArr = new Object[0];
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = pq.u;
                    bj4VarO.C(objF);
                }
                uuid = (UUID) mm8.d(objArr, (mh4) objF, bj4VarO, 48);
                zBooleanValue = ((Boolean) bj4VarO.F(b)).booleanValue();
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    str2 = str;
                    r9 = 0;
                    z2 = false;
                    d68 d68Var2 = new d68(mh4Var4, m68Var2, str2, view, tx2Var, l68Var2, uuid, zBooleanValue);
                    l68Var2 = l68Var2;
                    d68Var2.d(bVarE, new fr1(true, -297523940, new tq(d68Var2, h37VarJ)));
                    bj4VarO.C(d68Var2);
                    objF2 = d68Var2;
                } else {
                    str2 = str;
                    r9 = 0;
                    z2 = false;
                }
                d68Var = (d68) objF2;
                boolean zJ6 = bj4VarO.j(d68Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z8 = zJ6 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                zJ = z8 | z4 | bj4VarO.J(str2) | bj4VarO.h(tq5Var.ordinal());
                objF3 = bj4VarO.f();
                if (zJ || objF3 == c0187a) {
                    hq hqVar = new hq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                    bj4VarO.C(hqVar);
                    objF3 = hqVar;
                }
                wd3.a(d68Var, (oh4) objF3, bj4VarO);
                boolean zJ7 = bj4VarO.j(d68Var);
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                boolean z9 = z5 | zJ7;
                if (i6 == 256) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                zJ2 = z9 | z6 | bj4VarO.J(str2) | bj4VarO.h(tq5Var.ordinal());
                objF4 = bj4VarO.f();
                if (zJ2 || objF4 == c0187a) {
                    iq iqVar = new iq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                    bj4VarO.C(iqVar);
                    objF4 = iqVar;
                }
                bj4VarO.w((mh4) objF4);
                boolean zJ8 = bj4VarO.j(d68Var);
                if ((i4 & 14) == 4) {
                    z2 = true;
                }
                z7 = zJ8 | z2;
                objF5 = bj4VarO.f();
                if (z7 || objF5 == c0187a) {
                    objF5 = new kq(d68Var, l68Var2);
                    bj4VarO.C(objF5);
                }
                wd3.a(l68Var2, (oh4) objF5, bj4VarO);
                zJ3 = bj4VarO.j(d68Var);
                objF6 = bj4VarO.f();
                if (zJ3 || objF6 == c0187a) {
                    objF6 = new lq(d68Var, r9);
                    bj4VarO.C(objF6);
                }
                wd3.d(bj4VarO, (ci4) objF6, d68Var);
                zJ4 = bj4VarO.j(d68Var);
                objF7 = bj4VarO.f();
                if (zJ4 || objF7 == c0187a) {
                    objF7 = new mq(d68Var);
                    bj4VarO.C(objF7);
                }
                ox6 ox6VarB = oh7.b(ox6.a.t, (oh4) objF7);
                zJ5 = bj4VarO.j(d68Var) | bj4VarO.h(tq5Var.ordinal());
                objF8 = bj4VarO.f();
                if (zJ5 || objF8 == c0187a) {
                    objF8 = new nq(d68Var, tq5Var);
                    bj4VarO.C(objF8);
                }
                fl6Var = (fl6) objF8;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw r9;
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
                bj4VarO.U(true);
                mh4Var3 = mh4Var4;
            } else {
                bj4VarO.u();
                mh4Var3 = mh4Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new oq(l68Var2, mh4Var3, m68Var, fr1Var, i, i2);
            }
        }
        i3 |= 48;
        mh4Var2 = mh4Var;
        if ((i & 384) == 0) {
            m68Var2 = m68Var;
            if (bj4VarO.J(m68Var2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            m68Var2 = m68Var;
        }
        if ((i & 3072) == 0) {
            if (bj4VarO.j(fr1Var)) {
                i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i4 & 1, z)) {
            if (i9 != 0) {
                mh4Var4 = null;
            } else {
                mh4Var4 = mh4Var2;
            }
            view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
            tx2Var = (tx2) bj4VarO.F(qu1.h);
            str = (String) bj4VarO.F(a);
            tq5Var = (tq5) bj4VarO.F(qu1.n);
            bVarE = bj4VarO.E();
            h37VarJ = bl7.j(fr1Var, bj4VarO);
            Object[] objArr2 = new Object[0];
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = pq.u;
                bj4VarO.C(objF);
            }
            uuid = (UUID) mm8.d(objArr2, (mh4) objF, bj4VarO, 48);
            zBooleanValue = ((Boolean) bj4VarO.F(b)).booleanValue();
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                str2 = str;
                r9 = 0;
                z2 = false;
                d68 d68Var3 = new d68(mh4Var4, m68Var2, str2, view, tx2Var, l68Var2, uuid, zBooleanValue);
                l68Var2 = l68Var2;
                d68Var3.d(bVarE, new fr1(true, -297523940, new tq(d68Var3, h37VarJ)));
                bj4VarO.C(d68Var3);
                objF2 = d68Var3;
            } else {
                str2 = str;
                r9 = 0;
                z2 = false;
            }
            d68Var = (d68) objF2;
            boolean zJ9 = bj4VarO.j(d68Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean z10 = zJ9 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = true;
            } else {
                z4 = z2;
            }
            zJ = z10 | z4 | bj4VarO.J(str2) | bj4VarO.h(tq5Var.ordinal());
            objF3 = bj4VarO.f();
            if (zJ) {
                hq hqVar2 = new hq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                bj4VarO.C(hqVar2);
                objF3 = hqVar2;
            } else {
                hq hqVar3 = new hq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                bj4VarO.C(hqVar3);
                objF3 = hqVar3;
            }
            wd3.a(d68Var, (oh4) objF3, bj4VarO);
            boolean zJ10 = bj4VarO.j(d68Var);
            if (i5 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            boolean z11 = z5 | zJ10;
            if (i6 == 256) {
                z6 = true;
            } else {
                z6 = z2;
            }
            zJ2 = z11 | z6 | bj4VarO.J(str2) | bj4VarO.h(tq5Var.ordinal());
            objF4 = bj4VarO.f();
            if (zJ2) {
                iq iqVar2 = new iq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                bj4VarO.C(iqVar2);
                objF4 = iqVar2;
            } else {
                iq iqVar3 = new iq(d68Var, mh4Var4, m68Var, str2, tq5Var);
                bj4VarO.C(iqVar3);
                objF4 = iqVar3;
            }
            bj4VarO.w((mh4) objF4);
            boolean zJ11 = bj4VarO.j(d68Var);
            if ((i4 & 14) == 4) {
                z2 = true;
            }
            z7 = zJ11 | z2;
            objF5 = bj4VarO.f();
            if (z7) {
                objF5 = new kq(d68Var, l68Var2);
                bj4VarO.C(objF5);
            } else {
                objF5 = new kq(d68Var, l68Var2);
                bj4VarO.C(objF5);
            }
            wd3.a(l68Var2, (oh4) objF5, bj4VarO);
            zJ3 = bj4VarO.j(d68Var);
            objF6 = bj4VarO.f();
            if (zJ3) {
                objF6 = new lq(d68Var, r9);
                bj4VarO.C(objF6);
            } else {
                objF6 = new lq(d68Var, r9);
                bj4VarO.C(objF6);
            }
            wd3.d(bj4VarO, (ci4) objF6, d68Var);
            zJ4 = bj4VarO.j(d68Var);
            objF7 = bj4VarO.f();
            if (zJ4) {
                objF7 = new mq(d68Var);
                bj4VarO.C(objF7);
            } else {
                objF7 = new mq(d68Var);
                bj4VarO.C(objF7);
            }
            ox6 ox6VarB2 = oh7.b(ox6.a.t, (oh4) objF7);
            zJ5 = bj4VarO.j(d68Var) | bj4VarO.h(tq5Var.ordinal());
            objF8 = bj4VarO.f();
            if (zJ5) {
                objF8 = new nq(d68Var, tq5Var);
                bj4VarO.C(objF8);
            } else {
                objF8 = new nq(d68Var, tq5Var);
                bj4VarO.C(objF8);
            }
            fl6Var = (fl6) objF8;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB2);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a != null) {
                ml5.c();
                throw r9;
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
            bj4VarO.U(true);
            mh4Var3 = mh4Var4;
        } else {
            bj4VarO.u();
            mh4Var3 = mh4Var2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new oq(l68Var2, mh4Var3, m68Var, fr1Var, i, i2);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
