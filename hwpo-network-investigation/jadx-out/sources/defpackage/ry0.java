package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ry0 {
    public static final <T> KSerializer<T> a(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().c() ? kSerializer : new wd7(kSerializer);
    }
}
