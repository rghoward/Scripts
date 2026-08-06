package defpackage;

import android.os.Bundle;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class foc implements si4 {
    public final /* synthetic */ kxc a;
    public final /* synthetic */ hrc b;

    public foc(hrc hrcVar, kxc kxcVar) {
        this.a = kxcVar;
        this.b = hrcVar;
    }

    @Override // defpackage.si4
    public final void a(Throwable th) {
        hrc hrcVar = this.b;
        hrcVar.g();
        tkc tkcVar = hrcVar.a;
        hrcVar.i = false;
        hrcVar.E().add(this.a);
        if (hrcVar.j > ((Integer) wfc.v0.a(null)).intValue()) {
            hrcVar.j = 1;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.c(thc.o(tkcVar.r().m()), thc.o(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.i.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", thc.o(tkcVar.r().m()), thc.o(String.valueOf(hrcVar.j)), thc.o(th.toString()));
        int i = hrcVar.j;
        if (hrcVar.k == null) {
            hrcVar.k = new hoc(hrcVar, tkcVar);
        }
        hrcVar.k.b(((long) i) * 1000);
        int i2 = hrcVar.j;
        hrcVar.j = i2 + i2;
    }

    @Override // defpackage.si4
    public final void onSuccess(Object obj) {
        hrc hrcVar = this.b;
        hrcVar.g();
        tkc tkcVar = hrcVar.a;
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        SparseArray sparseArrayM = zicVar.m();
        kxc kxcVar = this.a;
        sparseArrayM.put(kxcVar.v, Long.valueOf(kxcVar.u));
        zic zicVar2 = tkcVar.e;
        tkc.k(zicVar2);
        int[] iArr = new int[sparseArrayM.size()];
        long[] jArr = new long[sparseArrayM.size()];
        for (int i = 0; i < sparseArrayM.size(); i++) {
            iArr[i] = sparseArrayM.keyAt(i);
            jArr[i] = ((Long) sparseArrayM.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zicVar2.n.b(bundle);
        hrcVar.i = false;
        hrcVar.j = 1;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.b(kxcVar.t, "Successfully registered trigger URI");
        hrcVar.F();
    }
}
