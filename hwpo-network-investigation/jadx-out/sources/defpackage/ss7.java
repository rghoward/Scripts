package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ss7 implements iw.a {
    public final int a;
    public final int b;
    public final long c;
    public final qha d;
    public final h18 e;
    public final e86 f;
    public final int g;
    public final int h;
    public final jja i;

    public ss7(int i, int i2, long j, qha qhaVar, h18 h18Var, e86 e86Var, int i3, int i4, jja jjaVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = qhaVar;
        this.e = h18Var;
        this.f = e86Var;
        this.g = i3;
        this.h = i4;
        this.i = jjaVar;
        if (bka.a(j, bka.c) || bka.c(j) >= 0.0f) {
            return;
        }
        vc5.c("lineHeight can't be negative (" + bka.c(j) + ')');
    }

    public final ss7 a(ss7 ss7Var) {
        return ss7Var == null ? this : ts7.a(this, ss7Var.a, ss7Var.b, ss7Var.c, ss7Var.d, ss7Var.e, ss7Var.f, ss7Var.g, ss7Var.h, ss7Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss7)) {
            return false;
        }
        ss7 ss7Var = (ss7) obj;
        return this.a == ss7Var.a && this.b == ss7Var.b && bka.a(this.c, ss7Var.c) && xj5.a(this.d, ss7Var.d) && xj5.a(this.e, ss7Var.e) && xj5.a(this.f, ss7Var.f) && this.g == ss7Var.g && this.h == ss7Var.h && xj5.a(this.i, ss7Var.i);
    }

    public final int hashCode() {
        int iA = os2.a(this.b, Integer.hashCode(this.a) * 31, 31);
        dka[] dkaVarArr = bka.b;
        int iC = al.c(this.c, iA, 31);
        qha qhaVar = this.d;
        int iHashCode = (iC + (qhaVar != null ? qhaVar.hashCode() : 0)) * 31;
        h18 h18Var = this.e;
        int iHashCode2 = (iHashCode + (h18Var != null ? h18Var.hashCode() : 0)) * 31;
        e86 e86Var = this.f;
        int iA2 = os2.a(this.h, os2.a(this.g, (iHashCode2 + (e86Var != null ? e86Var.hashCode() : 0)) * 31, 31), 31);
        jja jjaVar = this.i;
        return iA2 + (jjaVar != null ? jjaVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) vaa.a(this.a)) + ", textDirection=" + ((Object) jda.a(this.b)) + ", lineHeight=" + ((Object) bka.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) c86.a(this.g)) + ", hyphens=" + ((Object) o55.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public ss7(long j, qha qhaVar, int i) {
        this(0, 0, j, (i & 8) != 0 ? null : qhaVar, null, null, 0, 0, null);
    }
}
