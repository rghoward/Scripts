package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j47 implements Decoder, rt1 {
    public final ArrayList<String> t = new ArrayList<>();
    public boolean u;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final char D() {
        return c(q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final int F(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return e(q(), serialDescriptor);
    }

    @Override // defpackage.rt1
    public final long G(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return j(p(serialDescriptor, i));
    }

    @Override // defpackage.rt1
    public final char I(h98 h98Var, int i) {
        h98Var.getClass();
        return c(p(h98Var, i));
    }

    @Override // defpackage.rt1
    public final <T> T J(SerialDescriptor serialDescriptor, int i, sy2<? extends T> sy2Var, T t) {
        serialDescriptor.getClass();
        sy2Var.getClass();
        this.t.add(p(serialDescriptor, i));
        sy2Var.getClass();
        T t2 = (T) C(sy2Var);
        if (!this.u) {
            q();
        }
        this.u = false;
        return t2;
    }

    @Override // defpackage.rt1
    public final <T> T L(SerialDescriptor serialDescriptor, int i, sy2<? extends T> sy2Var, T t) {
        serialDescriptor.getClass();
        sy2Var.getClass();
        this.t.add(p(serialDescriptor, i));
        T t2 = (sy2Var.getDescriptor().c() || d0()) ? (T) C(sy2Var) : null;
        if (!this.u) {
            q();
        }
        this.u = false;
        return t2;
    }

    @Override // defpackage.rt1
    public final byte N(h98 h98Var, int i) {
        h98Var.getClass();
        return b(p(h98Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final int O() {
        return h(q());
    }

    @Override // defpackage.rt1
    public final short P(h98 h98Var, int i) {
        h98Var.getClass();
        return l(p(h98Var, i));
    }

    @Override // defpackage.rt1
    public final int R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return h(p(serialDescriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final String S() {
        return m(q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final long Z() {
        return j(q());
    }

    public abstract boolean a(String str);

    @Override // defpackage.rt1
    public final boolean a0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return a(p(serialDescriptor, i));
    }

    public abstract byte b(String str);

    public abstract char c(String str);

    @Override // defpackage.rt1
    public final String c0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m(p(serialDescriptor, i));
    }

    public abstract double d(String str);

    public abstract int e(String str, SerialDescriptor serialDescriptor);

    public abstract float f(String str);

    public abstract Decoder g(String str, SerialDescriptor serialDescriptor);

    public abstract int h(String str);

    public abstract long j(String str);

    public abstract short l(String str);

    public abstract String m(String str);

    public String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.g(i);
    }

    @Override // defpackage.rt1
    public final double o0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return d(p(serialDescriptor, i));
    }

    public final String p(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strO = o(serialDescriptor, i);
        strO.getClass();
        return strO;
    }

    public final String q() {
        ArrayList<String> arrayList = this.t;
        String strRemove = arrayList.remove(ws0.g(arrayList));
        this.u = true;
        return strRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final byte q0() {
        return b(q());
    }

    public final String r() {
        ArrayList<String> arrayList = this.t;
        return arrayList.isEmpty() ? "$" : th1.F(arrayList, ".", "$.", null, null, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final short t0() {
        return l(q());
    }

    @Override // defpackage.rt1
    public final Decoder u(h98 h98Var, int i) {
        h98Var.getClass();
        return g(p(h98Var, i), h98Var.i(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final float u0() {
        return f(q());
    }

    @Override // defpackage.rt1
    public final float w0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return f(p(serialDescriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final double y0() {
        return d(q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        return a(q());
    }
}
