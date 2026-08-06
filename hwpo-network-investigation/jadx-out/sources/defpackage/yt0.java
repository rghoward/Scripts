package defpackage;

import android.graphics.drawable.Drawable;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yt0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yt0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ec9.b((String) obj2, (hc9) obj);
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$81$lambda$80((ConversationViewModel) obj2, (AttributeData) obj);
            case 2:
                ((o13) obj2).D = true;
                return g2b.a;
            case 3:
                ((Integer) obj).intValue();
                return obj2;
            default:
                Drawable drawable = (Drawable) obj2;
                d73 d73Var = (d73) obj;
                n41 n41VarA = d73Var.Y0().a();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (d73Var.c() >> 32)), (int) Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)));
                drawable.draw(pl.a(n41VarA));
                return g2b.a;
        }
    }
}
