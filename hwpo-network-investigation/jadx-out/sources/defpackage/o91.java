package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o91 {
    public final di a;
    public final oh4<kg5, kg5> b;
    public final a04<kg5> c;

    public o91(di diVar, oh4 oh4Var, a04 a04Var) {
        this.a = diVar;
        this.b = oh4Var;
        this.c = a04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o91)) {
            return false;
        }
        o91 o91Var = (o91) obj;
        return xj5.a(this.a, o91Var.a) && this.b.equals(o91Var.b) && xj5.a(this.c, o91Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
