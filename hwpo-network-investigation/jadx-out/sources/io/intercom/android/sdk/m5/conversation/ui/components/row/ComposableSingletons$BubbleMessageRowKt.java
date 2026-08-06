package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.yi1;
import defpackage.zg5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BubbleMessageRowKt {
    public static final ComposableSingletons$BubbleMessageRowKt INSTANCE = new ComposableSingletons$BubbleMessageRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f150lambda1 = new fr1(false, 1770558333, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-1$1
        public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
            oy8Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                mia.b(nr1.f(jt1Var, R.string.intercom_retry), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var, 0, 0, 262142);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            invoke(oy8Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f151lambda2 = new fr1(false, -1805447849, ComposableSingletons$BubbleMessageRowKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f152lambda3 = new fr1(false, 1936538463, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-3$1
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
            Part partBuild = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getAttachmentBlock())).build();
            partBuild.getClass();
            GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
            BubbleMessageRowKt.BubbleMessageRow(partBuild, groupingPosition, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 16.0f));
            Part partBuild2 = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getAttachmentBlock(), BubbleMessageRowKt.getAttachmentBlock(), BubbleMessageRowKt.getAttachmentBlock())).build();
            partBuild2.getClass();
            BubbleMessageRowKt.BubbleMessageRow(partBuild2, groupingPosition, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 16.0f));
            Part partBuild3 = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getVideoBlock(), BubbleMessageRowKt.getAttachmentBlock(), BubbleMessageRowKt.getLongParagraphBlock())).build();
            partBuild3.getClass();
            BubbleMessageRowKt.BubbleMessageRow(partBuild3, groupingPosition, false, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 16.0f));
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f153lambda4 = new fr1(false, -1349597280, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-4$1
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
            Part partBuild = new Part.Builder().withBlocks(ws0.i(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withMetadata(new Metadata("Bot", "AI Agent", 1726738186L, ws0.h(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).build();
            partBuild.getClass();
            GroupingPosition groupingPosition = GroupingPosition.TOP;
            BubbleMessageRowKt.BubbleMessageRow(partBuild, groupingPosition, true, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 2.0f));
            Part partBuild2 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).build();
            partBuild2.getClass();
            BubbleMessageRowKt.BubbleMessageRow(partBuild2, GroupingPosition.MIDDLE, true, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 2.0f));
            Part partBuild3 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getLongParagraphBlock())).build();
            partBuild3.getClass();
            GroupingPosition groupingPosition2 = GroupingPosition.BOTTOM;
            BubbleMessageRowKt.BubbleMessageRow(partBuild3, groupingPosition2, true, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 16.0f));
            Part partBuild4 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getParagraphBlock())).withMetadata(new Metadata("Bob", null, 1726738186L, ws0.h(new Avatar.Builder().withInitials("SK")), 2, null)).build();
            partBuild4.getClass();
            BubbleMessageRowKt.BubbleMessageRow(partBuild4, groupingPosition, true, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 2.0f));
            Part partBuild5 = new Part.Builder().withBlocks(ws0.h(BubbleMessageRowKt.getImageBlock())).withMetadata(new Metadata("Bob", null, 1726738186L, ws0.h(new Avatar.Builder().withInitials("SK")), 2, null)).build();
            partBuild5.getClass();
            BubbleMessageRowKt.BubbleMessageRow(partBuild5, groupingPosition2, true, null, null, null, null, null, null, null, null, null, jt1Var, 432, 0, 4088);
            b47.b(jt1Var, ir9.d(aVar2, 16.0f));
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m216getLambda1$intercom_sdk_base_release() {
        return f150lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m217getLambda2$intercom_sdk_base_release() {
        return f151lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m218getLambda3$intercom_sdk_base_release() {
        return f152lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m219getLambda4$intercom_sdk_base_release() {
        return f153lambda4;
    }
}
