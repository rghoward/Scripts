package defpackage;

import androidx.fragment.app.l;
import com.hwpo_training_app.R;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ pb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return rb3.q((rb3) obj);
            case 1:
                HostActivity hostActivity = (HostActivity) obj;
                ho5<Object>[] ho5VarArr = HostActivity.K;
                l supportFragmentManager = hostActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                return new n20(hostActivity, R.id.rootContainer, supportFragmentManager);
            default:
                vo6 vo6Var = (vo6) obj;
                vo6.a aVar = vo6.Companion;
                return new b70(new vo6.c(1, vo6Var.w(), ip6.class, "onAttachmentItemClicked", "onAttachmentItemClicked(Lcom/hwpo_training_app/hwpo_library/presentation/entity/AttachmentUiEntity;)V", 0), new vo6.d(1, vo6Var.w(), ip6.class, "onItemShown", "onItemShown(I)V", 0));
        }
    }
}
