package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p6d extends BroadcastReceiver {
    public final tkc a;

    public p6d(tkc tkcVar) {
        this.a = tkcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final tkc tkcVar = this.a;
        if (intent == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.i.a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                thc thcVar3 = tkcVar.f;
                tkc.m(thcVar3);
                thcVar3.n.a("[sgtm] App Receiver notified batches are available");
                fkc fkcVar = tkcVar.g;
                tkc.m(fkcVar);
                fkcVar.p(new Runnable() { // from class: q3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        tkc tkcVar2 = this.t.a;
                        tkc.j(tkcVar2.u);
                        tkcVar2.u.k(((Long) wfc.D.a(null)).longValue());
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            o6c.a();
            if (tkcVar.d.r(null, wfc.P0)) {
                thc thcVar4 = tkcVar.f;
                tkc.m(thcVar4);
                thcVar4.n.a("App receiver notified triggers are available");
                fkc fkcVar2 = tkcVar.g;
                tkc.m(fkcVar2);
                fkcVar2.p(new Runnable() { // from class: o4d
                    @Override // java.lang.Runnable
                    public final void run() {
                        tkc tkcVar2 = tkcVar;
                        yzc yzcVar = tkcVar2.i;
                        final hrc hrcVar = tkcVar2.m;
                        tkc.k(yzcVar);
                        yzcVar.g();
                        if (yzcVar.E() != 1) {
                            thc thcVar5 = tkcVar2.f;
                            tkc.m(thcVar5);
                            thcVar5.i.a("registerTrigger called but app not eligible");
                            return;
                        }
                        tkc.l(hrcVar);
                        hrcVar.g();
                        boc bocVar = hrcVar.l;
                        if (bocVar != null) {
                            bocVar.c();
                        }
                        tkc.l(hrcVar);
                        new Thread(new Runnable() { // from class: p5d
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                hrcVar.D();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        thc thcVar5 = tkcVar.f;
        tkc.m(thcVar5);
        thcVar5.i.a("App receiver called with unknown action");
    }
}
