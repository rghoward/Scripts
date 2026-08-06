package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements an6 {
    public final MediaCodec a;
    public final w50 b;
    public final cn6 c;
    public final jf6 d;
    public boolean e;
    public int f = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements an6.b {
        public final s50 a;
        public final t50 b;
        public boolean c = true;

        public a(s50 s50Var, t50 t50Var) {
            this.a = s50Var;
            this.b = t50Var;
        }

        @Override // an6.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u50 a(an6.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            cn6 v50Var;
            int i;
            String str = aVar.a.a;
            u50 u50Var = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (!this.c || Build.VERSION.SDK_INT < 36) {
                        v50Var = new v50(mediaCodecCreateByCodecName, (HandlerThread) this.b.get());
                        i = 0;
                    } else {
                        v50Var = new r7a(mediaCodecCreateByCodecName);
                        i = 4;
                    }
                    u50 u50Var2 = new u50(mediaCodecCreateByCodecName, (HandlerThread) this.a.get(), v50Var, aVar.f);
                    try {
                        Trace.endSection();
                        Surface surface = aVar.d;
                        if (surface == null && aVar.a.h && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        u50.t(u50Var2, aVar.b, surface, aVar.e, i);
                        return u50Var2;
                    } catch (Exception e) {
                        e = e;
                        u50Var = u50Var2;
                        if (u50Var != null) {
                            u50Var.a();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public u50(MediaCodec mediaCodec, HandlerThread handlerThread, cn6 cn6Var, jf6 jf6Var) {
        this.a = mediaCodec;
        this.b = new w50(handlerThread);
        this.c = cn6Var;
        this.d = jf6Var;
    }

    public static void t(u50 u50Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        jf6 jf6Var;
        w50 w50Var = u50Var.b;
        MediaCodec mediaCodec = u50Var.a;
        HandlerThread handlerThread = w50Var.b;
        xl7.r(w50Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(w50Var, handler);
        w50Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        u50Var.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jf6Var = u50Var.d) != null) {
            jf6Var.a(mediaCodec);
        }
        u50Var.f = 1;
    }

    public static String u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.an6
    public final void a() {
        jf6 jf6Var;
        jf6 jf6Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                w50 w50Var = this.b;
                synchronized (w50Var.a) {
                    w50Var.m = true;
                    w50Var.b.quit();
                    w50Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (jf6Var2 = this.d) != null) {
                    jf6Var2.c(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (jf6Var = this.d) != null) {
                        jf6Var.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }

    @Override // defpackage.an6
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.an6
    public final void c(int i, cc2 cc2Var, long j, int i2) {
        this.c.c(i, cc2Var, j, i2);
    }

    @Override // defpackage.an6
    public final void d(int i, int i2, int i3, long j) {
        this.c.d(i, i2, i3, j);
    }

    @Override // defpackage.an6
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.an6
    public final boolean f(in6.c cVar) {
        w50 w50Var = this.b;
        synchronized (w50Var.a) {
            w50Var.o = cVar;
        }
        return true;
    }

    @Override // defpackage.an6
    public final void flush() {
        this.c.flush();
        this.a.flush();
        w50 w50Var = this.b;
        synchronized (w50Var.a) {
            w50Var.l++;
            Handler handler = w50Var.c;
            String str = n6b.a;
            handler.post(new an(1, w50Var));
        }
        this.a.start();
    }

    @Override // defpackage.an6
    public final void g(hn6 hn6Var) {
        w50 w50Var = this.b;
        r50 r50Var = new r50(0, this, hn6Var);
        synchronized (w50Var.a) {
            w50Var.b();
            r50Var.run();
        }
    }

    @Override // defpackage.an6
    public final MediaFormat h() {
        MediaFormat mediaFormat;
        w50 w50Var = this.b;
        synchronized (w50Var.a) {
            try {
                mediaFormat = w50Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
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
        this.c.a();
        w50 w50Var = this.b;
        synchronized (w50Var.a) {
            try {
                w50Var.b();
                int i = -1;
                if (w50Var.l > 0 || w50Var.m) {
                    return -1;
                }
                gd1 gd1Var = w50Var.d;
                int i2 = gd1Var.b;
                int i3 = gd1Var.c;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = gd1Var.a[i2];
                    gd1Var.b = (i2 + 1) & gd1Var.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.an6
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.a();
        w50 w50Var = this.b;
        synchronized (w50Var.a) {
            try {
                w50Var.b();
                if (w50Var.l > 0 || w50Var.m) {
                    return -1;
                }
                gd1 gd1Var = w50Var.e;
                int i = gd1Var.b;
                int i2 = gd1Var.c;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = gd1Var.a[i];
                gd1Var.b = gd1Var.d & (i + 1);
                if (i3 >= 0) {
                    w50Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfoRemove = w50Var.f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (i3 == -2) {
                    w50Var.h = w50Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
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
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: q50
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
