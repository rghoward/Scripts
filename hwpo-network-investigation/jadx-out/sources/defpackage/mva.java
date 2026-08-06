package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mva {
    public final iw a;
    public final ag7 b;

    public mva(iw iwVar, ag7 ag7Var) {
        this.a = iwVar;
        this.b = ag7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mva)) {
            return false;
        }
        mva mvaVar = (mva) obj;
        return xj5.a(this.a, mvaVar.a) && xj5.a(this.b, mvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
