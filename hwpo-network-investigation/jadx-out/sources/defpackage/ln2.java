package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = n6b.a;
        Locale locale = Locale.US;
        StringBuilder sbB = u43.b("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=", i, i2);
        p23.a(sbB, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        p23.a(sbB, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        p23.a(sbB, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        p23.a(sbB, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbB.append(j);
        sbB.append("\n videoFrameProcessingOffsetCount=");
        sbB.append(i11);
        sbB.append("\n}");
        return sbB.toString();
    }
}
