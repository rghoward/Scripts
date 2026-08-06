package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class npc implements Runnable {
    public final /* synthetic */ obc t;
    public final /* synthetic */ hrc u;

    public npc(hrc hrcVar, obc obcVar) {
        this.t = obcVar;
        Objects.requireNonNull(hrcVar);
        this.u = hrcVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        obc obcVar;
        hrc hrcVar = this.u;
        cxc cxcVar = hrcVar.a.h;
        tkc.l(cxcVar);
        tkc tkcVar = cxcVar.a;
        zic zicVar = tkcVar.e;
        zic zicVar2 = tkcVar.e;
        tkc.k(zicVar);
        if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
            tkc.k(zicVar2);
            tkcVar.k.getClass();
            if (!zicVar2.p(System.currentTimeMillis())) {
                tkc.k(zicVar2);
                if (zicVar2.q.a() != 0) {
                    tkc.k(zicVar2);
                    lValueOf = Long.valueOf(zicVar2.q.a());
                }
            }
            obcVar = this.t;
            if (lValueOf == null) {
                yzc yzcVar = hrcVar.a.i;
                tkc.k(yzcVar);
                yzcVar.V(obcVar, lValueOf.longValue());
            } else {
                try {
                    obcVar.D(null);
                    return;
                } catch (RemoteException e) {
                    thc thcVar = hrcVar.a.f;
                    tkc.m(thcVar);
                    thcVar.f.b(e, "getSessionId failed with exception");
                    return;
                }
            }
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.k.a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        obcVar = this.t;
        if (lValueOf == null) {
            obcVar.D(null);
            return;
        }
        yzc yzcVar2 = hrcVar.a.i;
        tkc.k(yzcVar2);
        yzcVar2.V(obcVar, lValueOf.longValue());
    }
}
