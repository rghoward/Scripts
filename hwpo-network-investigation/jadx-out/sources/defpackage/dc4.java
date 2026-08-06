package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dc4 implements lv8, jac {
    public static final dc4 t = new dc4();
    public static final /* synthetic */ dc4 u = new dc4();

    public static final vx8 b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new vx8(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean c(vx8 vx8Var) {
        long j = vx8Var.e;
        return (j >>> 32) == (4294967295L & j) && j == vx8Var.f && j == vx8Var.g && j == vx8Var.h;
    }

    public static final o67 d(p87[] p87VarArr, jt1 jt1Var) {
        Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(p87VarArr, p87VarArr.length);
        au3 au3Var = new au3(new p67(), new f36(1, context));
        boolean zJ = jt1Var.j(context);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new mq1(2, context);
            jt1Var.C(objF);
        }
        o67 o67Var = (o67) mm8.f(objArrCopyOf, au3Var, (mh4) objF, jt1Var, 0, 4);
        for (p87 p87Var : p87VarArr) {
            o67Var.b.s.a(p87Var);
        }
        return o67Var;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(u4c.u.get().l());
    }
}
