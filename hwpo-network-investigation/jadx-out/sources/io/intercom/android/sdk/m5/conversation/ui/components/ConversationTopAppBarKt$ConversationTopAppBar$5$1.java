package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ei4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.oy8;
import defpackage.uh1;
import defpackage.yz9;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationTopAppBarKt$ConversationTopAppBar$5$1 implements ei4<oy8, jt1, Integer, g2b> {
    final /* synthetic */ yz9<uh1> $contentColorState;
    final /* synthetic */ oh4<HeaderMenuItem, g2b> $onMenuClicked;
    final /* synthetic */ TopAppBarUiState $topAppBarUiState;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationTopAppBarKt$ConversationTopAppBar$5$1(TopAppBarUiState topAppBarUiState, oh4<? super HeaderMenuItem, g2b> oh4Var, yz9<uh1> yz9Var, oh4<? super MetricData, g2b> oh4Var2) {
        this.$topAppBarUiState = topAppBarUiState;
        this.$onMenuClicked = oh4Var;
        this.$contentColorState = yz9Var;
        this.$trackMetric = oh4Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(oh4 oh4Var, HeaderMenuItem headerMenuItem) {
        headerMenuItem.getClass();
        oh4Var.invoke(headerMenuItem);
        return g2b.a;
    }

    public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
        oy8Var.getClass();
        if ((i & 17) == 16 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        List<HeaderMenuItem> headerMenuItems = this.$topAppBarUiState.getHeaderMenuItems();
        jt1Var.K(-1166851020);
        boolean zJ = jt1Var.J(this.$onMenuClicked);
        final oh4<HeaderMenuItem, g2b> oh4Var = this.$onMenuClicked;
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return ConversationTopAppBarKt$ConversationTopAppBar$5$1.invoke$lambda$1$lambda$0(oh4Var, (HeaderMenuItem) obj);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationKebabKt.m147ConversationKebabcf5BqRc(headerMenuItems, (oh4) objF, this.$contentColorState.getValue().a, this.$trackMetric, jt1Var, 0, 0);
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
        invoke(oy8Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
