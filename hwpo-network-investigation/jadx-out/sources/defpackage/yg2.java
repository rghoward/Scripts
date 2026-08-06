package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yg2 {
    public final String a;
    public final char b;
    public final String c;

    public yg2(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = w2a.l(str, String.valueOf(c), BuildConfig.FLAVOR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg2)) {
            return false;
        }
        yg2 yg2Var = (yg2) obj;
        return this.a.equals(yg2Var.a) && this.b == yg2Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
