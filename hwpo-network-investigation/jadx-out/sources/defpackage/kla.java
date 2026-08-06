package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kla {
    public final e27<a> a;
    public a b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final int a;
        public final xg0.a b;
        public final wg0 c;
        public a d;
        public long e;
        public long f;
        public long g = Long.MIN_VALUE;

        public a(int i, xg0.a aVar, wg0 wg0Var) {
            this.a = i;
            this.b = aVar;
            this.c = wg0Var;
        }

        public final void a(long j, long j2, long j3, long j4, float[] fArr) {
            am8 am8Var;
            am8 am8Var2;
            long j5 = kla.this.f;
            xg0.a aVar = this.b;
            mb7 mb7VarD = ew2.d(aVar, 2);
            qr5 qr5VarF = ew2.f(aVar);
            boolean zJ = qr5VarF.j();
            kb7 kb7Var = qr5VarF.Y;
            if (zJ) {
                if (kb7Var.d != mb7VarD) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                    long j6 = mb7VarD.v;
                    mb7 mb7Var = kb7Var.d;
                    mb7Var.getClass();
                    long jC = cg5.c(mb7Var.U(mb7VarD, jFloatToRawIntBits));
                    am8Var = new am8(jC, (4294967295L & ((long) (((int) (jC & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jC >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, aVar);
                } else {
                    am8Var = new am8(j, j2, j3, j4, j5, fArr, aVar);
                }
                am8Var2 = am8Var;
            } else {
                am8Var2 = null;
            }
            if (am8Var2 == null) {
                return;
            }
            this.c.invoke(am8Var2);
        }

        public final void b() {
            kla klaVar = kla.this;
            e27<a> e27Var = klaVar.a;
            int i = this.a;
            a aVarG = e27Var.g(i);
            if (aVarG != null) {
                if (aVarG == this) {
                    a aVar = this.d;
                    this.d = null;
                    if (aVar == null) {
                        qr5 qr5VarF = ew2.f(this.b.t);
                        if (qr5VarF.z) {
                            ur5.a(qr5VarF).getRectManager().b.c(qr5VarF.u, false);
                            return;
                        }
                        return;
                    }
                    int iD = e27Var.d(i);
                    Object[] objArr = e27Var.c;
                    Object obj = objArr[iD];
                    e27Var.b[iD] = i;
                    objArr[iD] = aVar;
                    return;
                }
                int iD2 = e27Var.d(i);
                Object[] objArr2 = e27Var.c;
                Object obj2 = objArr2[iD2];
                e27Var.b[iD2] = i;
                objArr2[iD2] = aVarG;
                while (true) {
                    a aVar2 = aVarG.d;
                    if (aVar2 == null) {
                        break;
                    }
                    if (aVar2 == this) {
                        aVarG.d = this.d;
                        this.d = null;
                        return;
                    }
                    aVarG = aVar2;
                }
            }
            a aVar3 = klaVar.b;
            if (aVar3 == this) {
                klaVar.b = aVar3.d;
                this.d = null;
                return;
            }
            a aVar4 = aVar3 != null ? aVar3.d : null;
            while (true) {
                a aVar5 = aVar3;
                aVar3 = aVar4;
                if (aVar3 == null) {
                    return;
                }
                if (aVar3 == this) {
                    if (aVar5 != null) {
                        aVar5.d = aVar3.d;
                    }
                    this.d = null;
                    return;
                }
                aVar4 = aVar3.d;
            }
        }
    }

    public kla() {
        e27 e27Var = ag5.a;
        this.a = new e27<>();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(a aVar, long j, long j2, float[] fArr, long j3) {
        long j4 = aVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            aVar.g = j3;
            aVar.a(aVar.e, aVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (bg5.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!bg5.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
