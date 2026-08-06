package defpackage;

import android.graphics.Matrix;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b23 {
    public static final k7a a = new k7a("UNDEFINED");
    public static final k7a b = new k7a("REUSABLE_CLAIMED");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(final t69 t69Var, final float f, yv yvVar, an2 an2Var, final oh4 oh4Var, u02 u02Var) throws Throwable {
        au9 au9Var;
        dl8 dl8Var;
        if (u02Var instanceof au9) {
            au9Var = (au9) u02Var;
            int i = au9Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                au9Var.x = i - Integer.MIN_VALUE;
            } else {
                au9Var = new au9(u02Var);
            }
        } else {
            au9Var = new au9(u02Var);
        }
        Object obj = au9Var.w;
        int i2 = au9Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            final dl8 dl8Var2 = new dl8();
            boolean z = ((Number) yvVar.d()).floatValue() == 0.0f;
            oh4 oh4Var2 = new oh4() { // from class: yt9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    vv vvVar = (vv) obj2;
                    float fAbs = Math.abs(((Number) vvVar.e.getValue()).floatValue());
                    float f2 = f;
                    float fAbs2 = Math.abs(f2);
                    dt7 dt7Var = vvVar.e;
                    dl8 dl8Var3 = dl8Var2;
                    t69 t69Var2 = t69Var;
                    oh4 oh4Var3 = oh4Var;
                    if (fAbs >= fAbs2) {
                        float fD = b23.d(((Number) dt7Var.getValue()).floatValue(), f2);
                        b23.c(vvVar, t69Var2, oh4Var3, fD - dl8Var3.t);
                        vvVar.a();
                        dl8Var3.t = fD;
                    } else {
                        b23.c(vvVar, t69Var2, oh4Var3, ((Number) dt7Var.getValue()).floatValue() - dl8Var3.t);
                        dl8Var3.t = ((Number) dt7Var.getValue()).floatValue();
                    }
                    return g2b.a;
                }
            };
            au9Var.u = yvVar;
            au9Var.v = dl8Var2;
            au9Var.t = f;
            au9Var.x = 1;
            Object objD = o6a.d(yvVar, an2Var, !z, oh4Var2, au9Var);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
            dl8Var = dl8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = au9Var.t;
            dl8Var = au9Var.v;
            yvVar = au9Var.u;
            dv8.b(obj);
        }
        return new tv(new Float(f - dl8Var.t), yvVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(final t69 t69Var, float f, final float f2, yv yvVar, wv wvVar, final oh4 oh4Var, u02 u02Var) throws Throwable {
        bu9 bu9Var;
        dl8 dl8Var;
        float f3;
        yv yvVar2;
        if (u02Var instanceof bu9) {
            bu9Var = (bu9) u02Var;
            int i = bu9Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                bu9Var.y = i - Integer.MIN_VALUE;
            } else {
                bu9Var = new bu9(u02Var);
            }
        } else {
            bu9Var = new bu9(u02Var);
        }
        bu9 bu9Var2 = bu9Var;
        Object obj = bu9Var2.x;
        int i2 = bu9Var2.y;
        if (i2 == 0) {
            dv8.b(obj);
            final dl8 dl8Var2 = new dl8();
            float fFloatValue = ((Number) yvVar.d()).floatValue();
            Float f4 = new Float(f);
            boolean z = ((Number) yvVar.d()).floatValue() == 0.0f;
            oh4 oh4Var2 = new oh4() { // from class: zt9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    float f5;
                    t69 t69Var2 = t69Var;
                    vv vvVar = (vv) obj2;
                    float fD = b23.d(((Number) vvVar.e.getValue()).floatValue(), f2);
                    dl8 dl8Var3 = dl8Var2;
                    float f6 = fD - dl8Var3.t;
                    try {
                        f5 = t69Var2.f(f6);
                    } catch (CancellationException unused) {
                        vvVar.a();
                        f5 = 0.0f;
                    }
                    oh4Var.invoke(Float.valueOf(f5));
                    if (Math.abs(f6 - f5) > 0.5f || fD != ((Number) vvVar.e.getValue()).floatValue()) {
                        vvVar.a();
                    }
                    dl8Var3.t += f5;
                    return g2b.a;
                }
            };
            bu9Var2.v = yvVar;
            bu9Var2.w = dl8Var2;
            bu9Var2.t = f;
            bu9Var2.u = fFloatValue;
            bu9Var2.y = 1;
            Object objE = o6a.e(yvVar, f4, wvVar, !z, oh4Var2, bu9Var2);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
            dl8Var = dl8Var2;
            f3 = fFloatValue;
            yvVar2 = yvVar;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = bu9Var2.u;
            f = bu9Var2.t;
            dl8Var = bu9Var2.w;
            yvVar2 = bu9Var2.v;
            dv8.b(obj);
        }
        return new tv(new Float(f - dl8Var.t), zv.c(yvVar2, 0.0f, d(((Number) yvVar2.d()).floatValue(), f3), 29));
    }

    public static final void c(vv vvVar, t69 t69Var, oh4 oh4Var, float f) {
        float f2;
        try {
            f2 = t69Var.f(f);
        } catch (CancellationException unused) {
            vvVar.a();
            f2 = 0.0f;
        }
        oh4Var.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            vvVar.a();
        }
    }

    public static final float d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final void e(r02 r02Var, Object obj) {
        if (!(r02Var instanceof a23)) {
            r02Var.resumeWith(obj);
            return;
        }
        a23 a23Var = (a23) r02Var;
        n72 n72Var = a23Var.w;
        u02 u02Var = a23Var.x;
        Throwable thA = av8.a(obj);
        Object jp1Var = thA == null ? obj : new jp1(thA, false);
        if (g(n72Var, u02Var.getContext())) {
            a23Var.y = jp1Var;
            a23Var.v = 1;
            f(n72Var, u02Var.getContext(), a23Var);
            return;
        }
        pm3 pm3VarA = dla.a();
        if (pm3VarA.v >= 4294967296L) {
            a23Var.y = jp1Var;
            a23Var.v = 1;
            pm3VarA.y0(a23Var);
            return;
        }
        pm3VarA.z0(true);
        try {
            el5 el5Var = (el5) u02Var.getContext().d0(el5.a.t);
            if (el5Var == null || el5Var.h()) {
                Object obj2 = a23Var.z;
                h72 context = u02Var.getContext();
                Object objC = cla.c(context, obj2);
                x1b<?> x1bVarC = objC != cla.a ? l72.c(u02Var, context, objC) : null;
                try {
                    u02Var.resumeWith(obj);
                    g2b g2bVar = g2b.a;
                    if (x1bVarC == null || x1bVarC.F0()) {
                        cla.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (x1bVarC == null || x1bVarC.F0()) {
                        cla.a(context, objC);
                    }
                    throw th;
                }
            } else {
                a23Var.resumeWith(dv8.a(el5Var.H()));
            }
            while (pm3VarA.B0()) {
            }
        } catch (Throwable th2) {
            try {
                a23Var.g(th2);
            } finally {
                pm3VarA.x0(true);
            }
        }
    }

    public static final void f(n72 n72Var, h72 h72Var, Runnable runnable) {
        try {
            n72Var.t0(h72Var, runnable);
        } catch (Throwable th) {
            throw new x13(th, n72Var, h72Var);
        }
    }

    public static final boolean g(n72 n72Var, h72 h72Var) throws x13 {
        try {
            return n72Var.v0(h72Var);
        } catch (Throwable th) {
            throw new x13(th, n72Var, h72Var);
        }
    }

    public static final void h(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void i(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }
}
