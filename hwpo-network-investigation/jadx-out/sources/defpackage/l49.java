package defpackage;

import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.ScheduleNetworkEntity;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l49 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ l49(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                ScheduleNetworkEntity.Companion companion = ScheduleNetworkEntity.Companion;
                return new m30(ProgramSectionNetworkEntity$$serializer.INSTANCE);
            default:
                return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$1$lambda$0();
        }
    }
}
