package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tk6 {
    public static final y0a a;

    static {
        hv5.d(new qk6());
        a = new y0a(new p53(1));
    }

    public static final void a(final fi1 fi1Var, final vy6 vy6Var, final ul9 ul9Var, final g0b g0bVar, final ci4 ci4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(904511636);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(fi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(vy6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(ul9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(g0bVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 16384 : 8192;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 9363) != 9362)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            cx8 cx8VarA = zw8.a(7);
            long j = fi1Var.a;
            boolean zI = bj4VarO.i(j);
            Object objF = bj4VarO.f();
            if (zI || objF == jt1.a.a) {
                objF = new qja(j, uh1.b(0.4f, j));
                bj4VarO.C(objF);
            }
            nu1.b(new kf8[]{hi1.a.a(fi1Var), a.a(vy6Var), xa5.a.a(cx8VarA), wl9.a.a(ul9Var), rja.a.a((qja) objF), j0b.a.a(g0bVar)}, gr1.b(-1750539308, new sk6(g0bVar, ci4Var), bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rk6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tk6.a(fi1Var, vy6Var, ul9Var, g0bVar, ci4Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(fi1 fi1Var, ul9 ul9Var, g0b g0bVar, ci4 ci4Var, jt1 jt1Var, final int i) {
        final ci4 ci4Var2;
        final g0b g0bVar2;
        final ul9 ul9Var2;
        final fi1 fi1Var2;
        bj4 bj4VarO = jt1Var.o(-449719819);
        int i2 = (bj4VarO.J(fi1Var) ? 4 : 2) | i | (bj4VarO.J(ul9Var) ? 32 : 16) | (bj4VarO.J(g0bVar) ? 256 : 128) | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            a(fi1Var, (vy6) bj4VarO.F(a), ul9Var, g0bVar, ci4Var, bj4VarO, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            fi1Var2 = fi1Var;
            ul9Var2 = ul9Var;
            g0bVar2 = g0bVar;
            ci4Var2 = ci4Var;
        } else {
            ci4Var2 = ci4Var;
            g0bVar2 = g0bVar;
            ul9Var2 = ul9Var;
            fi1Var2 = fi1Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ul9Var2, g0bVar2, ci4Var2, i) { // from class: pk6
                public final /* synthetic */ ul9 u;
                public final /* synthetic */ g0b v;
                public final /* synthetic */ ci4 w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    tk6.b(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
