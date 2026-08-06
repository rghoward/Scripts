package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ld5 {
    public static final a Companion = new a();
    public final boolean a;
    public final int b;
    public final int c;
    public final mh4<g2b> d;
    public final mh4<g2b> e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public ld5(boolean z, int i, int i2, mh4 mh4Var, yn1 yn1Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = mh4Var;
        this.e = yn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5Var = (ld5) obj;
        return this.a == ld5Var.a && this.b == ld5Var.b && this.c == ld5Var.c && this.d.equals(ld5Var.d) && xj5.a(this.e, ld5Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + os2.a(this.c, os2.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31)) * 31;
        mh4<g2b> mh4Var = this.e;
        return iHashCode + (mh4Var == null ? 0 : mh4Var.hashCode());
    }

    public final String toString() {
        return "InputFieldViewState(isInputFocusable=" + this.a + ", inputHint=" + this.b + ", iconTint=" + this.c + ", addCallback=" + this.d + ", inputFieldCallback=" + this.e + ")";
    }
}
