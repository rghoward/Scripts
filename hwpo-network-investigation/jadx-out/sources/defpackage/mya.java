package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mya extends bq0 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements bq0.f {
        public final apa a;
        public final pt7 b = new pt7();
        public final int c;

        public a(int i, apa apaVar) {
            this.c = i;
            this.a = apaVar;
        }

        @Override // bq0.f
        public final bq0.e a(ks3 ks3Var, long j) {
            long j2;
            long position = ks3Var.getPosition();
            int iMin = (int) Math.min(112800L, ks3Var.a() - position);
            pt7 pt7Var = this.b;
            pt7Var.J(iMin);
            ks3Var.n(pt7Var.a, 0, iMin);
            int i = pt7Var.c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                if (pt7Var.a() < 188) {
                    j2 = -9223372036854775807L;
                    break;
                }
                byte[] bArr = pt7Var.a;
                int i2 = pt7Var.b;
                while (true) {
                    if (i2 >= i) {
                        j2 = -9223372036854775807L;
                        break;
                    }
                    j2 = -9223372036854775807L;
                    if (bArr[i2] == 71) {
                        break;
                    }
                    i2++;
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long jC = zu1.c(pt7Var, i2, this.c);
                if (jC != j2) {
                    long jB = this.a.b(jC);
                    if (jB > j) {
                        return j5 == j2 ? new bq0.e(jB, -1, position) : new bq0.e(-9223372036854775807L, 0, position + j4);
                    }
                    j5 = jB;
                    if (100000 + j5 > j) {
                        return new bq0.e(-9223372036854775807L, 0, position + ((long) i2));
                    }
                    j4 = i2;
                }
                pt7Var.M(i3);
                j3 = i3;
            }
            return j5 != j2 ? new bq0.e(j5, -2, position + j3) : bq0.e.d;
        }

        @Override // bq0.f
        public final void b() {
            byte[] bArr = n6b.b;
            pt7 pt7Var = this.b;
            pt7Var.getClass();
            pt7Var.K(bArr, bArr.length);
        }
    }
}
