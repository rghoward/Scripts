package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ecc extends tec {
    public final n30 b;
    public final n30 c;
    public long d;

    public ecc(tkc tkcVar) {
        super(tkcVar);
        this.c = new n30();
        this.b = new n30();
    }

    public final void h(long j, String str) {
        tkc tkcVar = this.a;
        if (str == null || str.length() == 0) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Ad unit id must be a non-empty string");
        } else {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new ixb(this, str, j));
        }
    }

    public final void i(long j, String str) {
        tkc tkcVar = this.a;
        if (str == null || str.length() == 0) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Ad unit id must be a non-empty string");
        } else {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new x8c(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(long j) {
        xsc xscVar = this.a.l;
        tkc.l(xscVar);
        dsc dscVarK = xscVar.k(false);
        n30 n30Var = this.b;
        for (String str : (n30.c) n30Var.keySet()) {
            l(str, j - ((Long) n30Var.get(str)).longValue(), dscVarK);
        }
        if (!n30Var.isEmpty()) {
            k(j - this.d, dscVarK);
        }
        m(j);
    }

    public final void k(long j, dsc dscVar) {
        tkc tkcVar = this.a;
        if (dscVar == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.n.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            yzc.d0(dscVar, bundle, true);
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.n("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j, dsc dscVar) {
        tkc tkcVar = this.a;
        if (dscVar == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.n.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            yzc.d0(dscVar, bundle, true);
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.n("am", "_xu", bundle);
        }
    }

    public final void m(long j) {
        n30 n30Var = this.b;
        Iterator it = ((n30.c) n30Var.keySet()).iterator();
        while (it.hasNext()) {
            n30Var.put((String) it.next(), Long.valueOf(j));
        }
        if (n30Var.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
