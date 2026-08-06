package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qua implements el0 {
    public static final a Companion = new a();
    public static final qua d = new qua(0, BuildConfig.FLAVOR, false);
    public final int a;
    public final String b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public qua(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public static qua a(qua quaVar, int i, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = quaVar.a;
        }
        if ((i2 & 2) != 0) {
            str = quaVar.b;
        }
        if ((i2 & 4) != 0) {
            z = quaVar.c;
        }
        quaVar.getClass();
        str.getClass();
        return new qua(i, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qua)) {
            return false;
        }
        qua quaVar = (qua) obj;
        return this.a == quaVar.a && this.b.equals(quaVar.b) && this.c == quaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fz.c(il.a("TrackingViewState(currentTab=", ", searchHint=", this.b, ", addButtonVisibility=", this.a), this.c, ")");
    }
}
