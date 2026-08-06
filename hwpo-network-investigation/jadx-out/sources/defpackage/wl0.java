package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 {
    public static final void a(final ox6 ox6Var, final hf8 hf8Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        fr1 fr1Var2 = aj0.y;
        bj4 bj4VarO = jt1Var.o(-714464401);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(hf8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(fr1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                dt7 dt7Var = new dt7(null, ha7.u);
                bj4VarO.C(dt7Var);
                objF = dt7Var;
            }
            final h37 h37Var = (h37) objF;
            final ol0 ol0VarB = b(fr1Var2, bj4VarO, (i2 >> 6) & 14);
            nu1.a(hf8Var.a(ol0VarB), gr1.b(274270255, new ci4() { // from class: tl0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objF2 = jt1Var2.f();
                        final h37 h37Var2 = h37Var;
                        jt1.a.C0187a c0187a = jt1.a.a;
                        if (objF2 == c0187a) {
                            objF2 = new ql0(0, h37Var2);
                            jt1Var2.C(objF2);
                        }
                        ox6 ox6VarB = oh7.b(ox6Var, (oh4) objF2);
                        fl6 fl6VarD = dv0.d(di.a.a, true);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC = it1.c(jt1Var2, ox6VarB);
                        bt1.c.getClass();
                        qr5.a aVar = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        fr1Var.invoke(jt1Var2, 0);
                        Object objF3 = jt1Var2.f();
                        if (objF3 == c0187a) {
                            objF3 = new mh4() { // from class: rl0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    qq5 qq5Var = (qq5) h37Var2.getValue();
                                    if (qq5Var != null) {
                                        return qq5Var;
                                    }
                                    xc5.d("Required value was null.");
                                    fl.a();
                                    return null;
                                }
                            };
                            jt1Var2.C(objF3);
                        }
                        ol0VarB.b((mh4) objF3, jt1Var2, 6);
                        jt1Var2.I();
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ul0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    wl0.a(ox6Var, hf8Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final ol0 b(fr1 fr1Var, jt1 jt1Var, int i) {
        int i2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && jt1Var.J(fr1Var)) || (i & 6) == 4;
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (z || objF == obj) {
            objF = new ol0(fr1Var);
            jt1Var.C(objF);
        }
        ol0 ol0Var = (ol0) objF;
        boolean zJ = jt1Var.J(ol0Var);
        Object objF2 = jt1Var.f();
        if (zJ || objF2 == obj) {
            objF2 = new sl0(i2, ol0Var);
            jt1Var.C(objF2);
        }
        wd3.a(ol0Var, (oh4) objF2, jt1Var);
        return ol0Var;
    }
}
