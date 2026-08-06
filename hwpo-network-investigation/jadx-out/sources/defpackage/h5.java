package defpackage;

import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h5 implements g6 {
    public final hy8 a;

    public h5(hy8 hy8Var) {
        hy8Var.getClass();
        this.a = hy8Var;
    }

    @Override // defpackage.g6
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.g6
    public final void b() {
        this.a.d(new rf4(jo9.class.getName(), new g5(), true));
    }

    @Override // defpackage.g6
    public final void c(final yp4 yp4Var) {
        this.a.c(new rf4(nsb.class.getName(), new mb2() { // from class: f5
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                nsb.Companion.getClass();
                nsb nsbVar = new nsb();
                nsbVar.setArguments(uy0.c(new js7("com.hwpo_training_app.your_gym.presentation.YourGymFragment.SELECTED_GYM_KEY", yp4Var)));
                return nsbVar;
            }
        }, true));
    }
}
