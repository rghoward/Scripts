package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xr6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ox6 ox6Var, final j37 j37Var, final h37 h37Var, final x69 x69Var, final jl9 jl9Var, final long j, final float f, final fr1 fr1Var, jt1 jt1Var, final int i) {
        float f2;
        bj4 bj4VarO = jt1Var.o(848986741);
        int i2 = i | (bj4VarO.J(ox6Var) ? 4 : 2) | (bj4VarO.J(j37Var) ? 32 : 16) | (bj4VarO.J(x69Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.J(jl9Var) ? 16384 : 8192) | (bj4VarO.i(j) ? 131072 : 65536) | (bj4VarO.g(0.0f) ? 1048576 : 524288) | (bj4VarO.g(f) ? 8388608 : 4194304) | (bj4VarO.J(null) ? 67108864 : 33554432) | (bj4VarO.j(fr1Var) ? 536870912 : 268435456);
        if (bj4VarO.A(i2 & 1, (i2 & 306783379) != 306783378)) {
            tva tvaVarE = owa.e(j37Var, "DropDownMenu", bj4VarO, ((i2 >> 3) & 14) | 48);
            a04 a04VarE = zs4.e(wy6.u, bj4VarO);
            a04 a04VarE2 = zs4.e(wy6.w, bj4VarO);
            dza dzaVar = b0a.v;
            l4c l4cVar = tvaVarE.a;
            dt7 dt7Var = tvaVarE.d;
            boolean zBooleanValue = ((Boolean) l4cVar.b()).booleanValue();
            bj4VarO.K(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            bj4VarO.U(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) dt7Var.getValue()).booleanValue();
            bj4VarO.K(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            bj4VarO.U(false);
            Float fValueOf2 = Float.valueOf(f4);
            tvaVarE.f();
            bj4VarO.K(-745957716);
            bj4VarO.U(false);
            final tva.d dVarC = owa.c(tvaVarE, fValueOf, fValueOf2, a04VarE, dzaVar, bj4VarO, 0);
            boolean zBooleanValue3 = ((Boolean) tvaVarE.a.b()).booleanValue();
            bj4VarO.K(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            bj4VarO.U(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) dt7Var.getValue()).booleanValue();
            bj4VarO.K(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            bj4VarO.U(false);
            Float fValueOf4 = Float.valueOf(f6);
            tvaVarE.f();
            bj4VarO.K(2839488);
            bj4VarO.U(false);
            final tva.d dVarC2 = owa.c(tvaVarE, fValueOf3, fValueOf4, a04VarE2, dzaVar, bj4VarO, 0);
            final boolean zBooleanValue5 = ((Boolean) bj4VarO.F(me5.a)).booleanValue();
            boolean zC = bj4VarO.c(zBooleanValue5) | bj4VarO.J(dVarC) | ((i2 & 112) == 32) | bj4VarO.J(dVarC2);
            Object objF = bj4VarO.f();
            if (zC || objF == jt1.a.a) {
                f2 = 0.0f;
                oh4 oh4Var = new oh4() { // from class: sr6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        float fFloatValue;
                        dt7 dt7Var2 = j37Var.c;
                        ro4 ro4Var = (ro4) obj;
                        boolean z = zBooleanValue5;
                        yz9 yz9Var = dVarC;
                        float fFloatValue2 = 0.8f;
                        float fFloatValue3 = 1.0f;
                        if (z) {
                            fFloatValue = ((Boolean) dt7Var2.getValue()).booleanValue() ? 1.0f : 0.8f;
                        } else {
                            fFloatValue = ((Number) yz9Var.getValue()).floatValue();
                        }
                        ro4Var.r(fFloatValue);
                        if (!z) {
                            fFloatValue2 = ((Number) yz9Var.getValue()).floatValue();
                        } else if (((Boolean) dt7Var2.getValue()).booleanValue()) {
                            fFloatValue2 = 1.0f;
                        }
                        ro4Var.k(fFloatValue2);
                        if (!z) {
                            fFloatValue3 = ((Number) dVarC2.getValue()).floatValue();
                        } else if (!((Boolean) dt7Var2.getValue()).booleanValue()) {
                            fFloatValue3 = 0.0f;
                        }
                        ro4Var.b(fFloatValue3);
                        ro4Var.o1(((ava) h37Var.getValue()).a);
                        return g2b.a;
                    }
                };
                bj4VarO.C(oh4Var);
                objF = oh4Var;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            v5a.a(po4.a(ox6.a.t, (oh4) objF), jl9Var, j, 0L, f2, f, null, gr1.b(-1463404422, new ur6(ox6Var, x69Var, fr1Var), bj4VarO), bj4VarO, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            bj4VarO = bj4VarO;
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(j37Var, h37Var, x69Var, jl9Var, j, f, fr1Var, i) { // from class: tr6
                public final /* synthetic */ fr1 A;
                public final /* synthetic */ j37 u;
                public final /* synthetic */ h37 v;
                public final /* synthetic */ x69 w;
                public final /* synthetic */ jl9 x;
                public final /* synthetic */ long y;
                public final /* synthetic */ float z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(385);
                    xr6.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final fr1 fr1Var, final mh4 mh4Var, final ox6 ox6Var, boolean z, final nr6 nr6Var, final go7 go7Var, jt1 jt1Var, final int i) {
        int i2;
        final boolean z2 = z;
        bj4 bj4VarO = jt1Var.o(-1325192924);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(fr1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(null) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.c(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.J(nr6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.J(go7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bj4VarO.J(null) ? 67108864 : 33554432;
        }
        if (bj4VarO.A(i2 & 1, (38347923 & i2) != 38347922)) {
            ox6 ox6VarH = eo7.h(ir9.m(ir9.c(we1.b(ox6Var, null, zw8.a(6), z2, null, mh4Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, 0.0f, 8), go7Var);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                z2 = z2;
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                z2 = z2;
                bj4VarO.k(aVar);
            } else {
                z2 = z2;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            mia.a(((g0b) bj4VarO.F(j0b.a)).m, gr1.b(865999929, new wr6(nr6Var, z2, fr1Var), bj4VarO), bj4VarO, 48);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rr6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xr6.b(fr1Var, mh4Var, ox6Var, z2, nr6Var, go7Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long c(gg5 gg5Var, gg5 gg5Var2) {
        float fMin;
        int i = gg5Var2.a;
        int i2 = gg5Var2.d;
        int i3 = gg5Var2.a;
        int i4 = gg5Var2.c;
        int i5 = gg5Var2.b;
        int i6 = gg5Var.c;
        int i7 = gg5Var.b;
        int i8 = gg5Var.d;
        int i9 = gg5Var.a;
        float fMin2 = 1.0f;
        if (i >= i6) {
            fMin = 0.0f;
        } else if (i4 <= i9) {
            fMin = 1.0f;
        } else if (gg5Var2.d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(gg5Var.c, i4) + Math.max(i9, i3)) / 2) - i3) / gg5Var2.d();
        }
        if (i5 >= i8) {
            fMin2 = 0.0f;
        } else if (i2 > i7) {
            if (gg5Var2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / gg5Var2.b();
            }
        }
        return sb4.b(fMin, fMin2);
    }
}
