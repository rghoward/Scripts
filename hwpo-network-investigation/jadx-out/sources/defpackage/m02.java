package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m02 {
    public static final b02 a;

    static {
        u93 u93Var = fq.a;
        long j = uh1.e;
        long j2 = uh1.b;
        a = new b02(j, j2, j2, uh1.b(0.38f, j2), uh1.b(0.38f, j2));
    }

    public static final void a(final b02 b02Var, final ox6 ox6Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-527864079);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(b02Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 256 : 128;
        }
        int i3 = i2;
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            sp0.b bVar = f02.a;
            ox6 ox6VarH = q69.h(eo7.k(oj5.h(gi0.c(pw3.c(ox6Var, 3.0f, ay8.b(4.0f), 0L, 0L, 28), b02Var.a, al8.a)), 0.0f, f02.d, 1), q69.f(bj4VarO), 14);
            int i4 = (i3 << 3) & 7168;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var.invoke(cj1.a, bj4VarO, Integer.valueOf(((i4 >> 6) & 112) | 6));
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: i02
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    m02.a(b02Var, ox6Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(ox6 ox6Var, final b02 b02Var, final oh4<? super e02, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        bj4 bj4VarO = jt1Var.o(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (bj4VarO.J(b02Var) ? 32 : 16);
        }
        int i7 = i4 | (bj4VarO.j(oh4Var) ? 256 : 128);
        if (bj4VarO.A(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                ox6Var = ox6.a.t;
            }
            if (i6 != 0) {
                b02Var = a;
            }
            a(b02Var, ox6Var, gr1.b(-250345048, new ei4() { // from class: g02
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jt1 jt1Var2 = (jt1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Object objF = jt1Var2.f();
                        if (objF == jt1.a.a) {
                            objF = new e02();
                            jt1Var2.C(objF);
                        }
                        e02 e02Var = (e02) objF;
                        e02Var.a.clear();
                        oh4Var.invoke(e02Var);
                        e02Var.a(b02Var, jt1Var2, 0);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            bj4VarO.u();
        }
        final ox6 ox6Var2 = ox6Var;
        final b02 b02Var2 = b02Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(b02Var2, oh4Var, i, i2) { // from class: h02
                public final /* synthetic */ b02 u;
                public final /* synthetic */ oh4 v;
                public final /* synthetic */ int w;

                {
                    this.w = i2;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    m02.b(this.t, this.u, this.v, (jt1) obj, iS, this.w);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final String str, final boolean z, final b02 b02Var, final ox6 ox6Var, final ei4 ei4Var, final mh4 mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-2001167027);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.c(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(b02Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(ei4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (bj4VarO.A(i3 & 1, (74899 & i2) != 74898)) {
            sp0.b bVar = f02.a;
            float f = f02.c;
            c30.h hVar = new c30.h(f, true, new a30());
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 458752) == 131072);
            Object objF = bj4VarO.f();
            if (z2 || objF == jt1.a.a) {
                objF = new mh4() { // from class: j02
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        if (z) {
                            mh4Var.invoke();
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            ox6 ox6VarK = eo7.k(ir9.l(ir9.c(we1.c(ox6Var, z, str, (mh4) objF, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            ny8 ny8VarA = ly8.a(hVar, bVar, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarK);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            if (ei4Var == null) {
                bj4VarO.K(-1597947094);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1597947093);
                float f2 = f02.e;
                ox6 ox6VarH = ir9.h(ox6.a.t, f2, 0.0f, f2, f2, 2);
                fl6 fl6VarD = dv0.d(di.a.a, false);
                int iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP2 = bj4VarO.P();
                ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarH);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ei4Var.invoke(new uh1(z ? b02Var.c : b02Var.e), bj4VarO, 0);
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            long j = z ? b02Var.b : b02Var.d;
            um0.b(str, new qs5(true, 1.0f), new wja(j, f02.h, f02.i, f02.k, f02.b, f02.j, 16613240), null, 0, false, 1, 0, bj4VarO, (i3 & 14) | 1572864, 952);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: k02
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m02.c(str, z, b02Var, ox6Var, ei4Var, mh4Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }
}
