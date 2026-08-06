package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 implements bq6.a {
    public final a a;
    public final rq2.a b;
    public zt2 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final cr2 a;
        public rq2.a d;
        public zt2 f;
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();
        public boolean e = true;
        public int g = 3;

        public a(cr2 cr2Var, zt2 zt2Var) {
            this.a = cr2Var;
            this.f = zt2Var;
        }

        public final bq6.a a(int i) {
            l5a l5aVar;
            l5a l5aVar2;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map = this.c;
            bq6.a aVar = (bq6.a) map.get(numValueOf);
            if (aVar != null) {
                return aVar;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            HashMap map2 = this.b;
            l5a l5aVar3 = (l5a) map2.get(numValueOf2);
            if (l5aVar3 == null) {
                final rq2.a aVar2 = this.d;
                aVar2.getClass();
                if (i == 0) {
                    final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(bq6.a.class);
                    l5aVar = new l5a() { // from class: hs2
                        @Override // defpackage.l5a
                        public final Object get() {
                            return ms2.e(clsAsSubclass, aVar2);
                        }
                    };
                } else if (i == 1) {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(bq6.a.class);
                    l5aVar = new l5a() { // from class: is2
                        @Override // defpackage.l5a
                        public final Object get() {
                            return ms2.e(clsAsSubclass2, aVar2);
                        }
                    };
                } else if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(bq6.a.class);
                        l5aVar2 = new l5a() { // from class: ks2
                            @Override // defpackage.l5a
                            public final Object get() {
                                try {
                                    return (bq6.a) clsAsSubclass3.getConstructor(null).newInstance(null);
                                } catch (Exception e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        };
                    } else if (i == 4) {
                        l5aVar2 = new l5a() { // from class: ls2
                            @Override // defpackage.l5a
                            public final Object get() {
                                return new he8.b(aVar2, this.t.a);
                            }
                        };
                    } else {
                        z90.a(pp2.a(i, "Unrecognized contentType: "));
                        l5aVar3 = null;
                    }
                    l5aVar3 = l5aVar2;
                    map2.put(Integer.valueOf(i), l5aVar3);
                } else {
                    final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(bq6.a.class);
                    l5aVar = new l5a() { // from class: js2
                        @Override // defpackage.l5a
                        public final Object get() {
                            return ms2.e(clsAsSubclass4, aVar2);
                        }
                    };
                }
                l5aVar3 = l5aVar;
                map2.put(Integer.valueOf(i), l5aVar3);
            }
            bq6.a aVar3 = (bq6.a) l5aVar3.get();
            aVar3.a(this.f);
            aVar3.b(this.e);
            aVar3.d(this.g);
            map.put(Integer.valueOf(i), aVar3);
            return aVar3;
        }
    }

    public ms2(Context context, cr2 cr2Var) {
        rq2.a aVar = new rq2.a(context);
        zt2 zt2Var = new zt2();
        this.b = aVar;
        this.c = zt2Var;
        a aVar2 = new a(cr2Var, zt2Var);
        this.a = aVar2;
        if (aVar != aVar2.d) {
            aVar2.d = aVar;
            aVar2.b.clear();
            aVar2.c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static bq6.a e(Class cls, if2.a aVar) {
        try {
            return (bq6.a) cls.getConstructor(if2.a.class).newInstance(aVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // bq6.a
    public final void a(zt2 zt2Var) {
        this.c = zt2Var;
        a aVar = this.a;
        aVar.f = zt2Var;
        cr2 cr2Var = aVar.a;
        synchronized (cr2Var) {
            cr2Var.v = zt2Var;
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((bq6.a) it.next()).a(zt2Var);
        }
    }

    @Override // bq6.a
    @Deprecated
    public final void b(boolean z) {
        this.i = z;
        a aVar = this.a;
        aVar.e = z;
        cr2 cr2Var = aVar.a;
        synchronized (cr2Var) {
            cr2Var.u = z;
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((bq6.a) it.next()).b(z);
        }
    }

    @Override // bq6.a
    public final bq6 c(co6 co6Var) {
        co6Var.b.getClass();
        String scheme = co6Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(co6Var.b.b, "application/x-image-uri");
        co6.f fVar = co6Var.b;
        if (zEquals) {
            long j = fVar.f;
            String str = n6b.a;
            throw null;
        }
        int iF = n6b.F(fVar.a, fVar.b);
        if (co6Var.b.f != -9223372036854775807L) {
            cr2 cr2Var = this.a.a;
            synchronized (cr2Var) {
                cr2Var.x = 1;
            }
            cr2 cr2Var2 = this.a.a;
            synchronized (cr2Var2) {
                cr2Var2.y = 1;
            }
        }
        try {
            bq6.a aVarA = this.a.a(iF);
            co6.e.a aVarA2 = co6Var.c.a();
            co6.e eVar = co6Var.c;
            if (eVar.a == -9223372036854775807L) {
                aVarA2.a = this.d;
            }
            if (eVar.d == -3.4028235E38f) {
                aVarA2.d = this.g;
            }
            if (eVar.e == -3.4028235E38f) {
                aVarA2.e = this.h;
            }
            if (eVar.b == -9223372036854775807L) {
                aVarA2.b = this.e;
            }
            if (eVar.c == -9223372036854775807L) {
                aVarA2.c = this.f;
            }
            co6.e eVar2 = new co6.e(aVarA2);
            if (!eVar2.equals(co6Var.c)) {
                co6.a aVarA3 = co6Var.a();
                aVarA3.k = eVar2.a();
                co6Var = aVarA3.a();
            }
            bq6 bq6VarC = aVarA.c(co6Var);
            k95<co6.i> k95Var = co6Var.b.d;
            if (!k95Var.isEmpty()) {
                bq6[] bq6VarArr = new bq6[k95Var.size() + 1];
                bq6VarArr[0] = bq6VarC;
                if (k95Var.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        co6.i iVar = k95Var.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new jq6.a();
                        new j83.a();
                        vl8 vl8Var = vl8.z;
                        k95.b bVar = k95.u;
                        ul8 ul8Var = ul8.x;
                        List list = Collections.EMPTY_LIST;
                        ul8 ul8Var2 = ul8.x;
                        co6.g gVar = co6.g.a;
                        Uri uri = Uri.EMPTY;
                        iVar.getClass();
                        throw null;
                    }
                    id4.a aVar = new id4.a();
                    k95Var.get(0).getClass();
                    ArrayList<fv6.a> arrayList = fv6.a;
                    aVar.n = null;
                    k95Var.get(0).getClass();
                    aVar.d = null;
                    k95Var.get(0).getClass();
                    aVar.e = 0;
                    k95Var.get(0).getClass();
                    aVar.f = 0;
                    k95Var.get(0).getClass();
                    aVar.b = null;
                    k95Var.get(0).getClass();
                    aVar.a = null;
                    id4 id4Var = new id4(aVar);
                    if (this.c.f(id4Var)) {
                        id4.a aVarA4 = id4Var.a();
                        aVarA4.n = fv6.n("application/x-media3-cues");
                        aVarA4.j = id4Var.o;
                        aVarA4.L = this.c.h(id4Var);
                        new id4(aVarA4);
                    }
                    k95Var.get(0).getClass();
                    throw null;
                }
                bq6VarC = new ns6(bq6VarArr);
            }
            co6.c cVar = co6Var.e;
            if (cVar.a != Long.MIN_VALUE) {
                tf1.a aVar2 = new tf1.a(bq6VarC);
                xl7.r(!aVar2.d);
                long j2 = cVar.a;
                xl7.r(!aVar2.d);
                aVar2.b = j2;
                xl7.r(!aVar2.d);
                aVar2.c = true;
                xl7.r(!aVar2.d);
                xl7.r(!aVar2.d);
                xl7.r(!aVar2.d);
                xl7.r(!aVar2.d);
                aVar2.d = true;
                bq6VarC = new tf1(aVar2);
            }
            co6Var.b.getClass();
            co6Var.b.getClass();
            return bq6VarC;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // bq6.a
    public final void d(int i) {
        a aVar = this.a;
        aVar.g = i;
        cr2 cr2Var = aVar.a;
        synchronized (cr2Var) {
            cr2Var.w = i;
        }
    }
}
