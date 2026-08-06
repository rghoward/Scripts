package io.intercom.android.sdk.ui.component;

import defpackage.aa0;
import defpackage.bw;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.qt;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.xv;
import defpackage.xya;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1$1", f = "PulsatingBox.kt", l = {36}, m = "invokeSuspend")
public final class PulsatingBoxKt$PulsatingBox$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ qt<Float, bw> $animatedScale;
    final /* synthetic */ float $pulseSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulsatingBoxKt$PulsatingBox$1$1(qt<Float, bw> qtVar, float f, r02<? super PulsatingBoxKt$PulsatingBox$1$1> r02Var) {
        super(2, r02Var);
        this.$animatedScale = qtVar;
        this.$pulseSize = f;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new PulsatingBoxKt$PulsatingBox$1$1(this.$animatedScale, this.$pulseSize, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((PulsatingBoxKt$PulsatingBox$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            qt<Float, bw> qtVar = this.$animatedScale;
            Float f = new Float(this.$pulseSize);
            xya xyaVarC = xv.c(100, 0, null, 6);
            this.label = 1;
            Object objC = qt.c(qtVar, f, xyaVarC, null, this, 12);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
