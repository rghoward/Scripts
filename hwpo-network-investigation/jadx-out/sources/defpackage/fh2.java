package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fh2 {
    public static final ko7 a = eo7.c(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;

        public a(String str, String str2) {
            this.t = str;
            this.u = str2;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                String str = this.t;
                boolean zJ = jt1Var2.J(str);
                final String str2 = this.u;
                boolean zJ2 = zJ | jt1Var2.J(str2);
                Object objF = jt1Var2.f();
                if (zJ2 || objF == jt1.a.a) {
                    final String str3 = this.t;
                    objF = new oh4() { // from class: eh2
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ec9.b(str3 + ", " + str2, (hc9) obj);
                            return g2b.a;
                        }
                    };
                    jt1Var2.C(objF);
                }
                mia.b(str, pb9.b(ox6.a.t, false, (oh4) objF), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262140);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ String t;

        public b(String str) {
            this.t = str;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objF = jt1Var2.f();
                if (objF == jt1.a.a) {
                    objF = new gh2();
                    jt1Var2.C(objF);
                }
                mia.b(this.t, pb9.a(ox6.a.t, (oh4) objF), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262140);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    public static final void a(final Long l, final oh4<? super Long, g2b> oh4Var, final i21 i21Var, final fg5 fg5Var, final yh2 yh2Var, final s99 s99Var, final lh2 lh2Var, final p94 p94Var, jt1 jt1Var, final int i) {
        yg2 yg2Var;
        bj4 bj4VarO = jt1Var.o(-432341251);
        int i2 = i | (bj4VarO.J(l) ? 4 : 2) | (bj4VarO.j(oh4Var) ? 32 : 16) | (bj4VarO.j(i21Var) ? 256 : 128) | (bj4VarO.j(fg5Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.J(yh2Var) ? 16384 : 8192) | (bj4VarO.J(s99Var) ? 131072 : 65536) | (bj4VarO.J(lh2Var) ? 1048576 : 524288) | (bj4VarO.J(p94Var) ? 8388608 : 4194304);
        if (bj4VarO.A(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zJ = bj4VarO.J(i21Var.a);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = i21Var.c(i21Var.a);
                bj4VarO.C(objF);
            }
            yg2 yg2Var2 = (yg2) objF;
            String strB = ws3.b(bj4VarO, R.string.m3c_date_input_invalid_for_pattern);
            String strB2 = ws3.b(bj4VarO, R.string.m3c_date_input_invalid_year_range);
            String strB3 = ws3.b(bj4VarO, R.string.m3c_date_input_invalid_not_allowed);
            boolean zJ2 = bj4VarO.J(yg2Var2) | ((i2 & 57344) == 16384);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                yg2Var = yg2Var2;
                kh2 kh2Var = new kh2(fg5Var, s99Var, yg2Var, yh2Var, strB, strB2, strB3);
                bj4VarO.C(kh2Var);
                objF2 = kh2Var;
            } else {
                yg2Var = yg2Var2;
            }
            kh2 kh2Var2 = (kh2) objF2;
            String upperCase = yg2Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strB4 = ws3.b(bj4VarO, R.string.m3c_date_input_label);
            ox6 ox6VarH = eo7.h(ir9.c(ox6.a.t, 1.0f), a);
            kh2Var2.getClass();
            int i3 = i2 << 3;
            b(ox6VarH, l, oh4Var, i21Var, gr1.b(-752164549, new a(strB4, upperCase), bj4VarO), gr1.b(-1179434278, new b(upperCase), bj4VarO), kh2Var2, yg2Var, i21Var.a, lh2Var, p94Var, bj4VarO, (i3 & 112) | 1794054 | (i3 & 896) | (i3 & 7168), (i2 >> 18) & 126);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(l, oh4Var, i21Var, fg5Var, yh2Var, s99Var, lh2Var, p94Var, i) { // from class: zg2
                public final /* synthetic */ p94 A;
                public final /* synthetic */ Long t;
                public final /* synthetic */ oh4 u;
                public final /* synthetic */ i21 v;
                public final /* synthetic */ fg5 w;
                public final /* synthetic */ yh2 x;
                public final /* synthetic */ s99 y;
                public final /* synthetic */ lh2 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    fh2.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ox6 ox6Var, Long l, final oh4 oh4Var, final i21 i21Var, final fr1 fr1Var, final fr1 fr1Var2, final kh2 kh2Var, final yg2 yg2Var, final Locale locale, final lh2 lh2Var, final p94 p94Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        bj4 bj4Var;
        h37 h37Var;
        Object obj;
        boolean z;
        yg2 yg2Var2;
        h37 h37Var2;
        final Long l2 = l;
        final i21 i21Var2 = i21Var;
        final Locale locale2 = locale;
        bj4 bj4VarO = jt1Var.o(1456309913);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(i21Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bj4VarO.j(fr1Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bj4VarO.h(0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bj4VarO.J(kh2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bj4VarO.J(yg2Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bj4VarO.j(locale2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.J(lh2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.J(p94Var) ? 32 : 16;
        }
        int i5 = i4;
        if (bj4VarO.A(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new ah2();
                bj4VarO.C(objF);
            }
            final h37 h37VarC = mm8.c(objArr, kha.d, (mh4) objF, bj4VarO, 384);
            Object[] objArr2 = {(kha) h37VarC.getValue()};
            int i6 = 29360128 & i3;
            int i7 = i3 & 234881024;
            boolean zJ = bj4VarO.J(h37VarC) | (i6 == 8388608) | bj4VarO.j(i21Var2) | (i7 == 67108864) | bj4VarO.j(locale2);
            int i8 = i3 & 3670016;
            boolean z2 = zJ | (i8 == 1048576);
            Object objF2 = bj4VarO.f();
            if (z2 || objF2 == c0187a) {
                objF2 = new mh4() { // from class: bh2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        String strA;
                        h37 h37Var3 = h37VarC;
                        if (((kha) h37Var3.getValue()).a.u.length() > 0) {
                            String str = ((kha) h37Var3.getValue()).a.u;
                            String str2 = yg2Var.c;
                            i21 i21Var3 = i21Var2;
                            Locale locale3 = locale2;
                            strA = kh2Var.a(i21Var3.j(str, str2, locale3), locale3);
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        return bl7.i(strA);
                    }
                };
                i21Var2 = i21Var2;
                h37Var = h37VarC;
                bj4VarO.C(objF2);
            } else {
                h37Var = h37VarC;
            }
            final h37 h37Var3 = (h37) mm8.d(objArr2, (mh4) objF2, bj4VarO, 0);
            boolean zW = z2a.w((CharSequence) h37Var3.getValue());
            float f = b;
            if (!zW) {
                if (!((16.0f >= 0.0f) & (4.0f >= 0.0f) & (16.0f >= 0.0f) & (0.0f >= 0.0f))) {
                    sc5.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            kha khaVar = (kha) h37Var.getValue();
            boolean zJ2 = ((i3 & 896) == 256) | (i7 == 67108864) | bj4VarO.J(h37Var) | bj4VarO.J(h37Var3) | bj4VarO.j(i21Var2) | bj4VarO.j(locale2) | (i6 == 8388608) | (i8 == 1048576);
            Object objF3 = bj4VarO.f();
            if (zJ2 || objF3 == c0187a) {
                final h37 h37Var4 = h37Var;
                z = false;
                final i21 i21Var3 = i21Var2;
                obj = new oh4() { // from class: ch2
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        kha khaVar2 = (kha) obj2;
                        String str = khaVar2.a.u;
                        int length = str.length();
                        String str2 = yg2Var.c;
                        if (length <= str2.length()) {
                            for (int i9 = 0; i9 < str.length(); i9++) {
                                if (Character.isDigit(str.charAt(i9))) {
                                }
                            }
                            h37Var4.setValue(khaVar2);
                            String string = z2a.R(str).toString();
                            int length2 = string.length();
                            h37 h37Var5 = h37Var3;
                            oh4 oh4Var2 = oh4Var;
                            Long lValueOf = null;
                            if (length2 != 0 && string.length() >= str2.length()) {
                                i21 i21Var4 = i21Var3;
                                Locale locale3 = locale2;
                                b21 b21VarJ = i21Var4.j(string, str2, locale3);
                                h37Var5.setValue(kh2Var.a(b21VarJ, locale3));
                                if (((CharSequence) h37Var5.getValue()).length() == 0 && b21VarJ != null) {
                                    lValueOf = Long.valueOf(b21VarJ.w);
                                }
                                oh4Var2.invoke(lValueOf);
                            } else {
                                h37Var5.setValue(BuildConfig.FLAVOR);
                                oh4Var2.invoke(null);
                            }
                        }
                        return g2b.a;
                    }
                };
                yg2Var2 = yg2Var;
                i21Var2 = i21Var3;
                locale2 = locale2;
                h37Var2 = h37Var3;
                h37Var = h37Var4;
                bj4VarO.C(obj);
            } else {
                h37Var2 = h37Var3;
                obj = objF3;
                z = false;
                yg2Var2 = yg2Var;
            }
            oh4 oh4Var2 = (oh4) obj;
            ox6 ox6VarM = eo7.m(ox6Var, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zJ3 = bj4VarO.J(h37Var2);
            Object objF4 = bj4VarO.f();
            if (zJ3 || objF4 == c0187a) {
                objF4 = new n40(1, h37Var2);
                bj4VarO.C(objF4);
            }
            ox6 ox6VarB = pb9.b(ox6VarM, false, (oh4) objF4);
            ox6 ox6VarB2 = ox6.a.t;
            if (p94Var != null) {
                ox6VarB2 = ym2.b(ox6VarB2, p94Var);
            }
            rm7.a(khaVar, oh4Var2, ox6VarB.H(ox6VarB2), false, null, fr1Var, fr1Var2, gr1.b(-357881838, new hh2(h37Var2), bj4VarO), !z2a.w((CharSequence) h37Var2.getValue()), new cl2(yg2Var2), new dp5(3, 7, 113), null, true, 0, 0, null, lh2Var.y, bj4VarO, (i3 << 6) & 33030144);
            bj4Var = bj4VarO;
            g2b g2bVar = g2b.a;
            boolean z3 = (i5 & 112) == 32;
            Object objF5 = bj4Var.f();
            if (z3 || objF5 == c0187a) {
                objF5 = new ih2(p94Var, null);
                bj4Var.C(objF5);
            }
            wd3.d(bj4Var, (ci4) objF5, g2bVar);
            boolean zJ4 = bj4Var.j(i21Var2) | ((i3 & 112) == 32) | (i7 == 67108864) | bj4Var.j(locale2) | bj4Var.J(h37Var);
            Object objF6 = bj4Var.f();
            if (zJ4 || objF6 == c0187a) {
                jh2 jh2Var = new jh2(l, i21Var2, yg2Var, locale2, h37Var, null);
                l2 = l;
                bj4Var.C(jh2Var);
                objF6 = jh2Var;
            } else {
                l2 = l;
            }
            wd3.d(bj4Var, (ci4) objF6, l2);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dh2
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    fh2.b(ox6Var, l2, oh4Var, i21Var, fr1Var, fr1Var2, kh2Var, yg2Var, locale, lh2Var, p94Var, (jt1) obj2, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }
}
