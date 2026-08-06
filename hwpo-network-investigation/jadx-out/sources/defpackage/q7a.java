package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q7a implements an6 {
    public final MediaCodec a;
    public final jf6 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements an6.b {
        public static MediaCodec b(an6.a aVar) throws IOException {
            String str = aVar.a.a;
            Trace.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0041  */
        @Override // an6.b
        public final an6 a(an6.a aVar) throws Throwable {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                Trace.beginSection("configureCodec");
                Surface surface = aVar.d;
                mediaCodecB.configure(aVar.b, surface, aVar.e, (surface == null && aVar.a.h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecB.start();
                Trace.endSection();
                return new q7a(mediaCodecB, aVar.f);
            } catch (IOException e) {
                e = e;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            }
        }
    }

    public q7a(MediaCodec mediaCodec, jf6 jf6Var) {
        this.a = mediaCodec;
        this.b = jf6Var;
        if (Build.VERSION.SDK_INT < 35 || jf6Var == null) {
            return;
        }
        jf6Var.a(mediaCodec);
    }

    @Override // defpackage.an6
    public final void a() {
        jf6 jf6Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && jf6Var != null) {
                jf6Var.c(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // defpackage.an6
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.an6
    public final void c(int i, cc2 cc2Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, cc2Var.i, j, i2);
    }

    @Override // defpackage.an6
    public final void d(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.an6
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.an6
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.an6
    public final MediaFormat h() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.an6
    public final void i() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.an6
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.an6
    public final int k() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.an6
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.an6
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.an6
    public final ByteBuffer n(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.an6
    public final void o(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.an6
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.an6
    public final void q(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.an6
    public final void r(final pn6.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: p7a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                pn6.e eVar2 = eVar;
                Handler handler2 = eVar2.t;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // defpackage.an6
    public final void s(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
