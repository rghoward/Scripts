package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ul9 {
    public final b72 a;
    public final b72 b;
    public final b72 c;
    public final b72 d;
    public final b72 e;
    public final b72 f;
    public final b72 g;
    public final b72 h;

    public ul9() {
        this(ol9.a, ol9.b, ol9.c, ol9.d, ol9.f, ol9.e, ol9.g, ol9.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul9)) {
            return false;
        }
        ul9 ul9Var = (ul9) obj;
        return xj5.a(this.a, ul9Var.a) && xj5.a(this.b, ul9Var.b) && xj5.a(this.c, ul9Var.c) && xj5.a(this.d, ul9Var.d) && xj5.a(this.e, ul9Var.e) && xj5.a(this.f, ul9Var.f) && xj5.a(this.g, ul9Var.g) && xj5.a(this.h, ul9Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    public ul9(b72 b72Var, b72 b72Var2, b72 b72Var3, b72 b72Var4, b72 b72Var5, b72 b72Var6, b72 b72Var7, b72 b72Var8) {
        this.a = b72Var;
        this.b = b72Var2;
        this.c = b72Var3;
        this.d = b72Var4;
        this.e = b72Var5;
        this.f = b72Var6;
        this.g = b72Var7;
        this.h = b72Var8;
    }

    public ul9(int i) {
        this(ol9.a, ol9.b, ol9.c, ol9.d, ol9.f, ol9.e, ol9.g, ol9.h);
    }
}
