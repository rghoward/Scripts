package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.e96;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.qq2;
import defpackage.ws0;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LazyMessageListKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$LazyMessageListKt$lambda2$1 INSTANCE = new ComposableSingletons$LazyMessageListKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1(ReplyOption replyOption) {
        replyOption.getClass();
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        e96 e96VarF = ws0.f();
        e96VarF.add(new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have"));
        e96VarF.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        partBuild.getClass();
        ContentRow.BubbleMessageRow.PartWrapper partWrapper = new ContentRow.BubbleMessageRow.PartWrapper(partBuild, false, true, null, null, 24, null);
        GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
        e96VarF.add(new ContentRow.BubbleMessageRow(partWrapper, groupingPosition, null, false, false, 16, null));
        e96VarF.add(new ContentRow.DayDividerRow(164138400L));
        Part partBuild2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        partBuild2.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        PendingMessage.FailedMediaUploadData failedMediaUploadData = null;
        boolean z = false;
        boolean z2 = false;
        e96VarF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild2, false, true, objArr, null, 24, null), GroupingPosition.TOP, failedMediaUploadData, z, z2, 16, null));
        Part partBuild3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.h(BubbleMessageRowKt.getArticleBlock())).build();
        partBuild3.getClass();
        PendingMessage.FailedMediaUploadData failedMediaUploadData2 = null;
        boolean z3 = false;
        boolean z4 = false;
        e96VarF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild3, z, true, null, 0 == true ? 1 : 0, 24, null), GroupingPosition.MIDDLE, failedMediaUploadData2, z3, z4, 16, null));
        Part partBuild4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.h(BubbleMessageRowKt.getCreateTicketBlock())).build();
        partBuild4.getClass();
        qq2 qq2Var = null;
        PendingMessage.FailedMediaUploadData failedMediaUploadData3 = null;
        boolean z5 = false;
        boolean z6 = false;
        e96VarF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild4, z3, true, null, 0 == true ? 1 : 0, 24, null), GroupingPosition.BOTTOM, failedMediaUploadData3, z5, z6, 16, qq2Var));
        Part partBuild5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).build();
        partBuild5.getClass();
        boolean z7 = false;
        PendingMessage.FailedMediaUploadData failedMediaUploadData4 = null;
        boolean z8 = true;
        e96VarF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild5, z7, false, null, null, 24, qq2Var), groupingPosition, failedMediaUploadData4, z8, z7, 16, 0 == true ? 1 : 0));
        e96 e96VarE = ws0.e(e96VarF);
        jt1Var.K(2011044025);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new b();
            jt1Var.C(objF);
        }
        jt1Var.B();
        LazyMessageListKt.LazyMessageList(null, e96VarE, null, null, (oh4) objF, null, null, null, null, null, false, null, false, null, false, null, jt1Var, 24576, 0, 65517);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
