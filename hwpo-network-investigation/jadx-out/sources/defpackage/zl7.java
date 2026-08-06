package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl7 implements el0 {
    public final boolean a;
    public final boolean b;

    public zl7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static zl7 a(zl7 zl7Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = zl7Var.a;
        }
        if ((i & 2) != 0) {
            z2 = zl7Var.b;
        }
        zl7Var.getClass();
        return new zl7(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl7)) {
            return false;
        }
        zl7 zl7Var = (zl7) obj;
        return this.a == zl7Var.a && this.b == zl7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OtherReasonViewState(isLoading=" + this.a + ", isSendEnabled=" + this.b + ")";
    }

    public zl7() {
        this(false, false);
    }
}
