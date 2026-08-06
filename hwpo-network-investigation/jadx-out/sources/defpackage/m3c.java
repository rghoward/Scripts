package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m3c implements t3c {
    public final g3c a;
    public final h4c b;
    public final boolean c;

    public m3c(h4c h4cVar, g3c g3cVar) {
        h1c h1cVar = i1c.a;
        this.b = h4cVar;
        this.c = g3cVar instanceof r1c;
        this.a = g3cVar;
    }

    @Override // defpackage.t3c
    public final u1c a() {
        g3c g3cVar = this.a;
        if (g3cVar instanceof u1c) {
            return ((u1c) g3cVar).m();
        }
        p1c p1cVar = (p1c) g3cVar.c();
        boolean zK = p1cVar.u.k();
        u1c u1cVar = p1cVar.u;
        if (!zK) {
            return u1cVar;
        }
        u1cVar.n();
        return p1cVar.u;
    }

    @Override // defpackage.t3c
    public final void b(Object obj, c1c c1cVar) {
        Iterator itB = ((r1c) obj).zzb.b();
        if (itB.hasNext()) {
            ((j1c) ((Map.Entry) itB.next()).getKey()).c();
            throw null;
        }
        g4c g4cVar = ((u1c) obj).zzc;
        for (int i = 0; i < g4cVar.a; i++) {
            int i2 = g4cVar.b[i] >>> 3;
            Object obj2 = g4cVar.c[i];
            boolean z = obj2 instanceof p0c;
            b1c b1cVar = c1cVar.a;
            if (z) {
                b1cVar.r(i2, (p0c) obj2);
            } else {
                b1cVar.q(i2, (g3c) obj2);
            }
        }
    }

    @Override // defpackage.t3c
    public final void c(Object obj, Object obj2) {
        u3c.b(obj, obj2);
        if (this.c) {
            h1c h1cVar = i1c.a;
            if (((r1c) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.t3c
    public final boolean d(Object obj) {
        ((r1c) obj).zzb.c();
        return true;
    }

    @Override // defpackage.t3c
    public final int e(u1c u1cVar) {
        g4c g4cVar = u1cVar.zzc;
        int iA = g4cVar.d;
        if (iA == -1) {
            iA = 0;
            for (int i = 0; i < g4cVar.a; i++) {
                int i2 = g4cVar.b[i] >>> 3;
                p0c p0cVar = (p0c) g4cVar.c[i];
                int iA2 = b1c.a(8);
                int iA3 = b1c.a(i2) + b1c.a(16);
                int iA4 = b1c.a(24);
                int iE = p0cVar.e();
                iA += iA2 + iA2 + iA3 + k3c.a(iE, iE, iA4);
            }
            g4cVar.d = iA;
        }
        if (this.c) {
            v3c v3cVar = ((r1c) u1cVar).zzb.a;
            if (v3cVar.u > 0) {
                k1c.g(v3cVar.b(0));
                throw null;
            }
            Iterator it = v3cVar.c().iterator();
            if (it.hasNext()) {
                k1c.g((Map.Entry) it.next());
                throw null;
            }
        }
        return iA;
    }

    @Override // defpackage.t3c
    public final void f(Object obj) {
        this.b.getClass();
        g4c g4cVar = ((u1c) obj).zzc;
        if (g4cVar.e) {
            g4cVar.e = false;
        }
        h1c h1cVar = i1c.a;
        ((r1c) obj).zzb.a();
    }

    @Override // defpackage.t3c
    public final void g(Object obj, byte[] bArr, int i, int i2, i0c i0cVar) {
        u1c u1cVar = (u1c) obj;
        if (u1cVar.zzc == g4c.f) {
            u1cVar.zzc = g4c.a();
        }
        throw null;
    }

    @Override // defpackage.t3c
    public final int h(u1c u1cVar) {
        int iHashCode = u1cVar.zzc.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return ((r1c) u1cVar).zzb.a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.t3c
    public final void i(Object obj, t0c t0cVar, f1c f1cVar) {
        this.b.getClass();
        h4c.c(obj);
        throw null;
    }

    @Override // defpackage.t3c
    public final boolean j(u1c u1cVar, u1c u1cVar2) {
        if (!u1cVar.zzc.equals(u1cVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((r1c) u1cVar).zzb.equals(((r1c) u1cVar2).zzb);
        }
        return true;
    }
}
