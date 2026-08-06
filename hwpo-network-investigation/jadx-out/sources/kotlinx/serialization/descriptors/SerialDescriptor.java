package kotlinx.serialization.descriptors;

import defpackage.hf3;
import defpackage.pd9;
import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface SerialDescriptor {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    pd9 e();

    int f();

    String g(int i);

    default List<Annotation> getAnnotations() {
        return hf3.t;
    }

    List<Annotation> h(int i);

    SerialDescriptor i(int i);

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
