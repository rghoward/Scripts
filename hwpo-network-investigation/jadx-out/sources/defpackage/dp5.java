package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dp5 {
    public static final dp5 e;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    static {
        int i = 0;
        e = new dp5(i, i, 127);
    }

    public /* synthetic */ dp5(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public final s85 a(boolean z) {
        int i = this.a;
        cp5 cp5Var = new cp5(i);
        if (i == -1) {
            cp5Var = null;
        }
        int i2 = cp5Var != null ? cp5Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        ep5 ep5Var = new ep5(i3);
        if (i3 == 0) {
            ep5Var = null;
        }
        int i4 = ep5Var != null ? ep5Var.a : 1;
        int i5 = this.d;
        r85 r85Var = i5 != -1 ? new r85(i5) : null;
        return new s85(z, i2, zBooleanValue, i4, r85Var != null ? r85Var.a : 1, ad6.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp5)) {
            return false;
        }
        dp5 dp5Var = (dp5) obj;
        return this.a == dp5Var.a && xj5.a(this.b, dp5Var.b) && this.c == dp5Var.c && this.d == dp5Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return os2.a(this.d, os2.a(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) cp5.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) ep5.a(this.c)) + ", imeAction=" + ((Object) r85.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public dp5(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }
}
