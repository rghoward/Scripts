package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rm7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final kha khaVar, final oh4 oh4Var, final ox6 ox6Var, boolean z, wja wjaVar, final ci4 ci4Var, final ci4 ci4Var2, final ci4 ci4Var3, final boolean z2, final ojb ojbVar, final dp5 dp5Var, bp5 bp5Var, final boolean z3, int i, int i2, jl9 jl9Var, final pda pdaVar, jt1 jt1Var, final int i3) {
        int i4;
        oh4 oh4Var2;
        ox6 ox6Var2;
        ci4 ci4Var4;
        bj4 bj4Var;
        final boolean z4;
        final wja wjaVar2;
        final bp5 bp5Var2;
        final int i5;
        final int i6;
        final jl9 jl9Var2;
        wja wjaVar3;
        bp5 bp5Var3;
        int i7;
        jl9 jl9VarB;
        int i8;
        long j;
        bj4 bj4VarO = jt1Var.o(2057288437);
        if ((i3 & 6) == 0) {
            i4 = (bj4VarO.J(khaVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            oh4Var2 = oh4Var;
            i4 |= bj4VarO.j(oh4Var2) ? 32 : 16;
        } else {
            oh4Var2 = oh4Var;
        }
        if ((i3 & 384) == 0) {
            ox6Var2 = ox6Var;
            i4 |= bj4VarO.J(ox6Var2) ? 256 : 128;
        } else {
            ox6Var2 = ox6Var;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            i9 |= bj4VarO.j(ci4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            ci4Var4 = ci4Var2;
            i9 |= bj4VarO.j(ci4Var4) ? 8388608 : 4194304;
        } else {
            ci4Var4 = ci4Var2;
        }
        int i10 = i9 | 905969664;
        boolean z5 = true;
        if (bj4VarO.A(i10 & 1, ((i10 & 306783379) == 306783378 && (((((bj4VarO.c(z2) ? (char) 2048 : (char) 1024) | 438) | (bj4VarO.J(ojbVar) ? 16384 : 8192)) | 840433664) & 306783379) == 306783378 && (((bj4VarO.J(pdaVar) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            bj4VarO.v0();
            if ((i3 & 1) == 0 || bj4VarO.c0()) {
                wjaVar3 = (wja) bj4VarO.F(mia.a);
                bp5Var3 = bp5.c;
                i7 = z3 ? 1 : Integer.MAX_VALUE;
                jl9VarB = wl9.b(ym7.u, bj4VarO);
                i8 = 1;
            } else {
                bj4VarO.u();
                z5 = z;
                wjaVar3 = wjaVar;
                bp5Var3 = bp5Var;
                i7 = i;
                i8 = i2;
                jl9VarB = jl9Var;
            }
            bj4VarO.V();
            bj4VarO.K(-502250010);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new i27();
                bj4VarO.C(objF);
            }
            h27 h27Var = (h27) objF;
            bj4VarO.U(false);
            bj4VarO.K(1369277167);
            long jB = wjaVar3.b();
            if (jB == 16) {
                boolean zBooleanValue = ((Boolean) y84.a(h27Var, bj4VarO, 0).getValue()).booleanValue();
                if (!z5) {
                    j = pdaVar.c;
                } else if (z2) {
                    j = pdaVar.d;
                } else {
                    j = zBooleanValue ? pdaVar.a : pdaVar.b;
                }
                jB = j;
            }
            long j2 = jB;
            bj4VarO.U(false);
            wja wjaVarD = wjaVar3.d(new wja(j2, 0L, null, 0L, 0, 0L, 16777214));
            kf8 kf8VarA = rja.a.a(pdaVar.k);
            ox6 ox6Var3 = ox6Var2;
            boolean z6 = z5;
            qm7 qm7Var = new qm7(ox6Var3, ci4Var, z2, pdaVar, khaVar, oh4Var2, z6, wjaVarD, dp5Var, bp5Var3, z3, i7, i8, ojbVar, h27Var, ci4Var4, ci4Var3, jl9VarB);
            bj4Var = bj4VarO;
            nu1.a(kf8VarA, gr1.b(-2094276683, qm7Var, bj4Var), bj4Var, 56);
            z4 = z6;
            i5 = i7;
            i6 = i8;
            jl9Var2 = jl9VarB;
            wjaVar2 = wjaVar3;
            bp5Var2 = bp5Var3;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            z4 = z;
            wjaVar2 = wjaVar;
            bp5Var2 = bp5Var;
            i5 = i;
            i6 = i2;
            jl9Var2 = jl9Var;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nm7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i3 | 1);
                    rm7.a(khaVar, oh4Var, ox6Var, z4, wjaVar2, ci4Var, ci4Var2, ci4Var3, z2, ojbVar, dp5Var, bp5Var2, z3, i5, i6, jl9Var2, pdaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:275:0x0547  */
    /* JADX WARN: Code duplicated, block: B:277:0x054b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0580  */
    /* JADX WARN: Code duplicated, block: B:282:0x0587  */
    /* JADX WARN: Code duplicated, block: B:283:0x058b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0598  */
    /* JADX WARN: Code duplicated, block: B:288:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:290:0x05c2  */
    public static final void b(final ci4 ci4Var, ei4 ei4Var, ci4 ci4Var2, final ci4 ci4Var3, final ci4 ci4Var4, final ci4 ci4Var5, ci4 ci4Var6, final boolean z, final jfa.b bVar, final yea.b bVar2, final oh4 oh4Var, final fr1 fr1Var, ci4 ci4Var7, final go7 go7Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        ci4 ci4Var8;
        ci4 ci4Var9;
        bj4 bj4Var;
        ei4 ei4Var2;
        boolean z2;
        ci4 ci4Var10;
        boolean z3;
        Object obj;
        boolean z4;
        Object objF;
        fl6 fl6VarD;
        int iD;
        kw7 kw7VarP;
        ox6 ox6VarC;
        final ci4 ci4Var11 = ci4Var6;
        bj4 bj4VarO = jt1Var.o(753699262);
        j1b j1bVar = bj4VarO.a;
        int i5 = i & 6;
        ox6.a aVar = ox6.a.t;
        if (i5 == 0) {
            i3 = i | (bj4VarO.J(aVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.j(ei4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(ci4Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(ci4Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bj4VarO.j(ci4Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bj4VarO.j(ci4Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bj4VarO.j(ci4Var11) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bj4VarO.c(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bj4VarO.J(bVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? bj4VarO.J(bVar2) : bj4VarO.j(bVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bj4VarO.j(fr1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bj4VarO.j(ci4Var7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bj4VarO.J(go7Var) ? 16384 : 8192;
        }
        int i6 = i4;
        if (bj4VarO.A(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            float fG = yea.g(bj4VarO);
            int i7 = i6 & 14;
            boolean zG = ((i6 & 57344) == 16384) | ((i6 & 112) == 32) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && bj4VarO.J(bVar2))) | bj4VarO.g(fG);
            Object objF2 = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zG || objF2 == c0187a) {
                bj4Var = bj4VarO;
                xm7 xm7Var = new xm7(oh4Var, z, bVar, bVar2, go7Var, fG);
                bj4Var.C(xm7Var);
                objF2 = xm7Var;
            } else {
                bj4Var = bj4VarO;
            }
            xm7 xm7Var2 = (xm7) objF2;
            tq5 tq5Var = (tq5) bj4Var.F(qu1.n);
            int iD2 = bj4Var.D();
            kw7 kw7VarP2 = bj4Var.P();
            ox6 ox6VarC2 = it1.c(bj4Var, r20);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar2);
            } else {
                bj4Var.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4Var, cVar, xm7Var2);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4Var, eVar, kw7VarP2);
            bt1.a.b bVar3 = bt1.a.g;
            if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD2))) {
                qh.a(iD2, bj4Var, iD2, bVar3);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4Var, dVar, ox6VarC2);
            fr1Var.invoke(bj4Var, Integer.valueOf((i6 >> 6) & 14));
            sp0 sp0Var = di.a.e;
            if (ci4Var3 != null) {
                bj4Var.K(2145628269);
                ox6 ox6VarH = yq5.d(aVar, "Leading").H(iv6.t);
                fl6 fl6VarD2 = dv0.d(sp0Var, false);
                int iD3 = bj4Var.D();
                kw7 kw7VarP3 = bj4Var.P();
                ox6 ox6VarC3 = it1.c(bj4Var, ox6VarH);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD2);
                rd7.d(bj4Var, eVar, kw7VarP3);
                if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD3))) {
                    qh.a(iD3, bj4Var, iD3, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC3);
                ci4Var3.invoke(bj4Var, Integer.valueOf((i3 >> 12) & 14));
                bj4Var.U(true);
                z2 = false;
                bj4Var.U(false);
            } else {
                z2 = false;
                bj4Var.K(2145874285);
                bj4Var.U(false);
            }
            if (ci4Var4 != null) {
                bj4Var.K(2145917003);
                ox6 ox6VarH2 = yq5.d(r20, "Trailing").H(iv6.t);
                fl6 fl6VarD3 = dv0.d(sp0Var, z2);
                int iD4 = bj4Var.D();
                kw7 kw7VarP4 = bj4Var.P();
                ox6 ox6VarC4 = it1.c(bj4Var, ox6VarH2);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD3);
                rd7.d(bj4Var, eVar, kw7VarP4);
                if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD4))) {
                    qh.a(iD4, bj4Var, iD4, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC4);
                ci4Var4.invoke(bj4Var, Integer.valueOf((i3 >> 15) & 14));
                bj4Var.U(true);
                bj4Var.U(false);
            } else {
                bj4Var.K(2146164941);
                bj4Var.U(z2);
            }
            float fE = eo7.e(go7Var, tq5Var);
            float fD = eo7.d(go7Var, tq5Var);
            if (ci4Var3 != null) {
                fE -= fG;
                if (fE < 0.0f) {
                    fE = 0.0f;
                }
            }
            float f = fE;
            if (ci4Var4 != null) {
                fD -= fG;
                if (fD < 0.0f) {
                    fD = 0.0f;
                }
            }
            float f2 = fD;
            sp0 sp0Var2 = di.a.a;
            if (ci4Var5 != null) {
                bj4Var.K(2146868920);
                ox6 ox6VarM = eo7.m(ir9.p(ir9.e(yq5.d(r20, "Prefix"), 24.0f, 0.0f, 2)), f, 0.0f, 2.0f, 0.0f, 10);
                fl6 fl6VarD4 = dv0.d(sp0Var2, false);
                int iD5 = bj4Var.D();
                kw7 kw7VarP5 = bj4Var.P();
                ox6 ox6VarC5 = it1.c(bj4Var, ox6VarM);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD4);
                rd7.d(bj4Var, eVar, kw7VarP5);
                if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD5))) {
                    qh.a(iD5, bj4Var, iD5, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC5);
                ci4Var10 = ci4Var5;
                ci4Var10.invoke(bj4Var, Integer.valueOf((i3 >> 18) & 14));
                bj4Var.U(true);
                bj4Var.U(false);
            } else {
                ci4Var10 = ci4Var5;
                bj4Var.K(2147196621);
                bj4Var.U(false);
            }
            if (ci4Var6 != null) {
                bj4Var.K(2147239866);
                ox6 ox6VarM2 = eo7.m(ir9.p(ir9.e(yq5.d(r20, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                fl6 fl6VarD5 = dv0.d(sp0Var2, false);
                int iD6 = bj4Var.D();
                kw7 kw7VarP6 = bj4Var.P();
                ox6 ox6VarC6 = it1.c(bj4Var, ox6VarM2);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD5);
                rd7.d(bj4Var, eVar, kw7VarP6);
                if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD6))) {
                    qh.a(iD6, bj4Var, iD6, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC6);
                ci4Var11 = ci4Var6;
                ci4Var11.invoke(bj4Var, Integer.valueOf((i3 >> 21) & 14));
                bj4Var.U(true);
                bj4Var.U(false);
            } else {
                ci4Var11 = ci4Var6;
                bj4Var.K(-2147401651);
                bj4Var.U(false);
            }
            ox6 ox6VarM3 = eo7.m(ir9.p(ir9.e(r20, 24.0f, 0.0f, 2)), ci4Var10 == null ? f : 0.0f, 0.0f, ci4Var11 == null ? f2 : 0.0f, 0.0f, 10);
            if (ei4Var != null) {
                bj4Var.K(-2147031666);
                ei4Var2 = ei4Var;
                ei4Var2.invoke(yq5.d(r20, "Hint").H(ox6VarM3), bj4Var, Integer.valueOf((i3 >> 3) & 112));
                bj4Var.U(false);
            } else {
                ei4Var2 = ei4Var;
                bj4Var.K(-2146940371);
                bj4Var.U(false);
            }
            ox6 ox6VarH3 = yq5.d(r20, "TextField").H(ox6VarM3);
            fl6 fl6VarD6 = dv0.d(sp0Var2, true);
            int iD7 = bj4Var.D();
            kw7 kw7VarP7 = bj4Var.P();
            ox6 ox6VarC7 = it1.c(bj4Var, ox6VarH3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar2);
            } else {
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, fl6VarD6);
            rd7.d(bj4Var, eVar, kw7VarP7);
            if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD7))) {
                qh.a(iD7, bj4Var, iD7, bVar3);
            }
            rd7.d(bj4Var, dVar, ox6VarC7);
            ci4Var.invoke(bj4Var, Integer.valueOf((i3 >> 3) & 14));
            bj4Var.U(true);
            if (ci4Var2 != null) {
                bj4Var.K(-2146287790);
                if (i7 != 4) {
                    if ((i6 & 8) != 0) {
                        obj = bVar2;
                        if (bj4Var.j(obj)) {
                        }
                        objF = bj4Var.f();
                        if (z4 || objF == c0187a) {
                            objF = new ql1(1, obj);
                            bj4Var.C(objF);
                        }
                        ox6 ox6VarH4 = yq5.d(ir9.p(kr5.a(r20, new kea((mh4) objF))), "Label").H(r20);
                        fl6VarD = dv0.d(sp0Var2, false);
                        iD = bj4Var.D();
                        kw7VarP = bj4Var.P();
                        ox6VarC = it1.c(bj4Var, ox6VarH4);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, fl6VarD);
                        rd7.d(bj4Var, eVar, kw7VarP);
                        if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD))) {
                            qh.a(iD, bj4Var, iD, bVar3);
                        }
                        rd7.d(bj4Var, dVar, ox6VarC);
                        ci4Var9 = ci4Var2;
                        ci4Var9.invoke(bj4Var, Integer.valueOf((i3 >> 9) & 14));
                        bj4Var.U(true);
                        bj4Var.U(false);
                    } else {
                        obj = bVar2;
                    }
                    z4 = false;
                    objF = bj4Var.f();
                    if (z4) {
                        objF = new ql1(1, obj);
                        bj4Var.C(objF);
                    } else {
                        objF = new ql1(1, obj);
                        bj4Var.C(objF);
                    }
                    ox6 ox6VarH5 = yq5.d(ir9.p(kr5.a(r20, new kea((mh4) objF))), "Label").H(r20);
                    fl6VarD = dv0.d(sp0Var2, false);
                    iD = bj4Var.D();
                    kw7VarP = bj4Var.P();
                    ox6VarC = it1.c(bj4Var, ox6VarH5);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, fl6VarD);
                    rd7.d(bj4Var, eVar, kw7VarP);
                    if (bj4Var.S) {
                        qh.a(iD, bj4Var, iD, bVar3);
                    } else {
                        qh.a(iD, bj4Var, iD, bVar3);
                    }
                    rd7.d(bj4Var, dVar, ox6VarC);
                    ci4Var9 = ci4Var2;
                    ci4Var9.invoke(bj4Var, Integer.valueOf((i3 >> 9) & 14));
                    bj4Var.U(true);
                    bj4Var.U(false);
                } else {
                    obj = bVar2;
                }
                z4 = true;
                objF = bj4Var.f();
                if (z4) {
                    objF = new ql1(1, obj);
                    bj4Var.C(objF);
                } else {
                    objF = new ql1(1, obj);
                    bj4Var.C(objF);
                }
                ox6 ox6VarH6 = yq5.d(ir9.p(kr5.a(r20, new kea((mh4) objF))), "Label").H(r20);
                fl6VarD = dv0.d(sp0Var2, false);
                iD = bj4Var.D();
                kw7VarP = bj4Var.P();
                ox6VarC = it1.c(bj4Var, ox6VarH6);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD);
                rd7.d(bj4Var, eVar, kw7VarP);
                if (bj4Var.S) {
                    qh.a(iD, bj4Var, iD, bVar3);
                } else {
                    qh.a(iD, bj4Var, iD, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC);
                ci4Var9 = ci4Var2;
                ci4Var9.invoke(bj4Var, Integer.valueOf((i3 >> 9) & 14));
                bj4Var.U(true);
                bj4Var.U(false);
            } else {
                ci4Var9 = ci4Var2;
                bj4Var.K(-2145892819);
                bj4Var.U(false);
            }
            if (ci4Var7 != null) {
                bj4Var.K(-2145844304);
                ox6 ox6VarH7 = eo7.h(ir9.p(ir9.e(yq5.d(r20, "Supporting"), 16.0f, 0.0f, 2)), new ko7(16.0f, 4.0f, 16.0f, 0.0f));
                fl6 fl6VarD7 = dv0.d(sp0Var2, false);
                int iD8 = bj4Var.D();
                kw7 kw7VarP8 = bj4Var.P();
                ox6 ox6VarC8 = it1.c(bj4Var, ox6VarH7);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD7);
                rd7.d(bj4Var, eVar, kw7VarP8);
                if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD8))) {
                    qh.a(iD8, bj4Var, iD8, bVar3);
                }
                rd7.d(bj4Var, dVar, ox6VarC8);
                ci4Var8 = ci4Var7;
                ci4Var8.invoke(bj4Var, Integer.valueOf((i6 >> 9) & 14));
                z3 = true;
                bj4Var.U(true);
                bj4Var.U(false);
            } else {
                ci4Var8 = ci4Var7;
                z3 = true;
                bj4Var.K(-2145508915);
                bj4Var.U(false);
            }
            bj4Var.U(z3);
        } else {
            ci4Var8 = ci4Var7;
            ci4Var9 = ci4Var2;
            bj4Var = bj4VarO;
            ei4Var2 = ei4Var;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final ci4 ci4Var12 = ci4Var9;
            final ei4 ei4Var3 = ei4Var2;
            final ci4 ci4Var13 = ci4Var8;
            xj8VarW.d = new ci4() { // from class: mm7
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    rm7.b(ci4Var, ei4Var3, ci4Var12, ci4Var3, ci4Var4, ci4Var5, ci4Var11, z, bVar, bVar2, oh4Var, fr1Var, ci4Var13, go7Var, (jt1) obj2, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }
}
