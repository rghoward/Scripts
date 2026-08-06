package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kvb implements Runnable {
    public final /* synthetic */ kwb t;
    public final /* synthetic */ lvb u;

    public kvb(lvb lvbVar, kwb kwbVar) {
        this.t = kwbVar;
        this.u = lvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p55 o3dVar;
        lvb lvbVar = this.u;
        lvbVar.getClass();
        kwb kwbVar = this.t;
        ax1 ax1Var = kwbVar.u;
        if (ax1Var.u == 0) {
            dxb dxbVar = kwbVar.v;
            a78.g(dxbVar);
            ax1 ax1Var2 = dxbVar.v;
            if (ax1Var2.u != 0) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ax1Var2)), new Exception());
                lvbVar.h.b(ax1Var2);
                lvbVar.g.h();
                return;
            }
            uub uubVar = lvbVar.h;
            IBinder iBinder = dxbVar.u;
            if (iBinder == null) {
                o3dVar = null;
            } else {
                int i = p55.a.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                o3dVar = iInterfaceQueryLocalInterface instanceof p55 ? (p55) iInterfaceQueryLocalInterface : new o3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set<Scope> set = lvbVar.e;
            uubVar.getClass();
            if (o3dVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                uubVar.b(new ax1(4, null, null));
            } else {
                uubVar.c = o3dVar;
                uubVar.d = set;
                if (uubVar.e) {
                    uubVar.a.p(o3dVar, set);
                }
            }
        } else {
            lvbVar.h.b(ax1Var);
        }
        lvbVar.g.h();
    }
}
