package defpackage;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v22 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ v22(int i, int i2, Object obj, Object obj2) {
        this.t = i2;
        this.v = obj;
        this.u = i;
        this.w = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.w;
        int i2 = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$65$lambda$64((ConversationViewModel) obj3, i2, (Context) obj2, (List) obj);
            default:
                r69 r69Var = (r69) obj3;
                jz7 jz7Var = (jz7) obj2;
                jz7.a aVar = (jz7.a) obj;
                int iK = r69Var.H.a.k();
                if (iK < 0) {
                    iK = 0;
                }
                if (iK <= i2) {
                    i2 = iK;
                }
                int i3 = -i2;
                boolean z = r69Var.I;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                aVar.t = true;
                jz7.a.v(aVar, jz7Var, i4, i3);
                g2b g2bVar = g2b.a;
                aVar.t = false;
                return g2b.a;
        }
    }
}
