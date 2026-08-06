package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy9 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ cy9(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                View viewInflate = View.inflate(((dy9.b) obj).a, R.layout.splash_screen_view, null);
                viewInflate.getClass();
                return (ViewGroup) viewInflate;
            default:
                gga ggaVar = (gga) obj;
                return Boolean.valueOf(ggaVar.a.h() < ggaVar.b.h());
        }
    }
}
