package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ezc {
    public wkc a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ lzc e;

    public /* synthetic */ ezc(lzc lzcVar) {
        this.e = lzcVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    public final boolean a(long j, tjc tjcVar) {
        wkc wkcVar;
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || ((((tjc) this.c.get(0)).E() / 1000) / 60) / 60 == ((tjcVar.E() / 1000) / 60) / 60) {
            long jF = this.d + ((long) tjcVar.f());
            lzc lzcVar = this.e;
            if (!lzcVar.f0().r(null, wfc.Y0)) {
                lzcVar.f0();
                if (jF < Math.max(0, ((Integer) wfc.j.a(null)).intValue())) {
                    this.d = jF;
                    this.c.add(tjcVar);
                    this.b.add(Long.valueOf(j));
                    wkcVar = this.a;
                    if (this.c.size() < Math.max(1, lzcVar.f0().p(wkcVar != null ? wkcVar.x() : null, wfc.k))) {
                        return true;
                    }
                }
            } else if (this.c.isEmpty()) {
                this.d = jF;
                this.c.add(tjcVar);
                this.b.add(Long.valueOf(j));
                wkcVar = this.a;
                if (this.c.size() < Math.max(1, lzcVar.f0().p(wkcVar != null ? wkcVar.x() : null, wfc.k))) {
                    return true;
                }
            } else {
                lzcVar.f0();
                if (jF < Math.max(0, ((Integer) wfc.j.a(null)).intValue())) {
                    this.d = jF;
                    this.c.add(tjcVar);
                    this.b.add(Long.valueOf(j));
                    wkcVar = this.a;
                    if (this.c.size() < Math.max(1, lzcVar.f0().p(wkcVar != null ? wkcVar.x() : null, wfc.k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
