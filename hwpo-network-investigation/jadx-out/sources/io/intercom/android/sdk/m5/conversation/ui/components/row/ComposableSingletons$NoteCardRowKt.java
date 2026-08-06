package io.intercom.android.sdk.m5.conversation.ui.components.row;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$NoteCardRowKt {
    public static final ComposableSingletons$NoteCardRowKt INSTANCE = new ComposableSingletons$NoteCardRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f192lambda1 = new fr1(false, 525193153, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$NoteCardRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Part partBuild = new Part.Builder().withParticipantIsAdmin(false).withBlocks(ws0.i(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).build();
            partBuild.setParticipant(Participant.create(BuildConfig.FLAVOR, "Paul", Participant.USER_TYPE, BuildConfig.FLAVOR, Avatar.create(BuildConfig.FLAVOR, "PK"), Boolean.FALSE));
            NoteCardRowKt.NoteCardRow(null, partBuild, "SDK Test App", jt1Var, 384, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m258getLambda1$intercom_sdk_base_release() {
        return f192lambda1;
    }
}
