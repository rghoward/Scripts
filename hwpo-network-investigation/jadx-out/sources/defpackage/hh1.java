package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh1 implements mh4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ hh1(oh4 oh4Var, h37 h37Var) {
        this.v = h37Var;
        this.u = oh4Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        oh4 oh4Var = this.u;
        Object obj = this.v;
        switch (i) {
            case 0:
                return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(oh4Var, (CollectionRowData) obj);
            default:
                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$11$lambda$10((h37) obj, oh4Var);
        }
    }

    public /* synthetic */ hh1(oh4 oh4Var, CollectionRowData collectionRowData) {
        this.u = oh4Var;
        this.v = collectionRowData;
    }
}
