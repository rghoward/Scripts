package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hoa {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hoa) {
            return this.a == ((hoa) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Hour";
        }
        return i == 1 ? "Minute" : BuildConfig.FLAVOR;
    }
}
