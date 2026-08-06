package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ndc implements Callable {
    public static final /* synthetic */ ndc a = new ndc();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        s8d s8dVar = new s8d("internal.platform");
        s8dVar.u.put("getVersion", new r7d("getVersion"));
        return s8dVar;
    }
}
