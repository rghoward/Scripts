package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class juc implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ q1d v;
    public final /* synthetic */ obc w;
    public final /* synthetic */ tvc x;

    public juc(tvc tvcVar, String str, String str2, q1d q1dVar, obc obcVar) {
        this.t = str;
        this.u = str2;
        this.v = q1dVar;
        this.w = obcVar;
        this.x = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzc yzcVar;
        obc obcVar = this.w;
        String str = this.u;
        String str2 = this.t;
        tvc tvcVar = this.x;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                jgc jgcVar = tvcVar.d;
                if (jgcVar == null) {
                    tkc tkcVar = tvcVar.a;
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.f.c(str2, str, "Failed to get conditional properties; not connected to service");
                    yzcVar = tkcVar.i;
                } else {
                    arrayList = yzc.b0(jgcVar.A(str2, str, this.v));
                    tvcVar.t();
                    yzcVar = tvcVar.a.i;
                }
            } catch (RemoteException e) {
                thc thcVar2 = tvcVar.a.f;
                tkc.m(thcVar2);
                thcVar2.f.d("Failed to get conditional properties; remote exception", str2, str, e);
            }
            tkc.k(yzcVar);
            yzcVar.a0(obcVar, arrayList);
        } catch (Throwable th) {
            yzc yzcVar2 = tvcVar.a.i;
            tkc.k(yzcVar2);
            yzcVar2.a0(obcVar, arrayList);
            throw th;
        }
    }
}
