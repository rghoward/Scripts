package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ lj(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int largeMemoryClass;
        int i = this.t;
        int i2 = 0;
        Object obj = this.u;
        switch (i) {
            case 0:
                wj wjVar = (wj) obj;
                T value = wjVar.l.getValue();
                if (value != 0) {
                    return value;
                }
                float fH = wjVar.j.h();
                boolean zIsNaN = Float.isNaN(fH);
                dt7 dt7Var = wjVar.g;
                if (zIsNaN) {
                    return dt7Var.getValue();
                }
                T value2 = dt7Var.getValue();
                g63 g63VarE = wjVar.e();
                float fD = g63VarE.d(value2);
                if (fD != fH && !Float.isNaN(fD)) {
                    if (fD < fH) {
                        Object objA = g63VarE.a(true, fH);
                        if (objA != null) {
                            return objA;
                        }
                    } else {
                        Object objA2 = g63VarE.a(false, fH);
                        if (objA2 != null) {
                            return objA2;
                        }
                    }
                }
                return value2;
            default:
                Context context = ((b85.a) obj).a;
                Bitmap.Config[] configArr = v.a;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                lj8 lj8Var = new lj8();
                if (d > 0.0d) {
                    Bitmap.Config[] configArr2 = v.a;
                    try {
                        Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                        systemService2.getClass();
                        ActivityManager activityManager = (ActivityManager) systemService2;
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = 256;
                    }
                    i2 = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                    break;
                }
                return new cj8(i2 > 0 ? new ij8(i2, lj8Var) : new rf3(lj8Var), lj8Var);
        }
    }
}
