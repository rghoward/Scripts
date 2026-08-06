package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ww9 implements iw.a {
    public final mha a;
    public final long b;
    public final ob4 c;
    public final mb4 d;
    public final nb4 e;
    public final qa4 f;
    public final String g;
    public final long h;
    public final gl0 i;
    public final oha j;
    public final ad6 k;
    public final long l;
    public final fda m;
    public final el9 n;
    public final r18 o;
    public final e73 p;

    public ww9(long j, long j2, ob4 ob4Var, mb4 mb4Var, nb4 nb4Var, qa4 qa4Var, String str, long j3, gl0 gl0Var, oha ohaVar, ad6 ad6Var, long j4, fda fdaVar, el9 el9Var, int i) {
        this((i & 1) != 0 ? uh1.k : j, (i & 2) != 0 ? bka.c : j2, (i & 4) != 0 ? null : ob4Var, (i & 8) != 0 ? null : mb4Var, (i & 16) != 0 ? null : nb4Var, (i & 32) != 0 ? null : qa4Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? bka.c : j3, (i & 256) != 0 ? null : gl0Var, (i & 512) != 0 ? null : ohaVar, (i & 1024) != 0 ? null : ad6Var, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? uh1.k : j4, (i & 4096) != 0 ? null : fdaVar, (i & 8192) != 0 ? null : el9Var, (r18) null, (e73) null);
    }

    public final boolean a(ww9 ww9Var) {
        if (this == ww9Var) {
            return true;
        }
        return bka.a(this.b, ww9Var.b) && xj5.a(this.c, ww9Var.c) && xj5.a(this.d, ww9Var.d) && xj5.a(this.e, ww9Var.e) && xj5.a(this.f, ww9Var.f) && xj5.a(this.g, ww9Var.g) && bka.a(this.h, ww9Var.h) && xj5.a(this.i, ww9Var.i) && xj5.a(this.j, ww9Var.j) && xj5.a(this.k, ww9Var.k) && uh1.c(this.l, ww9Var.l) && xj5.a(this.o, ww9Var.o);
    }

    public final boolean b(ww9 ww9Var) {
        return xj5.a(this.a, ww9Var.a) && xj5.a(this.m, ww9Var.m) && xj5.a(this.n, ww9Var.n) && xj5.a(this.p, ww9Var.p);
    }

    public final ww9 c(ww9 ww9Var) {
        if (ww9Var == null) {
            return this;
        }
        mha mhaVar = ww9Var.a;
        return yw9.a(this, mhaVar.c(), mhaVar.e(), mhaVar.a(), ww9Var.b, ww9Var.c, ww9Var.d, ww9Var.e, ww9Var.f, ww9Var.g, ww9Var.h, ww9Var.i, ww9Var.j, ww9Var.k, ww9Var.l, ww9Var.m, ww9Var.n, ww9Var.o, ww9Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww9)) {
            return false;
        }
        ww9 ww9Var = (ww9) obj;
        return a(ww9Var) && b(ww9Var);
    }

    public final int hashCode() {
        mha mhaVar = this.a;
        long jC = mhaVar.c();
        int i = uh1.l;
        int iHashCode = Long.hashCode(jC) * 31;
        fx0 fx0VarE = mhaVar.e();
        int iHashCode2 = (Float.hashCode(mhaVar.a()) + ((iHashCode + (fx0VarE != null ? fx0VarE.hashCode() : 0)) * 31)) * 31;
        dka[] dkaVarArr = bka.b;
        int iC = al.c(this.b, iHashCode2, 31);
        ob4 ob4Var = this.c;
        int i2 = (iC + (ob4Var != null ? ob4Var.t : 0)) * 31;
        mb4 mb4Var = this.d;
        int iHashCode3 = (i2 + (mb4Var != null ? Integer.hashCode(mb4Var.a) : 0)) * 31;
        nb4 nb4Var = this.e;
        int iHashCode4 = (iHashCode3 + (nb4Var != null ? Integer.hashCode(nb4Var.a) : 0)) * 31;
        qa4 qa4Var = this.f;
        int iHashCode5 = (iHashCode4 + (qa4Var != null ? qa4Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = al.c(this.h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        gl0 gl0Var = this.i;
        int iHashCode6 = (iC2 + (gl0Var != null ? Float.hashCode(gl0Var.a) : 0)) * 31;
        oha ohaVar = this.j;
        int iHashCode7 = (iHashCode6 + (ohaVar != null ? ohaVar.hashCode() : 0)) * 31;
        ad6 ad6Var = this.k;
        int iC3 = al.c(this.l, (iHashCode7 + (ad6Var != null ? ad6Var.t.hashCode() : 0)) * 31, 31);
        fda fdaVar = this.m;
        int i3 = (iC3 + (fdaVar != null ? fdaVar.a : 0)) * 31;
        el9 el9Var = this.n;
        int iHashCode8 = (i3 + (el9Var != null ? el9Var.hashCode() : 0)) * 31;
        r18 r18Var = this.o;
        int iHashCode9 = (iHashCode8 + (r18Var != null ? r18Var.hashCode() : 0)) * 31;
        e73 e73Var = this.p;
        return iHashCode9 + (e73Var != null ? e73Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        mha mhaVar = this.a;
        sb.append((Object) uh1.i(mhaVar.c()));
        sb.append(", brush=");
        sb.append(mhaVar.e());
        sb.append(", alpha=");
        sb.append(mhaVar.a());
        sb.append(", fontSize=");
        sb.append((Object) bka.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) bka.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        a83.b(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public ww9(mha mhaVar, long j, ob4 ob4Var, mb4 mb4Var, nb4 nb4Var, qa4 qa4Var, String str, long j2, gl0 gl0Var, oha ohaVar, ad6 ad6Var, long j3, fda fdaVar, el9 el9Var, r18 r18Var, e73 e73Var) {
        this.a = mhaVar;
        this.b = j;
        this.c = ob4Var;
        this.d = mb4Var;
        this.e = nb4Var;
        this.f = qa4Var;
        this.g = str;
        this.h = j2;
        this.i = gl0Var;
        this.j = ohaVar;
        this.k = ad6Var;
        this.l = j3;
        this.m = fdaVar;
        this.n = el9Var;
        this.o = r18Var;
        this.p = e73Var;
    }

    public ww9(long j, long j2, ob4 ob4Var, mb4 mb4Var, nb4 nb4Var, qa4 qa4Var, String str, long j3, gl0 gl0Var, oha ohaVar, ad6 ad6Var, long j4, fda fdaVar, el9 el9Var, r18 r18Var, e73 e73Var) {
        this(j != 16 ? new ui1(j) : mha.a.a, j2, ob4Var, mb4Var, nb4Var, qa4Var, str, j3, gl0Var, ohaVar, ad6Var, j4, fdaVar, el9Var, r18Var, e73Var);
    }
}
