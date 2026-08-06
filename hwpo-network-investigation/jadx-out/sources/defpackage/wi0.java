package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 {
    public static final j15 a = new j15(null);
    public static final ieb b = new ieb(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ ei4<oy8, jt1, Integer, g2b> t;

        public a(ei4 ei4Var) {
            this.t = ei4Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                this.t.invoke(py8.a, jt1Var2, 0);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x010f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void a(final ox6 ox6Var, final long j, long j2, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var2;
        boolean z;
        final long j3;
        xj8 xj8VarW;
        long jB;
        float f;
        jl9 jl9VarB;
        ox6 ox6VarK;
        ny8 ny8VarA;
        int iD;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        bt1.a.b bVar;
        long j4;
        bj4 bj4VarO = jt1Var.o(1428256508);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.i(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                ei4Var2 = ei4Var;
                i3 |= bj4VarO.j(ei4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i3 & 1, z)) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    jB = hi1.b(j, bj4VarO);
                    if (i4 != 0) {
                        ei4Var2 = null;
                    }
                } else {
                    bj4VarO.u();
                    jB = j2;
                }
                bj4VarO.V();
                if (ei4Var2 != null) {
                    f = aj0.v;
                } else {
                    f = aj0.x;
                }
                if (ei4Var2 != null) {
                    bj4VarO.K(-1051012910);
                    jl9VarB = wl9.b(aj0.u, bj4VarO);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-1050955529);
                    jl9VarB = wl9.b(aj0.w, bj4VarO);
                    bj4VarO.U(false);
                }
                ox6 ox6VarC2 = gi0.c(ir9.a(f, f, ox6Var), j, jl9VarB);
                ox6VarK = ox6.a.t;
                if (ei4Var2 != null) {
                    ox6VarK = eo7.k(ox6VarK, 4.0f, 0.0f, 2);
                }
                ox6 ox6VarH = ox6VarC2.H(ox6VarK);
                ny8VarA = ly8.a(c30.d, di.a.k, bj4VarO, 54);
                iD = bj4VarO.D();
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                bVar = bt1.a.g;
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                    qh.a(iD, bj4VarO, iD, bVar);
                }
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (ei4Var2 != null) {
                    bj4VarO.K(1345815094);
                    j4 = jB;
                    bzb.b(j4, j0b.a(aj0.t, bj4VarO), gr1.b(541712501, new a(ei4Var2), bj4VarO), bj4VarO, 384);
                    bj4VarO.U(false);
                } else {
                    j4 = jB;
                    bj4VarO.K(1346141834);
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                j3 = j4;
            } else {
                bj4VarO.u();
                j3 = j2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ui0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wi0.a(ox6Var, j, j3, ei4Var2, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 3072;
        ei4Var2 = ei4Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i3 & 1, z)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                jB = hi1.b(j, bj4VarO);
                if (i4 != 0) {
                    ei4Var2 = null;
                }
            } else {
                jB = hi1.b(j, bj4VarO);
                if (i4 != 0) {
                    ei4Var2 = null;
                }
            }
            bj4VarO.V();
            if (ei4Var2 != null) {
                f = aj0.v;
            } else {
                f = aj0.x;
            }
            if (ei4Var2 != null) {
                bj4VarO.K(-1051012910);
                jl9VarB = wl9.b(aj0.u, bj4VarO);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1050955529);
                jl9VarB = wl9.b(aj0.w, bj4VarO);
                bj4VarO.U(false);
            }
            ox6 ox6VarC3 = gi0.c(ir9.a(f, f, ox6Var), j, jl9VarB);
            ox6VarK = ox6.a.t;
            if (ei4Var2 != null) {
                ox6VarK = eo7.k(ox6VarK, 4.0f, 0.0f, 2);
            }
            ox6 ox6VarH2 = ox6VarC3.H(ox6VarK);
            ny8VarA = ly8.a(c30.d, di.a.k, bj4VarO, 54);
            iD = bj4VarO.D();
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH2);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bVar = bt1.a.g;
            if (bj4VarO.S) {
                qh.a(iD, bj4VarO, iD, bVar);
            } else {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (ei4Var2 != null) {
                bj4VarO.K(1345815094);
                j4 = jB;
                bzb.b(j4, j0b.a(aj0.t, bj4VarO), gr1.b(541712501, new a(ei4Var2), bj4VarO), bj4VarO, 384);
                bj4VarO.U(false);
            } else {
                j4 = jB;
                bj4VarO.K(1346141834);
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            j3 = j4;
        } else {
            bj4VarO.u();
            j3 = j2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ui0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wi0.a(ox6Var, j, j3, ei4Var2, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final fr1 fr1Var, final ox6 ox6Var, final fr1 fr1Var2, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1693825945);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(fr1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(fr1Var2) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = yi0.a;
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
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
            rd7.d(bj4VarO, cVar, fl6Var);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarD = yq5.d(aVar2, "anchor");
            int i3 = ((i2 << 3) & 7168) | 54;
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iD2 = bj4VarO.D();
            int i4 = i2;
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarD);
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
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                qh.a(iD2, bj4VarO, iD2, bVar);
            }
            rd7.d(bj4VarO, dVar, ox6VarC2);
            Integer numValueOf = Integer.valueOf(((i3 >> 6) & 112) | 6);
            kv0 kv0Var = kv0.a;
            fr1Var2.invoke(kv0Var, bj4VarO, numValueOf);
            bj4VarO.U(true);
            ox6 ox6VarD2 = yq5.d(aVar2, MetricTracker.Object.BADGE);
            int i5 = ((i4 << 9) & 7168) | 6;
            fl6 fl6VarD2 = dv0.d(di.a.a, false);
            int iD3 = bj4VarO.D();
            kw7 kw7VarP3 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarD2);
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
            rd7.d(bj4VarO, cVar, fl6VarD2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD3))) {
                qh.a(iD3, bj4VarO, iD3, bVar);
            }
            rd7.d(bj4VarO, dVar, ox6VarC3);
            fr1Var.invoke(kv0Var, bj4VarO, Integer.valueOf(((i5 >> 6) & 112) | 6));
            bj4VarO.U(true);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vi0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    wi0.b(fr1Var, ox6Var, fr1Var2, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
