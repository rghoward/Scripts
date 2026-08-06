package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class etc extends sgc {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ tvc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etc(tvc tvcVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.b = atomicReference;
        this.c = tvcVar;
    }

    @Override // defpackage.ugc
    public final void H(byc bycVar) {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            thc thcVar = this.c.a.f;
            tkc.m(thcVar);
            thcVar.n.b(Integer.valueOf(bycVar.t.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(bycVar);
            atomicReference.notifyAll();
        }
    }
}
