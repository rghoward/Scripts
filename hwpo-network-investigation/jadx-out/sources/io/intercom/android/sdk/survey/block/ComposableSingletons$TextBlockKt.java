package io.intercom.android.sdk.survey.block;

import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.yi1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.carousel.BlockAlignment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TextBlockKt {
    public static final ComposableSingletons$TextBlockKt INSTANCE = new ComposableSingletons$TextBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f298lambda1 = new fr1(false, -222161121, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-1$1
        private static final Block invoke$lambda$0$buildBlock(String str, String str2) {
            return new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withAlign(str).withText(str2).build();
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
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
            Block blockInvoke$lambda$0$buildBlock = invoke$lambda$0$buildBlock(BlockAlignment.LEFT, "Left");
            blockInvoke$lambda$0$buildBlock.getClass();
            TextBlockKt.TextBlock(ir9.c(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock, null, null, null, null, 30, null), null, null, false, null, jt1Var, 6, 60);
            Block blockInvoke$lambda$0$buildBlock2 = invoke$lambda$0$buildBlock("center", "Center");
            blockInvoke$lambda$0$buildBlock2.getClass();
            TextBlockKt.TextBlock(ir9.c(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock2, null, null, null, null, 30, null), null, null, false, null, jt1Var, 6, 60);
            Block blockInvoke$lambda$0$buildBlock3 = invoke$lambda$0$buildBlock(BlockAlignment.RIGHT, "Right");
            blockInvoke$lambda$0$buildBlock3.getClass();
            TextBlockKt.TextBlock(ir9.c(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock3, null, null, null, null, 30, null), null, null, false, null, jt1Var, 6, 60);
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f299lambda2 = new fr1(false, -895740540, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TextBlockKt.INSTANCE.m436getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m436getLambda1$intercom_sdk_base_release() {
        return f298lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m437getLambda2$intercom_sdk_base_release() {
        return f299lambda2;
    }
}
