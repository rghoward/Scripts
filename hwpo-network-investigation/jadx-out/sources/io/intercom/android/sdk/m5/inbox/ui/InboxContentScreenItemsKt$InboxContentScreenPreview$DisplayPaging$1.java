package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.a06;
import defpackage.bz5;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ys5;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements ci4<jt1, Integer, g2b> {
    final /* synthetic */ a06<Conversation> $lazyPagingItems;

    public InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(a06<Conversation> a06Var) {
        this.$lazyPagingItems = a06Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1(a06 a06Var, bz5 bz5Var) {
        bz5Var.getClass();
        InboxContentScreenItemsKt.inboxContentScreenItems$default(bz5Var, a06Var, null, new g(), 2, null);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(Conversation conversation) {
        conversation.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(-614447302);
        boolean zJ = jt1Var.j(this.$lazyPagingItems);
        final a06<Conversation> a06Var = this.$lazyPagingItems;
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new oh4() { // from class: io.intercom.android.sdk.m5.inbox.ui.f
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$2$lambda$1(a06Var, (bz5) obj);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        ys5.a(null, null, null, null, null, null, false, null, (oh4) objF, jt1Var, 0, 511);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
