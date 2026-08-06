package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rc implements t23 {
    public final int a;
    public final String b;
    public final boolean c;

    public rc(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public static rc a(rc rcVar, boolean z) {
        int i = rcVar.a;
        String str = rcVar.b;
        str.getClass();
        return new rc(i, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return this.a == rcVar.a && xj5.a(this.b, rcVar.b) && this.c == rcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fz.c(il.a("AddValueItemModel(id=", ", title=", this.b, ", isChecked=", this.a), this.c, ")");
    }
}
