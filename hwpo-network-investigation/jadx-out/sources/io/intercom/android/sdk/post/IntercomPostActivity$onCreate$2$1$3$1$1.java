package io.intercom.android.sdk.post;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.ei4;
import defpackage.ft;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.mia;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.u7d;
import defpackage.we1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPostActivity$onCreate$2$1$3$1$1 implements ei4<oy8, jt1, Integer, g2b> {
    final /* synthetic */ Part $part;
    final /* synthetic */ IntercomPostActivity this$0;

    public IntercomPostActivity$onCreate$2$1$3$1$1(Part part, IntercomPostActivity intercomPostActivity) {
        this.$part = part;
        this.this$0 = intercomPostActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$2$lambda$1(Part part, IntercomPostActivity intercomPostActivity, Context context) {
        context.getClass();
        ReactionInputView reactionInputView = new ReactionInputView(context, null);
        reactionInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        reactionInputView.setUpReactions(part.getReactionReply(), true, new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, part.getId(), intercomPostActivity.getConversationId(), intercomPostActivity.getInjector().getApi(), intercomPostActivity.getInjector().getMetricTracker()));
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$4$lambda$3(IntercomPostActivity intercomPostActivity) {
        intercomPostActivity.openConversation();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$6$lambda$5(IntercomPostActivity intercomPostActivity) {
        intercomPostActivity.openConversation();
        return g2b.a;
    }

    public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
        oy8Var.getClass();
        if ((i & 17) == 16 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        boolean zIsNull = ReactionReply.isNull(this.$part.getReactionReply());
        jt1.a.C0187a c0187a = jt1.a.a;
        if (!zIsNull) {
            jt1Var.K(1612520741);
            jt1Var.K(-1056358321);
            boolean zJ = jt1Var.j(this.$part) | jt1Var.j(this.this$0);
            final Part part = this.$part;
            final IntercomPostActivity intercomPostActivity = this.this$0;
            Object objF = jt1Var.f();
            if (zJ || objF == c0187a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.post.b
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return IntercomPostActivity$onCreate$2$1$3$1$1.invoke$lambda$2$lambda$1(part, intercomPostActivity, (Context) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            ft.b((oh4) objF, null, null, jt1Var, 0, 6);
            jt1Var.B();
            return;
        }
        if (!this.this$0.isComposerVisible()) {
            jt1Var.K(1615277292);
            jt1Var.B();
            return;
        }
        jt1Var.K(1614313192);
        jt1Var.K(-1056300820);
        boolean zJ2 = jt1Var.j(this.this$0);
        final IntercomPostActivity intercomPostActivity2 = this.this$0;
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == c0187a) {
            objF2 = new mh4() { // from class: io.intercom.android.sdk.post.c
                @Override // defpackage.mh4
                public final Object invoke() {
                    return IntercomPostActivity$onCreate$2$1$3$1$1.invoke$lambda$4$lambda$3(intercomPostActivity2);
                }
            };
            jt1Var.C(objF2);
        }
        jt1Var.B();
        ox6.a aVar = ox6.a.t;
        ox6 ox6VarC = we1.c(aVar, false, null, (mh4) objF2, 15);
        String string = this.this$0.getString(R.string.intercom_reply_to_conversation);
        string.getClass();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i2 = IntercomTheme.$stable;
        mia.b(string, ox6VarC, u7d.d(4288585374L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04(), jt1Var, 384, 0, 131064);
        jt1Var.K(-1056285812);
        boolean zJ3 = jt1Var.j(this.this$0);
        final IntercomPostActivity intercomPostActivity3 = this.this$0;
        Object objF3 = jt1Var.f();
        if (zJ3 || objF3 == c0187a) {
            objF3 = new mh4() { // from class: io.intercom.android.sdk.post.d
                @Override // defpackage.mh4
                public final Object invoke() {
                    return IntercomPostActivity$onCreate$2$1$3$1$1.invoke$lambda$6$lambda$5(intercomPostActivity3);
                }
            };
            jt1Var.C(objF3);
        }
        jt1Var.B();
        ox6 ox6VarC2 = we1.c(aVar, false, null, (mh4) objF3, 15);
        String string2 = this.this$0.getString(R.string.intercom_send);
        string2.getClass();
        mia.b(string2, ox6VarC2, u7d.d(4288585374L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04(), jt1Var, 384, 0, 131064);
        jt1Var.B();
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
        invoke(oy8Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
