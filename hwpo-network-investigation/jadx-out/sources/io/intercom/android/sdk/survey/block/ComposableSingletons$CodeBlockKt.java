package io.intercom.android.sdk.survey.block;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.v5a;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CodeBlockKt {
    public static final ComposableSingletons$CodeBlockKt INSTANCE = new ComposableSingletons$CodeBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f292lambda1 = new fr1(false, 1197398742, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Block blockBuild = new Block.Builder().withText("This is some code").withType(BlockType.CODE.getSerializedName()).build();
            blockBuild.getClass();
            CodeBlockKt.CodeBlock(blockBuild, null, null, jt1Var, 0, 6);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f293lambda2 = new fr1(false, 1026238161, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CodeBlockKt.INSTANCE.m430getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m430getLambda1$intercom_sdk_base_release() {
        return f292lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m431getLambda2$intercom_sdk_base_release() {
        return f293lambda2;
    }
}
