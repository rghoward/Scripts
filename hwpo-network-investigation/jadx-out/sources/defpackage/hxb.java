package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hxb extends zac {
    public final tkc a;
    public final hrc b;

    public hxb(tkc tkcVar) {
        a78.g(tkcVar);
        this.a = tkcVar;
        hrc hrcVar = tkcVar.m;
        tkc.l(hrcVar);
        this.b = hrcVar;
    }

    @Override // defpackage.krc
    public final void a(String str, String str2, Bundle bundle) {
        this.b.k(str, str2, bundle);
    }

    @Override // defpackage.krc
    public final void b(Bundle bundle) {
        hrc hrcVar = this.b;
        hrcVar.a.k.getClass();
        hrcVar.t(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.krc
    public final void c(String str) {
        tkc tkcVar = this.a;
        ecc eccVar = tkcVar.n;
        tkc.j(eccVar);
        tkcVar.k.getClass();
        eccVar.i(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.krc
    public final void d(String str) {
        tkc tkcVar = this.a;
        ecc eccVar = tkcVar.n;
        tkc.j(eccVar);
        tkcVar.k.getClass();
        eccVar.h(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.krc
    public final void e(String str, String str2, Bundle bundle) {
        hrc hrcVar = this.a.m;
        tkc.l(hrcVar);
        hrcVar.u(str, str2, bundle);
    }

    @Override // defpackage.krc
    public final List f(String str, String str2) {
        hrc hrcVar = this.b;
        tkc tkcVar = hrcVar.a;
        fkc fkcVar = tkcVar.g;
        thc thcVar = tkcVar.f;
        tkc.m(fkcVar);
        if (fkcVar.m()) {
            tkc.m(thcVar);
            thcVar.f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (pd7.b()) {
            tkc.m(thcVar);
            thcVar.f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.q(atomicReference, 5000L, "get conditional user properties", new jpc(hrcVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return yzc.b0(list);
        }
        tkc.m(thcVar);
        thcVar.f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.krc
    public final String g() {
        xsc xscVar = this.b.a.l;
        tkc.l(xscVar);
        dsc dscVar = xscVar.c;
        if (dscVar != null) {
            return dscVar.a;
        }
        return null;
    }

    @Override // defpackage.krc
    public final int h(String str) {
        hrc hrcVar = this.b;
        hrcVar.getClass();
        a78.d(str);
        hrcVar.a.getClass();
        return 25;
    }

    @Override // defpackage.krc
    public final long i() {
        yzc yzcVar = this.a.i;
        tkc.k(yzcVar);
        return yzcVar.f0();
    }

    @Override // defpackage.krc
    public final String j() {
        xsc xscVar = this.b.a.l;
        tkc.l(xscVar);
        dsc dscVar = xscVar.c;
        if (dscVar != null) {
            return dscVar.b;
        }
        return null;
    }

    @Override // defpackage.krc
    public final Map k(String str, String str2, boolean z) {
        hrc hrcVar = this.b;
        tkc tkcVar = hrcVar.a;
        fkc fkcVar = tkcVar.g;
        thc thcVar = tkcVar.f;
        tkc.m(fkcVar);
        if (fkcVar.m()) {
            tkc.m(thcVar);
            thcVar.f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (pd7.b()) {
            tkc.m(thcVar);
            thcVar.f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.q(atomicReference, 5000L, "get user properties", new lpc(hrcVar, atomicReference, str, str2, z));
        List<szc> list = (List) atomicReference.get();
        if (list == null) {
            tkc.m(thcVar);
            thcVar.f.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        n30 n30Var = new n30(list.size());
        for (szc szcVar : list) {
            Object objJ = szcVar.j();
            if (objJ != null) {
                n30Var.put(szcVar.u, objJ);
            }
        }
        return n30Var;
    }

    @Override // defpackage.krc
    public final String l() {
        return (String) this.b.g.get();
    }

    @Override // defpackage.krc
    public final String m() {
        return this.b.v();
    }
}
