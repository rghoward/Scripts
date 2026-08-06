package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ndb<V extends fw> {
    public final V a;
    public final aa3 b;

    public ndb() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ndb(fw fwVar, aa3 aa3Var) {
        this.a = fwVar;
        this.b = aa3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndb)) {
            return false;
        }
        ndb ndbVar = (ndb) obj;
        return xj5.a(this.a, ndbVar.a) && xj5.a(this.b, ndbVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
