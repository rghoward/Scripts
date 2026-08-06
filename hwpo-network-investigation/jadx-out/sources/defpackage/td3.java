package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class td3 {
    public final yt7 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public td3(iw iwVar, long j) {
        String str = iwVar.u;
        yt7 yt7Var = new yt7();
        yt7Var.a = str;
        yt7Var.c = -1;
        yt7Var.d = -1;
        this.a = yt7Var;
        this.b = lja.f(j);
        this.c = lja.e(j);
        this.d = -1;
        this.e = -1;
        int iF = lja.f(j);
        int iE = lja.e(j);
        if (iF < 0 || iF > str.length()) {
            cp2.a(str.length(), t43.b(iF, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            cp2.a(str.length(), t43.b(iE, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        z90.a(u.a(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jC = ay.c(i, i2);
        this.a.b(i, i2, BuildConfig.FLAVOR);
        long jB = mq2.b(ay.c(this.b, this.c), jC);
        j(lja.f(jB));
        i(lja.e(jB));
        if (e()) {
            long jB2 = mq2.b(ay.c(this.d, this.e), jC);
            if (lja.c(jB2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = lja.f(jB2);
                this.e = lja.e(jB2);
            }
        }
    }

    public final char b(int i) {
        yt7 yt7Var = this.a;
        wi4 wi4Var = yt7Var.b;
        if (wi4Var == null) {
            return yt7Var.a.charAt(i);
        }
        if (i < yt7Var.c) {
            return yt7Var.a.charAt(i);
        }
        int iA = wi4Var.a - wi4Var.a();
        int i2 = yt7Var.c;
        if (i >= iA + i2) {
            return yt7Var.a.charAt(i - ((iA - yt7Var.d) + i2));
        }
        int i3 = i - i2;
        int i4 = wi4Var.c;
        char[] cArr = wi4Var.b;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + wi4Var.d];
    }

    public final lja c() {
        if (e()) {
            return new lja(ay.c(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i, int i2, String str) {
        yt7 yt7Var = this.a;
        if (i < 0 || i > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                z90.a(u.a(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            yt7Var.b(i, i2, str);
            j(str.length() + i);
            i(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void g(int i, int i2) {
        yt7 yt7Var = this.a;
        if (i < 0 || i > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            z90.a(u.a(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void h(int i, int i2) {
        yt7 yt7Var = this.a;
        if (i < 0 || i > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > yt7Var.a()) {
            cp2.a(yt7Var.a(), t43.b(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            z90.a(u.a(i, i2, "Do not set reversed range: ", " > "));
        } else {
            j(i);
            i(i2);
        }
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            vc5.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void j(int i) {
        if (!(i >= 0)) {
            vc5.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
