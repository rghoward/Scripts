package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lvb extends cvb implements yn4.a, yn4.b {
    public static final ztb i = pvb.a;
    public final Context b;
    public final Handler c;
    public final ztb d;
    public final Set e;
    public final nf1 f;
    public svb g;
    public uub h;

    public lvb(Context context, rwb rwbVar, nf1 nf1Var) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.b = context;
        this.c = rwbVar;
        this.f = nf1Var;
        this.e = nf1Var.b;
        this.d = i;
    }

    @Override // defpackage.hh7
    public final void a(ax1 ax1Var) {
        this.h.b(ax1Var);
    }

    @Override // defpackage.xw1
    public final void g(int i2) {
        uub uubVar = this.h;
        rub rubVar = (rub) uubVar.f.C.get(uubVar.b);
        if (rubVar != null) {
            if (rubVar.j) {
                rubVar.o(new ax1(17, null, null));
            } else {
                rubVar.g(i2);
            }
        }
    }

    @Override // defpackage.xw1
    public final void i() {
        this.g.a(this);
    }
}
