package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.xr1;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$GifGridKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$GifGridKt$lambda2$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(Block block) {
        block.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(String str) {
        str.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(1721954272);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new o();
            jt1Var.C(objF);
        }
        oh4 oh4Var = (oh4) objF;
        Object objA = xr1.a(jt1Var, 1721955712);
        if (objA == c0187a) {
            objA = new p();
            jt1Var.C(objA);
        }
        jt1Var.B();
        GifGridKt.GifGrid(null, hf3.t, oh4Var, (oh4) objA, jt1Var, 3504, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
