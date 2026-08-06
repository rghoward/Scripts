package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.aa0;
import defpackage.b27;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p27;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$4$1", f = "SoundWaveVisualization.kt", l = {385}, m = "invokeSuspend")
public final class SoundWaveVisualizationKt$SoundWaveVisualization$4$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ p27 $animationFrameCounter$delegate;
    final /* synthetic */ long $animationFrameRateMs;
    final /* synthetic */ float $animationSpeedPxPerMs;
    final /* synthetic */ b27 $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundWaveVisualizationKt$SoundWaveVisualization$4$1(float f, float f2, WaveformBuffer waveformBuffer, long j, b27 b27Var, p27 p27Var, r02<? super SoundWaveVisualizationKt$SoundWaveVisualization$4$1> r02Var) {
        super(2, r02Var);
        this.$elementSpacingPx = f;
        this.$animationSpeedPxPerMs = f2;
        this.$waveformBuffer = waveformBuffer;
        this.$animationFrameRateMs = j;
        this.$canvasWidth$delegate = b27Var;
        this.$animationFrameCounter$delegate = p27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(this.$elementSpacingPx, this.$animationSpeedPxPerMs, this.$waveformBuffer, this.$animationFrameRateMs, this.$canvasWidth$delegate, this.$animationFrameCounter$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$4$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        v72 v72Var;
        int i = this.label;
        if (i != 0 && i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        do {
            if (this.$canvasWidth$delegate.h() > 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.$waveformBuffer.cleanupOldElements(jCurrentTimeMillis, (long) ((this.$canvasWidth$delegate.h() + this.$elementSpacingPx) / this.$animationSpeedPxPerMs));
                this.$animationFrameCounter$delegate.o(jCurrentTimeMillis);
            }
            long j = this.$animationFrameRateMs;
            this.label = 1;
            objB = bw2.b(j, this);
            v72Var = v72.t;
        } while (objB != v72Var);
        return v72Var;
    }
}
