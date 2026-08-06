package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp2 implements gb6.a, pg7 {
    public final /* synthetic */ Object t;

    @Override // defpackage.pg7
    public umb b(View view, umb umbVar) {
        View currentFocus;
        HostActivity hostActivity = (HostActivity) this.t;
        ho5<Object>[] ho5VarArr = HostActivity.K;
        view.getClass();
        umb.q qVar = umbVar.a;
        int i = qVar.i(1).b;
        FrameLayout frameLayout = hostActivity.w().e;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), i, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        if (!qVar.u(8) && (currentFocus = hostActivity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        return umbVar;
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        tfb tfbVar = (tfb) this.t;
        ((aj) obj).b(tfbVar);
        int i = tfbVar.a;
    }

    public /* synthetic */ kp2(HostActivity hostActivity) {
        this.t = hostActivity;
    }
}
