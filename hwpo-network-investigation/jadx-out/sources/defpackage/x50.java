package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x50 implements we8 {
    public final int b;

    public x50(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return we8.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we8)) {
            return false;
        }
        we8 we8Var = (we8) obj;
        return this.b == we8Var.tag() && we8.a.t.equals(we8Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (we8.a.t.hashCode() ^ 2041407134);
    }

    @Override // defpackage.we8
    public final we8.a intEncoding() {
        return we8.a.t;
    }

    @Override // defpackage.we8
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + we8.a.t + ')';
    }
}
