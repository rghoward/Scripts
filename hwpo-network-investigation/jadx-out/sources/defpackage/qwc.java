package defpackage;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qwc implements Runnable {
    public final long t;
    public final long u;
    public final /* synthetic */ swc v;

    public qwc(swc swcVar, long j, long j2) {
        Objects.requireNonNull(swcVar);
        this.v = swcVar;
        this.t = j;
        this.u = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fkc fkcVar = this.v.b.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new Runnable() { // from class: pwc
            /* JADX WARN: Code duplicated, block: B:10:0x007c  */
            @Override // java.lang.Runnable
            public final void run() {
                qwc qwcVar = this.t;
                cxc cxcVar = qwcVar.v.b;
                cxcVar.g();
                tkc tkcVar = cxcVar.a;
                thc thcVar = tkcVar.f;
                Context context = tkcVar.a;
                tkc.m(thcVar);
                thcVar.m.a("Application going to the background");
                zic zicVar = tkcVar.e;
                tkc.k(zicVar);
                zicVar.s.b(true);
                cxcVar.g();
                cxcVar.d = true;
                t7c t7cVar = tkcVar.d;
                if (!t7cVar.v()) {
                    long j = qwcVar.u;
                    zwc zwcVar = cxcVar.f;
                    zwcVar.a(j, false, false);
                    zwcVar.c.c();
                }
                long j2 = qwcVar.t;
                tkc.m(thcVar);
                thcVar.l.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                hrc hrcVar = tkcVar.m;
                tkc.l(hrcVar);
                hrcVar.g();
                tkc tkcVar2 = hrcVar.a;
                hrcVar.h();
                tvc tvcVarP = tkcVar2.p();
                tvcVarP.g();
                tvcVarP.h();
                if (tvcVarP.n()) {
                    yzc yzcVar = tvcVarP.a.i;
                    tkc.k(yzcVar);
                    if (yzcVar.S() >= 242600) {
                        tvc tvcVarP2 = tkcVar2.p();
                        tvcVarP2.g();
                        tvcVarP2.h();
                        tvcVarP2.u(new ptc(tvcVarP2, tvcVarP2.w(true)));
                    }
                } else {
                    tvc tvcVarP3 = tkcVar2.p();
                    tvcVarP3.g();
                    tvcVarP3.h();
                    tvcVarP3.u(new ptc(tvcVarP3, tvcVarP3.w(true)));
                }
                if (t7cVar.r(null, wfc.N0)) {
                    yzc yzcVar2 = tkcVar.i;
                    tkc.k(yzcVar2);
                    long jO = yzcVar2.M(context.getPackageName(), t7cVar.c) ? 1000L : t7cVar.o(context.getPackageName(), wfc.E);
                    tkc.m(thcVar);
                    thcVar.n.b(Long.valueOf(jO), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    tkc.j(tkcVar.u);
                    tkcVar.u.k(jO);
                }
            }
        });
    }
}
