package androidx.media3.exoplayer;

import android.text.TextUtils;
import defpackage.co6;
import defpackage.fq3;
import defpackage.ji;
import defpackage.k95;
import defpackage.ki;
import defpackage.m95;
import defpackage.md6;
import defpackage.n6b;
import defpackage.pp0;
import defpackage.qp7;
import defpackage.toa;
import defpackage.ul8;
import defpackage.uz8;
import defpackage.vl8;
import defpackage.x38;
import defpackage.xl7;
import defpackage.zn2;
import defpackage.zn3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public static final ul8 r;
    public final toa.c a;
    public final toa.b b;
    public final zn2 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final m95<String, Integer> o;
    public final ConcurrentHashMap<x38, b> p;
    public long q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements ki {
        public final HashMap<ji, x38> a = new HashMap<>();
        public final x38 b;

        public a(x38 x38Var) {
            this.b = x38Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r2v0, types: [ki$a] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4, types: [uz8$a] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // defpackage.ki
        public final synchronized void a(ki.a aVar) {
            c.this.c.a(aVar);
            while (aVar != 0) {
                ji jiVar = ((uz8.a) aVar).c;
                jiVar.getClass();
                f(jiVar);
                aVar = ((uz8.a) aVar).d;
                if (aVar == 0 || aVar.c == null) {
                    aVar = 0;
                }
            }
        }

        @Override // defpackage.ki
        public final synchronized void b(ji jiVar) {
            c.this.c.b(jiVar);
            f(jiVar);
        }

        @Override // defpackage.ki
        public final synchronized ji c() {
            ji jiVarC;
            jiVarC = c.this.c.c();
            this.a.put(jiVarC, this.b);
            b bVar = c.this.p.get(this.b);
            if (bVar != null) {
                synchronized (bVar) {
                    bVar.d++;
                }
            }
            return jiVarC;
        }

        @Override // defpackage.ki
        public final synchronized void d() {
            c.this.c.d();
        }

        @Override // defpackage.ki
        public final synchronized int e() {
            return c.this.c.b;
        }

        public final void f(ji jiVar) {
            x38 x38VarRemove = this.a.remove(jiVar);
            x38VarRemove.getClass();
            b bVar = c.this.p.get(x38VarRemove);
            if (bVar != null) {
                synchronized (bVar) {
                    bVar.d--;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public int a = 1;
        public boolean b;
        public int c;
        public int d;
    }

    static {
        k95.b bVar = k95.u;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        pp0.b(6, objArr);
        r = k95.n(6, objArr);
    }

    public c() {
        zn2 zn2Var = new zn2();
        vl8 vl8Var = vl8.z;
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.a = new toa.c();
        this.b = new toa.b();
        this.c = zn2Var;
        long jN = n6b.N(50000L);
        this.d = jN;
        long jN2 = n6b.N(1000L);
        this.e = jN2;
        this.f = jN;
        this.g = jN;
        this.h = jN2;
        this.i = jN2;
        this.j = n6b.N(2000L);
        this.k = jN2;
        this.l = -1;
        this.m = true;
        this.n = n6b.N(0L);
        this.p = new ConcurrentHashMap<>();
        this.o = m95.b(vl8Var);
        this.q = -1L;
    }

    public static void k(int i, int i2, String str, String str2) {
        xl7.j(i >= i2, "%s cannot be less than %s", str, str2);
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean a(f.a aVar) {
        long jMin;
        int i;
        boolean zL = l(aVar);
        x38 x38Var = aVar.a;
        long jA = n6b.A(aVar.e, aVar.d);
        if (aVar.f) {
            jMin = zL ? this.k : this.j;
        } else {
            jMin = zL ? this.i : this.h;
        }
        long j = aVar.g;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jA >= jMin) {
            return true;
        }
        if (!(zL ? this.m : false)) {
            b bVar = this.p.get(x38Var);
            bVar.getClass();
            synchronized (bVar) {
                i = bVar.d;
            }
            int i2 = i * this.c.b;
            b bVar2 = this.p.get(x38Var);
            bVar2.getClass();
            if (i2 >= bVar2.c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean c(f.a aVar) {
        int i;
        x38 x38Var = aVar.a;
        long j = aVar.d;
        b bVar = this.p.get(x38Var);
        bVar.getClass();
        b bVar2 = this.p.get(x38Var);
        bVar2.getClass();
        synchronized (bVar2) {
            i = bVar2.d;
        }
        int i2 = i * this.c.b;
        b bVar3 = this.p.get(x38Var);
        bVar3.getClass();
        boolean z = i2 >= bVar3.c;
        if (x38Var.equals(x38.c)) {
            return !z;
        }
        boolean zL = l(aVar);
        long jMin = zL ? this.e : this.d;
        long j2 = zL ? this.g : this.f;
        float f = aVar.e;
        if (f > 1.0f) {
            jMin = Math.min(n6b.y(f, jMin), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z2 = (zL ? this.m : false) || !z;
            bVar.b = z2;
            if (!z2 && j < 500000) {
                md6.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z) {
            bVar.b = false;
        }
        return bVar.b;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean d() {
        Iterator<b> it = this.p.values().iterator();
        while (it.hasNext()) {
            if (it.next().b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void e(x38 x38Var) {
        ConcurrentHashMap<x38, b> concurrentHashMap = this.p;
        b bVar = concurrentHashMap.get(x38Var);
        if (bVar != null) {
            int i = bVar.a - 1;
            bVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x38Var);
                m();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.q = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void f(x38 x38Var) {
        ConcurrentHashMap<x38, b> concurrentHashMap = this.p;
        b bVar = concurrentHashMap.get(x38Var);
        if (bVar != null) {
            int i = bVar.a - 1;
            bVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x38Var);
                m();
            }
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final long g() {
        return this.n;
    }

    @Override // androidx.media3.exoplayer.f
    public final void h(x38 x38Var) {
        long id = Thread.currentThread().getId();
        long j = this.q;
        xl7.q("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.q = id;
        ConcurrentHashMap<x38, b> concurrentHashMap = this.p;
        b bVar = concurrentHashMap.get(x38Var);
        if (bVar == null) {
            concurrentHashMap.put(x38Var, new b());
        } else {
            bVar.a++;
        }
        b bVar2 = concurrentHashMap.get(x38Var);
        bVar2.getClass();
        Integer num = this.o.get(x38Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        bVar2.c = iIntValue;
        bVar2.b = false;
    }

    @Override // androidx.media3.exoplayer.f
    public final a i(x38 x38Var) {
        return new a(x38Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.f
    public final void j(f.a aVar, fq3[] fq3VarArr) {
        x38 x38Var = aVar.a;
        Integer num = this.o.get(x38Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        b bVar = this.p.get(x38Var);
        bVar.getClass();
        if (iIntValue == -1) {
            boolean zL = l(aVar);
            int length = fq3VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    fq3 fq3Var = fq3VarArr[i];
                    if (fq3Var != null) {
                        switch (fq3Var.a().c) {
                            case qp7.POSITION_NONE /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = zL ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                zn3.b();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = n6b.i(i2, 13107200, 210239488);
                }
            }
        }
        bVar.c = iIntValue;
        m();
    }

    public final boolean l(f.a aVar) {
        toa toaVar = aVar.b;
        co6.f fVar = toaVar.m(toaVar.g(aVar.c.a, this.b).c, this.a, 0L).c.b;
        if (fVar == null) {
            return false;
        }
        String scheme = fVar.a.getScheme();
        return TextUtils.isEmpty(scheme) || r.contains(scheme);
    }

    public final void m() {
        boolean zIsEmpty = this.p.isEmpty();
        zn2 zn2Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (zn2Var) {
                if (zn2Var.a) {
                    zn2Var.f(0);
                }
            }
        } else {
            Iterator<b> it = this.p.values().iterator();
            while (it.hasNext()) {
                i += it.next().c;
            }
            zn2Var.f(i);
        }
    }
}
