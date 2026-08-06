package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xh2 {
    public static final ko7 a = eo7.c(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(final mh4 mh4Var, final fr1 fr1Var, ox6 ox6Var, final ci4 ci4Var, jl9 jl9Var, lh2 lh2Var, f03 f03Var, final fr1 fr1Var2, jt1 jt1Var, final int i) {
        int i2;
        final ox6 ox6Var2;
        final lh2 lh2Var2;
        final f03 f03Var2;
        final jl9 jl9Var2;
        f03 f03Var3;
        jl9 jl9Var3;
        lh2 lh2Var3;
        int i3;
        ox6 ox6Var3;
        bj4 bj4VarO = jt1Var.o(219718641);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        int i6 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i6 |= bj4VarO.j(fr1Var2) ? 67108864 : 33554432;
        }
        if (bj4VarO.A(i6 & 1, (38347923 & i6) != 38347922)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                ph2 ph2Var = ph2.a;
                jl9 jl9VarB = wl9.b(fk2.c, bj4VarO);
                ph2 ph2Var2 = ph2.a;
                lh2 lh2VarC = ph2.c(bj4VarO);
                f03Var3 = new f03(3);
                jl9Var3 = jl9VarB;
                lh2Var3 = lh2VarC;
                i3 = i6 & (-3727361);
                ox6Var3 = ox6.a.t;
            } else {
                bj4VarO.u();
                jl9Var3 = jl9Var;
                lh2Var3 = lh2Var;
                f03Var3 = f03Var;
                i3 = i6 & (-3727361);
                ox6Var3 = ox6Var;
            }
            bj4VarO.V();
            int i7 = i3;
            ci.d(mh4Var, ir9.p(ox6Var3), f03Var3, gr1.b(1108953335, new wh2(jl9Var3, lh2Var3, fr1Var2, ci4Var, fr1Var), bj4VarO), bj4VarO, ((i7 >> 15) & 896) | (i7 & 14) | 3072);
            f03Var2 = f03Var3;
            lh2Var2 = lh2Var3;
            ox6Var2 = ox6Var3;
            jl9Var2 = jl9Var3;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            lh2Var2 = lh2Var;
            f03Var2 = f03Var;
            jl9Var2 = jl9Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sh2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xh2.a(mh4Var, fr1Var, ox6Var2, ci4Var, jl9Var2, lh2Var2, f03Var2, fr1Var2, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }
}
