package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.presentation.dialog.photopicker.PickPhotoBottomSheetDialog$initListeners$1$4", f = "PickPhotoBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vy7 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ xy7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy7(xy7 xy7Var, r02<? super vy7> r02Var) {
        super(3, r02Var);
        this.t = xy7Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new vy7(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        xy7 xy7Var = this.t;
        xy7Var.N.invoke();
        xy7Var.i();
        return g2b.a;
    }
}
