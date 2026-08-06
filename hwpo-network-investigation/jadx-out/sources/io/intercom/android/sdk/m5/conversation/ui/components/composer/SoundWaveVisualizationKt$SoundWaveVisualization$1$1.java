package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.aa0;
import defpackage.b27;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$1$1", f = "SoundWaveVisualization.kt", l = {}, m = "invokeSuspend")
public final class SoundWaveVisualizationKt$SoundWaveVisualization$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ b27 $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundWaveVisualizationKt$SoundWaveVisualization$1$1(float f, WaveformBuffer waveformBuffer, b27 b27Var, r02<? super SoundWaveVisualizationKt$SoundWaveVisualization$1$1> r02Var) {
        super(2, r02Var);
        this.$elementSpacingPx = f;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = b27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(this.$elementSpacingPx, this.$waveformBuffer, this.$canvasWidth$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        if (this.$canvasWidth$delegate.h() > 0.0f) {
            this.$waveformBuffer.resizeBuffer(SoundWaveVisualizationKt.calculateOptimalBufferSize(this.$canvasWidth$delegate.h(), this.$elementSpacingPx));
        }
        return g2b.a;
    }
}
