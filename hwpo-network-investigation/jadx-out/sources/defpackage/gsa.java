package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gsa {
    public static final gsa d = new gsa(new esa[0]);
    public final int a;
    public final ul8 b;
    public int c;

    static {
        n6b.H(0);
    }

    public gsa(esa... esaVarArr) {
        ul8 ul8VarR = k95.r(esaVarArr);
        this.b = ul8VarR;
        this.a = esaVarArr.length;
        int i = 0;
        while (i < ul8VarR.w) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < ul8VarR.w; i3++) {
                if (((esa) ul8VarR.get(i)).equals(ul8VarR.get(i3))) {
                    md6.e("TrackGroupArray", BuildConfig.FLAVOR, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final esa a(int i) {
        return (esa) this.b.get(i);
    }

    public final int b(esa esaVar) {
        int iIndexOf = this.b.indexOf(esaVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gsa.class != obj.getClass()) {
            return false;
        }
        gsa gsaVar = (gsa) obj;
        return this.a == gsaVar.a && this.b.equals(gsaVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
