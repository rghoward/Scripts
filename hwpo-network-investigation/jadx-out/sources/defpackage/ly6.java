package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ly6 implements jy6 {
    public final Context t;
    public o02 u;
    public final at7 v = new at7(1.0f);
    public dz9 w;

    public ly6(Context context) {
        this.t = context;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public final h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    @Override // defpackage.jy6
    public final float P() {
        zz9<Float> zz9Var;
        if (this.w == null) {
            Context context = this.t;
            c37<Context, zz9<Float>> c37Var = dob.a;
            synchronized (c37Var) {
                try {
                    zz9<Float> zz9VarD = c37Var.d(context);
                    if (zz9VarD == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        zx0 zx0VarA = da1.a(-1, 6, null);
                        zz9VarD = yk2.u(new oz8(new bob(contentResolver, uriFor, new cob(zx0VarA, ct4.a(Looper.getMainLooper())), zx0VarA, context, null)), u72.b(), new uz9(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c37Var.m(context, zz9VarD);
                    }
                    zz9Var = zz9VarD;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v.g(zz9Var.getValue().floatValue());
            o02 o02Var = this.u;
            if (o02Var == null) {
                aa0.c("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.w = oy0.d(o02Var, null, null, new ky6(zz9Var, this, null), 3);
        }
        return this.v.h();
    }

    @Override // defpackage.h72
    public final h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }
}
