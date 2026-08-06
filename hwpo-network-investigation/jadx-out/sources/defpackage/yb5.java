package defpackage;

import android.content.Context;
import com.hwpo_training_app.R;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;
import io.intercom.android.sdk.api.WrapperPrefsStore$Companion$createSharedPrefsMigration$1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yb5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yb5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return Float.valueOf(o6a.h(((t72) obj).getCoroutineContext()));
            case 1:
                return (hw5) ((mh4) ((h37) obj).getValue()).invoke();
            case 2:
                final ScoreInfoExpandableLayout scoreInfoExpandableLayout = (ScoreInfoExpandableLayout) obj;
                int i2 = ScoreInfoExpandableLayout.N;
                return new jw3(new oh4() { // from class: o59
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        l89 l89Var = (l89) obj2;
                        int i3 = ScoreInfoExpandableLayout.N;
                        l89Var.getClass();
                        oh4<? super l89, g2b> oh4Var = scoreInfoExpandableLayout.J;
                        if (oh4Var != null) {
                            oh4Var.invoke(l89Var);
                        }
                        return g2b.a;
                    }
                }, R.color.performanceAttachmentsBackground);
            default:
                return WrapperPrefsStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0((Context) obj);
        }
    }
}
