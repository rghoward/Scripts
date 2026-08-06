package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wja {
    public static final wja d = new wja(0, 0, null, 0, 0, 0, 16777215);
    public final ww9 a;
    public final ss7 b;
    public final b28 c;

    public wja(long j, long j2, ob4 ob4Var, long j3, int i, long j4, int i2) {
        this(new ww9((i2 & 1) != 0 ? uh1.k : j, (i2 & 2) != 0 ? bka.c : j2, (i2 & 4) != 0 ? null : ob4Var, (mb4) null, (nb4) null, (qa4) null, (String) null, (i2 & 128) != 0 ? bka.c : j3, (gl0) null, (oha) null, (ad6) null, uh1.k, (fda) null, (el9) null, (r18) null, (e73) null), new ss7((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? bka.c : j4, null, null, null, 0, 0, null), null);
    }

    public static wja a(wja wjaVar, long j, long j2, ob4 ob4Var, qa4 qa4Var, long j3, long j4, b28 b28Var, e86 e86Var, int i) {
        mha ui1Var;
        long jC = (i & 1) != 0 ? wjaVar.a.a.c() : j;
        long j5 = (i & 2) != 0 ? wjaVar.a.b : j2;
        ob4 ob4Var2 = (i & 4) != 0 ? wjaVar.a.c : ob4Var;
        ww9 ww9Var = wjaVar.a;
        mb4 mb4Var = ww9Var.d;
        nb4 nb4Var = ww9Var.e;
        qa4 qa4Var2 = (i & 32) != 0 ? ww9Var.f : qa4Var;
        String str = ww9Var.g;
        long j6 = (i & 128) != 0 ? ww9Var.h : j3;
        gl0 gl0Var = ww9Var.i;
        oha ohaVar = ww9Var.j;
        ad6 ad6Var = ww9Var.k;
        long j7 = ww9Var.l;
        fda fdaVar = (i & 4096) != 0 ? ww9Var.m : fda.c;
        el9 el9Var = ww9Var.n;
        e73 e73Var = ww9Var.p;
        int i2 = (i & 32768) != 0 ? wjaVar.b.a : 3;
        ss7 ss7Var = wjaVar.b;
        int i3 = ss7Var.b;
        long j8 = (i & 131072) != 0 ? ss7Var.c : j4;
        qha qhaVar = ss7Var.d;
        b28 b28Var2 = (i & 524288) != 0 ? wjaVar.c : b28Var;
        e86 e86Var2 = (i & 1048576) != 0 ? ss7Var.f : e86Var;
        int i4 = ss7Var.g;
        int i5 = ss7Var.h;
        jja jjaVar = ss7Var.i;
        if (uh1.c(jC, ww9Var.a.c())) {
            ui1Var = ww9Var.a;
        } else {
            ui1Var = jC != 16 ? new ui1(jC) : mha.a.a;
        }
        return new wja(new ww9(ui1Var, j5, ob4Var2, mb4Var, nb4Var, qa4Var2, str, j6, gl0Var, ohaVar, ad6Var, j7, fdaVar, el9Var, b28Var2 != null ? b28Var2.a : null, e73Var), new ss7(i2, i3, j8, qhaVar, b28Var2 != null ? b28Var2.b : null, e86Var2, i4, i5, jjaVar), b28Var2);
    }

    public static wja e(wja wjaVar, long j, long j2, ob4 ob4Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? bka.c : j2;
        ob4 ob4Var2 = (i2 & 4) != 0 ? null : ob4Var;
        long j6 = (i2 & 128) != 0 ? bka.c : j3;
        long j7 = uh1.k;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? bka.c : j4;
        ww9 ww9VarA = yw9.a(wjaVar.a, j, null, Float.NaN, j5, ob4Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        ss7 ss7VarA = ts7.a(wjaVar.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (wjaVar.a == ww9VarA && wjaVar.b == ss7VarA) ? wjaVar : new wja(ww9VarA, ss7VarA);
    }

    public final long b() {
        return this.a.a.c();
    }

    public final boolean c(wja wjaVar) {
        if (this != wjaVar) {
            return xj5.a(this.b, wjaVar.b) && this.a.a(wjaVar.a);
        }
        return true;
    }

    public final wja d(wja wjaVar) {
        return (wjaVar == null || wjaVar.equals(d)) ? this : new wja(this.a.c(wjaVar.a), this.b.a(wjaVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wja)) {
            return false;
        }
        wja wjaVar = (wja) obj;
        return xj5.a(this.a, wjaVar.a) && xj5.a(this.b, wjaVar.b) && xj5.a(this.c, wjaVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        b28 b28Var = this.c;
        return iHashCode + (b28Var != null ? b28Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) uh1.i(b()));
        sb.append(", brush=");
        ww9 ww9Var = this.a;
        sb.append(ww9Var.a.e());
        sb.append(", alpha=");
        sb.append(ww9Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) bka.d(ww9Var.b));
        sb.append(", fontWeight=");
        sb.append(ww9Var.c);
        sb.append(", fontStyle=");
        sb.append(ww9Var.d);
        sb.append(", fontSynthesis=");
        sb.append(ww9Var.e);
        sb.append(", fontFamily=");
        sb.append(ww9Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(ww9Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) bka.d(ww9Var.h));
        sb.append(", baselineShift=");
        sb.append(ww9Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(ww9Var.j);
        sb.append(", localeList=");
        sb.append(ww9Var.k);
        sb.append(", background=");
        a83.b(ww9Var.l, ", textDecoration=", sb);
        sb.append(ww9Var.m);
        sb.append(", shadow=");
        sb.append(ww9Var.n);
        sb.append(", drawStyle=");
        sb.append(ww9Var.p);
        sb.append(", textAlign=");
        ss7 ss7Var = this.b;
        sb.append((Object) vaa.a(ss7Var.a));
        sb.append(", textDirection=");
        sb.append((Object) jda.a(ss7Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) bka.d(ss7Var.c));
        sb.append(", textIndent=");
        sb.append(ss7Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(ss7Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) c86.a(ss7Var.g));
        sb.append(", hyphens=");
        sb.append((Object) o55.a(ss7Var.h));
        sb.append(", textMotion=");
        sb.append(ss7Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wja(ww9 ww9Var, ss7 ss7Var) {
        r18 r18Var = ww9Var.o;
        h18 h18Var = ss7Var.e;
        this(ww9Var, ss7Var, (r18Var == null && h18Var == null) ? null : new b28(r18Var, h18Var));
    }

    public wja(ww9 ww9Var, ss7 ss7Var, b28 b28Var) {
        this.a = ww9Var;
        this.b = ss7Var;
        this.c = b28Var;
    }
}
