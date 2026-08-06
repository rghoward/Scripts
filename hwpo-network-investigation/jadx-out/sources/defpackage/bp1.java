package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bp1<T> extends ll5 implements uv2<Object> {
    public final boolean B0(Throwable th) {
        return h0(new jp1(th, false));
    }

    @Override // defpackage.uv2
    public final T p() throws Throwable {
        Object objS = S();
        if (objS instanceof ja5) {
            aa0.c("This job has not completed yet");
            return null;
        }
        if (objS instanceof jp1) {
            throw ((jp1) objS).a;
        }
        return (T) ml5.d(objS);
    }
}
