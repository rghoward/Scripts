package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d50 {
    public static final void a(final l50 l50Var, final String str, final ox6 ox6Var, final oh4 oh4Var, final nz1 nz1Var, final wh1 wh1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        wh1 wh1Var2;
        int i4;
        bj4 bj4VarO = jt1Var.o(-421592773);
        if ((i & 14) == 0) {
            i3 = (bj4VarO.J(l50Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= bj4VarO.j(f50.N) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= bj4VarO.J(di.a.e) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= bj4VarO.J(nz1Var) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= bj4VarO.g(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            wh1Var2 = wh1Var;
            i3 |= bj4VarO.J(wh1Var2) ? 67108864 : 33554432;
        } else {
            wh1Var2 = wh1Var;
        }
        if ((1879048192 & i) == 0) {
            i3 |= bj4VarO.h(1) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (bj4VarO.c(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((1533916891 & i3) == 306783378 && (i4 & 11) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            k85 k85VarB = x6b.b(l50Var.a, nz1Var, bj4VarO);
            int i5 = i3 >> 6;
            int i6 = i5 & 57344;
            f50 f50VarA = k50.a(k85VarB, l50Var.b, oh4Var, nz1Var, bj4VarO, 0);
            lr9 lr9Var = k85VarB.y;
            c(lr9Var instanceof by1 ? ox6Var.H((ox6) lr9Var) : ox6Var, f50VarA, str, nz1Var, wh1Var2, bj4VarO, ((i3 << 3) & 896) | (i5 & 7168) | i6 | (i5 & 458752) | (i5 & 3670016) | ((i4 << 21) & 29360128));
            bj4VarO = bj4VarO;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: y40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d50.a(l50Var, str, ox6Var, oh4Var, nz1Var, wh1Var, (jt1) obj, gz3.s(i | 1), gz3.s(i2));
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(k85 k85Var, String str, b85 b85Var, ox6 ox6Var, oh4 oh4Var, nz1 nz1Var, wh1 wh1Var, jt1 jt1Var, int i, int i2) {
        jt1Var.e(2032051394);
        if ((i2 & 32) != 0) {
            oh4Var = null;
        }
        if ((i2 & 128) != 0) {
            nz1Var = nz1.a.b;
        }
        if ((i2 & 512) != 0) {
            wh1Var = null;
        }
        l50 l50Var = new l50(k85Var, b85Var);
        int i3 = i & 112;
        int i4 = i >> 3;
        a(l50Var, str, ox6Var, oh4Var, nz1Var, wh1Var, jt1Var, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024), 0);
        jt1Var.H();
    }

    public static final void c(final ox6 ox6Var, final f50 f50Var, final String str, final nz1 nz1Var, final wh1 wh1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(777774312);
        if ((i & 14) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= bj4VarO.J(f50Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= bj4VarO.J(str) ? 256 : 128;
        }
        int i3 = i & 7168;
        sp0 sp0Var = di.a.e;
        if (i3 == 0) {
            i2 |= bj4VarO.J(sp0Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= bj4VarO.J(nz1Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= bj4VarO.g(1.0f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= bj4VarO.J(wh1Var) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= bj4VarO.c(true) ? 8388608 : 4194304;
        }
        if ((i2 & 23967451) == 4793490 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            hj8 hj8Var = x6b.b;
            ox6 ox6VarH = uma.b(str != null ? pb9.b(ox6Var, false, new v6b(str)) : ox6Var).H(new kz1(f50Var, sp0Var, nz1Var, 1.0f, wh1Var));
            bj4VarO.e(544976794);
            int iD = bj4VarO.D();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
            kw7 kw7VarP = bj4VarO.P();
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            bj4VarO.e(1405779621);
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(new a50(aVar));
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, c50.a);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bj4VarO.U(true);
            bj4VarO.U(false);
            bj4VarO.U(false);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: z40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d50.c(ox6Var, f50Var, str, nz1Var, wh1Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }
}
