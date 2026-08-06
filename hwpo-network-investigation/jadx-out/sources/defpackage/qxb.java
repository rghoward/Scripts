package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qxb extends uac {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ ik0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxb(ik0 ik0Var, int i, Bundle bundle) {
        super(ik0Var);
        this.f = ik0Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.uac
    public final void a(Object obj) {
        ik0 ik0Var = this.f;
        int i = this.d;
        if (i != 0) {
            ik0Var.C(1, null);
            Bundle bundle = this.e;
            c(new ax1(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else {
            if (b()) {
                return;
            }
            ik0Var.C(1, null);
            c(new ax1(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(ax1 ax1Var);
}
