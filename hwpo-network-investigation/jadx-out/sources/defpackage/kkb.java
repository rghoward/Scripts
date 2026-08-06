package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kkb<T> {
    public final k37<Reference<T>> a = new k37<>(new Reference[16]);
    public final ReferenceQueue<T> b = new ReferenceQueue<>();
}
