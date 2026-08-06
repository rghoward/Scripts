package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.yi1;
import defpackage.zg5;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BubbleMessageRowKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda2$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda2$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = gi0.c(ir9.c, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, aj1VarA);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC2);
        ox6.a aVar2 = ox6.a.t;
        b47.b(jt1Var, ir9.d(aVar2, 16.0f));
        Part partBuild = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).build();
        partBuild.getClass();
        GroupingPosition groupingPosition = GroupingPosition.TOP;
        BubbleMessageRowKt.BubbleMessageRow(partBuild, groupingPosition, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
        b47.b(jt1Var, ir9.d(aVar2, 2.0f));
        Part partBuild2 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).build();
        partBuild2.getClass();
        BubbleMessageRowKt.BubbleMessageRow(partBuild2, GroupingPosition.MIDDLE, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
        b47.b(jt1Var, ir9.d(aVar2, 2.0f));
        Part partBuild3 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).build();
        partBuild3.getClass();
        GroupingPosition groupingPosition2 = GroupingPosition.BOTTOM;
        BubbleMessageRowKt.BubbleMessageRow(partBuild3, groupingPosition2, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
        b47.b(jt1Var, ir9.d(aVar2, 16.0f));
        Part partBuild4 = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getImageBlock(), BubbleMessageRowKt.getImageBlock(), BubbleMessageRowKt.getVideoBlock())).build();
        partBuild4.getClass();
        jt1Var.K(-916632466);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new i();
            jt1Var.C(objF);
        }
        jt1Var.B();
        BubbleMessageRowKt.BubbleMessageRow(partBuild4, groupingPosition, false, null, null, null, null, null, null, null, new FailedMessage("Failed to send message", (mh4) objF), null, jt1Var, 432, 0, 3064);
        b47.b(jt1Var, ir9.d(aVar2, 2.0f));
        Part partBuild5 = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getImageBlock(), BubbleMessageRowKt.getVideoBlock())).build();
        partBuild5.getClass();
        BubbleMessageRowKt.BubbleMessageRow(partBuild5, groupingPosition2, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
        b47.b(jt1Var, ir9.d(aVar2, 16.0f));
        Part partBuild6 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getImageBlock())).build();
        partBuild6.getClass();
        BubbleMessageRowKt.BubbleMessageRow(partBuild6, GroupingPosition.STANDALONE, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
        b47.b(jt1Var, ir9.d(aVar2, 16.0f));
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
