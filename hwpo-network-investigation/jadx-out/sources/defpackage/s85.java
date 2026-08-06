package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s85 {
    public static final s85 g = new s85(false, 0, true, 1, 1, ad6.v);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ad6 f;

    public s85(boolean z, int i, boolean z2, int i2, int i3, ad6 ad6Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ad6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s85)) {
            return false;
        }
        s85 s85Var = (s85) obj;
        return this.a == s85Var.a && this.b == s85Var.b && this.c == s85Var.c && this.d == s85Var.d && this.e == s85Var.e && xj5.a(this.f, s85Var.f);
    }

    public final int hashCode() {
        return this.f.t.hashCode() + os2.a(this.e, os2.a(this.d, uo2.a(os2.a(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) cp5.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) ep5.a(this.d)) + ", imeAction=" + ((Object) r85.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
