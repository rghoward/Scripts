package defpackage;

import android.os.Bundle;
import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tr9 extends hk0 {
    public final vg4 v;
    public static final /* synthetic */ ho5<Object>[] w = {new ne8(tr9.class, "binding", "getBinding()Lcom/hwpo_training_app/onboarding/databinding/FragmentOnboardingTutorialSlideBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<tr9, hf4> {
        @Override // defpackage.oh4
        public final hf4 invoke(tr9 tr9Var) {
            tr9 tr9Var2 = tr9Var;
            tr9Var2.getClass();
            return hf4.bind(tr9Var2.requireView());
        }
    }

    public tr9() {
        super(R.layout.fragment_onboarding_tutorial_slide);
        this.v = new vg4(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ho5<?>[] ho5VarArr = w;
            ho5<?> ho5Var = ho5VarArr[0];
            vg4 vg4Var = this.v;
            ((hf4) vg4Var.a(this, ho5Var)).c.setImageResource(arguments.getInt("com.getsjitdone.james.ui.onboarding.slides.DRAWABLE_ARG"));
            ((hf4) vg4Var.a(this, ho5VarArr[0])).d.setText(arguments.getCharSequence("com.getsjitdone.james.ui.onboarding.slides.TITLE_ARG"));
            ((hf4) vg4Var.a(this, ho5VarArr[0])).b.setText(getString(arguments.getInt("com.getsjitdone.james.ui.onboarding.slides.SUBTITLE_ARG")));
        }
    }
}
