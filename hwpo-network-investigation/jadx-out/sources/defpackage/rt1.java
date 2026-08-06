package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface rt1 {
    long G(SerialDescriptor serialDescriptor, int i);

    char I(h98 h98Var, int i);

    <T> T J(SerialDescriptor serialDescriptor, int i, sy2<? extends T> sy2Var, T t);

    <T> T L(SerialDescriptor serialDescriptor, int i, sy2<? extends T> sy2Var, T t);

    byte N(h98 h98Var, int i);

    short P(h98 h98Var, int i);

    int R(SerialDescriptor serialDescriptor, int i);

    boolean a0(SerialDescriptor serialDescriptor, int i);

    String c0(SerialDescriptor serialDescriptor, int i);

    int g0(SerialDescriptor serialDescriptor);

    void i(SerialDescriptor serialDescriptor);

    ln4 k();

    double o0(SerialDescriptor serialDescriptor, int i);

    Decoder u(h98 h98Var, int i);

    float w0(SerialDescriptor serialDescriptor, int i);
}
