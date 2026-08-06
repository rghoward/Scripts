package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb4 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile fx9<jb4> b = new fx9<>(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new lb4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new lb4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new lb4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new lb4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(200, new lb4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            g2b g2bVar = g2b.a;
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        wc5.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static jb4 a(float f) {
        float fD;
        jb4 jb4VarG;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        jb4 jb4VarC = b.c(i);
        if (jb4VarC != null) {
            return jb4VarC;
        }
        fx9<jb4> fx9Var = b;
        if (fx9Var.t) {
            zb9.b(fx9Var);
        }
        int iD = ty1.d(fx9Var.w, i, fx9Var.u);
        if (iD >= 0) {
            return b.g(iD);
        }
        int i2 = -(iD + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f()) {
            lb4 lb4Var = new lb4(new float[]{1.0f}, new float[]{f});
            b(f, lb4Var);
            return lb4Var;
        }
        if (i3 < 0) {
            jb4VarG = new lb4(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = b.d(i3) / 100.0f;
            jb4VarG = b.g(i3);
        }
        float fD2 = b.d(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        jb4 jb4VarG2 = b.g(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = jb4VarG.b(f2);
            fArr2[i4] = ((jb4VarG2.b(f2) - fB) * fMax) + fB;
        }
        lb4 lb4Var2 = new lb4(fArr, fArr2);
        b(f, lb4Var2);
        return lb4Var2;
    }

    public static void b(float f, lb4 lb4Var) {
        synchronized (c) {
            fx9<jb4> fx9VarClone = b.clone();
            fx9VarClone.e((int) (f * 100.0f), lb4Var);
            b = fx9VarClone;
            g2b g2bVar = g2b.a;
        }
    }
}
