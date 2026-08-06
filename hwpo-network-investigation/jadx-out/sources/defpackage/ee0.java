package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ee0 extends hs3 {
    public final Integer a;

    public ee0(Integer num) {
        this.a = num;
    }

    @Override // defpackage.hs3
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs3)) {
            return false;
        }
        hs3 hs3Var = (hs3) obj;
        Integer num = this.a;
        if (num == null) {
            return hs3Var.a() == null;
        }
        return num.equals(hs3Var.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
