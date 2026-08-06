package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class at1 {
    public final int a;
    public final pw9 b;
    public final Integer c;

    public at1(int i, pw9 pw9Var, Integer num) {
        this.a = i;
        this.b = pw9Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at1)) {
            return false;
        }
        at1 at1Var = (at1) obj;
        return this.a == at1Var.a && xj5.a(this.b, at1Var.b) && xj5.a(this.c, at1Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        pw9 pw9Var = this.b;
        int iHashCode2 = (iHashCode + (pw9Var == null ? 0 : pw9Var.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + this.b + ", groupOffset=" + this.c + ')';
    }
}
