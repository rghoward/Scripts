package io.intercom.android.sdk.tickets.create.ui;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ox6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.BlockRenderData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketCardKt {
    public static final ComposableSingletons$CreateTicketCardKt INSTANCE = new ComposableSingletons$CreateTicketCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f361lambda1 = new fr1(false, -1627499370, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarC = ir9.c(ox6.a.t, 1.0f);
            Block block = CreateTicketCardKt.sampleBlock;
            block.getClass();
            CreateTicketCardKt.CreateTicketCard(ox6VarC, new BlockRenderData(block, null, null, null, null, 30, null), true, null, jt1Var, 390, 8);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f362lambda2 = new fr1(false, -1398017791, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarC = ir9.c(ox6.a.t, 1.0f);
            Block block = CreateTicketCardKt.sampleBlock;
            block.getClass();
            CreateTicketCardKt.CreateTicketCard(ox6VarC, new BlockRenderData(block, null, null, null, null, 30, null), false, null, jt1Var, 390, 8);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m532getLambda1$intercom_sdk_base_release() {
        return f361lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m533getLambda2$intercom_sdk_base_release() {
        return f362lambda2;
    }
}
