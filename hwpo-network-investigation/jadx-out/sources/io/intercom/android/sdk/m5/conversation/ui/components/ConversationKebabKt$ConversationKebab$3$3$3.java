package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.bj1;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.h37;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationKebabKt$ConversationKebab$3$3$3 implements ei4<bj1, jt1, Integer, g2b> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ h37<Boolean> $isExpanded;
    final /* synthetic */ oh4<HeaderMenuItem, g2b> $onMenuClicked;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, oh4<? super HeaderMenuItem, g2b> oh4Var, oh4<? super MetricData, g2b> oh4Var2, long j, h37<Boolean> h37Var) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = oh4Var;
        this.$trackMetric = oh4Var2;
        this.$contentColor = j;
        this.$isExpanded = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(h37 h37Var, oh4 oh4Var, HeaderMenuItem headerMenuItem, oh4 oh4Var2) {
        h37Var.setValue(Boolean.FALSE);
        oh4Var.invoke(headerMenuItem);
        oh4Var2.invoke(ConversationKebabKt.metricData(headerMenuItem, true));
        return g2b.a;
    }

    public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
        jt1 jt1Var2 = jt1Var;
        bj1Var.getClass();
        if ((i & 17) == 16 && jt1Var2.r()) {
            jt1Var2.u();
            return;
        }
        List<HeaderMenuItem> list = this.$headerMenuItems;
        final oh4<HeaderMenuItem, g2b> oh4Var = this.$onMenuClicked;
        final oh4<MetricData, g2b> oh4Var2 = this.$trackMetric;
        long j = this.$contentColor;
        final h37<Boolean> h37Var = this.$isExpanded;
        for (final HeaderMenuItem headerMenuItem : list) {
            String text = headerMenuItem.getLabel().getText(jt1Var2, StringProvider.$stable);
            int iIcon = ConversationKebabKt.icon(headerMenuItem);
            String strBadgeText = ConversationKebabKt.badgeText(headerMenuItem);
            boolean zShouldShowUnreadDot = ConversationKebabKt.shouldShowUnreadDot(headerMenuItem);
            boolean enabled = headerMenuItem.getEnabled();
            jt1Var2.K(1730714714);
            boolean zJ = jt1Var2.J(oh4Var) | jt1Var2.J(headerMenuItem) | jt1Var2.J(oh4Var2);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationKebabKt$ConversationKebab$3$3$3.invoke$lambda$2$lambda$1$lambda$0(h37Var, oh4Var, headerMenuItem, oh4Var2);
                    }
                };
                jt1Var2.C(objF);
            }
            jt1Var2.B();
            HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text, enabled, iIcon, null, strBadgeText, true, zShouldShowUnreadDot, true, (mh4) objF, j, jt1Var2, 12779520, 8);
            jt1Var2 = jt1Var;
            h37Var = h37Var;
        }
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
        invoke(bj1Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
