package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class twc extends v8c {
    public final /* synthetic */ zwc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twc(zwc zwcVar, enc encVar) {
        super(encVar);
        this.e = zwcVar;
    }

    @Override // defpackage.v8c
    public final void a() {
        zwc zwcVar = this.e;
        cxc cxcVar = zwcVar.d;
        cxcVar.g();
        tkc tkcVar = cxcVar.a;
        tkcVar.k.getClass();
        zwcVar.a(SystemClock.elapsedRealtime(), false, false);
        ecc eccVar = tkcVar.n;
        tkc.j(eccVar);
        tkcVar.k.getClass();
        eccVar.j(SystemClock.elapsedRealtime());
    }
}
