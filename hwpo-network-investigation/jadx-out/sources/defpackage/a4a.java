package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a4a {
    public static final void a(Object obj, String str, b85 b85Var, ox6 ox6Var, fi4 fi4Var, fi4 fi4Var2, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, jt1 jt1Var, int i, int i2, int i3) {
        jt1Var.e(-1545157471);
        if ((i3 & 32) != 0) {
            fi4Var = null;
        }
        fi4 fi4Var3 = (i3 & 128) != 0 ? null : fi4Var2;
        final oh4 oh4Var4 = (i3 & 256) != 0 ? null : oh4Var;
        final oh4 oh4Var5 = (i3 & 512) != 0 ? null : oh4Var2;
        final oh4 oh4Var6 = (i3 & 1024) != 0 ? null : oh4Var3;
        nz1 nz1Var = (i3 & 4096) != 0 ? nz1.a.b : nz1.a.a;
        l50 l50Var = new l50(obj, b85Var);
        hj8 hj8Var = x6b.b;
        b(l50Var, str, ox6Var, (oh4Var4 == null && oh4Var5 == null && oh4Var6 == null) ? null : new oh4() { // from class: u6b
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                f50.a aVar = (f50.a) obj2;
                if (aVar instanceof f50.a.c) {
                    oh4 oh4Var7 = oh4Var4;
                    if (oh4Var7 != null) {
                        oh4Var7.invoke(aVar);
                    }
                } else if (aVar instanceof f50.a.d) {
                    oh4 oh4Var8 = oh4Var5;
                    if (oh4Var8 != null) {
                        oh4Var8.invoke(aVar);
                    }
                } else if (aVar instanceof f50.a.b) {
                    oh4 oh4Var9 = oh4Var6;
                    if (oh4Var9 != null) {
                        oh4Var9.invoke(aVar);
                    }
                } else if (!(aVar instanceof f50.a.C0085a)) {
                    u.b();
                    return null;
                }
                return g2b.a;
            }
        }, nz1Var, (fi4Var == null && fi4Var3 == null) ? as1.a : new fr1(true, 750771424, new z3a(fi4Var, fi4Var3)), jt1Var, (i & 112) | ((i2 << 12) & 3670016), 0);
        jt1Var.H();
    }

    public static final void b(final l50 l50Var, final String str, final ox6 ox6Var, final oh4 oh4Var, final nz1 nz1Var, final fr1 fr1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        fr1 fr1Var2;
        bj4 bj4VarO = jt1Var.o(-605638725);
        int i4 = (bj4VarO.J(l50Var) ? 4 : 2) | i;
        if ((i & 112) == 0) {
            i4 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= bj4VarO.j(f50.N) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i5 = i4 | (bj4VarO.j(oh4Var) ? 16384 : 8192);
        int i6 = 458752 & i;
        sp0 sp0Var = di.a.e;
        if (i6 == 0) {
            i5 |= bj4VarO.J(sp0Var) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i5 |= bj4VarO.J(nz1Var) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i5 |= bj4VarO.g(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i5 |= bj4VarO.J(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i5 |= bj4VarO.h(1) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i3 = i2 | (bj4VarO.c(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        int i7 = i3;
        if ((1533916891 & i5) == 306783378 && (i7 & 91) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            k85 k85VarB = x6b.b(l50Var.a, nz1Var, bj4VarO);
            int i8 = i5;
            int i9 = i8 >> 6;
            int i10 = i8 >> 12;
            f50 f50VarA = k50.a(k85VarB, l50Var.b, oh4Var, nz1Var, bj4VarO, 64);
            lr9 lr9Var = k85VarB.y;
            boolean z = lr9Var instanceof by1;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z) {
                bj4VarO.e(-2079329304);
                w3a w3aVar = new w3a(lr9Var, fr1Var, f50VarA, str, nz1Var);
                bj4VarO.p(Integer.rotateLeft(-888190719, 1), gr1.a);
                Object objF = bj4VarO.f();
                if (objF == c0187a) {
                    fr1Var2 = new fr1(true, -888190719, w3aVar);
                    bj4VarO.C(fr1Var2);
                } else {
                    objF.getClass();
                    fr1Var2 = (fr1) objF;
                    fr1Var2.j(w3aVar);
                }
                fr1 fr1Var3 = fr1Var2;
                bj4VarO.U(false);
                bj4VarO = bj4VarO;
                ov0.a(ox6Var, sp0Var, true, fr1Var3, bj4VarO, (i9 & 14) | 3456 | (i10 & 112), 0);
                bj4VarO.U(false);
            } else {
                bj4VarO.e(-2080018031);
                bj4VarO.e(733328855);
                int i11 = (((((i9 & 14) | 384) | (i10 & 112)) >> 3) & 14) | 48;
                c37<di, fl6> c37Var = dv0.a;
                sp0Var.equals(di.a.a);
                bj4VarO.K(244380021);
                boolean z2 = (((i11 & 14) ^ 6) > 4 && bj4VarO.J(sp0Var)) || (i11 & 6) == 4;
                Object objF2 = bj4VarO.f();
                if (z2 || objF2 == c0187a) {
                    objF2 = new hv0(sp0Var, true);
                    bj4VarO.C(objF2);
                }
                hv0 hv0Var = (hv0) objF2;
                bj4VarO.U(false);
                bj4VarO.e(-1323940314);
                int iD = bj4VarO.D();
                kw7 kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                fr1 fr1Var4 = new fr1(true, -511438721, new gr5(ox6Var));
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
                rd7.d(bj4VarO, bt1.a.f, hv0Var);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                bt1.a.b bVar = bt1.a.g;
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                    qh.a(iD, bj4VarO, iD, bVar);
                }
                fr1Var4.invoke(new rr9(bj4VarO), bj4VarO, 0);
                bj4VarO.e(2058660585);
                fr1Var.invoke(new jj8(kv0.a, f50VarA, str, nz1Var), bj4VarO, Integer.valueOf(i7 & 112));
                bj4VarO.U(false);
                bj4VarO.U(true);
                bj4VarO.U(false);
                bj4VarO.U(false);
                bj4VarO.U(false);
                bj4VarO = bj4VarO;
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v3a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a4a.b(l50Var, str, ox6Var, oh4Var, nz1Var, fr1Var, (jt1) obj, gz3.s(i | 1), gz3.s(i2));
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(b4a b4aVar, ox6 ox6Var, es7 es7Var, String str, di diVar, nz1 nz1Var, float f, wh1 wh1Var, boolean z, jt1 jt1Var, final int i) {
        final b4a b4aVar2;
        int i2;
        es7 es7VarH;
        String contentDescription;
        di diVarG;
        nz1 nz1VarB;
        float fA;
        wh1 wh1VarJ;
        boolean zE;
        ox6 ox6Var2;
        final es7 es7Var2;
        final ox6 ox6Var3;
        final boolean z2;
        final wh1 wh1Var2;
        final float f2;
        final nz1 nz1Var2;
        final di diVar2;
        final String str2;
        bj4 bj4VarO = jt1Var.o(880638523);
        if ((i & 14) == 0) {
            b4aVar2 = b4aVar;
            i2 = (bj4VarO.J(b4aVar2) ? 4 : 2) | i;
        } else {
            b4aVar2 = b4aVar;
            i2 = i;
        }
        int i3 = i2 | 176;
        if ((i & 7168) == 0) {
            i3 = i2 | 1200;
        }
        if ((57344 & i) == 0) {
            i3 |= 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= 33554432;
        }
        if ((191739611 & i3) == 38347922 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var;
            es7Var2 = es7Var;
            str2 = str;
            diVar2 = diVar;
            nz1Var2 = nz1Var;
            f2 = f;
            wh1Var2 = wh1Var;
            z2 = z;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                es7VarH = b4aVar2.h();
                contentDescription = b4aVar2.getContentDescription();
                diVarG = b4aVar2.g();
                nz1VarB = b4aVar2.b();
                fA = b4aVar2.a();
                wh1VarJ = b4aVar2.j();
                zE = b4aVar2.e();
                ox6Var2 = ox6.a.t;
            } else {
                bj4VarO.u();
                ox6Var2 = ox6Var;
                es7VarH = es7Var;
                contentDescription = str;
                diVarG = diVar;
                nz1VarB = nz1Var;
                fA = f;
                wh1VarJ = wh1Var;
                zE = z;
            }
            bj4VarO.V();
            hj8 hj8Var = x6b.b;
            ox6 ox6VarB = contentDescription != null ? pb9.b(ox6Var2, false, new v6b(contentDescription)) : ox6Var2;
            if (zE) {
                ox6VarB = uma.b(ox6VarB);
            }
            ox6 ox6VarH = ox6VarB.H(new kz1(es7VarH, diVarG, nz1VarB, fA, wh1VarJ));
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
                bj4VarO.k(new x3a(aVar));
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, y3a.a);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bj4VarO.U(true);
            bj4VarO.U(false);
            bj4VarO.U(false);
            String str3 = contentDescription;
            es7Var2 = es7VarH;
            ox6Var3 = ox6Var2;
            z2 = zE;
            wh1Var2 = wh1VarJ;
            f2 = fA;
            nz1Var2 = nz1VarB;
            diVar2 = diVarG;
            str2 = str3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: u3a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a4a.c(b4aVar2, ox6Var3, es7Var2, str2, diVar2, nz1Var2, f2, wh1Var2, z2, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }
}
