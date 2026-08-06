package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qc9 extends g99<qc9> {
    public final /* synthetic */ AtomicReferenceArray z;

    public qc9(long j, qc9 qc9Var, int i) {
        super(j, qc9Var, i);
        this.z = new AtomicReferenceArray(pc9.f);
    }

    @Override // defpackage.g99
    public final int l() {
        return pc9.f;
    }

    @Override // defpackage.g99
    public final void m(int i, h72 h72Var) {
        this.z.set(i, pc9.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.x + ", hashCode=" + hashCode() + ']';
    }
}
