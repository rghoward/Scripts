package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nxc extends v8c {
    public final /* synthetic */ pxc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxc(pxc pxcVar, enc encVar) {
        super(encVar);
        this.e = pxcVar;
    }

    @Override // defpackage.v8c
    public final void a() {
        pxc pxcVar = this.e;
        pxcVar.l();
        thc thcVar = pxcVar.a.f;
        tkc.m(thcVar);
        thcVar.n.a("Starting upload from DelayedRunnable");
        pxcVar.b.q();
    }
}
