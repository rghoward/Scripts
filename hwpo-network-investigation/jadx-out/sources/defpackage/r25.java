package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$onTokenLoadingFinished$1", f = "HostActivityViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class r25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ String u;
    public final /* synthetic */ e25 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ id7 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ki7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((li7) this.receiver).b();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements ci4<String, Boolean, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(String str, Boolean bool) {
            String str2 = str;
            boolean zBooleanValue = bool.booleanValue();
            str2.getClass();
            e25 e25Var = (e25) this.receiver;
            int i = e25.T;
            e25Var.getClass();
            oy0.d(rhb.b(e25Var), null, null, new l25(e25Var, str2, zBooleanValue, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((o52) this.receiver).c();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((o52) this.receiver).b();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((o52) this.receiver).a();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r25(String str, e25 e25Var, String str2, id7 id7Var, boolean z, ki7 ki7Var, r02<? super r25> r02Var) {
        super(2, r02Var);
        this.u = str;
        this.v = e25Var;
        this.w = str2;
        this.x = id7Var;
        this.y = z;
        this.z = ki7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new r25(this.u, this.v, this.w, this.x, this.y, this.z, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((r25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009b  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        int i = this.t;
        h5b h5bVar = null;
        e25 e25Var = this.v;
        if (i == 0) {
            dv8.b(obj);
            if (this.u != null) {
                uk4 uk4Var = e25Var.J;
                g2b g2bVar = g2b.a;
                this.t = 1;
                uk4Var.getClass();
                objB = g5b.b(uk4Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            }
            c87 c87Var = e25Var.x;
            o52 o52Var = e25Var.z;
            a aVar = new a(0, e25Var.y, li7.class, "goToSignIn", "goToSignIn()V", 0);
            b bVar = new b(2, e25Var, e25.class, "navigateToNeededNotificationScreen", "navigateToNeededNotificationScreen(Ljava/lang/String;Z)V", 0);
            c cVar = new c(0, o52Var, o52.class, "goToMainTabs", "goToMainTabs()V", 0);
            d dVar = new d(0, o52Var, o52.class, "goToOnboardingSettingsFirstScreen", "goToOnboardingSettingsFirstScreen()V", 0);
            e eVar = new e(0, o52Var, o52.class, "goToOnboardingSettingsSecondScreen", "goToOnboardingSettingsSecondScreen()V", 0);
            h5b h5bVar2 = h5bVar;
            c87Var.a(this.u, h5bVar2, this.w, this.x, this.y, this.z, aVar, bVar, cVar, dVar, eVar);
            if (e25Var.R == xz7.u) {
                e25Var.f(c25.b);
            }
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        objB = obj;
        h5bVar = (h5b) yd3.e((xd3) objB, null);
        c87 c87Var2 = e25Var.x;
        o52 o52Var2 = e25Var.z;
        a aVar2 = new a(0, e25Var.y, li7.class, "goToSignIn", "goToSignIn()V", 0);
        b bVar2 = new b(2, e25Var, e25.class, "navigateToNeededNotificationScreen", "navigateToNeededNotificationScreen(Ljava/lang/String;Z)V", 0);
        c cVar2 = new c(0, o52Var2, o52.class, "goToMainTabs", "goToMainTabs()V", 0);
        d dVar2 = new d(0, o52Var2, o52.class, "goToOnboardingSettingsFirstScreen", "goToOnboardingSettingsFirstScreen()V", 0);
        e eVar2 = new e(0, o52Var2, o52.class, "goToOnboardingSettingsSecondScreen", "goToOnboardingSettingsSecondScreen()V", 0);
        h5b h5bVar3 = h5bVar;
        c87Var2.a(this.u, h5bVar3, this.w, this.x, this.y, this.z, aVar2, bVar2, cVar2, dVar2, eVar2);
        if (e25Var.R == xz7.u) {
            e25Var.f(c25.b);
        }
        return g2b.a;
    }
}
