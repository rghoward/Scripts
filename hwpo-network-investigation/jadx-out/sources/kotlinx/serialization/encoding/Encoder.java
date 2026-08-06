package kotlinx.serialization.encoding;

import defpackage.ln4;
import defpackage.st1;
import defpackage.ud9;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface Encoder {
    void D(String str);

    void a();

    void b(double d);

    void c(short s);

    void d(byte b);

    void e(boolean z);

    void h(float f);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void j(ud9<? super T> ud9Var, T t) {
        ud9Var.getClass();
        ud9Var.serialize(this, t);
    }

    ln4 k();

    void m(char c);

    st1 n(SerialDescriptor serialDescriptor);

    void s(SerialDescriptor serialDescriptor, int i);

    void u(int i);

    Encoder v(SerialDescriptor serialDescriptor);

    default st1 w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return n(serialDescriptor);
    }

    void y(long j);
}
