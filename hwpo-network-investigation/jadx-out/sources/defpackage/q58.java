package defpackage;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q58 {
    public static final String a(sl5 sl5Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        sl5Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof wl5) {
                return ((wl5) annotation).discriminator();
            }
        }
        return sl5Var.a.f;
    }
}
