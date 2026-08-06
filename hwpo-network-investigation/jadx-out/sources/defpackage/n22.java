package defpackage;

import android.content.Context;
import io.intercom.android.sdk.blocks.ConversationRatingCard;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n22 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ n22(int i, Object obj, Object obj2) {
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
                return ((ConversationRatingCard) obj2).lambda$createConversationRatingBlock$0((Context) obj);
            default:
                hn9 hn9Var = (hn9) obj2;
                t72 t72Var = (t72) obj;
                if (hn9Var.d.d.invoke(in9.v).booleanValue()) {
                    oy0.d(t72Var, null, null, new yw6(hn9Var, null), 3);
                }
                return Boolean.TRUE;
        }
    }
}
