package defpackage;

import android.content.Context;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment;
import io.intercom.android.sdk.identity.AppConfigStore;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q00 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ q00(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return AppConfigStore.appConfigDataStore_delegate$lambda$0((Context) obj);
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new vs2(iIntValue, ((Float) obj3).floatValue(), new r00(1, list));
            case 2:
                ec9.e((hc9) obj, 0);
                return g2b.a;
            case 3:
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                ((sk1) obj).getClass();
                return g2b.a;
            default:
                ((Long) obj).longValue();
                return g2b.a;
        }
    }
}
