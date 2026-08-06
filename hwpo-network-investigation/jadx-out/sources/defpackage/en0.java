package defpackage;

import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ en0(int i, Object obj, Object obj2) {
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
                oy0.d((t72) obj3, null, null, new nn0((v94) obj, (fra) obj2, null), 3);
                return g2b.a;
            default:
                return MessageComposerKt.MessageComposer$lambda$66$lambda$47$lambda$46((eh6) obj3, (ComposerState.TextInput) obj2, ((Integer) obj).intValue());
        }
    }
}
