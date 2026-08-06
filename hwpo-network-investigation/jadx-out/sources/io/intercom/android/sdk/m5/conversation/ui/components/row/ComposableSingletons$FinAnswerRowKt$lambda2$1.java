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
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.yi1;
import defpackage.zg5;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinAnswerRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FinAnswerRowKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$FinAnswerRowKt$lambda2$1 INSTANCE = new ComposableSingletons$FinAnswerRowKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(List list) {
        list.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6.a aVar = ox6.a.t;
        ox6 ox6VarC = gi0.c(ir9.c(aVar, 1.0f), zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
        bt1.c.getClass();
        qr5.a aVar2 = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar2);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, aj1VarA);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC2);
        b47.b(jt1Var, ir9.d(aVar, 16.0f));
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(ws0.i(BubbleMessageRowKt.getAnswerBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withMetadata(new Metadata("Bot", "AI Agent", Long.valueOf(System.currentTimeMillis()), ws0.h(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).withSources(ws0.i(new Source("1", "other", "Changing the date of your stay using our mobile app", "http://external.source.com"), new Source("2", "article", "Cancel your booking", "http://intercom.com"))).build();
        partBuild.getClass();
        GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
        jt1Var.K(-413084004);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new j();
            jt1Var.C(objF);
        }
        jt1Var.B();
        FinAnswerRowKt.FinAnswerRow(partBuild, groupingPosition, null, null, (oh4) objF, false, null, jt1Var, 24624, 108);
        b47.b(jt1Var, ir9.d(aVar, 16.0f));
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
