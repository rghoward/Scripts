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
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$3$1", f = "SoundWaveVisualization.kt", l = {367}, m = "invokeSuspend")
public final class SoundWaveVisualizationKt$SoundWaveVisualization$3$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ b27 $canvasWidth$delegate;
    final /* synthetic */ long $elementGenerationIntervalMs;
    final /* synthetic */ p27 $lastElementGenerationTime$delegate;
    final /* synthetic */ b27 $smoothedAmplitude$delegate;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundWaveVisualizationKt$SoundWaveVisualization$3$1(long j, WaveformBuffer waveformBuffer, b27 b27Var, p27 p27Var, b27 b27Var2, r02<? super SoundWaveVisualizationKt$SoundWaveVisualization$3$1> r02Var) {
        super(2, r02Var);
        this.$elementGenerationIntervalMs = j;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = b27Var;
        this.$lastElementGenerationTime$delegate = p27Var;
        this.$smoothedAmplitude$delegate = b27Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(this.$elementGenerationIntervalMs, this.$waveformBuffer, this.$canvasWidth$delegate, this.$lastElementGenerationTime$delegate, this.$smoothedAmplitude$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$3$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.$canvasWidth$delegate.h() > 0.0f && (this.$lastElementGenerationTime$delegate.b() == 0 || jCurrentTimeMillis - this.$lastElementGenerationTime$delegate.b() >= this.$elementGenerationIntervalMs)) {
                this.$waveformBuffer.addElement(new WaveformElement(0.0f, SoundWaveVisualizationKt.scaleAmplitudeForVisualization(this.$smoothedAmplitude$delegate.h()), jCurrentTimeMillis));
                this.$lastElementGenerationTime$delegate.o(jCurrentTimeMillis);
            }
            long j = this.$elementGenerationIntervalMs;
            this.label = 1;
            objB = bw2.b(j, this);
            v72Var = v72.t;
        } while (objB != v72Var);
        return v72Var;
    }
}
