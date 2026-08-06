package defpackage;

import com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt2 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ lt2(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return Float.valueOf(1.0f);
            default:
                return lo.b("com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity", NotificationTypeNetworkEntity.values(), new String[]{"client_leaderboard_new_comment", "client_leaderboard_chat_mention", "client_bonus_plan_remind"}, new Annotation[][]{null, null, null});
        }
    }
}
