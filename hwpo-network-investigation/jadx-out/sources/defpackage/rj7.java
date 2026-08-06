package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rj7 extends dl0<tj7, ij7> {
    public static final /* synthetic */ int F = 0;
    public final t72 A;
    public final bu8 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final b87 x;
    public final li7 y;
    public final he1 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.presentation.OnboardingSettingsSecondPageViewModel$onCleared$1", f = "OnboardingSettingsSecondPageViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rj7.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                he1 he1Var = rj7.this.z;
                g2b g2bVar = g2b.a;
                this.t = 1;
                he1Var.getClass();
                Object objB = g5b.b(he1Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj7(b87 b87Var, li7 li7Var, gf7 gf7Var, he1 he1Var, t72 t72Var, bu8 bu8Var) {
        super(tj7.c);
        b87Var.getClass();
        li7Var.getClass();
        gf7Var.getClass();
        he1Var.getClass();
        t72Var.getClass();
        bu8Var.getClass();
        tj7.Companion.getClass();
        this.x = b87Var;
        this.y = li7Var;
        this.z = he1Var;
        this.A = t72Var;
        this.B = bu8Var;
        int i = 1;
        this.C = oh7.a(this.u, new ti2(i));
        this.D = oh7.a(this.u, new af6(i));
        this.E = oh7.a(this.u, new pj7());
        yk2.o(new k74(gf7Var.b(g2b.a), new qj7(this, null)), rhb.b(this));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (!(bl0Var instanceof ij7.a)) {
            return b();
        }
        b();
        ArrayList arrayList = ((ij7.a) bl0Var).a;
        return new tj7(arrayList, !arrayList.isEmpty());
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        oy0.d(this.A, null, null, new a(null), 3);
        super.onCleared();
    }
}
