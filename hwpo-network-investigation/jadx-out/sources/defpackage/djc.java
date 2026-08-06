package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class djc {
    public final tkc a;

    public djc(lzc lzcVar) {
        this.a = lzcVar.l;
    }

    public final boolean a() {
        tkc tkcVar = this.a;
        try {
            yn7 yn7VarA = wqb.a(tkcVar.a);
            if (yn7VarA != null) {
                return yn7VarA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.n.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
