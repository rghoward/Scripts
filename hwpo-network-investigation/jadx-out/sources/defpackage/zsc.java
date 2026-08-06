package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zsc implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ q1d v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ obc x;
    public final /* synthetic */ tvc y;

    public zsc(tvc tvcVar, String str, String str2, q1d q1dVar, boolean z, obc obcVar) {
        this.t = str;
        this.u = str2;
        this.v = q1dVar;
        this.w = z;
        this.x = obcVar;
        this.y = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.t;
        obc obcVar = this.x;
        tvc tvcVar = this.y;
        Bundle bundle = new Bundle();
        try {
            try {
                jgc jgcVar = tvcVar.d;
                tkc tkcVar = tvcVar.a;
                String str2 = this.u;
                if (jgcVar == null) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.f.c(str, str2, "Failed to get user properties; not connected to service");
                    yzc yzcVar = tkcVar.i;
                    tkc.k(yzcVar);
                    yzcVar.Z(obcVar, bundle);
                    return;
                }
                List<szc> listQ = jgcVar.q(str, str2, this.w, this.v);
                Bundle bundle2 = new Bundle();
                if (listQ != null) {
                    for (szc szcVar : listQ) {
                        String str3 = szcVar.x;
                        String str4 = szcVar.u;
                        if (str3 != null) {
                            bundle2.putString(str4, str3);
                        } else {
                            Long l = szcVar.w;
                            if (l != null) {
                                bundle2.putLong(str4, l.longValue());
                            } else {
                                Double d = szcVar.z;
                                if (d != null) {
                                    bundle2.putDouble(str4, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    tvcVar.t();
                    yzc yzcVar2 = tkcVar.i;
                    tkc.k(yzcVar2);
                    yzcVar2.Z(obcVar, bundle2);
                } catch (RemoteException e) {
                    e = e;
                    bundle = bundle2;
                    thc thcVar2 = tvcVar.a.f;
                    tkc.m(thcVar2);
                    thcVar2.f.c(str, e, "Failed to get user properties; remote exception");
                    yzc yzcVar3 = tvcVar.a.i;
                    tkc.k(yzcVar3);
                    yzcVar3.Z(obcVar, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle = bundle2;
                    yzc yzcVar4 = tvcVar.a.i;
                    tkc.k(yzcVar4);
                    yzcVar4.Z(obcVar, bundle);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }
}
