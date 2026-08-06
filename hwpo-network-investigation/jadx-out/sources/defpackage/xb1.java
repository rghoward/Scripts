package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xb1 extends g5b<g2b, Boolean> {
    public final gd7 a;
    public final qs2 b;

    public xb1(gd7 gd7Var, qs2 qs2Var) {
        gd7Var.getClass();
        this.a = gd7Var;
        this.b = qs2Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        wb1 wb1Var;
        if (r02Var instanceof wb1) {
            wb1Var = (wb1) r02Var;
            int i = wb1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wb1Var.v = i - Integer.MIN_VALUE;
            } else {
                wb1Var = new wb1(this, (u02) r02Var);
            }
        } else {
            wb1Var = new wb1(this, (u02) r02Var);
        }
        Object objB = wb1Var.t;
        int i2 = wb1Var.v;
        boolean z = false;
        if (i2 == 0) {
            dv8.b(objB);
            if (Build.VERSION.SDK_INT >= 33) {
                wb1Var.v = 1;
                objB = this.a.b();
                Object obj = v72.t;
                if (objB == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(objB);
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        boolean zA = this.b.a();
        if (!zBooleanValue && !zA) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
