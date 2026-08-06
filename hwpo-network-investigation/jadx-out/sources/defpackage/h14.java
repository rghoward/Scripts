package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h14 extends gv7 {
    public static final dp c = dp.d();
    public final k20 b;

    public h14(k20 k20Var) {
        this.b = k20Var;
    }

    @Override // defpackage.gv7
    public final boolean a() {
        dp dpVar = c;
        k20 k20Var = this.b;
        if (k20Var == null) {
            dpVar.f("ApplicationInfo is null");
        } else if (!k20Var.I()) {
            dpVar.f("GoogleAppId is null");
        } else if (!k20Var.G()) {
            dpVar.f("AppInstanceId is null");
        } else if (!k20Var.H()) {
            dpVar.f("ApplicationProcessState is null");
        } else {
            if (!k20Var.F()) {
                return true;
            }
            if (!k20Var.D().C()) {
                dpVar.f("AndroidAppInfo.packageName is null");
            } else {
                if (k20Var.D().D()) {
                    return true;
                }
                dpVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        dpVar.f("ApplicationInfo is invalid");
        return false;
    }
}
