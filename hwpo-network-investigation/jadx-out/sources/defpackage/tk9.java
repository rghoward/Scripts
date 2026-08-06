package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class tk9 extends p6a implements ci4<ee9, r02<? super ee9>, Object> {
    public final /* synthetic */ ee9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk9(ee9 ee9Var, r02<? super tk9> r02Var) {
        super(2, r02Var);
        this.t = ee9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new tk9(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(ee9 ee9Var, r02<? super ee9> r02Var) {
        return ((tk9) create(ee9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        return this.t;
    }
}
