package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.presentation.dialog.confirm.ConfirmDialogViewBinder$bind$1", f = "ConfirmDialogViewBinder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ mh4<g2b> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mh4<g2b> mh4Var, r02<? super a> r02Var) {
            super(3, r02Var);
            this.t = mh4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return new a(this.t, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.invoke();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.presentation.dialog.confirm.ConfirmDialogViewBinder$bind$2", f = "ConfirmDialogViewBinder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ mh4<g2b> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mh4<g2b> mh4Var, r02<? super b> r02Var) {
            super(3, r02Var);
            this.t = mh4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return new b(this.t, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.invoke();
            return g2b.a;
        }
    }

    public static void a(Resources resources, Window window, l55.b bVar, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, mh4 mh4Var, mh4 mh4Var2) {
        String str = bVar.v;
        String str2 = bVar.u;
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout((int) (((double) resources.getDisplayMetrics().widthPixels) * 0.72d), -2);
        String str3 = bVar.t;
        materialTextView.setVisibility(str3 != null ? 0 : 8);
        materialTextView.setText(str3);
        materialTextView2.setVisibility(str2 != null ? 0 : 8);
        materialTextView2.setText(str2);
        materialTextView4.setVisibility(str == null ? 8 : 0);
        materialTextView4.setText(str);
        materialTextView3.setText(bVar.w);
        xgb.a(materialTextView4, new a(mh4Var2, null));
        xgb.a(materialTextView3, new b(mh4Var, null));
    }
}
