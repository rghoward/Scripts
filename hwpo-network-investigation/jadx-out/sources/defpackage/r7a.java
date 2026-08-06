package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r7a implements cn6 {
    public final MediaCodec a;

    public r7a(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // defpackage.cn6
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.cn6
    public final void c(int i, cc2 cc2Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, cc2Var.i, j, i2);
    }

    @Override // defpackage.cn6
    public final void d(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.cn6
    public final void a() {
    }

    @Override // defpackage.cn6
    public final void flush() {
    }

    @Override // defpackage.cn6
    public final void shutdown() {
    }

    @Override // defpackage.cn6
    public final void start() {
    }
}
