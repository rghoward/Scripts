package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.intercom.twig.BuildConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xsc extends dgc {
    public volatile dsc c;
    public volatile dsc d;
    public dsc e;
    public final ConcurrentHashMap f;
    public lcc g;
    public volatile boolean h;
    public volatile dsc i;
    public dsc j;
    public boolean k;
    public final Object l;

    public xsc(tkc tkcVar) {
        super(tkcVar);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.dgc
    public final boolean j() {
        return false;
    }

    public final dsc k(boolean z) {
        h();
        g();
        dsc dscVar = this.e;
        return (z && dscVar == null) ? this.j : dscVar;
    }

    public final String l(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : BuildConfig.FLAVOR;
        int length2 = str2.length();
        tkc tkcVar = this.a;
        tkcVar.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        tkcVar.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    public final void m(dsc dscVar, dsc dscVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = dscVar.e;
        g();
        boolean z4 = false;
        if (dscVar2 != null) {
            if (dscVar2.c == dscVar.c && Objects.equals(dscVar2.b, dscVar.b) && Objects.equals(dscVar2.a, dscVar.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z4 = true;
        }
        tkc tkcVar = this.a;
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            yzc.d0(dscVar, bundle3, true);
            if (dscVar2 != null) {
                String str = dscVar2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = dscVar2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", dscVar2.c);
            }
            if (z4) {
                cxc cxcVar = tkcVar.h;
                tkc.l(cxcVar);
                zwc zwcVar = cxcVar.f;
                long j3 = j - zwcVar.b;
                zwcVar.b = j;
                if (j3 > 0) {
                    yzc yzcVar = tkcVar.i;
                    tkc.k(yzcVar);
                    yzcVar.T(bundle3, j3);
                }
            }
            t7c t7cVar = tkcVar.d;
            mq2 mq2Var = tkcVar.k;
            if (!t7cVar.v()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            mq2Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = dscVar.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = tkcVar.d.r(null, wfc.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = dscVar.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.o(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            p(this.e, true, j);
        }
        this.e = dscVar;
        if (z3) {
            this.j = dscVar;
        }
        tvc tvcVarP = tkcVar.p();
        tvcVarP.g();
        tvcVarP.h();
        tvcVarP.u(new stc(tvcVarP, dscVar));
    }

    public final void n(lcc lccVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.d.v() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(Integer.valueOf(lccVar.t), new dsc(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void o(String str, dsc dscVar, boolean z) {
        dsc dscVar2;
        dsc dscVar3 = this.c == null ? this.d : this.c;
        if (dscVar.b == null) {
            dscVar2 = new dsc(dscVar.a, str != null ? l(str) : null, dscVar.c, dscVar.e, dscVar.f, dscVar.g);
        } else {
            dscVar2 = dscVar;
        }
        this.d = this.c;
        this.c = dscVar2;
        tkc tkcVar = this.a;
        tkcVar.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.p(new gsc(this, dscVar2, dscVar3, jElapsedRealtime, z));
    }

    public final void p(dsc dscVar, boolean z, long j) {
        tkc tkcVar = this.a;
        ecc eccVar = tkcVar.n;
        tkc.j(eccVar);
        tkcVar.k.getClass();
        eccVar.j(SystemClock.elapsedRealtime());
        boolean z2 = dscVar != null && dscVar.d;
        cxc cxcVar = tkcVar.h;
        tkc.l(cxcVar);
        if (!cxcVar.f.a(j, z2, z) || dscVar == null) {
            return;
        }
        dscVar.d = false;
    }

    public final dsc q(lcc lccVar) {
        a78.g(lccVar);
        Integer numValueOf = Integer.valueOf(lccVar.t);
        ConcurrentHashMap concurrentHashMap = this.f;
        dsc dscVar = (dsc) concurrentHashMap.get(numValueOf);
        if (dscVar == null) {
            String strL = l(lccVar.u);
            yzc yzcVar = this.a.i;
            tkc.k(yzcVar);
            dsc dscVar2 = new dsc(null, strL, yzcVar.f0());
            concurrentHashMap.put(numValueOf, dscVar2);
            dscVar = dscVar2;
        }
        return this.i != null ? this.i : dscVar;
    }
}
