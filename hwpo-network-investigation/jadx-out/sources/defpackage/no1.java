package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 {
    /* JADX WARN: Type inference failed for: r2v3, types: [hga] */
    public static final void a(final qga qgaVar, fr1 fr1Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1533506138);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(qgaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        int i3 = 0;
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            bj4VarO.K(-885604480);
            p08.b(!qgaVar.k() ? ox6.a.t : new ica(new iga(qgaVar, null)).H(new cda(qgaVar.y, new jga(qgaVar, null), new kga(qgaVar, null), new oh4() { // from class: hga
                /* JADX WARN: Code duplicated, block: B:40:0x011f  */
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    Object obj2;
                    sk8 sk8Var;
                    qq5 qq5VarC;
                    char c;
                    float fIntBitsToFloat;
                    qq5 qq5VarC2;
                    qq5 qq5VarC3;
                    qq5 qq5VarC4;
                    qq5 qq5VarC5;
                    qq5 qq5Var = (qq5) obj;
                    qga qgaVar2 = qgaVar;
                    u56 u56Var = qgaVar2.d;
                    sk8 sk8Var2 = sk8.e;
                    if (u56Var == null) {
                        obj2 = null;
                        sk8Var = sk8Var2;
                    } else {
                        if (u56Var.p) {
                            u56Var = null;
                        }
                        if (u56Var != null) {
                            ag7 ag7Var = qgaVar2.b;
                            long j = qgaVar2.n().b;
                            int i4 = lja.c;
                            int iB = ag7Var.b((int) (j >> 32));
                            int iB2 = qgaVar2.b.b((int) (qgaVar2.n().b & 4294967295L));
                            u56 u56Var2 = qgaVar2.d;
                            long jA0 = 0;
                            long jA1 = (u56Var2 == null || (qq5VarC5 = u56Var2.c()) == null) ? 0L : qq5VarC5.a0(qgaVar2.l(true));
                            u56 u56Var3 = qgaVar2.d;
                            if (u56Var3 != null && (qq5VarC4 = u56Var3.c()) != null) {
                                jA0 = qq5VarC4.a0(qgaVar2.l(false));
                            }
                            u56 u56Var4 = qgaVar2.d;
                            float fIntBitsToFloat2 = 0.0f;
                            if (u56Var4 == null || (qq5VarC3 = u56Var4.c()) == null) {
                                c = ' ';
                                obj2 = null;
                                fIntBitsToFloat = 0.0f;
                            } else {
                                obj2 = null;
                                sia siaVarD = u56Var.d();
                                c = ' ';
                                fIntBitsToFloat = Float.intBitsToFloat((int) (qq5VarC3.a0((((long) Float.floatToRawIntBits(siaVarD != null ? siaVarD.a.c(iB).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                            }
                            u56 u56Var5 = qgaVar2.d;
                            if (u56Var5 != null && (qq5VarC2 = u56Var5.c()) != null) {
                                sia siaVarD2 = u56Var.d();
                                fIntBitsToFloat2 = Float.intBitsToFloat((int) (qq5VarC2.a0((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(siaVarD2 != null ? siaVarD2.a.c(iB2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                            }
                            int i5 = (int) (jA1 >> c);
                            int i6 = (int) (jA0 >> c);
                            sk8Var = new sk8(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), (u56Var.a.g.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jA1 & 4294967295L)), Float.intBitsToFloat((int) (jA0 & 4294967295L))));
                        } else {
                            obj2 = null;
                            sk8Var = sk8Var2;
                        }
                    }
                    u56 u56Var6 = qgaVar2.d;
                    if (u56Var6 == null || (qq5VarC = u56Var6.c()) == null) {
                        return obj2;
                    }
                    return (qq5VarC.e() && qq5Var.e()) ? tk8.a(qq5Var.T(rq5.d(qq5VarC), sk8Var.d()), sk8Var.c()) : sk8Var2;
                }
            })), fr1Var, bj4VarO, i2 & 112);
            bj4VarO.U(false);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mo1(qgaVar, fr1Var, i, i3);
        }
    }
}
