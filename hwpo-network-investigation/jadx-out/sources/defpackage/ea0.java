package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 {
    public boolean A;
    public long B;
    public final t90.c a;
    public final vf1 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final o90 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public ea0(t90.c cVar, vf1 vf1Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = cVar;
        this.b = vf1Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new o90(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zJ = n6b.J(i);
        this.g = zJ;
        this.f = zJ ? n6b.S(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        long jC = this.b.c();
        if (jC - this.p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jC;
                }
            }
            this.p = jC;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jY;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jY = this.u != -9223372036854775807L ? n6b.S(i2, c()) : n6b.S(i2, a());
        } else {
            jY = n6b.y(this.i, j + this.k);
        }
        long jMax = Math.max(0L, jY - this.n);
        return this.u != -9223372036854775807L ? Math.min(n6b.S(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        return this.w + n6b.U(n6b.y(this.i, n6b.N(this.b.c()) - this.u), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        final long jCurrentTimeMillis = this.b.currentTimeMillis() - n6b.Z(n6b.A(this.i, j - j2));
        this.j = -9223372036854775807L;
        gb6<l80.a> gb6Var = t90.this.j;
        gb6Var.getClass();
        if (Thread.currentThread() == gb6Var.b) {
            gb6Var.e(-1, new gb6.a() { // from class: x90
                @Override // gb6.a
                public final void invoke(Object obj) {
                    ((l80.a) obj).a(jCurrentTimeMillis);
                }
            });
        }
    }
}
