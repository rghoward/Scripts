package defpackage;

import android.content.SharedPreferences;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wpc implements Runnable {
    public final /* synthetic */ m9c t;
    public final /* synthetic */ hrc u;

    public wpc(hrc hrcVar, m9c m9cVar) {
        this.t = m9cVar;
        this.u = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.u;
        tkc tkcVar = hrcVar.a;
        zic zicVar = tkcVar.e;
        thc thcVar = tkcVar.f;
        tkc.k(zicVar);
        zicVar.g();
        zicVar.g();
        m9c m9cVarB = m9c.b(zicVar.k().getString("dma_consent_settings", null));
        m9c m9cVar = this.t;
        int i = m9cVar.a;
        if (!nnc.l(i, m9cVarB.a)) {
            tkc.m(thcVar);
            thcVar.l.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = zicVar.k().edit();
        editorEdit.putString("dma_consent_settings", m9cVar.b);
        editorEdit.apply();
        tkc.m(thcVar);
        thcVar.n.b(m9cVar, "Setting DMA consent(FE)");
        tkc tkcVar2 = hrcVar.a;
        if (tkcVar2.p().q()) {
            final tvc tvcVarP = tkcVar2.p();
            tvcVarP.g();
            tvcVarP.h();
            tvcVarP.u(new Runnable() { // from class: jvc
                @Override // java.lang.Runnable
                public final void run() {
                    tvc tvcVar = tvcVarP;
                    tkc tkcVar3 = tvcVar.a;
                    jgc jgcVar = tvcVar.d;
                    if (jgcVar == null) {
                        thc thcVar2 = tkcVar3.f;
                        tkc.m(thcVar2);
                        thcVar2.f.a("Failed to send Dma consent settings to service");
                        return;
                    }
                    try {
                        jgcVar.t(tvcVar.w(false));
                        tvcVar.t();
                    } catch (RemoteException e) {
                        thc thcVar3 = tkcVar3.f;
                        tkc.m(thcVar3);
                        thcVar3.f.b(e, "Failed to send Dma consent settings to the service");
                    }
                }
            });
            return;
        }
        tvc tvcVarP2 = tkcVar2.p();
        tvcVarP2.g();
        tvcVarP2.h();
        if (tvcVarP2.p()) {
            tvcVarP2.u(new cuc(tvcVarP2, tvcVarP2.w(false)));
        }
    }
}
