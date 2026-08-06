package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gyb {
    public final ozb a;
    public final String b;

    public gyb(ozb ozbVar, String str) {
        qzb.a(ozbVar, "parser");
        this.a = ozbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gyb) {
            gyb gybVar = (gyb) obj;
            if (this.a.equals(gybVar.a) && this.b.equals(gybVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
