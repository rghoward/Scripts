package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bx6 {
    public static final long a = sb4.b(0.5f, 0.0f);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ mh4<g2b> a;

        public a(mh4<g2b> mh4Var) {
            this.a = mh4Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            Object objD = o8a.d(i58Var, null, null, new hn(1, this.a), r02Var, 7);
            return objD == v72.t ? objD : g2b.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa A[PHI: r30
      0x01fa: PHI (r30v6 boolean) = (r30v2 boolean), (r30v7 boolean) binds: [B:122:0x01f8, B:120:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0203  */
    /* JADX WARN: Code duplicated, block: B:128:0x0206  */
    /* JADX WARN: Code duplicated, block: B:131:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0210  */
    /* JADX WARN: Code duplicated, block: B:135:0x0220  */
    /* JADX WARN: Code duplicated, block: B:138:0x0230  */
    /* JADX WARN: Code duplicated, block: B:142:0x023a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0240 A[PHI: r16
      0x0240: PHI (r16v12 int) = (r16v10 int), (r16v14 int) binds: [B:143:0x023e, B:141:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x0243  */
    /* JADX WARN: Code duplicated, block: B:148:0x0253  */
    /* JADX WARN: Code duplicated, block: B:149:0x0256  */
    /* JADX WARN: Code duplicated, block: B:152:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x0260  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x030e  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0172 A[PHI: r32
      0x0172: PHI (r32v3 long) = (r32v1 long), (r32v4 long) binds: [B:89:0x0170, B:87:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a4  */
    public static final void a(final mh4 mh4Var, ox6 ox6Var, final hn9 hn9Var, float f, boolean z, jl9 jl9Var, final long j, long j2, long j3, ci4 ci4Var, ci4 ci4Var2, cx6 cx6Var, final fr1 fr1Var, jt1 jt1Var, final int i, final int i2, final int i3) {
        ox6 ox6Var2;
        int i4;
        jl9 jl9VarB;
        ci4 ci4Var3;
        int i5;
        ci4 ci4Var4;
        int i6;
        boolean z2;
        bj4 bj4Var;
        hn9 hn9Var2;
        final float f2;
        long j4;
        cx6 cx6Var2;
        final ci4 ci4Var5;
        final jl9 jl9Var2;
        final long j5;
        final ci4 ci4Var6;
        final boolean z3;
        xj8 xj8VarW;
        int i7;
        cx6 cx6Var3;
        long j6;
        ci4 ci4Var7;
        jl9 jl9Var3;
        boolean z4;
        ox6 ox6Var3;
        float f3;
        long j7;
        final a04 a04VarE;
        final a04 a04VarE2;
        final a04 a04VarE3;
        int i8;
        long j8;
        boolean z5;
        boolean zJ;
        Object objF;
        jt1.a.C0187a c0187a;
        Object objF2;
        final t72 t72Var;
        int i9;
        boolean z6;
        boolean z7;
        Object objF3;
        boolean zJ2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objF4;
        Object objF5;
        final qt qtVar;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objF6;
        int i11;
        int i12;
        boolean z15;
        Object objF7;
        bj4 bj4VarO = jt1Var.o(1904798512);
        int i13 = i | (bj4VarO.j(mh4Var) ? 4 : 2);
        int i14 = i3 & 2;
        int i15 = 32;
        if (i14 != 0) {
            i4 = i13 | 48;
            ox6Var2 = ox6Var;
        } else {
            ox6Var2 = ox6Var;
            i4 = i13 | (bj4VarO.J(ox6Var2) ? 32 : 16);
        }
        int i16 = i4 | (bj4VarO.J(hn9Var) ? 256 : 128) | 27648;
        if ((i & 196608) == 0) {
            if ((i3 & 32) == 0) {
                jl9VarB = jl9Var;
                int i17 = bj4VarO.J(jl9VarB) ? 131072 : 65536;
                i16 |= i17;
            } else {
                jl9VarB = jl9Var;
            }
            i16 |= i17;
        } else {
            jl9VarB = jl9Var;
        }
        int i18 = i16 | (bj4VarO.i(j) ? 1048576 : 524288) | 373293056;
        int i19 = i3 & 1024;
        if (i19 != 0) {
            i5 = 3078;
            ci4Var3 = ci4Var;
        } else {
            ci4Var3 = ci4Var;
            if ((i2 & 6) == 0) {
                i5 = i2 | (bj4VarO.j(ci4Var3) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            ci4Var4 = ci4Var2;
            if (!bj4VarO.j(ci4Var4)) {
            }
            int i20 = i5 | i15 | 384;
            i6 = i18;
            if ((i18 & 306783379) == 306783378 || (i20 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i6 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    float f4 = bu0.b;
                    if ((i3 & 32) != 0) {
                        bu0 bu0Var = bu0.a;
                        i6 &= -458753;
                        jl9VarB = wl9.b(kr5.a, bj4VarO);
                    }
                    long jB = hi1.b(j, bj4VarO);
                    ox6 ox6Var4 = ox6Var2;
                    long jB2 = uh1.b(0.32f, hi1.d(md6.u, bj4VarO));
                    int i21 = i6 & (-1908408321);
                    if (i19 != 0) {
                        ci4Var3 = vr1.a;
                    }
                    if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                        ci4Var4 = hw6.t;
                    }
                    i7 = i21;
                    cx6Var3 = new cx6(0);
                    j6 = jB;
                    ci4Var7 = ci4Var3;
                    jl9Var3 = jl9VarB;
                    z4 = true;
                    ox6Var3 = ox6Var4;
                    f3 = f4;
                    j7 = jB2;
                } else {
                    bj4VarO.u();
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                    }
                    int i22 = i6 & (-1908408321);
                    j6 = j2;
                    cx6Var3 = cx6Var;
                    ci4Var7 = ci4Var3;
                    i7 = i22;
                    ox6Var3 = ox6Var2;
                    jl9Var3 = jl9VarB;
                    f3 = f;
                    z4 = z;
                    j7 = j3;
                }
                ci4 ci4Var8 = ci4Var4;
                bj4VarO.V();
                wy6 wy6Var = wy6.t;
                a04VarE = zs4.e(wy6Var, bj4VarO);
                a04VarE2 = zs4.e(wy6Var, bj4VarO);
                a04VarE3 = zs4.e(wy6.w, bj4VarO);
                i8 = (i7 & 896) ^ 384;
                if (i8 > 256 || !bj4VarO.J(hn9Var)) {
                    j8 = j7;
                    if ((i7 & 384) != 256) {
                        z5 = false;
                    }
                    zJ = z5 | bj4VarO.j(a04VarE2) | bj4VarO.j(a04VarE3) | bj4VarO.j(a04VarE);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (zJ || objF == c0187a) {
                        objF = new mh4() { // from class: yv6
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                hn9 hn9Var3 = hn9Var;
                                hn9Var3.e = a04VarE2;
                                hn9Var3.f = a04VarE3;
                                hn9Var3.c = a04VarE;
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    c33 c33Var = wd3.a;
                    bj4VarO.w((mh4) objF);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    boolean zJ3 = ((i8 <= 256 && bj4VarO.J(hn9Var)) || (i7 & 384) == 256) | bj4VarO.j(t72Var);
                    i9 = i7 & 14;
                    if (i9 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zJ3 | z6;
                    objF3 = bj4VarO.f();
                    if (z7 || objF3 == c0187a) {
                        objF3 = new mh4() { // from class: zv6
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                hn9 hn9Var3 = hn9Var;
                                if (hn9Var3.d.d.invoke(in9.t).booleanValue()) {
                                    oy0.d(t72Var, null, null, new ow6(hn9Var3, null), 3).j0(new dw6(0, hn9Var3, mh4Var));
                                }
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    mh4 mh4Var2 = (mh4) objF3;
                    zJ2 = bj4VarO.j(t72Var);
                    if (i8 > 256 || !bj4VarO.J(hn9Var)) {
                        z8 = zJ2;
                        if ((i7 & 384) != 256) {
                            z9 = false;
                        }
                        boolean z16 = z8 | z9;
                        if (i9 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z16 | z10;
                        objF4 = bj4VarO.f();
                        if (z11 || objF4 == c0187a) {
                            objF4 = new oh4() { // from class: aw6
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    float fFloatValue = ((Float) obj).floatValue();
                                    final hn9 hn9Var3 = hn9Var;
                                    dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var3, fFloatValue, null), 3);
                                    final mh4 mh4Var3 = mh4Var;
                                    dz9VarD.j0(new oh4() { // from class: fw6
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj2) {
                                            if (!hn9Var3.d()) {
                                                mh4Var3.invoke();
                                            }
                                            return g2b.a;
                                        }
                                    });
                                    return g2b.a;
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        oh4 oh4Var = (oh4) objF4;
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = ut.a(0.0f);
                            bj4VarO.C(objF5);
                        }
                        qtVar = (qt) objF5;
                        cx6 cx6Var4 = cx6Var3;
                        if (i8 > 256 || !bj4VarO.J(hn9Var)) {
                            i10 = i8;
                            if ((i7 & 384) != 256) {
                                z12 = false;
                            }
                            boolean zJ4 = z12 | bj4VarO.j(t72Var) | bj4VarO.j(qtVar);
                            if (i9 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zJ4 | z13;
                            objF6 = bj4VarO.f();
                            if (z14 || objF6 == c0187a) {
                                objF6 = new mh4() { // from class: bw6
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        hn9 hn9Var3 = hn9Var;
                                        in9 in9Var = (in9) hn9Var3.d.g.getValue();
                                        in9 in9Var2 = in9.u;
                                        t72 t72Var2 = t72Var;
                                        if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                            oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                            oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                                        } else {
                                            oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                                        }
                                        return g2b.a;
                                    }
                                };
                                bj4VarO.C(objF6);
                            }
                            i11 = i7;
                            i12 = i10;
                            bj4Var = bj4VarO;
                            long j9 = j8;
                            mw6 mw6Var = new mw6(j9, mh4Var2, hn9Var, cx6Var4, qtVar, t72Var, oh4Var, ox6Var3, f3, z4, jl9Var3, j, j6, ci4Var7, ci4Var8, fr1Var);
                            j4 = j9;
                            hn9Var2 = hn9Var;
                            gx6.a((mh4) objF6, j6, cx6Var4, qtVar, gr1.b(1010026864, mw6Var, bj4Var), bj4Var, 29056);
                            if (hn9Var2.d.e().e(in9.u)) {
                                bj4Var.K(748459762);
                                z15 = (i12 <= 256 && bj4Var.J(hn9Var2)) || (i11 & 384) == 256;
                                objF7 = bj4Var.f();
                                if (z15 || objF7 == c0187a) {
                                    objF7 = new nw6(hn9Var2, null);
                                    bj4Var.C(objF7);
                                }
                                wd3.d(bj4Var, (ci4) objF7, hn9Var2);
                                bj4Var.U(false);
                            } else {
                                bj4Var.K(748521266);
                                bj4Var.U(false);
                            }
                            cx6Var2 = cx6Var4;
                            f2 = f3;
                            z3 = z4;
                            jl9Var2 = jl9Var3;
                            j5 = j6;
                            ci4Var6 = ci4Var7;
                            ci4Var5 = ci4Var8;
                            ox6Var2 = ox6Var3;
                        } else {
                            i10 = i8;
                        }
                        z12 = true;
                        boolean zJ5 = z12 | bj4VarO.j(t72Var) | bj4VarO.j(qtVar);
                        if (i9 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zJ5 | z13;
                        objF6 = bj4VarO.f();
                        if (z14) {
                            objF6 = new mh4() { // from class: bw6
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    hn9 hn9Var3 = hn9Var;
                                    in9 in9Var = (in9) hn9Var3.d.g.getValue();
                                    in9 in9Var2 = in9.u;
                                    t72 t72Var2 = t72Var;
                                    if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                        oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                        oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                                    } else {
                                        oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new mh4() { // from class: bw6
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    hn9 hn9Var3 = hn9Var;
                                    in9 in9Var = (in9) hn9Var3.d.g.getValue();
                                    in9 in9Var2 = in9.u;
                                    t72 t72Var2 = t72Var;
                                    if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                        oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                        oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                                    } else {
                                        oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4VarO.C(objF6);
                        }
                        i11 = i7;
                        i12 = i10;
                        bj4Var = bj4VarO;
                        long j10 = j8;
                        mw6 mw6Var2 = new mw6(j10, mh4Var2, hn9Var, cx6Var4, qtVar, t72Var, oh4Var, ox6Var3, f3, z4, jl9Var3, j, j6, ci4Var7, ci4Var8, fr1Var);
                        j4 = j10;
                        hn9Var2 = hn9Var;
                        gx6.a((mh4) objF6, j6, cx6Var4, qtVar, gr1.b(1010026864, mw6Var2, bj4Var), bj4Var, 29056);
                        if (hn9Var2.d.e().e(in9.u)) {
                            bj4Var.K(748459762);
                            if (i12 <= 256) {
                            }
                            objF7 = bj4Var.f();
                            if (z15) {
                                objF7 = new nw6(hn9Var2, null);
                                bj4Var.C(objF7);
                            } else {
                                objF7 = new nw6(hn9Var2, null);
                                bj4Var.C(objF7);
                            }
                            wd3.d(bj4Var, (ci4) objF7, hn9Var2);
                            bj4Var.U(false);
                        } else {
                            bj4Var.K(748521266);
                            bj4Var.U(false);
                        }
                        cx6Var2 = cx6Var4;
                        f2 = f3;
                        z3 = z4;
                        jl9Var2 = jl9Var3;
                        j5 = j6;
                        ci4Var6 = ci4Var7;
                        ci4Var5 = ci4Var8;
                        ox6Var2 = ox6Var3;
                    } else {
                        z8 = zJ2;
                    }
                    z9 = true;
                    boolean z17 = z8 | z9;
                    if (i9 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z17 | z10;
                    objF4 = bj4VarO.f();
                    if (z11) {
                        objF4 = new oh4() { // from class: aw6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                float fFloatValue = ((Float) obj).floatValue();
                                final hn9 hn9Var3 = hn9Var;
                                dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var3, fFloatValue, null), 3);
                                final mh4 mh4Var3 = mh4Var;
                                dz9VarD.j0(new oh4() { // from class: fw6
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        if (!hn9Var3.d()) {
                                            mh4Var3.invoke();
                                        }
                                        return g2b.a;
                                    }
                                });
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: aw6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                float fFloatValue = ((Float) obj).floatValue();
                                final hn9 hn9Var3 = hn9Var;
                                dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var3, fFloatValue, null), 3);
                                final mh4 mh4Var3 = mh4Var;
                                dz9VarD.j0(new oh4() { // from class: fw6
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        if (!hn9Var3.d()) {
                                            mh4Var3.invoke();
                                        }
                                        return g2b.a;
                                    }
                                });
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    oh4 oh4Var2 = (oh4) objF4;
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = ut.a(0.0f);
                        bj4VarO.C(objF5);
                    }
                    qtVar = (qt) objF5;
                    cx6 cx6Var5 = cx6Var3;
                    if (i8 > 256) {
                        i10 = i8;
                        if ((i7 & 384) != 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        i10 = i8;
                        if ((i7 & 384) != 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    boolean zJ6 = z12 | bj4VarO.j(t72Var) | bj4VarO.j(qtVar);
                    if (i9 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zJ6 | z13;
                    objF6 = bj4VarO.f();
                    if (z14) {
                        objF6 = new mh4() { // from class: bw6
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                hn9 hn9Var3 = hn9Var;
                                in9 in9Var = (in9) hn9Var3.d.g.getValue();
                                in9 in9Var2 = in9.u;
                                t72 t72Var2 = t72Var;
                                if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                    oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                    oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                                } else {
                                    oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                                }
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new mh4() { // from class: bw6
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                hn9 hn9Var3 = hn9Var;
                                in9 in9Var = (in9) hn9Var3.d.g.getValue();
                                in9 in9Var2 = in9.u;
                                t72 t72Var2 = t72Var;
                                if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                    oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                    oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                                } else {
                                    oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                                }
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF6);
                    }
                    i11 = i7;
                    i12 = i10;
                    bj4Var = bj4VarO;
                    long j11 = j8;
                    mw6 mw6Var3 = new mw6(j11, mh4Var2, hn9Var, cx6Var5, qtVar, t72Var, oh4Var2, ox6Var3, f3, z4, jl9Var3, j, j6, ci4Var7, ci4Var8, fr1Var);
                    j4 = j11;
                    hn9Var2 = hn9Var;
                    gx6.a((mh4) objF6, j6, cx6Var5, qtVar, gr1.b(1010026864, mw6Var3, bj4Var), bj4Var, 29056);
                    if (hn9Var2.d.e().e(in9.u)) {
                        bj4Var.K(748459762);
                        if (i12 <= 256) {
                        }
                        objF7 = bj4Var.f();
                        if (z15) {
                            objF7 = new nw6(hn9Var2, null);
                            bj4Var.C(objF7);
                        } else {
                            objF7 = new nw6(hn9Var2, null);
                            bj4Var.C(objF7);
                        }
                        wd3.d(bj4Var, (ci4) objF7, hn9Var2);
                        bj4Var.U(false);
                    } else {
                        bj4Var.K(748521266);
                        bj4Var.U(false);
                    }
                    cx6Var2 = cx6Var5;
                    f2 = f3;
                    z3 = z4;
                    jl9Var2 = jl9Var3;
                    j5 = j6;
                    ci4Var6 = ci4Var7;
                    ci4Var5 = ci4Var8;
                    ox6Var2 = ox6Var3;
                } else {
                    j8 = j7;
                }
                z5 = true;
                zJ = z5 | bj4VarO.j(a04VarE2) | bj4VarO.j(a04VarE3) | bj4VarO.j(a04VarE);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (zJ) {
                    objF = new mh4() { // from class: yv6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            hn9Var3.e = a04VarE2;
                            hn9Var3.f = a04VarE3;
                            hn9Var3.c = a04VarE;
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: yv6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            hn9Var3.e = a04VarE2;
                            hn9Var3.f = a04VarE3;
                            hn9Var3.c = a04VarE;
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF);
                }
                c33 c33Var2 = wd3.a;
                bj4VarO.w((mh4) objF);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                boolean zJ7 = ((i8 <= 256 && bj4VarO.J(hn9Var)) || (i7 & 384) == 256) | bj4VarO.j(t72Var);
                i9 = i7 & 14;
                if (i9 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zJ7 | z6;
                objF3 = bj4VarO.f();
                if (z7) {
                    objF3 = new mh4() { // from class: zv6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            if (hn9Var3.d.d.invoke(in9.t).booleanValue()) {
                                oy0.d(t72Var, null, null, new ow6(hn9Var3, null), 3).j0(new dw6(0, hn9Var3, mh4Var));
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: zv6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            if (hn9Var3.d.d.invoke(in9.t).booleanValue()) {
                                oy0.d(t72Var, null, null, new ow6(hn9Var3, null), 3).j0(new dw6(0, hn9Var3, mh4Var));
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF3);
                }
                mh4 mh4Var3 = (mh4) objF3;
                zJ2 = bj4VarO.j(t72Var);
                if (i8 > 256) {
                    z8 = zJ2;
                    if ((i7 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z8 = zJ2;
                    if ((i7 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                boolean z18 = z8 | z9;
                if (i9 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z18 | z10;
                objF4 = bj4VarO.f();
                if (z11) {
                    objF4 = new oh4() { // from class: aw6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            float fFloatValue = ((Float) obj).floatValue();
                            final hn9 hn9Var3 = hn9Var;
                            dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var3, fFloatValue, null), 3);
                            final mh4 mh4Var4 = mh4Var;
                            dz9VarD.j0(new oh4() { // from class: fw6
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    if (!hn9Var3.d()) {
                                        mh4Var4.invoke();
                                    }
                                    return g2b.a;
                                }
                            });
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: aw6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            float fFloatValue = ((Float) obj).floatValue();
                            final hn9 hn9Var3 = hn9Var;
                            dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var3, fFloatValue, null), 3);
                            final mh4 mh4Var4 = mh4Var;
                            dz9VarD.j0(new oh4() { // from class: fw6
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    if (!hn9Var3.d()) {
                                        mh4Var4.invoke();
                                    }
                                    return g2b.a;
                                }
                            });
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF4);
                }
                oh4 oh4Var3 = (oh4) objF4;
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = ut.a(0.0f);
                    bj4VarO.C(objF5);
                }
                qtVar = (qt) objF5;
                cx6 cx6Var6 = cx6Var3;
                if (i8 > 256) {
                    i10 = i8;
                    if ((i7 & 384) != 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    i10 = i8;
                    if ((i7 & 384) != 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                boolean zJ8 = z12 | bj4VarO.j(t72Var) | bj4VarO.j(qtVar);
                if (i9 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zJ8 | z13;
                objF6 = bj4VarO.f();
                if (z14) {
                    objF6 = new mh4() { // from class: bw6
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            in9 in9Var = (in9) hn9Var3.d.g.getValue();
                            in9 in9Var2 = in9.u;
                            t72 t72Var2 = t72Var;
                            if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                            } else {
                                oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF6);
                } else {
                    objF6 = new mh4() { // from class: bw6
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            hn9 hn9Var3 = hn9Var;
                            in9 in9Var = (in9) hn9Var3.d.g.getValue();
                            in9 in9Var2 = in9.u;
                            t72 t72Var2 = t72Var;
                            if (in9Var == in9Var2 && hn9Var3.d.e().e(in9.v)) {
                                oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                                oy0.d(t72Var2, null, null, new jw6(hn9Var3, null), 3);
                            } else {
                                oy0.d(t72Var2, null, null, new kw6(hn9Var3, null), 3).j0(new ew6(0, mh4Var));
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF6);
                }
                i11 = i7;
                i12 = i10;
                bj4Var = bj4VarO;
                long j12 = j8;
                mw6 mw6Var4 = new mw6(j12, mh4Var3, hn9Var, cx6Var6, qtVar, t72Var, oh4Var3, ox6Var3, f3, z4, jl9Var3, j, j6, ci4Var7, ci4Var8, fr1Var);
                j4 = j12;
                hn9Var2 = hn9Var;
                gx6.a((mh4) objF6, j6, cx6Var6, qtVar, gr1.b(1010026864, mw6Var4, bj4Var), bj4Var, 29056);
                if (hn9Var2.d.e().e(in9.u)) {
                    bj4Var.K(748459762);
                    if (i12 <= 256) {
                    }
                    objF7 = bj4Var.f();
                    if (z15) {
                        objF7 = new nw6(hn9Var2, null);
                        bj4Var.C(objF7);
                    } else {
                        objF7 = new nw6(hn9Var2, null);
                        bj4Var.C(objF7);
                    }
                    wd3.d(bj4Var, (ci4) objF7, hn9Var2);
                    bj4Var.U(false);
                } else {
                    bj4Var.K(748521266);
                    bj4Var.U(false);
                }
                cx6Var2 = cx6Var6;
                f2 = f3;
                z3 = z4;
                jl9Var2 = jl9Var3;
                j5 = j6;
                ci4Var6 = ci4Var7;
                ci4Var5 = ci4Var8;
                ox6Var2 = ox6Var3;
            } else {
                bj4Var = bj4VarO;
                hn9Var2 = hn9Var;
                bj4Var.u();
                f2 = f;
                j4 = j3;
                cx6Var2 = cx6Var;
                ci4Var5 = ci4Var4;
                jl9Var2 = jl9VarB;
                j5 = j2;
                ci4Var6 = ci4Var3;
                z3 = z;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final hn9 hn9Var3 = hn9Var2;
                final ox6 ox6Var5 = ox6Var2;
                final long j13 = j4;
                final cx6 cx6Var7 = cx6Var2;
                xj8VarW.d = new ci4() { // from class: cw6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iS = gz3.s(i | 1);
                        int iS2 = gz3.s(i2);
                        bx6.a(mh4Var, ox6Var5, hn9Var3, f2, z3, jl9Var2, j, j5, j13, ci4Var6, ci4Var5, cx6Var7, fr1Var, (jt1) obj, iS, iS2, i3);
                        return g2b.a;
                    }
                };
            }
        }
        ci4Var4 = ci4Var2;
        i15 = 16;
        int i23 = i5 | i15 | 384;
        i6 = i18;
        if ((i18 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (bj4VarO.A(i6 & 1, z2)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                float f5 = bu0.b;
                if ((i3 & 32) != 0) {
                    bu0 bu0Var2 = bu0.a;
                    i6 &= -458753;
                    jl9VarB = wl9.b(kr5.a, bj4VarO);
                }
                long jB3 = hi1.b(j, bj4VarO);
                ox6 ox6Var6 = ox6Var2;
                long jB4 = uh1.b(0.32f, hi1.d(md6.u, bj4VarO));
                int i24 = i6 & (-1908408321);
                if (i19 != 0) {
                    ci4Var3 = vr1.a;
                }
                if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                    ci4Var4 = hw6.t;
                }
                i7 = i24;
                cx6Var3 = new cx6(0);
                j6 = jB3;
                ci4Var7 = ci4Var3;
                jl9Var3 = jl9VarB;
                z4 = true;
                ox6Var3 = ox6Var6;
                f3 = f5;
                j7 = jB4;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                float f6 = bu0.b;
                if ((i3 & 32) != 0) {
                    bu0 bu0Var3 = bu0.a;
                    i6 &= -458753;
                    jl9VarB = wl9.b(kr5.a, bj4VarO);
                }
                long jB5 = hi1.b(j, bj4VarO);
                ox6 ox6Var7 = ox6Var2;
                long jB6 = uh1.b(0.32f, hi1.d(md6.u, bj4VarO));
                int i25 = i6 & (-1908408321);
                if (i19 != 0) {
                    ci4Var3 = vr1.a;
                }
                if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                    ci4Var4 = hw6.t;
                }
                i7 = i25;
                cx6Var3 = new cx6(0);
                j6 = jB5;
                ci4Var7 = ci4Var3;
                jl9Var3 = jl9VarB;
                z4 = true;
                ox6Var3 = ox6Var7;
                f3 = f6;
                j7 = jB6;
            }
            ci4 ci4Var9 = ci4Var4;
            bj4VarO.V();
            wy6 wy6Var2 = wy6.t;
            a04VarE = zs4.e(wy6Var2, bj4VarO);
            a04VarE2 = zs4.e(wy6Var2, bj4VarO);
            a04VarE3 = zs4.e(wy6.w, bj4VarO);
            i8 = (i7 & 896) ^ 384;
            if (i8 > 256) {
                j8 = j7;
                if ((i7 & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                j8 = j7;
                if ((i7 & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            zJ = z5 | bj4VarO.j(a04VarE2) | bj4VarO.j(a04VarE3) | bj4VarO.j(a04VarE);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (zJ) {
                objF = new mh4() { // from class: yv6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        hn9Var4.e = a04VarE2;
                        hn9Var4.f = a04VarE3;
                        hn9Var4.c = a04VarE;
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: yv6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        hn9Var4.e = a04VarE2;
                        hn9Var4.f = a04VarE3;
                        hn9Var4.c = a04VarE;
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            c33 c33Var3 = wd3.a;
            bj4VarO.w((mh4) objF);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF2;
            boolean zJ9 = ((i8 <= 256 && bj4VarO.J(hn9Var)) || (i7 & 384) == 256) | bj4VarO.j(t72Var);
            i9 = i7 & 14;
            if (i9 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zJ9 | z6;
            objF3 = bj4VarO.f();
            if (z7) {
                objF3 = new mh4() { // from class: zv6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        if (hn9Var4.d.d.invoke(in9.t).booleanValue()) {
                            oy0.d(t72Var, null, null, new ow6(hn9Var4, null), 3).j0(new dw6(0, hn9Var4, mh4Var));
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new mh4() { // from class: zv6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        if (hn9Var4.d.d.invoke(in9.t).booleanValue()) {
                            oy0.d(t72Var, null, null, new ow6(hn9Var4, null), 3).j0(new dw6(0, hn9Var4, mh4Var));
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF3);
            }
            mh4 mh4Var4 = (mh4) objF3;
            zJ2 = bj4VarO.j(t72Var);
            if (i8 > 256) {
                z8 = zJ2;
                if ((i7 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z8 = zJ2;
                if ((i7 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            boolean z19 = z8 | z9;
            if (i9 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z19 | z10;
            objF4 = bj4VarO.f();
            if (z11) {
                objF4 = new oh4() { // from class: aw6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        float fFloatValue = ((Float) obj).floatValue();
                        final hn9 hn9Var4 = hn9Var;
                        dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var4, fFloatValue, null), 3);
                        final mh4 mh4Var5 = mh4Var;
                        dz9VarD.j0(new oh4() { // from class: fw6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                if (!hn9Var4.d()) {
                                    mh4Var5.invoke();
                                }
                                return g2b.a;
                            }
                        });
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF4);
            } else {
                objF4 = new oh4() { // from class: aw6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        float fFloatValue = ((Float) obj).floatValue();
                        final hn9 hn9Var4 = hn9Var;
                        dz9 dz9VarD = oy0.d(t72Var, null, null, new pw6(hn9Var4, fFloatValue, null), 3);
                        final mh4 mh4Var5 = mh4Var;
                        dz9VarD.j0(new oh4() { // from class: fw6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                if (!hn9Var4.d()) {
                                    mh4Var5.invoke();
                                }
                                return g2b.a;
                            }
                        });
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF4);
            }
            oh4 oh4Var4 = (oh4) objF4;
            objF5 = bj4VarO.f();
            if (objF5 == c0187a) {
                objF5 = ut.a(0.0f);
                bj4VarO.C(objF5);
            }
            qtVar = (qt) objF5;
            cx6 cx6Var8 = cx6Var3;
            if (i8 > 256) {
                i10 = i8;
                if ((i7 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                i10 = i8;
                if ((i7 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            boolean zJ10 = z12 | bj4VarO.j(t72Var) | bj4VarO.j(qtVar);
            if (i9 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zJ10 | z13;
            objF6 = bj4VarO.f();
            if (z14) {
                objF6 = new mh4() { // from class: bw6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        in9 in9Var = (in9) hn9Var4.d.g.getValue();
                        in9 in9Var2 = in9.u;
                        t72 t72Var2 = t72Var;
                        if (in9Var == in9Var2 && hn9Var4.d.e().e(in9.v)) {
                            oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                            oy0.d(t72Var2, null, null, new jw6(hn9Var4, null), 3);
                        } else {
                            oy0.d(t72Var2, null, null, new kw6(hn9Var4, null), 3).j0(new ew6(0, mh4Var));
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF6);
            } else {
                objF6 = new mh4() { // from class: bw6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var4 = hn9Var;
                        in9 in9Var = (in9) hn9Var4.d.g.getValue();
                        in9 in9Var2 = in9.u;
                        t72 t72Var2 = t72Var;
                        if (in9Var == in9Var2 && hn9Var4.d.e().e(in9.v)) {
                            oy0.d(t72Var2, null, null, new iw6(qtVar, null), 3);
                            oy0.d(t72Var2, null, null, new jw6(hn9Var4, null), 3);
                        } else {
                            oy0.d(t72Var2, null, null, new kw6(hn9Var4, null), 3).j0(new ew6(0, mh4Var));
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF6);
            }
            i11 = i7;
            i12 = i10;
            bj4Var = bj4VarO;
            long j14 = j8;
            mw6 mw6Var5 = new mw6(j14, mh4Var4, hn9Var, cx6Var8, qtVar, t72Var, oh4Var4, ox6Var3, f3, z4, jl9Var3, j, j6, ci4Var7, ci4Var9, fr1Var);
            j4 = j14;
            hn9Var2 = hn9Var;
            gx6.a((mh4) objF6, j6, cx6Var8, qtVar, gr1.b(1010026864, mw6Var5, bj4Var), bj4Var, 29056);
            if (hn9Var2.d.e().e(in9.u)) {
                bj4Var.K(748459762);
                if (i12 <= 256) {
                }
                objF7 = bj4Var.f();
                if (z15) {
                    objF7 = new nw6(hn9Var2, null);
                    bj4Var.C(objF7);
                } else {
                    objF7 = new nw6(hn9Var2, null);
                    bj4Var.C(objF7);
                }
                wd3.d(bj4Var, (ci4) objF7, hn9Var2);
                bj4Var.U(false);
            } else {
                bj4Var.K(748521266);
                bj4Var.U(false);
            }
            cx6Var2 = cx6Var8;
            f2 = f3;
            z3 = z4;
            jl9Var2 = jl9Var3;
            j5 = j6;
            ci4Var6 = ci4Var7;
            ci4Var5 = ci4Var9;
            ox6Var2 = ox6Var3;
        } else {
            bj4Var = bj4VarO;
            hn9Var2 = hn9Var;
            bj4Var.u();
            f2 = f;
            j4 = j3;
            cx6Var2 = cx6Var;
            ci4Var5 = ci4Var4;
            jl9Var2 = jl9VarB;
            j5 = j2;
            ci4Var6 = ci4Var3;
            z3 = z;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final hn9 hn9Var4 = hn9Var2;
            final ox6 ox6Var8 = ox6Var2;
            final long j15 = j4;
            final cx6 cx6Var9 = cx6Var2;
            xj8VarW.d = new ci4() { // from class: cw6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    bx6.a(mh4Var, ox6Var8, hn9Var4, f2, z3, jl9Var2, j, j5, j15, ci4Var6, ci4Var5, cx6Var9, fr1Var, (jt1) obj, iS, iS2, i3);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final qt qtVar, final t72 t72Var, final mh4 mh4Var, final oh4 oh4Var, final ox6 ox6Var, final hn9 hn9Var, final float f, final boolean z, final jl9 jl9Var, final long j, final long j2, final float f2, final ci4 ci4Var, final ci4 ci4Var2, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-37400432);
        int i2 = i | (bj4VarO.j(qtVar) ? 32 : 16) | (bj4VarO.j(t72Var) ? 256 : 128) | (bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(oh4Var) ? 16384 : 8192) | (bj4VarO.J(ox6Var) ? 131072 : 65536) | (bj4VarO.J(hn9Var) ? 1048576 : 524288) | (bj4VarO.g(f) ? 8388608 : 4194304) | (bj4VarO.c(z) ? 67108864 : 33554432) | (bj4VarO.J(jl9Var) ? 536870912 : 268435456);
        int i3 = (bj4VarO.i(j) ? 4 : 2) | (bj4VarO.i(j2) ? 32 : 16) | (bj4VarO.g(f2) ? 256 : 128) | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(ci4Var2) ? 16384 : 8192) | (bj4VarO.j(fr1Var) ? 131072 : 65536);
        if (bj4VarO.A(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            final String strB = ws3.b(bj4VarO, R.string.m3c_bottom_sheet_pane_title);
            ox6 ox6VarC = ir9.c(ir9.o(kv0.a.f(ox6Var, di.a.b), f), 1.0f);
            ox6 ox6VarA = ox6.a.t;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z) {
                bj4VarO.K(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && bj4VarO.J(hn9Var)) || (i2 & 1572864) == 1048576;
                Object objF = bj4VarO.f();
                if (z2 || objF == c0187a) {
                    xya xyaVar = dn9.a;
                    objF = new an9(hn9Var, oh4Var);
                    bj4VarO.C(objF);
                }
                ox6VarA = g97.a(ox6VarA, (b97) objF, null);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1582020872);
                bj4VarO.U(false);
            }
            ox6 ox6VarH = ox6VarC.H(ox6VarA);
            wj<in9> wjVar = hn9Var.d;
            wj<in9> wjVar2 = hn9Var.d;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && bj4VarO.J(hn9Var)) || (i2 & 1572864) == 1048576;
            Object objF2 = bj4VarO.f();
            if (z3 || objF2 == c0187a) {
                objF2 = new ci4() { // from class: uv6
                    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        kg5 kg5Var = (kg5) obj;
                        float fG = xx1.g(((xx1) obj2).a);
                        h63 h63Var = new h63();
                        in9 in9Var = in9.t;
                        h63Var.a(in9Var, fG);
                        float f3 = (int) (kg5Var.a & 4294967295L);
                        float f4 = fG / 2.0f;
                        in9 in9Var2 = in9.v;
                        hn9 hn9Var2 = hn9Var;
                        if (f3 > f4 && !hn9Var2.a) {
                            h63Var.a(in9Var2, f4);
                        }
                        int i5 = (int) (kg5Var.a & 4294967295L);
                        in9 in9Var3 = in9.u;
                        if (i5 != 0) {
                            h63Var.a(in9Var3, Math.max(0.0f, fG - i5));
                        }
                        g2b g2bVar = g2b.a;
                        LinkedHashMap linkedHashMap = h63Var.a;
                        oh6 oh6Var = new oh6(linkedHashMap);
                        int iOrdinal = ((in9) hn9Var2.d.h.getValue()).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    u.b();
                                    return null;
                                }
                                if (linkedHashMap.containsKey(in9Var2)) {
                                    in9Var = in9Var2;
                                } else if (linkedHashMap.containsKey(in9Var3)) {
                                    in9Var = in9Var3;
                                }
                            } else if (linkedHashMap.containsKey(in9Var3)) {
                                in9Var = in9Var3;
                            }
                        }
                        return new js7(oh6Var, in9Var);
                    }
                };
                bj4VarO.C(objF2);
            }
            ox6 ox6VarH2 = ox6VarH.H(new i63(wjVar, (ci4) objF2));
            vj vjVar = wjVar2.f;
            boolean z4 = z && hn9Var.d();
            boolean z5 = wjVar2.l.getValue() != 0;
            boolean z6 = (i2 & 57344) == 16384;
            Object objF3 = bj4VarO.f();
            if (z6 || objF3 == c0187a) {
                objF3 = new qw6(oh4Var, null);
                bj4VarO.C(objF3);
            }
            ox6 ox6VarH3 = ox6VarH2.H(new l63(vjVar, z4, z5, m63.a, (ei4) objF3));
            boolean zJ = bj4VarO.J(strB);
            Object objF4 = bj4VarO.f();
            if (zJ || objF4 == c0187a) {
                objF4 = new oh4() { // from class: vv6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        ec9.d(strB, hc9Var);
                        ec9.i(hc9Var, 0.0f);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF4);
            }
            ox6 ox6VarB = pb9.b(ox6VarH3, false, (oh4) objF4);
            int iH = (int) wjVar2.j.h();
            if (iH < 0) {
                iH = 0;
            }
            ox6 ox6VarH4 = ox6VarB.H(new e2b(new j34(iH)));
            boolean z7 = ((i4 > 1048576 && bj4VarO.J(hn9Var)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || bj4VarO.j(qtVar));
            Object objF5 = bj4VarO.f();
            if (z7 || objF5 == c0187a) {
                objF5 = new oh4() { // from class: wv6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ro4 ro4Var = (ro4) obj;
                        float fH = hn9Var.d.j.h();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (ro4Var.c() & 4294967295L));
                        if (!Float.isNaN(fH) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                            float fFloatValue = ((Number) qtVar.d()).floatValue();
                            ro4Var.r(bx6.d(ro4Var, fFloatValue));
                            ro4Var.k(bx6.e(ro4Var, fFloatValue));
                            ro4Var.o1(sb4.b(0.5f, (fH + fIntBitsToFloat) / fIntBitsToFloat));
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF5);
            }
            int i5 = i3 << 6;
            bj4Var = bj4VarO;
            v5a.a(po4.a(po4.a(ox6VarH4, (oh4) objF5), new fu0(0, hn9Var)), jl9Var, j, j2, f2, 0.0f, null, gr1.b(728743275, new ax6(ci4Var2, qtVar, hn9Var, ci4Var, fr1Var, mh4Var, t72Var, z), bj4VarO), bj4Var, ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 96);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(t72Var, mh4Var, oh4Var, ox6Var, hn9Var, f, z, jl9Var, j, j2, f2, ci4Var, ci4Var2, fr1Var, i) { // from class: xv6
                public final /* synthetic */ boolean A;
                public final /* synthetic */ jl9 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ float E;
                public final /* synthetic */ ci4 F;
                public final /* synthetic */ ci4 G;
                public final /* synthetic */ fr1 H;
                public final /* synthetic */ t72 u;
                public final /* synthetic */ mh4 v;
                public final /* synthetic */ oh4 w;
                public final /* synthetic */ ox6 x;
                public final /* synthetic */ hn9 y;
                public final /* synthetic */ float z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(71);
                    bx6.b(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final long j, final mh4<g2b> mh4Var, final boolean z, final boolean z2, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-391613911);
        int i2 = i | (bj4VarO.i(j) ? 4 : 2) | (bj4VarO.j(mh4Var) ? 32 : 16) | (bj4VarO.c(z) ? 256 : 128) | (bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (!bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            bj4VarO.u();
        } else if (j != 16) {
            bj4VarO.K(-1438582326);
            final yz9 yz9VarB = xt.b(z ? 1.0f : 0.0f, zs4.e(wy6.v, bj4VarO), bj4VarO, 0);
            final String strB = ws3.b(bj4VarO, R.string.close_sheet);
            ox6 ox6VarB = ox6.a.t;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z2) {
                bj4VarO.K(-1438283579);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objF = bj4VarO.f();
                if (z3 || objF == c0187a) {
                    objF = new a(mh4Var);
                    bj4VarO.C(objF);
                }
                ox6 ox6VarB2 = t6a.b(ox6VarB, mh4Var, (PointerInputEventHandler) objF);
                boolean zJ = (i3 == 32) | bj4VarO.J(strB);
                Object objF2 = bj4VarO.f();
                if (zJ || objF2 == c0187a) {
                    objF2 = new oh4() { // from class: gw6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            hc9 hc9Var = (hc9) obj;
                            ec9.i(hc9Var, 1.0f);
                            ec9.b(strB, hc9Var);
                            hc9Var.d(kb9.b, new k3(null, new xw2(2, mh4Var)));
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF2);
                }
                ox6VarB = pb9.b(ox6VarB2, true, (oh4) objF2);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1437857391);
                bj4VarO.U(false);
            }
            ox6 ox6VarH = ir9.c.H(ox6VarB);
            boolean zJ2 = bj4VarO.J(yz9VarB) | ((i2 & 14) == 4);
            Object objF3 = bj4VarO.f();
            if (zJ2 || objF3 == c0187a) {
                objF3 = new oh4() { // from class: sv6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73.W0((d73) obj, j, 0L, 0L, uh8.f(((Number) yz9VarB.getValue()).floatValue(), 0.0f, 1.0f), 118);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF3);
            }
            us3.b(ox6VarH, (oh4) objF3, bj4VarO, 0);
            bj4VarO.U(false);
        } else {
            bj4VarO.K(-1437676103);
            bj4VarO.U(false);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(j, mh4Var, z, z2, i) { // from class: tv6
                public final /* synthetic */ long t;
                public final /* synthetic */ mh4 u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ boolean w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    bx6.c(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final float d(ro4 ro4Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ro4Var.c() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (vk6.c(0.0f, Math.min(ro4Var.U0(48.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(ro4 ro4Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ro4Var.c() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (vk6.c(0.0f, Math.min(ro4Var.U0(24.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final hn9 f(int i, jt1 jt1Var, int i2) {
        boolean z = true;
        final boolean z2 = (i2 & 1) == 0;
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (objF == obj) {
            objF = new dj3(1);
            jt1Var.C(objF);
        }
        final oh4 oh4Var = (oh4) objF;
        int i3 = (i & 14) | 384;
        xya xyaVar = dn9.a;
        final float f = bu0.c;
        final float f2 = bu0.d;
        final tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        boolean zJ = jt1Var.J(tx2Var) | jt1Var.g(f);
        Object objF2 = jt1Var.f();
        if (zJ || objF2 == obj) {
            objF2 = new mh4() { // from class: wm9
                @Override // defpackage.mh4
                public final Object invoke() {
                    return Float.valueOf(tx2Var.U0(f));
                }
            };
            jt1Var.C(objF2);
        }
        final mh4 mh4Var = (mh4) objF2;
        boolean zJ2 = jt1Var.J(tx2Var) | jt1Var.g(f2);
        Object objF3 = jt1Var.f();
        if (zJ2 || objF3 == obj) {
            objF3 = new mh4() { // from class: xm9
                @Override // defpackage.mh4
                public final Object invoke() {
                    return Float.valueOf(tx2Var.U0(f2));
                }
            };
            jt1Var.C(objF3);
        }
        final mh4 mh4Var2 = (mh4) objF3;
        Object[] objArr = {Boolean.valueOf(z2), oh4Var, Boolean.FALSE};
        au3 au3Var = new au3(new v29(1), new oh4() { // from class: fn9
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                return new hn9(z2, mh4Var, mh4Var2, (in9) obj2, oh4Var);
            }
        });
        if ((((i3 & 14) ^ 6) <= 4 || !jt1Var.c(z2)) && (i3 & 6) != 4) {
            z = false;
        }
        boolean zJ3 = jt1Var.J(mh4Var) | z | jt1Var.J(mh4Var2) | jt1Var.J(oh4Var) | jt1Var.c(false);
        Object objF4 = jt1Var.f();
        if (zJ3 || objF4 == obj) {
            final in9 in9Var = in9.t;
            Object obj2 = new mh4() { // from class: ym9
                @Override // defpackage.mh4
                public final Object invoke() {
                    return new hn9(z2, mh4Var, mh4Var2, in9Var, oh4Var);
                }
            };
            jt1Var.C(obj2);
            objF4 = obj2;
        }
        return (hn9) mm8.e(objArr, au3Var, (mh4) objF4, jt1Var, 0);
    }
}
