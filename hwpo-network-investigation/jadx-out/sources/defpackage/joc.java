package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class joc implements Runnable {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ hrc u;

    public joc(hrc hrcVar, boolean z) {
        this.t = z;
        Objects.requireNonNull(hrcVar);
        this.u = hrcVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.u;
        tkc tkcVar = hrcVar.a;
        boolean zD = tkcVar.d();
        boolean z = false;
        boolean z2 = tkcVar.y != null && tkcVar.y.booleanValue();
        boolean z3 = this.t;
        tkcVar.y = Boolean.valueOf(z3);
        if (z2 == z3) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.b(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (tkcVar.d() != zD) {
            boolean zD2 = tkcVar.d();
            if (tkcVar.y != null && tkcVar.y.booleanValue()) {
                z = true;
            }
            if (zD2 != z) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.k.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
            }
        } else {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.k.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
        }
        hrcVar.y();
    }
}
