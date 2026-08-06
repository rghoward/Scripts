package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d9 implements ak4<Object> {
    public volatile yd2 t;
    public final Object u = new Object();
    public final px4 v;
    public final ma w;
    public t09 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        xd2 b();
    }

    public d9(px4 px4Var) {
        this.v = px4Var;
        this.w = new ma(px4Var);
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t;
    }

    public final yd2 b() {
        String str;
        px4 px4Var = this.v;
        if (px4Var.getApplication() instanceof ak4) {
            xd2 xd2VarB = ((a) kl3.b(a.class, this.w)).b();
            return new yd2((fe2) xd2VarB.a, (ae2) xd2VarB.b, new un2(), px4Var);
        }
        if (Application.class.equals(px4Var.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + px4Var.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }
}
