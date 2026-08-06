package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ws0;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$QuickRepliesKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$QuickRepliesKt$lambda1$1 INSTANCE = new ComposableSingletons$QuickRepliesKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(QuickReply quickReply) {
        quickReply.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        List listI = ws0.i(new QuickReply("1", "Option 1"), new QuickReply("2", "Option 2"), new QuickReply("3", "Option 3"), new QuickReply("4", "Option 4"), new QuickReply("5", "Option 5"));
        jt1Var.K(2125393874);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new k();
            jt1Var.C(objF);
        }
        jt1Var.B();
        QuickRepliesKt.QuickReplies(listI, (oh4) objF, null, jt1Var, 48, 4);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
