package io.intercom.android.sdk.survey.block;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AttachmentBlockKt {
    public static final ComposableSingletons$AttachmentBlockKt INSTANCE = new ComposableSingletons$AttachmentBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f291lambda1 = new fr1(false, -27709551, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$AttachmentBlockKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Block blockBuild = new Block.Builder().withAttachments(ws0.h(BlockAttachment.Companion.create$default(BlockAttachment.Companion, "Attachment Name.type", null, null, null, 0L, 0L, 62, null))).build();
            blockBuild.getClass();
            AttachmentBlockKt.AttachmentBlock(null, new BlockRenderData(blockBuild, null, null, null, null, 30, null), false, jt1Var, 384, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m429getLambda1$intercom_sdk_base_release() {
        return f291lambda1;
    }
}
