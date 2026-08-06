package defpackage;

import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListEvents;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f60 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ f60(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                AthletesListViewModel athletesListViewModel = (AthletesListViewModel) obj2;
                cm3 cm3Var = athletesListViewModel.D;
                Exception exc = (Exception) obj;
                rma.a.b(exc);
                int iOrdinal = ((ec6) obj3).ordinal();
                if (iOrdinal == 0) {
                    AthletesListViewModel.Action.FinishLoading finishLoading = AthletesListViewModel.Action.FinishLoading.a;
                    AthletesListViewModel.Companion companion = AthletesListViewModel.Companion;
                    athletesListViewModel.e(finishLoading);
                    athletesListViewModel.e(AthletesListViewModel.Action.ShowErrorPlaceHolder.a);
                } else if (iOrdinal == 1) {
                    AthletesListViewModel.Action.FinishLoading finishLoading2 = AthletesListViewModel.Action.FinishLoading.a;
                    AthletesListViewModel.Companion companion2 = AthletesListViewModel.Companion;
                    athletesListViewModel.e(finishLoading2);
                    athletesListViewModel.f(new AthletesListEvents.ShowError(cm3Var.a(exc)));
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    AthletesListEvents.StopRefreshing stopRefreshing = AthletesListEvents.StopRefreshing.b;
                    AthletesListViewModel.Companion companion3 = AthletesListViewModel.Companion;
                    athletesListViewModel.f(stopRefreshing);
                    athletesListViewModel.f(new AthletesListEvents.ShowError(cm3Var.a(exc)));
                }
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$58$lambda$57((eh6) obj3, (h37) obj2, (Block) obj);
            default:
                return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12((List) obj3, (List) obj2, (bz5) obj);
        }
    }
}
