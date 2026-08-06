package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 implements mha {
    public final long a;

    public ui1(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        vc5.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.mha
    public final float a() {
        return uh1.d(this.a);
    }

    @Override // defpackage.mha
    public final long c() {
        return this.a;
    }

    @Override // defpackage.mha
    public final fx0 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui1) && uh1.c(this.a, ((ui1) obj).a);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) uh1.i(this.a)) + ')';
    }
}
