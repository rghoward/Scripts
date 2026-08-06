package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bjc implements Runnable {
    public final /* synthetic */ nac t;
    public final /* synthetic */ cjc u;

    public bjc(cjc cjcVar, nac nacVar, cjc cjcVar2) {
        this.t = nacVar;
        this.u = cjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjc cjcVar = this.u;
        tkc tkcVar = cjcVar.u.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", cjcVar.t);
        try {
            if (this.t.y(bundle) == null) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.f.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
        }
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
