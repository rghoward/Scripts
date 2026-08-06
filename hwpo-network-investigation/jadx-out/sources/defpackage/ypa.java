package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ypa implements el0 {
    public static final a Companion = new a();
    public static final ypa d = new ypa(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null);
    public final String a;
    public final String b;
    public final ipa.b c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public ypa(String str, String str2, ipa.b bVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypa)) {
            return false;
        }
        ypa ypaVar = (ypa) obj;
        return xj5.a(this.a, ypaVar.a) && xj5.a(this.b, ypaVar.b) && xj5.a(this.c, ypaVar.c);
    }

    public final int hashCode() {
        int iC = ru3.c(this.a.hashCode() * 31, 31, this.b);
        ipa.b bVar = this.c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("TodayTipDetailsViewState(title=", this.a, ", descriptionText=", this.b, ", attachment=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
