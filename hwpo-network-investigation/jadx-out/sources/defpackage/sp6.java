package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseBooleanArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sp6 implements aj {
    public int A;
    public boolean B;
    public final Context a;
    public final ys2 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public h28 o;
    public b p;
    public b q;
    public b r;
    public id4 s;
    public id4 t;
    public id4 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = fi0.a();
    public final toa.c f = new toa.c();
    public final toa.b g = new toa.b();
    public final HashMap<String, Long> i = new HashMap<>();
    public final HashMap<String, Long> h = new HashMap<>();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final id4 a;
        public final int b;
        public final String c;

        public b(id4 id4Var, int i, String str) {
            this.a = id4Var;
            this.b = i;
            this.c = str;
        }
    }

    public sp6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        ys2 ys2Var = new ys2();
        this.c = ys2Var;
        ys2Var.d = this;
    }

    public static sp6 o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new sp6(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.aj
    public final void b(tfb tfbVar) {
        b bVar = this.p;
        if (bVar != null) {
            id4 id4Var = bVar.a;
            if (id4Var.w == -1) {
                id4.a aVarA = id4Var.a();
                aVarA.u = tfbVar.a;
                aVarA.v = tfbVar.b;
                this.p = new b(new id4(aVarA), bVar.b, bVar.c);
            }
        }
    }

    @Override // defpackage.aj
    public final void c(ln2 ln2Var) {
        this.y += ln2Var.g;
        this.z += ln2Var.e;
    }

    @Override // defpackage.aj
    public final void g(h28 h28Var) {
        this.o = h28Var;
    }

    @Override // defpackage.aj
    public final void h(int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // defpackage.aj
    public final void i(mp6 mp6Var) {
        this.w = mp6Var.a;
    }

    @Override // defpackage.aj
    public final void j(aj.a aVar, int i, long j) {
        bq6.b bVar = aVar.d;
        if (bVar != null) {
            String strC = this.c.c(aVar.b, bVar);
            HashMap<String, Long> map = this.i;
            Long l = map.get(strC);
            HashMap<String, Long> map2 = this.h;
            Long l2 = map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.aj
    public final void k(aj.a aVar, mp6 mp6Var) {
        bq6.b bVar = aVar.d;
        if (bVar == null) {
            return;
        }
        id4 id4Var = mp6Var.c;
        id4Var.getClass();
        int i = mp6Var.d;
        toa toaVar = aVar.b;
        bVar.getClass();
        b bVar2 = new b(id4Var, i, this.c.c(toaVar, bVar));
        int i2 = mp6Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = bVar2;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = bVar2;
                return;
            }
        }
        this.p = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:253:0x0458  */
    /* JADX WARN: Code duplicated, block: B:386:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:389:0x061c  */
    /* JADX WARN: Code duplicated, block: B:393:0x062e A[Catch: all -> 0x063d, TryCatch #0 {all -> 0x063d, blocks: (B:391:0x062a, B:393:0x062e, B:396:0x063f, B:397:0x0649, B:399:0x064f, B:401:0x065c, B:403:0x0660), top: B:410:0x062a }] */
    /* JADX WARN: Code duplicated, block: B:399:0x064f A[Catch: all -> 0x063d, TryCatch #0 {all -> 0x063d, blocks: (B:391:0x062a, B:393:0x062e, B:396:0x063f, B:397:0x0649, B:399:0x064f, B:401:0x065c, B:403:0x0660), top: B:410:0x062a }] */
    /* JADX WARN: Code duplicated, block: B:409:0x066a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:410:0x062a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aj
    public final void l(s28 s28Var, aj.b bVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        a aVar;
        a aVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        a aVar3;
        int i12;
        int i13;
        b bVar2;
        int i14;
        int i15;
        int i16;
        boolean z2;
        ys2 ys2Var;
        String str;
        Iterator<ys2.a> it;
        ys2.a next;
        sp6 sp6Var;
        id4 id4Var;
        h83 h83Var;
        int i17;
        if (bVar.a.a.size() == 0) {
            return;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean z3 = true;
            if (i19 >= bVar.a.a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = bVar.a.a;
            xl7.k(i19, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i19);
            aj.a aVar4 = bVar.b.get(iKeyAt);
            aVar4.getClass();
            ys2 ys2Var2 = this.c;
            if (iKeyAt == 0) {
                synchronized (ys2Var2) {
                    try {
                        ys2Var2.d.getClass();
                        toa toaVar = ys2Var2.e;
                        ys2Var2.e = aVar4.b;
                        Iterator<ys2.a> it2 = ys2Var2.c.values().iterator();
                        while (it2.hasNext()) {
                            ys2.a next2 = it2.next();
                            if (!next2.b(toaVar, ys2Var2.e) || next2.a(aVar4)) {
                                it2.remove();
                                if (next2.a.equals(ys2Var2.f)) {
                                    ys2Var2.a(next2);
                                }
                                if (next2.e) {
                                    ys2Var2.d.t(aVar4, next2.a);
                                }
                            }
                        }
                        ys2Var2.d(aVar4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iKeyAt == 11) {
                int i20 = this.l;
                synchronized (ys2Var2) {
                    try {
                        ys2Var2.d.getClass();
                        if (i20 != 0) {
                            z3 = false;
                        }
                        Iterator<ys2.a> it3 = ys2Var2.c.values().iterator();
                        while (it3.hasNext()) {
                            ys2.a next3 = it3.next();
                            if (next3.a(aVar4)) {
                                it3.remove();
                                boolean zEquals = next3.a.equals(ys2Var2.f);
                                if (zEquals) {
                                    ys2Var2.a(next3);
                                }
                                if (next3.e) {
                                    if (z3 && zEquals) {
                                        boolean z4 = next3.f;
                                    }
                                    ys2Var2.d.t(aVar4, next3.a);
                                }
                            }
                        }
                        ys2Var2.d(aVar4);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                ys2Var2.e(aVar4);
            }
            i19++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.a(0)) {
            aj.a aVar5 = bVar.b.get(0);
            aVar5.getClass();
            if (this.k != null) {
                r(aVar5.b, aVar5.d);
            }
        }
        if (bVar.a(2) && this.k != null) {
            k95.b bVarListIterator = s28Var.B().a.listIterator(0);
            loop3: while (true) {
                if (!bVarListIterator.hasNext()) {
                    h83Var = null;
                    break;
                }
                vua.a aVar6 = (vua.a) bVarListIterator.next();
                for (int i21 = 0; i21 < aVar6.a; i21++) {
                    if (aVar6.e[i21] && (h83Var = aVar6.b.d[i21].s) != null) {
                        break loop3;
                    }
                }
            }
            if (h83Var != null) {
                PlaybackMetrics.Builder builder = this.k;
                int i22 = 0;
                while (true) {
                    if (i22 >= h83Var.w) {
                        i17 = 1;
                        break;
                    }
                    UUID uuid = h83Var.t[i22].u;
                    if (uuid.equals(i01.d)) {
                        i17 = 3;
                        break;
                    } else if (uuid.equals(i01.e)) {
                        i17 = 2;
                        break;
                    } else {
                        if (uuid.equals(i01.c)) {
                            i17 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builder.setDrmType(i17);
            }
        }
        if (bVar.a(1011)) {
            this.A++;
        }
        h28 h28Var = this.o;
        if (h28Var == null) {
            i4 = 4;
            i12 = 1;
            i13 = 2;
            i7 = 13;
            i2 = 9;
            i3 = 8;
            i5 = 7;
            i6 = 6;
        } else {
            int i23 = h28Var.t;
            Context context = this.a;
            boolean z5 = this.w == 4;
            if (i23 == 1001) {
                aVar = new a(20, 0);
            } else {
                if (h28Var instanceof lo3) {
                    lo3 lo3Var = (lo3) h28Var;
                    z = lo3Var.v == 1;
                    i = lo3Var.z;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = h28Var.getCause();
                cause.getClass();
                int i24 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof n45) {
                        aVar3 = new a(5, ((n45) cause).v);
                    } else {
                        if ((cause instanceof m45) || (cause instanceof ut7)) {
                            i8 = 7;
                            i9 = 6;
                            i10 = 4;
                            i11 = 8;
                            i2 = 9;
                            aVar = new a(z5 ? 10 : 11, 0);
                        } else {
                            boolean z6 = cause instanceof l45;
                            if (z6 || (cause instanceof i1b.a)) {
                                i2 = 9;
                                if (ea7.a(context).b() == 1) {
                                    aVar = new a(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        aVar = new a(6, 0);
                                        i6 = 6;
                                        i7 = 13;
                                        i3 = 8;
                                        i4 = 4;
                                        i5 = 7;
                                    } else {
                                        i9 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            aVar = new a(7, 0);
                                            i5 = 7;
                                            i6 = 6;
                                            i7 = 13;
                                            i3 = 8;
                                            i4 = 4;
                                        } else {
                                            i8 = 7;
                                            if (z6 && ((l45) cause).u == 1) {
                                                aVar = new a(4, 0);
                                                i5 = 7;
                                                i6 = 6;
                                                i4 = 4;
                                                i7 = 13;
                                                i3 = 8;
                                            } else {
                                                i10 = 4;
                                                i11 = 8;
                                                aVar = new a(8, 0);
                                            }
                                        }
                                    }
                                }
                            } else if (i23 == 1002) {
                                aVar = new a(21, 0);
                            } else if (cause instanceof i83.a) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iX = n6b.x(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (n6b.w(iX)) {
                                        case 6002:
                                            i24 = 24;
                                            break;
                                        case 6003:
                                            i24 = 28;
                                            break;
                                        case 6004:
                                            i24 = 25;
                                            break;
                                        case 6005:
                                            i24 = 26;
                                            break;
                                    }
                                    aVar3 = new a(i24, iX);
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    aVar = new a(27, 0);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    aVar = new a(24, 0);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    aVar = new a(29, 0);
                                } else if (cause3 instanceof o3b) {
                                    aVar = new a(23, 0);
                                } else {
                                    aVar = cause3 instanceof tq2.a ? new a(28, 0) : new a(30, 0);
                                }
                            } else if ((cause instanceof kw3.a) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                aVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                            } else {
                                i2 = 9;
                                aVar = new a(9, 0);
                            }
                            i7 = 13;
                            i3 = 8;
                            i4 = 4;
                            i5 = 7;
                            i6 = 6;
                        }
                        i5 = i8;
                        i6 = i9;
                        i4 = i10;
                        i3 = i11;
                        i7 = 13;
                    }
                    aVar = aVar3;
                } else {
                    i2 = 9;
                    i3 = 8;
                    i4 = 4;
                    i5 = 7;
                    i6 = 6;
                    if (z && (i == 0 || i == 1)) {
                        aVar = new a(35, 0);
                    } else if (z && i == 3) {
                        aVar = new a(15, 0);
                    } else if (z && i == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof in6.b) {
                            i7 = 13;
                            aVar2 = new a(13, n6b.x(((in6.b) cause).w));
                        } else {
                            i7 = 13;
                            if (cause instanceof dn6) {
                                aVar = new a(14, ((dn6) cause).t);
                            } else if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof k90) {
                                aVar = new a(17, 0);
                            } else if (cause instanceof m90) {
                                aVar2 = new a(18, ((m90) cause).t);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (n6b.w(errorCode)) {
                                    case 6002:
                                        i24 = 24;
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                }
                                aVar2 = new a(i24, errorCode);
                            } else {
                                aVar = new a(22, 0);
                            }
                        }
                        aVar = aVar2;
                    }
                    i7 = 13;
                }
                final PlaybackErrorEvent playbackErrorEventBuild = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(aVar.a).setSubErrorCode(aVar.b).setException(h28Var).build();
                this.b.execute(new Runnable() { // from class: pp6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.t.d.reportPlaybackErrorEvent(playbackErrorEventBuild);
                    }
                });
                i12 = 1;
                this.B = true;
                this.o = null;
                i13 = 2;
            }
            i7 = 13;
            i2 = 9;
            i3 = 8;
            i4 = 4;
            i5 = 7;
            i6 = 6;
            final PlaybackErrorEvent playbackErrorEventBuild2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(aVar.a).setSubErrorCode(aVar.b).setException(h28Var).build();
            this.b.execute(new Runnable() { // from class: pp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.d.reportPlaybackErrorEvent(playbackErrorEventBuild2);
                }
            });
            i12 = 1;
            this.B = true;
            this.o = null;
            i13 = 2;
        }
        if (bVar.a(i13)) {
            vua vuaVarB = s28Var.B();
            boolean zA = vuaVarB.a(i13);
            boolean zA2 = vuaVarB.a(i12);
            boolean zA3 = vuaVarB.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    id4Var = null;
                } else {
                    id4Var = null;
                    if (!Objects.equals(this.s, null)) {
                        int i25 = this.s == null ? 1 : 0;
                        this.s = null;
                        u(1, jElapsedRealtime, null, i25);
                    }
                }
                if (!zA2 && !Objects.equals(this.t, id4Var)) {
                    int i26 = this.t == null ? 1 : 0;
                    this.t = id4Var;
                    u(0, jElapsedRealtime, id4Var, i26);
                }
                if (!zA3 && !Objects.equals(this.u, id4Var)) {
                    int i27 = this.u == null ? 1 : 0;
                    this.u = id4Var;
                    u(2, jElapsedRealtime, id4Var, i27);
                }
                bVar2 = id4Var;
            } else {
                i4 = i4;
                bVar2 = 0;
            }
        } else {
            i4 = i4;
            bVar2 = 0;
        }
        if (n(this.p)) {
            b bVar3 = this.p;
            id4 id4Var2 = bVar3.a;
            if (id4Var2.w != -1) {
                int i28 = bVar3.b;
                if (!Objects.equals(this.s, id4Var2)) {
                    int i29 = (this.s == null && i28 == 0) ? 1 : i28;
                    this.s = id4Var2;
                    u(1, jElapsedRealtime, id4Var2, i29);
                }
                this.p = bVar2;
            }
        }
        if (n(this.q)) {
            b bVar4 = this.q;
            id4 id4Var3 = bVar4.a;
            int i30 = bVar4.b;
            if (!Objects.equals(this.t, id4Var3)) {
                int i31 = (this.t == null && i30 == 0) ? 1 : i30;
                this.t = id4Var3;
                u(0, jElapsedRealtime, id4Var3, i31);
            }
            this.q = bVar2;
        }
        if (n(this.r)) {
            b bVar5 = this.r;
            id4 id4Var4 = bVar5.a;
            int i32 = bVar5.b;
            if (!Objects.equals(this.u, id4Var4)) {
                int i33 = (this.u == null && i32 == 0) ? 1 : i32;
                this.u = id4Var4;
                u(2, jElapsedRealtime, id4Var4, i33);
            }
            this.r = bVar2;
        }
        switch (ea7.a(this.a).b()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i2;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = i4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i6;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i3;
                break;
            case 10:
                i14 = i5;
                break;
        }
        if (i14 != this.n) {
            this.n = i14;
            this.b.execute(new op6(i18, this, new NetworkEvent.Builder().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
        }
        if (s28Var.A() != 2) {
            this.v = false;
        }
        if (s28Var.f() == null) {
            this.x = false;
            i15 = 10;
        } else {
            i15 = 10;
            if (bVar.a(10)) {
                this.x = true;
            }
        }
        int iA = s28Var.A();
        if (this.v) {
            i16 = 5;
        } else if (this.x) {
            i16 = i7;
        } else if (iA == i4) {
            i16 = 11;
        } else {
            i16 = 12;
            if (iA != 2) {
                if (iA != 3) {
                    z2 = true;
                    if (iA != 1 || this.m == 0) {
                        i16 = this.m;
                    }
                } else if (s28Var.k()) {
                    i16 = s28Var.L() != 0 ? i2 : 3;
                } else {
                    i16 = i4;
                }
                if (this.m != i16) {
                    this.m = i16;
                    this.B = z2;
                    final PlaybackStateEvent playbackStateEventBuild = new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build();
                    this.b.execute(new Runnable() { // from class: rp6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.t.d.reportPlaybackStateEvent(playbackStateEventBuild);
                        }
                    });
                }
                if (bVar.a(1028)) {
                    ys2Var = this.c;
                    aj.a aVar7 = bVar.b.get(1028);
                    aVar7.getClass();
                    synchronized (ys2Var) {
                        try {
                            str = ys2Var.f;
                            if (str != null) {
                                ys2.a aVar8 = ys2Var.c.get(str);
                                aVar8.getClass();
                                ys2Var.a(aVar8);
                            }
                            it = ys2Var.c.values().iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it.remove();
                                if (!next.e && (sp6Var = ys2Var.d) != null) {
                                    sp6Var.t(aVar7, next.a);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            int i34 = this.m;
            if (i34 == 0 || i34 == 2 || i34 == 12) {
                i16 = 2;
            } else if (s28Var.k()) {
                i16 = s28Var.L() != 0 ? i15 : i6;
            } else {
                i16 = i5;
            }
        }
        z2 = true;
        if (this.m != i16) {
            this.m = i16;
            this.B = z2;
            final PlaybackStateEvent playbackStateEventBuild2 = new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build();
            this.b.execute(new Runnable() { // from class: rp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.d.reportPlaybackStateEvent(playbackStateEventBuild2);
                }
            });
        }
        if (bVar.a(1028)) {
            ys2Var = this.c;
            aj.a aVar9 = bVar.b.get(1028);
            aVar9.getClass();
            synchronized (ys2Var) {
                str = ys2Var.f;
                if (str != null) {
                    ys2.a aVar10 = ys2Var.c.get(str);
                    aVar10.getClass();
                    ys2Var.a(aVar10);
                }
                it = ys2Var.c.values().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    it.remove();
                    if (!next.e) {
                    }
                }
            }
        }
    }

    public final boolean n(b bVar) {
        String str;
        if (bVar == null) {
            return false;
        }
        String str2 = bVar.c;
        ys2 ys2Var = this.c;
        synchronized (ys2Var) {
            str = ys2Var.f;
        }
        return str2.equals(str);
    }

    public final void p() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.k.build();
            this.b.execute(new Runnable() { // from class: qp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId q() {
        return this.d.getSessionId();
    }

    public final void r(toa toaVar, bq6.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (bVar == null || (iB = toaVar.b(bVar.a)) == -1) {
            return;
        }
        toa.b bVar2 = this.g;
        int i = 0;
        toaVar.f(iB, bVar2, false);
        int i2 = bVar2.c;
        toa.c cVar = this.f;
        toaVar.n(i2, cVar);
        co6.f fVar = cVar.c.b;
        if (fVar != null) {
            int iF = n6b.F(fVar.a, fVar.b);
            if (iF == 0) {
                i = 3;
            } else if (iF != 1) {
                i = iF != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (cVar.m != -9223372036854775807L && !cVar.k && !cVar.i && !cVar.a()) {
            builder.setMediaDurationMillis(n6b.Z(cVar.m));
        }
        builder.setPlaybackType(cVar.a() ? 2 : 1);
        this.B = true;
    }

    public final void s(aj.a aVar, String str) {
        bq6.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            p();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            r(aVar.b, bVar);
        }
    }

    public final void t(aj.a aVar, String str) {
        bq6.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.j)) {
            p();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void u(int i, long j, id4 id4Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        int i4 = 1;
        if (id4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = id4Var.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = id4Var.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = id4Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = id4Var.j;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = id4Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = id4Var.w;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = id4Var.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = id4Var.H;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = id4Var.d;
            if (str4 != null) {
                String str5 = n6b.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = id4Var.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new o82(this, timeSinceCreatedMillis.build(), i4));
    }
}
