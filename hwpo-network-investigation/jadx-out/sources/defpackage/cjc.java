package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cjc implements ServiceConnection {
    public final String t;
    public final /* synthetic */ djc u;

    public cjc(djc djcVar, String str) {
        Objects.requireNonNull(djcVar);
        this.u = djcVar;
        this.t = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        djc djcVar = this.u;
        if (iBinder == null) {
            thc thcVar = djcVar.a.f;
            tkc.m(thcVar);
            thcVar.i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = mac.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            nac kacVar = iInterfaceQueryLocalInterface instanceof nac ? (nac) iInterfaceQueryLocalInterface : new kac(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            tkc tkcVar = djcVar.a;
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.n.a("Install Referrer Service connected");
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new bjc(this, kacVar, this));
        } catch (RuntimeException e) {
            thc thcVar3 = djcVar.a.f;
            tkc.m(thcVar3);
            thcVar3.i.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        thc thcVar = this.u.a.f;
        tkc.m(thcVar);
        thcVar.n.a("Install Referrer Service disconnected");
    }
}
