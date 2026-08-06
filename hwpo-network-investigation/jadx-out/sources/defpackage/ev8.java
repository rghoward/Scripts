package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ev8<T> extends kl5 {
    public final ll5.a A;

    public ev8(ll5.a aVar) {
        this.A = aVar;
    }

    @Override // defpackage.kl5
    public final boolean q() {
        return false;
    }

    @Override // defpackage.kl5
    public final void r(Throwable th) {
        Object objS = p().S();
        boolean z = objS instanceof jp1;
        ll5.a aVar = this.A;
        if (z) {
            aVar.resumeWith(dv8.a(((jp1) objS).a));
        } else {
            aVar.resumeWith(ml5.d(objS));
        }
    }
}
