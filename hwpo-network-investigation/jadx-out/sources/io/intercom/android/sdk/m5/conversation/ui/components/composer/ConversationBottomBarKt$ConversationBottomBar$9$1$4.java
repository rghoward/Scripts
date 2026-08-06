package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import defpackage.bj1;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.jv;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.uh1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBottomBarKt$ConversationBottomBar$9$1$4 implements ei4<jv, jt1, Integer, g2b> {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Context $context;
    final /* synthetic */ mh4<g2b> $onPrivacyNoticeDismissed;
    final /* synthetic */ bj1 $this_Column;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationBottomBarKt$ConversationBottomBar$9$1$4(BottomBarUiState bottomBarUiState, mh4<g2b> mh4Var, bj1 bj1Var, oh4<? super MetricData, g2b> oh4Var, Context context) {
        this.$bottomBarUiState = bottomBarUiState;
        this.$onPrivacyNoticeDismissed = mh4Var;
        this.$this_Column = bj1Var;
        this.$trackMetric = oh4Var;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(oh4 oh4Var, PoweredBy poweredBy, Context context) {
        oh4Var.invoke(MetricData.PoweredByClicked.INSTANCE);
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return g2b.a;
    }

    public final void invoke(jv jvVar, jt1 jt1Var, int i) {
        jvVar.getClass();
        BottomBarUiState.BottomBadgeState bottomBadge = this.$bottomBarUiState.getBottomBadge();
        boolean z = bottomBadge instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState;
        ox6.a aVar = ox6.a.t;
        if (!z) {
            if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) {
                jt1Var.K(-247279460);
                PrivacyPolicyKt.PrivacyPolicy(((BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) this.$bottomBarUiState.getBottomBadge()).getText(), eo7.j(16.0f, 4.0f, aVar), this.$onPrivacyNoticeDismissed, jt1Var, 48, 0);
                jt1Var.B();
                return;
            } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.None) {
                jt1Var.K(-246875499);
                jt1Var.B();
                return;
            } else {
                jt1Var.K(-1254940347);
                jt1Var.B();
                defpackage.u.b();
                return;
            }
        }
        jt1Var.K(-248344341);
        final PoweredBy poweredBy = ((BottomBarUiState.BottomBadgeState.PoweredByBadgeState) this.$bottomBarUiState.getBottomBadge()).getPoweredBy();
        bj1 bj1Var = this.$this_Column;
        final oh4<MetricData, g2b> oh4Var = this.$trackMetric;
        final Context context = this.$context;
        ox6 ox6VarA = bj1Var.a(aVar, di.a.n);
        long j = uh1.j;
        long jM827getMuted0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getText().m827getMuted0d7_KjU();
        String text = poweredBy.getText();
        PoweredBy.PoweredByIconType icon = poweredBy.getIcon();
        jt1Var.K(-809155052);
        boolean zJ = jt1Var.J(oh4Var) | jt1Var.J(poweredBy) | jt1Var.j(context);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.r0
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ConversationBottomBarKt$ConversationBottomBar$9$1$4.invoke$lambda$2$lambda$1$lambda$0(oh4Var, poweredBy, context);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        PoweredByBadgeKt.m88PoweredByBadgewBJOh4Y(text, icon, (mh4) objF, ox6VarA, j, jM827getMuted0d7_KjU, jt1Var, 24576, 0);
        jt1Var.B();
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var, Integer num) {
        invoke(jvVar, jt1Var, num.intValue());
        return g2b.a;
    }
}
