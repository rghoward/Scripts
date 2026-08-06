package defpackage;

import android.view.View;
import android.view.Window;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ xu3(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return FileActionSheetKt.FileActionSheet$lambda$3$lambda$2$lambda$1((Window) obj2, (View) obj);
            default:
                mz6 mz6Var = (mz6) obj;
                ((bj4) obj2).f0(mz6Var.a, mz6Var.g, mz6Var.b);
                return g2b.a;
        }
    }
}
