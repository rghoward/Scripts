package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pn2 {
    public final String a;
    public final id4 b;
    public final id4 c;
    public final int d;
    public final int e;

    public pn2(String str, id4 id4Var, id4 id4Var2, int i, int i2) {
        xl7.g(i == 0 || i2 == 0);
        xl7.g(true ^ TextUtils.isEmpty(str));
        this.a = str;
        id4Var.getClass();
        this.b = id4Var;
        id4Var2.getClass();
        this.c = id4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pn2.class == obj.getClass()) {
            pn2 pn2Var = (pn2) obj;
            if (this.d == pn2Var.d && this.e == pn2Var.e && this.a.equals(pn2Var.a) && this.b.equals(pn2Var.b) && this.c.equals(pn2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ru3.c((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
