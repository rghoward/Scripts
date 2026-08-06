package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 implements l80 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final m80.f b;
    public final float c;
    public final a d;
    public b e;
    public final ea0 f;
    public final boolean g;
    public final int h;
    public final d i;
    public final gb6<l80.a> j = new gb6<>(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final AudioTrack a;
        public final a b;
        public final Handler c;
        public u90 d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, u90] */
        public b(AudioTrack audioTrack, a aVar) {
            this.a = audioTrack;
            this.b = aVar;
            Handler handlerP = n6b.p(null);
            this.c = handlerP;
            ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: u90
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(final AudioRouting audioRouting) {
                    final t90.b bVar = this.a;
                    if (bVar.d == null) {
                        return;
                    }
                    fi0.a().execute(new Runnable() { // from class: v90
                        @Override // java.lang.Runnable
                        public final void run() {
                            final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
                            if (routedDevice != null) {
                                final t90.b bVar2 = bVar;
                                bVar2.c.post(new Runnable() { // from class: w90
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        w70 w70Var;
                                        t90.b bVar3 = bVar2;
                                        if (bVar3.d == null || (w70Var = da0.this.i) == null) {
                                            return;
                                        }
                                        AudioDeviceInfo audioDeviceInfo = w70Var.i;
                                        AudioDeviceInfo audioDeviceInfo2 = routedDevice;
                                        if (audioDeviceInfo2.equals(audioDeviceInfo)) {
                                            return;
                                        }
                                        w70Var.i = audioDeviceInfo2;
                                        Context context = w70Var.a;
                                        q70 q70Var = w70Var.j;
                                        List<Integer> listA = w70Var.a();
                                        ul8 ul8Var = u70.e;
                                        w70Var.b(u70.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), q70Var, audioDeviceInfo2, listA));
                                    }
                                });
                            }
                        }
                    });
                }
            };
            this.d = r0;
            audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, handlerP);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d {
        public final Handler a;
        public final a b;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                t90.this.j.e(-1, new z90());
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                t90.this.j.e(-1, new aa0());
            }

            public final void onTearDown(AudioTrack audioTrack) {
                t90.this.j.e(-1, new z90());
            }
        }

        public d() {
            Handler handlerP = n6b.p(null);
            this.a = handlerP;
            a aVar = new a();
            this.b = aVar;
            t90.this.a.registerStreamEventCallback(new y90(handlerP), aVar);
        }

        public static void a(d dVar) {
            t90.this.a.unregisterStreamEventCallback(dVar.b);
            dVar.a.removeCallbacksAndMessages(null);
        }
    }

    public t90(AudioTrack audioTrack, m80.f fVar, a aVar, float f, vf1 vf1Var) {
        this.a = audioTrack;
        this.b = fVar;
        this.c = f;
        this.d = aVar;
        boolean zJ = n6b.J(fVar.a);
        this.g = zJ;
        if (zJ) {
            this.h = n6b.s(fVar.a) * Integer.bitCount(fVar.c);
        } else {
            this.h = -1;
        }
        this.f = new ea0(new c(), vf1Var, audioTrack, fVar.a, this.h, fVar.f);
        if (aVar != null) {
            this.e = new b(audioTrack, aVar);
        }
        this.i = k() ? new d() : null;
    }

    @Override // defpackage.l80
    public final void a() {
        if (this.f.d.getPlayState() == 3) {
            this.a.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && k()) {
            d dVar = this.i;
            dVar.getClass();
            d.a(dVar);
        }
        b bVar = this.e;
        if (bVar != null) {
            AudioTrack audioTrack = bVar.a;
            u90 u90Var = bVar.d;
            u90Var.getClass();
            audioTrack.removeOnRoutingChangedListener(u90Var);
            bVar.d = null;
            this.e = null;
        }
        final AudioTrack audioTrack2 = this.a;
        final gb6<l80.a> gb6Var = this.j;
        final Handler handlerP = n6b.p(null);
        synchronized (s) {
            try {
                if (t == null) {
                    t = Executors.newSingleThreadScheduledExecutor(new j6b());
                }
                u++;
                t.schedule(new Runnable() { // from class: q90
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioTrack audioTrack3 = audioTrack2;
                        Handler handler = handlerP;
                        final gb6 gb6Var2 = gb6Var;
                        try {
                            audioTrack3.flush();
                            audioTrack3.release();
                            if (handler.getLooper().getThread().isAlive()) {
                                handler.post(new Runnable() { // from class: r90
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gb6 gb6Var3 = gb6Var2;
                                        gb6Var3.getClass();
                                        if (Thread.currentThread() == gb6Var3.b) {
                                            gb6Var3.e(-1, new s90());
                                        }
                                    }
                                });
                            }
                            synchronized (t90.s) {
                                try {
                                    int i = t90.u - 1;
                                    t90.u = i;
                                    if (i == 0) {
                                        ScheduledExecutorService scheduledExecutorService = t90.t;
                                        scheduledExecutorService.getClass();
                                        scheduledExecutorService.shutdown();
                                        t90.t = null;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            if (handler.getLooper().getThread().isAlive()) {
                                handler.post(new Runnable() { // from class: r90
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gb6 gb6Var3 = gb6Var2;
                                        gb6Var3.getClass();
                                        if (Thread.currentThread() == gb6Var3.b) {
                                            gb6Var3.e(-1, new s90());
                                        }
                                    }
                                });
                            }
                            synchronized (t90.s) {
                                try {
                                    int i2 = t90.u - 1;
                                    t90.u = i2;
                                    if (i2 == 0) {
                                        ScheduledExecutorService scheduledExecutorService2 = t90.t;
                                        scheduledExecutorService2.getClass();
                                        scheduledExecutorService2.shutdown();
                                        t90.t = null;
                                    }
                                    throw th2;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l80
    public final void b() {
        ea0 ea0Var = this.f;
        ea0Var.k = 0L;
        ea0Var.t = 0;
        ea0Var.s = 0;
        ea0Var.l = 0L;
        ea0Var.y = -9223372036854775807L;
        ea0Var.z = -9223372036854775807L;
        if (ea0Var.u == -9223372036854775807L) {
            ea0Var.h.a(0);
        }
        ea0Var.w = ea0Var.a();
        if (!this.k || k()) {
            this.a.pause();
        }
    }

    @Override // defpackage.l80
    public final void c(k28 k28Var) {
        AudioTrack audioTrack = this.a;
        try {
            audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(n6b.h(k28Var.a, 0.1f, this.c)).setPitch(n6b.h(k28Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e) {
            md6.h("AudioTrackAudioOutput", "Failed to set playback params", e);
        }
        float speed = audioTrack.getPlaybackParams().getSpeed();
        ea0 ea0Var = this.f;
        ea0Var.i = speed;
        ea0Var.h.a(0);
        ea0Var.k = 0L;
        ea0Var.t = 0;
        ea0Var.s = 0;
        ea0Var.l = 0L;
        ea0Var.y = -9223372036854775807L;
        ea0Var.z = -9223372036854775807L;
    }

    public final long d() {
        if (!this.g) {
            return this.m;
        }
        long j = this.l;
        long j2 = this.h;
        String str = n6b.a;
        return ((j + j2) - 1) / j2;
    }

    @Override // defpackage.l80
    public final k28 e() {
        PlaybackParams playbackParams = this.a.getPlaybackParams();
        return new k28(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x0300  */
    /* JADX WARN: Code duplicated, block: B:124:0x030e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0327  */
    /* JADX WARN: Code duplicated, block: B:130:0x0343  */
    /* JADX WARN: Code duplicated, block: B:132:0x0346  */
    /* JADX WARN: Code duplicated, block: B:68:0x020f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0212  */
    /* JADX WARN: Code duplicated, block: B:72:0x0215  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x021c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0222  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x022b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0232  */
    /* JADX WARN: Code duplicated, block: B:87:0x023b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0264  */
    /* JADX WARN: Code duplicated, block: B:90:0x0269  */
    /* JADX WARN: Code duplicated, block: B:92:0x0273  */
    /* JADX WARN: Code duplicated, block: B:93:0x0278  */
    /* JADX WARN: Code duplicated, block: B:94:0x0285  */
    /* JADX WARN: Code duplicated, block: B:95:0x028a  */
    /* JADX WARN: Code duplicated, block: B:97:0x028f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0299  */
    @Override // defpackage.l80
    public final long g() {
        long j;
        long j2;
        boolean z;
        long jD;
        boolean z2;
        ea0 ea0Var;
        long jB;
        int playState;
        long j3;
        long j4;
        long jY;
        long j5;
        int i;
        AudioTimestamp audioTimestamp;
        int i2;
        int i3;
        AudioTimestamp audioTimestamp2;
        long j6;
        long j7;
        long j8;
        Method method;
        long j9;
        Method method2;
        ea0 ea0Var2 = this.f;
        vf1 vf1Var = ea0Var2.b;
        o90 o90Var = ea0Var2.h;
        AudioTrack audioTrack = ea0Var2.d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = ea0Var2.c;
            long jD2 = vf1Var.d() / 1000;
            if (jD2 - ea0Var2.l >= AudioConstants.TRANSCRIPTION_TIMEOUT_MS) {
                j = 1000;
                long jS = n6b.S(ea0Var2.e, ea0Var2.a());
                if (jS != 0) {
                    jArr[ea0Var2.s] = n6b.A(ea0Var2.i, jS) - jD2;
                    ea0Var2.s = (ea0Var2.s + 1) % 10;
                    int i4 = ea0Var2.t;
                    if (i4 < 10) {
                        ea0Var2.t = i4 + 1;
                    }
                    ea0Var2.l = jD2;
                    ea0Var2.k = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = ea0Var2.t;
                        if (i5 >= i6) {
                            break;
                        }
                        int i7 = i5;
                        ea0Var2.k = (jArr[i7] / ((long) i6)) + ea0Var2.k;
                        i5 = i7 + 1;
                    }
                }
            } else {
                j = 1000;
            }
            long j10 = ea0Var2.n;
            if (ea0Var2.g && (method = ea0Var2.m) != null && jD2 - ea0Var2.o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = n6b.a;
                    j9 = jD2;
                    try {
                        long jIntValue = (((long) num.intValue()) * j) - ea0Var2.f;
                        ea0Var2.n = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        ea0Var2.n = jMax;
                        if (jMax > 10000000) {
                            md6.g("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            ea0Var2.n = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        ea0Var2.m = method2;
                    }
                } catch (Exception unused2) {
                    j9 = jD2;
                    method2 = null;
                }
                jD2 = j9;
                ea0Var2.o = jD2;
            }
            boolean z3 = j10 != ea0Var2.n;
            float f = ea0Var2.i;
            long jB2 = ea0Var2.b(jD2);
            o90.a aVar = o90Var.a;
            c cVar = o90Var.c;
            j2 = 0;
            o90.a aVar2 = o90Var.a;
            int i8 = o90Var.b;
            audioTrack = audioTrack;
            if (z3 || jD2 - o90Var.g >= o90Var.f) {
                o90Var.g = jD2;
                AudioTrack audioTrack2 = aVar.a;
                AudioTimestamp audioTimestamp3 = aVar.b;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp3);
                if (timestamp) {
                    long j11 = audioTimestamp3.framePosition;
                    long j12 = aVar.d;
                    if (j12 > j11) {
                        if (aVar.f) {
                            aVar.g += j12;
                            aVar.f = false;
                        } else {
                            aVar.c++;
                        }
                    }
                    aVar.d = j11;
                    aVar.e = j11 + aVar.g + (aVar.c << 32);
                }
                if (timestamp != 0) {
                    long j13 = audioTimestamp3.nanoTime / j;
                    audioTimestamp = audioTimestamp3;
                    long jS2 = n6b.S(i8, aVar2.e) + n6b.y(f, jD2 - (aVar2.b.nanoTime / j));
                    if (Math.abs(j13 - jD2) > 5000000) {
                        long j14 = aVar.e;
                        cVar.getClass();
                        md6.g("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j14 + ", " + j13 + ", " + jD2 + ", " + jB2 + ", " + t90.this.d());
                        o90Var = o90Var;
                        o90Var.a(4);
                    } else if (Math.abs(jS2 - jB2) > 5000000) {
                        o90Var = o90Var;
                        long j15 = aVar.e;
                        cVar.getClass();
                        md6.g("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j15 + ", " + j13 + ", " + jD2 + ", " + jB2 + ", " + t90.this.d());
                        i2 = 4;
                        o90Var.a(4);
                    } else {
                        i2 = 4;
                        if (o90Var.d == 4) {
                            o90Var = o90Var;
                            o90Var.a(0);
                        }
                    }
                    o90Var = o90Var;
                    i3 = o90Var.d;
                    if (i3 != 0) {
                        audioTimestamp2 = audioTimestamp;
                        z = false;
                        if (timestamp != 0) {
                            j6 = audioTimestamp2.nanoTime;
                            if (j6 / j >= o90Var.e) {
                                o90Var.h = aVar.e;
                                o90Var.i = j6 / j;
                                o90Var.a(1);
                            }
                        } else if (jD2 - o90Var.e > 500000) {
                            o90Var.a(3);
                        }
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != i2) {
                                    d43.c();
                                    return 0L;
                                }
                            } else if (timestamp) {
                                z = false;
                                o90Var.a(0);
                            }
                        } else if (timestamp == 0) {
                            o90Var.a(0);
                        }
                    } else if (timestamp != 0) {
                        j7 = aVar.e;
                        j8 = o90Var.h;
                        if (j7 <= j8) {
                            if (Math.abs((n6b.y(f, jD2 - (aVar2.b.nanoTime / j)) + n6b.S(i8, aVar2.e)) - (n6b.y(f, jD2 - o90Var.i) + n6b.S(i8, j8))) < j) {
                                o90Var.a(2);
                            } else if (jD2 - o90Var.e > 2000000) {
                                o90Var.a(3);
                            } else {
                                o90Var.h = aVar.e;
                                o90Var.i = audioTimestamp.nanoTime / j;
                            }
                        } else if (jD2 - o90Var.e > 2000000) {
                            o90Var.a(3);
                        } else {
                            o90Var.h = aVar.e;
                            o90Var.i = audioTimestamp.nanoTime / j;
                        }
                    } else {
                        z = false;
                        o90Var.a(0);
                    }
                    jD = vf1Var.d() / j;
                    if (o90Var.d == 2) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        ea0Var = ea0Var2;
                        float f2 = ea0Var.i;
                        o90.a aVar3 = o90Var.a;
                        jB = n6b.y(f2, jD - (aVar3.b.nanoTime / j)) + n6b.S(o90Var.b, aVar3.e);
                    } else {
                        ea0Var = ea0Var2;
                        jB = ea0Var.b(jD);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (z2 || ((i = o90Var.d) != 0 && i != 1)) {
                            ea0Var.d(jB);
                        }
                        j3 = ea0Var.z;
                        if (j3 != -9223372036854775807L) {
                            j4 = jB - ea0Var.y;
                            jY = n6b.y(ea0Var.i, jD - j3);
                            j5 = ea0Var.y + jY;
                            long jAbs = Math.abs(j5 - jB);
                            if (j4 != j2 && jAbs < 1000000) {
                                long j16 = (jY * 10) / 100;
                                jB = n6b.j(jB, j5 - j16, j5 + j16);
                            }
                        }
                        ea0Var.z = jD;
                        ea0Var.y = jB;
                    } else if (playState == 1) {
                        ea0Var.d(jB);
                    }
                    return jB;
                }
                audioTimestamp = audioTimestamp3;
                o90Var = o90Var;
                i2 = 4;
                o90Var = o90Var;
                i3 = o90Var.d;
                if (i3 != 0) {
                    audioTimestamp2 = audioTimestamp;
                    z = false;
                    if (timestamp != 0) {
                        j6 = audioTimestamp2.nanoTime;
                        if (j6 / j >= o90Var.e) {
                            o90Var.h = aVar.e;
                            o90Var.i = j6 / j;
                            o90Var.a(1);
                        }
                    } else if (jD2 - o90Var.e > 500000) {
                        o90Var.a(3);
                    }
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != i2) {
                                d43.c();
                                return 0L;
                            }
                        } else if (timestamp) {
                            z = false;
                            o90Var.a(0);
                        }
                    } else if (timestamp == 0) {
                        o90Var.a(0);
                    }
                } else if (timestamp != 0) {
                    j7 = aVar.e;
                    j8 = o90Var.h;
                    if (j7 <= j8) {
                        if (Math.abs((n6b.y(f, jD2 - (aVar2.b.nanoTime / j)) + n6b.S(i8, aVar2.e)) - (n6b.y(f, jD2 - o90Var.i) + n6b.S(i8, j8))) < j) {
                            o90Var.a(2);
                        } else if (jD2 - o90Var.e > 2000000) {
                            o90Var.a(3);
                        } else {
                            o90Var.h = aVar.e;
                            o90Var.i = audioTimestamp.nanoTime / j;
                        }
                    } else if (jD2 - o90Var.e > 2000000) {
                        o90Var.a(3);
                    } else {
                        o90Var.h = aVar.e;
                        o90Var.i = audioTimestamp.nanoTime / j;
                    }
                } else {
                    z = false;
                    o90Var.a(0);
                }
                jD = vf1Var.d() / j;
                if (o90Var.d == 2) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    ea0Var = ea0Var2;
                    float f3 = ea0Var.i;
                    o90.a aVar4 = o90Var.a;
                    jB = n6b.y(f3, jD - (aVar4.b.nanoTime / j)) + n6b.S(o90Var.b, aVar4.e);
                } else {
                    ea0Var = ea0Var2;
                    jB = ea0Var.b(jD);
                }
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (z2) {
                        ea0Var.d(jB);
                    } else {
                        ea0Var.d(jB);
                    }
                    j3 = ea0Var.z;
                    if (j3 != -9223372036854775807L) {
                        j4 = jB - ea0Var.y;
                        jY = n6b.y(ea0Var.i, jD - j3);
                        j5 = ea0Var.y + jY;
                        long jAbs2 = Math.abs(j5 - jB);
                        if (j4 != j2) {
                            long j17 = (jY * 10) / 100;
                            jB = n6b.j(jB, j5 - j17, j5 + j17);
                        }
                    }
                    ea0Var.z = jD;
                    ea0Var.y = jB;
                } else if (playState == 1) {
                    ea0Var.d(jB);
                }
                return jB;
            }
            ea0Var2 = ea0Var2;
            vf1Var = vf1Var;
            z = false;
            jD = vf1Var.d() / j;
            if (o90Var.d == 2) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                ea0Var = ea0Var2;
                float f4 = ea0Var.i;
                o90.a aVar5 = o90Var.a;
                jB = n6b.y(f4, jD - (aVar5.b.nanoTime / j)) + n6b.S(o90Var.b, aVar5.e);
            } else {
                ea0Var = ea0Var2;
                jB = ea0Var.b(jD);
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z2) {
                    ea0Var.d(jB);
                } else {
                    ea0Var.d(jB);
                }
                j3 = ea0Var.z;
                if (j3 != -9223372036854775807L) {
                    j4 = jB - ea0Var.y;
                    jY = n6b.y(ea0Var.i, jD - j3);
                    j5 = ea0Var.y + jY;
                    long jAbs3 = Math.abs(j5 - jB);
                    if (j4 != j2) {
                        long j18 = (jY * 10) / 100;
                        jB = n6b.j(jB, j5 - j18, j5 + j18);
                    }
                }
                ea0Var.z = jD;
                ea0Var.y = jB;
            } else if (playState == 1) {
                ea0Var.d(jB);
            }
            return jB;
        }
        j = 1000;
        j2 = 0;
        z = false;
        jD = vf1Var.d() / j;
        if (o90Var.d == 2) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            ea0Var = ea0Var2;
            float f5 = ea0Var.i;
            o90.a aVar6 = o90Var.a;
            jB = n6b.y(f5, jD - (aVar6.b.nanoTime / j)) + n6b.S(o90Var.b, aVar6.e);
        } else {
            ea0Var = ea0Var2;
            jB = ea0Var.b(jD);
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z2) {
                ea0Var.d(jB);
            } else {
                ea0Var.d(jB);
            }
            j3 = ea0Var.z;
            if (j3 != -9223372036854775807L) {
                j4 = jB - ea0Var.y;
                jY = n6b.y(ea0Var.i, jD - j3);
                j5 = ea0Var.y + jY;
                long jAbs4 = Math.abs(j5 - jB);
                if (j4 != j2) {
                    long j19 = (jY * 10) / 100;
                    jB = n6b.j(jB, j5 - j19, j5 + j19);
                }
            }
            ea0Var.z = jD;
            ea0Var.y = jB;
        } else if (playState == 1) {
            ea0Var.d(jB);
        }
        return jB;
    }

    @Override // defpackage.l80
    public final void h() {
        ea0 ea0Var = this.f;
        if (ea0Var.u != -9223372036854775807L) {
            ea0Var.u = n6b.N(ea0Var.b.c());
        }
        ea0Var.j = n6b.S(ea0Var.e, ea0Var.a());
        ea0Var.h.a(0);
        if (!this.k || k()) {
            this.a.play();
        }
    }

    @Override // defpackage.l80
    public final boolean i() {
        long jD = d();
        ea0 ea0Var = this.f;
        return ea0Var.v != -9223372036854775807L && jD > 0 && ea0Var.b.c() - ea0Var.v >= 200;
    }

    @Override // defpackage.l80
    public final void j(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    @Override // defpackage.l80
    public final boolean k() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    @Override // defpackage.l80
    public final int l() {
        return this.a.getSampleRate();
    }

    @Override // defpackage.l80
    public final void m(float f) {
        this.a.setVolume(f);
    }

    @Override // defpackage.l80
    public final void n(x38 x38Var) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdA = x38Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.a.setLogSessionId(logSessionIdA);
    }

    @Override // defpackage.l80
    public final long o() {
        return this.a.getBufferSizeInFrames();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    @Override // defpackage.l80
    public final boolean p(int i, long j, ByteBuffer byteBuffer) throws l80.b {
        int iWrite;
        boolean z;
        a aVar;
        da0 da0Var;
        w70 w70Var;
        long j2 = j;
        m80.f fVar = this.b;
        boolean z2 = this.g;
        if (!z2 && this.q == 0) {
            this.q = dq2.i(fVar.a, byteBuffer);
        }
        gb6<l80.a> gb6Var = this.j;
        gb6Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = gb6Var.b;
        AudioTrack audioTrack = this.a;
        if (threadCurrentThread == thread) {
            d();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.r;
            this.r = underrunCount;
            if (z3) {
                gb6Var.e(-1, new p90());
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (fVar.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.n;
            } else {
                this.n = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
            } else {
                if (this.o == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.o = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.o.putInt(1431633921);
                }
                if (this.p == 0) {
                    this.o.putInt(4, iRemaining2);
                    this.o.putLong(8, j2 * 1000);
                    this.o.position(0);
                    this.p = iRemaining2;
                }
                int iRemaining3 = this.o.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.p = 0;
                    } else {
                        this.p -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.o, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.p = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.p = 0;
                        } else {
                            this.p -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.l += (long) iWrite;
                return z;
            }
            if (z) {
                this.m = (((long) this.q) * ((long) i)) + this.m;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (aVar = this.d) != null && (w70Var = (da0Var = da0.this).i) != null) {
            u70 u70Var = u70.f;
            da0Var.h = u70Var;
            w70Var.b(u70Var);
        }
        throw new l80.b(iWrite, z);
    }

    @Override // defpackage.l80
    public final int q() {
        return this.a.getAudioSessionId();
    }

    @Override // defpackage.l80
    public final void r() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        ea0 ea0Var = this.f;
        ea0Var.A = true;
        ea0Var.h.a.f = true;
    }

    @Override // defpackage.l80
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.a.setPreferredDevice(audioDeviceInfo);
    }

    @Override // defpackage.l80
    public final void stop() {
        if (this.k) {
            return;
        }
        this.k = true;
        long jD = d();
        ea0 ea0Var = this.f;
        ea0Var.w = ea0Var.a();
        ea0Var.u = n6b.N(ea0Var.b.c());
        ea0Var.x = jD;
        this.a.stop();
        this.p = 0;
    }
}
