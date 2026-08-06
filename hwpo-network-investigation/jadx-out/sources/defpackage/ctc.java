package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ctc extends ngc {
    public final /* synthetic */ AtomicReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctc(tvc tvcVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.b = atomicReference;
    }

    @Override // defpackage.pgc
    public final void L(List list) {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
