package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zb7 extends q7b {
    public final int a;

    public zb7(int i) {
        this.a = i;
    }

    @Override // defpackage.q7b
    public final int a() {
        return this.a;
    }

    @Override // defpackage.q7b
    public final p7b b(String str, vn0 vn0Var) {
        str.getClass();
        boolean zW = z2a.w(str);
        int i = this.a;
        return zW ? new p7b.a(i, null) : new p7b.b(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb7) && this.a == ((zb7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return pk.d(this.a, "NonEmptyInput(validatingId=", ", errorText=null)");
    }
}
