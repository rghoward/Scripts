package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oj5 implements jac {
    public static final /* synthetic */ oj5 t = new oj5();

    public static final void b(o1a o1aVar, a58 a58Var, long j) {
        jv2 jv2Var = (jv2) o1aVar.a;
        jv2Var.getClass();
        tdb tdbVar = jv2Var.b;
        tdb tdbVar2 = jv2Var.a;
        boolean zE = z69.e(a58Var);
        long j2 = a58Var.b;
        if (zE) {
            df2[] df2VarArr = tdbVar2.d;
            gz3.m(0, df2VarArr.length, null, df2VarArr);
            tdbVar2.e = 0;
            df2[] df2VarArr2 = tdbVar.d;
            gz3.m(0, df2VarArr2.length, null, df2VarArr2);
            tdbVar.e = 0;
            jv2Var.c = 0L;
        }
        if (!z69.g(a58Var)) {
            List list = a58Var.m;
            if (list == null) {
                list = hf3.t;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                ty4 ty4Var = (ty4) list.get(i);
                jv2Var.a(ty4Var.a, vf7.e(ty4Var.e, j));
                i++;
            }
            jv2Var.a(j2, vf7.e(a58Var.n, j));
        }
        if (z69.g(a58Var) && j2 - jv2Var.c > 40) {
            df2[] df2VarArr3 = tdbVar2.d;
            gz3.m(0, df2VarArr3.length, null, df2VarArr3);
            tdbVar2.e = 0;
            df2[] df2VarArr4 = tdbVar.d;
            gz3.m(0, df2VarArr4.length, null, df2VarArr4);
            tdbVar.e = 0;
            jv2Var.c = 0L;
        }
        jv2Var.c = j2;
    }

    public static final o67 c(Context context) {
        context.getClass();
        o67 o67Var = new o67(context);
        q57 q57Var = o67Var.b;
        r87 r87Var = q57Var.s;
        r87Var.a(new is1(r87Var));
        r87 r87Var2 = q57Var.s;
        r87Var2.a(new js1());
        r87Var2.a(new a03());
        return o67Var;
    }

    public static final float d(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final ox6 e(ox6 ox6Var) {
        return ox6Var.H(new mj5());
    }

    public static void f(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void g(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            uc5.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fD = d(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fD);
                }
            }
            float fSqrt = (float) Math.sqrt(d(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : d(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fD2 = d(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fD2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fD2 / fArr11[i14];
        }
    }

    public static final ox6 h(ox6 ox6Var) {
        return ox6Var.H(new uj5());
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().s0());
    }
}
