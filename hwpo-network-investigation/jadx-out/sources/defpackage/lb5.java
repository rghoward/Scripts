package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lb5 {
    public static final void a(final hw5 hw5Var, final Object obj, final int i, final Object obj2, jt1 jt1Var, final int i2) {
        bj4 bj4VarO = jt1Var.o(1439843069);
        int i3 = (bj4VarO.J(hw5Var) ? 4 : 2) | i2 | (bj4VarO.J(obj) ? 32 : 16) | (bj4VarO.h(i) ? 256 : 128) | (bj4VarO.J(obj2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            ((f09) obj).e(obj2, gr1.b(980966366, new ci4() { // from class: fw5
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    jt1 jt1Var2 = (jt1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        hw5Var.e(i, obj2, jt1Var2, 0);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 48);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(obj, i, obj2, i2) { // from class: gw5
                public final /* synthetic */ Object u;
                public final /* synthetic */ int v;
                public final /* synthetic */ Object w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iS = gz3.s(1);
                    lb5.a(this.t, this.u, this.v, this.w, (jt1) obj3, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(o1a o1aVar, jb5 jb5Var, fl7 fl7Var, ib5 ib5Var, mb5 mb5Var, long j) {
        float fIntBitsToFloat;
        t27<jb5> t27Var = mb5Var.b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jb5Var.c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jb5Var.c & 4294967295L));
        if (d(jb5Var)) {
            mb5Var.a = 0;
            t27Var.j();
        }
        if (!c(jb5Var) && !d(jb5Var)) {
            if (t27Var.b == 3) {
                int i = mb5Var.a;
                mb5Var.a = i + 1;
                t27Var.o(i, jb5Var);
            } else {
                t27Var.g(jb5Var);
            }
            if (mb5Var.a == 3) {
                mb5Var.a = 0;
            }
            Object[] objArr = t27Var.a;
            int i2 = t27Var.b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((jb5) objArr[i3]).c >> 32));
            }
            int i4 = t27Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = t27Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((jb5) objArr2[i5]).c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / t27Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (fl7Var != null) {
            int i6 = ib5Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = fl7Var == fl7.u ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((jv2) o1aVar.a).a(jb5Var.b, vf7.e(jFloatToRawIntBits, j));
    }

    public static final boolean c(jb5 jb5Var) {
        return jb5Var.h && !jb5Var.d;
    }

    public static final boolean d(jb5 jb5Var) {
        return !jb5Var.h && jb5Var.d;
    }

    public static final long e(jb5 jb5Var, fl7 fl7Var, ib5 ib5Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = jb5Var.g;
        if (fl7Var != null) {
            int i = ib5Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (fl7Var == fl7.u) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = vf7.d(f(jb5Var, fl7Var, ib5Var), j2);
        if (z || !jb5Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long f(jb5 jb5Var, fl7 fl7Var, ib5 ib5Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (fl7Var == null) {
            return jb5Var.c;
        }
        int i = ib5Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jb5Var.c >> 32));
        } else {
            if (i != 2) {
                return jb5Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (jb5Var.c & 4294967295L));
        }
        if (fl7Var == fl7.u) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }
}
