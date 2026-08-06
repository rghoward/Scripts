package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q34 extends bq0 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements bq0.f {
        public final x34 a;
        public final int b;
        public final t34.a c = new t34.a();

        public a(x34 x34Var, int i) {
            this.a = x34Var;
            this.b = i;
        }

        @Override // bq0.f
        public final bq0.e a(ks3 ks3Var, long j) {
            long position = ks3Var.getPosition();
            long jC = c(ks3Var);
            long jG = ks3Var.g();
            ks3Var.h(Math.max(6, this.a.c));
            long jC2 = c(ks3Var);
            long jG2 = ks3Var.g();
            if (jC > j || jC2 <= j) {
                return jC2 <= j ? new bq0.e(jC2, -2, jG2) : new bq0.e(jC, -1, position);
            }
            return new bq0.e(-9223372036854775807L, 0, jG);
        }

        public final long c(ks3 ks3Var) {
            t34.a aVar;
            x34 x34Var;
            int iJ;
            while (true) {
                long jG = ks3Var.g();
                long jA = ks3Var.a() - 6;
                aVar = this.c;
                x34Var = this.a;
                if (jG >= jA) {
                    break;
                }
                long jG2 = ks3Var.g();
                pt7 pt7Var = new pt7(17);
                int i = 0;
                boolean zA = false;
                ks3Var.n(pt7Var.a, 0, 2);
                char cG = pt7Var.g(0, ByteOrder.BIG_ENDIAN);
                int i2 = this.b;
                if (cG != i2) {
                    ks3Var.l();
                    ks3Var.h((int) (jG2 - ks3Var.getPosition()));
                } else {
                    byte[] bArr = pt7Var.a;
                    while (i < 15 && (iJ = ks3Var.j(bArr, 2 + i, 15 - i)) != -1) {
                        i += iJ;
                    }
                    pt7Var.L(i + 2);
                    ks3Var.l();
                    ks3Var.h((int) (jG2 - ks3Var.getPosition()));
                    zA = t34.a(pt7Var, x34Var, i2, aVar);
                }
                if (zA) {
                    break;
                }
                ks3Var.h(1);
            }
            if (ks3Var.g() < ks3Var.a() - 6) {
                return aVar.a;
            }
            ks3Var.h((int) (ks3Var.a() - ks3Var.g()));
            return x34Var.j;
        }
    }
}
