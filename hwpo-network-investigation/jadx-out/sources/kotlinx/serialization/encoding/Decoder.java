package kotlinx.serialization.encoding;

import defpackage.rt1;
import defpackage.sy2;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface Decoder {
    default <T> T C(sy2<? extends T> sy2Var) {
        sy2Var.getClass();
        return sy2Var.deserialize(this);
    }

    char D();

    int F(SerialDescriptor serialDescriptor);

    int O();

    String S();

    long Z();

    boolean d0();

    rt1 n(SerialDescriptor serialDescriptor);

    Decoder n0(SerialDescriptor serialDescriptor);

    byte q0();

    short t0();

    float u0();

    double y0();

    boolean z();
}
