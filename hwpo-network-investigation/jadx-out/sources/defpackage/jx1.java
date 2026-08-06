package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class jx1 {
    public final ii1 a;
    public final ii1 b;
    public final ii1 c;
    public final float[] d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends jx1 {
        public final lw8 e;
        public final lw8 f;
        public final float[] g;

        public a(lw8 lw8Var, lw8 lw8Var2) {
            float[] fArrF;
            super(lw8Var2, lw8Var, lw8Var2, null);
            this.e = lw8Var;
            this.f = lw8Var2;
            float[] fArr = va.b.a;
            amb ambVar = lw8Var.d;
            float[] fArr2 = lw8Var.i;
            amb ambVar2 = lw8Var2.d;
            float[] fArr3 = lw8Var2.j;
            if (ji1.c(ambVar, ambVar2)) {
                fArrF = ji1.f(fArr3, fArr2);
            } else {
                float[] fArrA = ambVar.a();
                float[] fArrA2 = ambVar2.a();
                amb ambVar3 = e75.b;
                fArrF = ji1.f(ji1.c(ambVar2, ambVar3) ? fArr3 : ji1.e(ji1.f(ji1.b(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), lw8Var2.i)), ji1.c(ambVar, ambVar3) ? fArr2 : ji1.f(ji1.b(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.g = fArrF;
        }

        @Override // defpackage.jx1
        public final long a(long j) {
            float fH = uh1.h(j);
            float fG = uh1.g(j);
            float fE = uh1.e(j);
            float fD = uh1.d(j);
            cw8 cw8Var = this.e.p;
            float fC = (float) cw8Var.c(fH);
            float fC2 = (float) cw8Var.c(fG);
            float fC3 = (float) cw8Var.c(fE);
            float[] fArr = this.g;
            float f = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
            float f2 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
            float f3 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
            lw8 lw8Var = this.f;
            float fC4 = (float) lw8Var.m.c(f);
            bw8 bw8Var = lw8Var.m;
            return u7d.a(fC4, (float) bw8Var.c(f2), (float) bw8Var.c(f3), fD, lw8Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public jx1(ii1 ii1Var, ii1 ii1Var2, int i) {
        float[] fArr;
        ii1 ii1VarA = q69.d(ii1Var.b, 12884901888L) ? ji1.a(ii1Var) : ii1Var;
        ii1 ii1VarA2 = q69.d(ii1Var2.b, 12884901888L) ? ji1.a(ii1Var2) : ii1Var2;
        if (i == 3) {
            boolean zD = q69.d(ii1Var.b, 12884901888L);
            boolean zD2 = q69.d(ii1Var2.b, 12884901888L);
            if (!(zD && zD2) && (zD || zD2)) {
                amb ambVar = ((lw8) (zD ? ii1Var : ii1Var2)).d;
                float[] fArrA = e75.e;
                float[] fArrA2 = zD ? ambVar.a() : fArrA;
                fArrA = zD2 ? ambVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(ii1Var2, ii1VarA, ii1VarA2, fArr);
    }

    public long a(long j) {
        float fH = uh1.h(j);
        float fG = uh1.g(j);
        float fE = uh1.e(j);
        float fD = uh1.d(j);
        ii1 ii1Var = this.b;
        long jE = ii1Var.e(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG2 = ii1Var.g(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.h(f, f2, fG2, fD, this.a);
    }

    public jx1(ii1 ii1Var, ii1 ii1Var2, ii1 ii1Var3, float[] fArr) {
        this.a = ii1Var;
        this.b = ii1Var2;
        this.c = ii1Var3;
        this.d = fArr;
    }
}
