package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class da0 implements m80 {
    public final Context a;
    public final dq2.c b;
    public final dq2.a c;
    public final b d;
    public final float e;
    public gb6<m80.e> f;
    public vf1 g;
    public u70 h;
    public w70 i;
    public Looper j;
    public Context k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;
        public dq2.a b;
        public dq2.c c;
        public u70 d;
        public final float e;

        public a(Context context) {
            this.a = context != null ? context.getApplicationContext() : null;
            this.c = dq2.c.a;
            if (context == null) {
                this.d = u70.f;
            }
            this.e = 8.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements t90.a {
        public b() {
        }
    }

    public da0(a aVar) {
        Context context = aVar.a;
        this.a = context;
        dq2.a aVar2 = aVar.b;
        aVar2.getClass();
        this.c = aVar2;
        this.b = aVar.c;
        this.h = aVar.d;
        this.d = context == null ? null : new b();
        this.e = aVar.e;
        this.g = vf1.a;
    }

    @Override // defpackage.m80
    public final void a() {
        ix9 ix9Var;
        gb6<m80.e> gb6Var = this.f;
        if (gb6Var != null) {
            gb6Var.d();
        }
        w70 w70Var = this.i;
        if (w70Var != null) {
            Context context = w70Var.a;
            if (w70Var.k) {
                w70Var.h = null;
                j80.b(context).unregisterAudioDeviceCallback(w70Var.d);
                if (Build.VERSION.SDK_INT >= 32 && (ix9Var = w70Var.g) != null) {
                    ix9Var.e();
                    w70Var.g = null;
                }
                context.unregisterReceiver(w70Var.e);
                w70.b bVar = w70Var.f;
                if (bVar != null) {
                    bVar.a.unregisterContentObserver(bVar);
                }
                w70Var.k = false;
            }
        }
    }

    @Override // defpackage.m80
    public final m80.c b(m80.b bVar) {
        g(bVar);
        id4 id4Var = bVar.a;
        q70 q70Var = bVar.b;
        k80 k80VarA = this.c.a(q70Var, id4Var);
        m80.c.a aVar = new m80.c.a();
        String str = id4Var.o;
        int i = id4Var.I;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(q70Var, id4Var) != null : i == 2) {
            i2 = 2;
        }
        aVar.d = i2;
        aVar.a = k80VarA.a;
        aVar.b = k80VarA.b;
        aVar.c = k80VarA.c;
        return aVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    @Override // defpackage.m80
    public final m80.f c(m80.b bVar) throws m80.a {
        int iIntValue;
        int iS;
        boolean z;
        char c;
        boolean z2;
        int i;
        int iMax;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int i2;
        int iB;
        boolean z5;
        int i3;
        int iB2;
        boolean z6;
        boolean z7;
        boolean z8;
        id4 id4Var = bVar.a;
        boolean z9 = bVar.d;
        q70 q70Var = bVar.b;
        g(bVar);
        String str = id4Var.o;
        int i4 = id4Var.H;
        int iIntValue2 = id4Var.I;
        int i5 = id4Var.G;
        if (!Objects.equals(str, "audio/raw")) {
            k80 k80VarA = z9 ? this.c.a(q70Var, id4Var) : k80.d;
            if (z9 && k80VarA.a) {
                str.getClass();
                int iC = fv6.c(str, id4Var.k);
                int iR = n6b.r(i5);
                boolean z10 = k80VarA.b;
                iIntValue2 = iC;
                iIntValue = iR;
                z = z10;
                iS = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairC = this.h.c(q70Var, id4Var);
                if (pairC == null) {
                    throw new m80.a("Unable to configure passthrough for: " + id4Var);
                }
                iIntValue2 = ((Integer) pairC.first).intValue();
                iIntValue = ((Integer) pairC.second).intValue();
                iS = -1;
                z = false;
                c = 2;
            }
            i = id4Var.j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            iMax = bVar.h;
            if (iMax != -1) {
                z4 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xl7.r(z3);
                if (iS == -1) {
                    iS = 1;
                }
                if (z2) {
                    d = this.e;
                } else {
                    d = 1.0d;
                }
                ((eq2) this.b).getClass();
                if (c != 0) {
                    z4 = true;
                    long j = i4;
                    long j2 = 250000 * j;
                    long j3 = iS;
                    i2 = n6b.i(minBufferSize * 4, ek5.i1((j2 * j3) / 1000000), ek5.i1(((750000 * j) * j3) / 1000000));
                } else if (c != 1) {
                    z4 = true;
                    iB = ms3.b(iIntValue2);
                    if (iB != -2147483647) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    xl7.r(z5);
                    i2 = ek5.i1((50000000 * ((long) iB)) / 1000000);
                } else {
                    if (c == 2) {
                        zn3.b();
                        return null;
                    }
                    z4 = true;
                    if (iIntValue2 == 5) {
                        i3 = 500000;
                    } else if (iIntValue2 == 8) {
                        i3 = 1000000;
                    } else {
                        i3 = 250000;
                    }
                    if (i != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iB2 = xf5.b(i, 8);
                    } else {
                        iB2 = ms3.b(iIntValue2);
                        if (iB2 != -2147483647) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        xl7.r(z6);
                    }
                    i2 = ek5.i1((((long) i3) * ((long) iB2)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) i2) * d)) + iS) - 1) / iS) * iS;
            }
            m80.f.a aVar = new m80.f.a();
            q70 q70Var2 = q70.b;
            aVar.i = -1;
            aVar.b = i4;
            aVar.c = iIntValue;
            aVar.a = iIntValue2;
            aVar.f = iMax;
            aVar.h = bVar.e;
            aVar.g = q70Var;
            z7 = z4;
            if (c == z7) {
                z8 = z7;
            } else {
                z8 = false;
            }
            aVar.e = z8;
            aVar.d = bVar.g;
            aVar.j = z2;
            aVar.k = z;
            aVar.i = bVar.f;
            return new m80.f(aVar);
        }
        xl7.g(n6b.J(iIntValue2));
        iIntValue = n6b.r(i5);
        iS = n6b.s(iIntValue2) * i5;
        z = false;
        c = 0;
        z2 = false;
        i = id4Var.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        iMax = bVar.h;
        if (iMax != -1) {
            z4 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            xl7.r(z3);
            if (iS == -1) {
                iS = 1;
            }
            if (z2) {
                d = this.e;
            } else {
                d = 1.0d;
            }
            ((eq2) this.b).getClass();
            if (c != 0) {
                z4 = true;
                long j4 = i4;
                long j5 = 250000 * j4;
                long j6 = iS;
                i2 = n6b.i(minBufferSize * 4, ek5.i1((j5 * j6) / 1000000), ek5.i1(((750000 * j4) * j6) / 1000000));
            } else if (c != 1) {
                z4 = true;
                iB = ms3.b(iIntValue2);
                if (iB != -2147483647) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xl7.r(z5);
                i2 = ek5.i1((50000000 * ((long) iB)) / 1000000);
            } else {
                if (c == 2) {
                    zn3.b();
                    return null;
                }
                z4 = true;
                if (iIntValue2 == 5) {
                    i3 = 500000;
                } else if (iIntValue2 == 8) {
                    i3 = 1000000;
                } else {
                    i3 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iB2 = xf5.b(i, 8);
                } else {
                    iB2 = ms3.b(iIntValue2);
                    if (iB2 != -2147483647) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    xl7.r(z6);
                }
                i2 = ek5.i1((((long) i3) * ((long) iB2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) i2) * d)) + iS) - 1) / iS) * iS;
        }
        m80.f.a aVar2 = new m80.f.a();
        q70 q70Var3 = q70.b;
        aVar2.i = -1;
        aVar2.b = i4;
        aVar2.c = iIntValue;
        aVar2.a = iIntValue2;
        aVar2.f = iMax;
        aVar2.h = bVar.e;
        aVar2.g = q70Var;
        z7 = z4;
        if (c == z7) {
            z8 = z7;
        } else {
            z8 = false;
        }
        aVar2.e = z8;
        aVar2.d = bVar.g;
        aVar2.j = z2;
        aVar2.k = z;
        aVar2.i = bVar.f;
        return new m80.f(aVar2);
    }

    @Override // defpackage.m80
    public final void d(aq2 aq2Var) {
        h();
        if (this.f == null) {
            this.f = new gb6<>(Thread.currentThread());
        }
        this.f.a(aq2Var);
    }

    @Override // defpackage.m80
    public final t90 e(m80.f fVar) throws m80.d {
        Context context;
        Context context2;
        try {
            int i = fVar.h;
            int i2 = fVar.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.k = context2.createDeviceContext(i2);
                }
                context = this.k;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(fVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : fVar.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(fVar.b).setChannelMask(fVar.c).setEncoding(fVar.a).build()).setTransferMode(1).setBufferSizeInBytes(fVar.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(fVar.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new t90(audioTrackBuild, fVar, this.d, this.e, this.g);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new m80.d();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new m80.d(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    @Override // defpackage.m80
    public final void f(vf1 vf1Var) {
        this.g = vf1Var;
    }

    public final void g(m80.b bVar) {
        Context context;
        u70 u70VarB;
        AudioDeviceInfo audioDeviceInfo = bVar.c;
        q70 q70Var = bVar.b;
        h();
        w70 w70Var = this.i;
        if (w70Var == null && (context = this.a) != null) {
            final w70 w70Var2 = new w70(context, new ba0(this), q70Var, audioDeviceInfo);
            this.i = w70Var2;
            if (w70Var2.k) {
                u70VarB = w70Var2.h;
                u70VarB.getClass();
            } else {
                w70Var2.k = true;
                w70.b bVar2 = w70Var2.f;
                if (bVar2 != null) {
                    bVar2.a.registerContentObserver(bVar2.b, false, bVar2);
                }
                Context context2 = w70Var2.a;
                AudioManager audioManagerB = j80.b(context2);
                w70.a aVar = w70Var2.d;
                Handler handler = w70Var2.c;
                audioManagerB.registerAudioDeviceCallback(aVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && w70Var2.g == null) {
                    w70Var2.g = new ix9(context2, new Runnable() { // from class: v70
                        @Override // java.lang.Runnable
                        public final void run() {
                            w70Var2.c();
                        }
                    }, Boolean.valueOf(n6b.M(context2)));
                }
                u70VarB = u70.b(context2, context2.registerReceiver(w70Var2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), w70Var2.j, w70Var2.i, w70Var2.a());
                w70Var2.h = u70VarB;
            }
            this.h = u70VarB;
        } else if (w70Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(w70Var.i)) {
                w70Var.i = audioDeviceInfo;
                Context context3 = w70Var.a;
                q70 q70Var2 = w70Var.j;
                List<Integer> listA = w70Var.a();
                ul8 ul8Var = u70.e;
                w70Var.b(u70.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), q70Var2, audioDeviceInfo, listA));
            }
            w70 w70Var3 = this.i;
            if (!Objects.equals(q70Var, w70Var3.j)) {
                w70Var3.j = q70Var;
                Context context4 = w70Var3.a;
                AudioDeviceInfo audioDeviceInfo2 = w70Var3.i;
                List<Integer> listA2 = w70Var3.a();
                ul8 ul8Var2 = u70.e;
                w70Var3.b(u70.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), q70Var, audioDeviceInfo2, listA2));
            }
        }
        this.h.getClass();
    }

    public final void h() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.j;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.j = looperMyLooper;
        } else {
            aa0.c(p2a.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
