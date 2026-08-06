package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface st1 {
    Encoder A(h98 h98Var, int i);

    void B(SerialDescriptor serialDescriptor, int i, long j);

    default boolean C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    void f(SerialDescriptor serialDescriptor, int i, float f);

    void g(int i, int i2, SerialDescriptor serialDescriptor);

    void i(SerialDescriptor serialDescriptor);

    void l(h98 h98Var, int i, byte b);

    void o(SerialDescriptor serialDescriptor, int i, boolean z);

    void p(SerialDescriptor serialDescriptor, int i, String str);

    <T> void q(SerialDescriptor serialDescriptor, int i, ud9<? super T> ud9Var, T t);

    void r(h98 h98Var, int i, short s);

    void t(h98 h98Var, int i, char c);

    void x(SerialDescriptor serialDescriptor, int i, double d);

    <T> void z(SerialDescriptor serialDescriptor, int i, ud9<? super T> ud9Var, T t);
}
