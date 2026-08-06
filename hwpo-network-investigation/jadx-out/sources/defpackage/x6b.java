package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x6b {
    public static final long a = zx1.h(0, 0, 0, 0);
    public static final hj8 b = new hj8(br9.c);

    public static final k85 a(Object obj, jt1 jt1Var) {
        jt1Var.e(1087186730);
        if (obj instanceof k85) {
            k85 k85Var = (k85) obj;
            jt1Var.H();
            return k85Var;
        }
        Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        jt1Var.e(-1245195153);
        boolean zJ = jt1Var.J(context) | jt1Var.J(obj);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            k85.a aVar = new k85.a(context);
            aVar.c = obj;
            objF = aVar.a();
            jt1Var.C(objF);
        }
        k85 k85Var2 = (k85) objF;
        jt1Var.H();
        jt1Var.H();
        return k85Var2;
    }

    public static final k85 b(Object obj, nz1 nz1Var, jt1 jt1Var) {
        lr9 lr9Var;
        jt1Var.e(1677680258);
        boolean z = obj instanceof k85;
        if (z) {
            k85 k85Var = (k85) obj;
            if (k85Var.F.a != null) {
                jt1Var.H();
                return k85Var;
            }
        }
        jt1Var.e(408306591);
        boolean zA = xj5.a(nz1Var, nz1.a.f);
        Object obj2 = jt1.a.a;
        if (zA) {
            lr9Var = b;
        } else {
            jt1Var.e(408309406);
            Object objF = jt1Var.f();
            if (objF == obj2) {
                objF = new by1();
                jt1Var.C(objF);
            }
            lr9Var = (by1) objF;
            jt1Var.H();
        }
        jt1Var.H();
        if (z) {
            jt1Var.e(-227230258);
            k85 k85Var2 = (k85) obj;
            jt1Var.e(408312509);
            boolean zJ = jt1Var.J(k85Var2) | jt1Var.J(lr9Var);
            Object objF2 = jt1Var.f();
            if (zJ || objF2 == obj2) {
                k85.a aVarA = k85.a(k85Var2);
                aVarA.t = lr9Var;
                aVarA.d();
                objF2 = aVarA.a();
                jt1Var.C(objF2);
            }
            k85 k85Var3 = (k85) objF2;
            jt1Var.H();
            jt1Var.H();
            jt1Var.H();
            return k85Var3;
        }
        jt1Var.e(-227066702);
        Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        jt1Var.e(408319118);
        boolean zJ2 = jt1Var.J(context) | jt1Var.J(obj) | jt1Var.J(lr9Var);
        Object objF3 = jt1Var.f();
        if (zJ2 || objF3 == obj2) {
            k85.a aVar = new k85.a(context);
            aVar.c = obj;
            aVar.t = lr9Var;
            aVar.d();
            objF3 = aVar.a();
            jt1Var.C(objF3);
        }
        k85 k85Var4 = (k85) objF3;
        jt1Var.H();
        jt1Var.H();
        jt1Var.H();
        return k85Var4;
    }
}
