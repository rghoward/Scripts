package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends zj0 {
    public final vg4 K = new vg4(new b());
    public mh4<g2b> L = new oj1();
    public mh4<g2b> M = new pj1();
    public static final /* synthetic */ ho5<Object>[] N = {new ne8(qj1.class, "binding", "getBinding()Lcom/hwpo_training_app/chat/databinding/DialogCommentActionsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<qj1, kz2> {
        @Override // defpackage.oh4
        public final kz2 invoke(qj1 qj1Var) {
            qj1 qj1Var2 = qj1Var;
            qj1Var2.getClass();
            return kz2.bind(qj1Var2.requireView());
        }
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("com.hwpo_training_app.comments.presentation.dialog.CommentActionsDialogFragment.ARG_IS_DELETE_VISIBLE") : false;
        Bundle arguments2 = getArguments();
        boolean z2 = arguments2 != null ? arguments2.getBoolean("com.hwpo_training_app.comments.presentation.dialog.CommentActionsDialogFragment.ARG_IS_REPORT_VISIBLE") : false;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_comment_actions, viewGroup);
        View viewFindViewById = viewInflate.findViewById(R.id.textActionDelete);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(z ? 0 : 8);
        View viewFindViewById2 = viewInflate.findViewById(R.id.textActionReport);
        viewFindViewById2.getClass();
        viewFindViewById2.setVisibility(z2 ? 0 : 8);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        T tA = this.K.a(this, N[0]);
        tA.getClass();
        kz2 kz2Var = (kz2) tA;
        xgb.a(kz2Var.c, new rj1(this, null));
        xgb.a(kz2Var.d, new sj1(this, null));
        xgb.a(kz2Var.b, new tj1(this, null));
    }
}
