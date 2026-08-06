package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zkc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ zmc u;

    public zkc(zmc zmcVar, q1d q1dVar) {
        this.t = q1dVar;
        this.u = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zmc zmcVar = this.u;
        zmcVar.b.W();
        lzc lzcVar = zmcVar.b;
        lzcVar.e().g();
        lzcVar.m0();
        q1d q1dVar = this.t;
        a78.g(q1dVar);
        String str = q1dVar.t;
        a78.d(str);
        int i = 0;
        if (lzcVar.f0().r(null, wfc.y0)) {
            lzcVar.c().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iP = lzcVar.f0().p(null, wfc.h0);
            lzcVar.f0();
            long jLongValue = jCurrentTimeMillis - ((Long) wfc.e.a(null)).longValue();
            while (i < iP && lzcVar.I(jLongValue, null)) {
                i++;
            }
        } else {
            lzcVar.f0();
            long jIntValue = ((Integer) wfc.l.a(null)).intValue();
            while (i < jIntValue && lzcVar.I(0L, str)) {
                i++;
            }
        }
        if (lzcVar.f0().r(null, wfc.z0)) {
            lzcVar.e().g();
            lzcVar.H();
        }
        jyc jycVar = lzcVar.j;
        int iA = pk.a(q1dVar.X);
        jycVar.g();
        if (iA != 2 || jyc.j(str)) {
            return;
        }
        ujc ujcVar = jycVar.b.a;
        lzc.U(ujcVar);
        dhc dhcVarS = ujcVar.s(str);
        if (dhcVarS == null || !dhcVarS.L() || dhcVarS.M().y().isEmpty()) {
            return;
        }
        lzcVar.b().n.b(str, "[sgtm] Going background, trigger client side upload. appId");
        lzcVar.c().getClass();
        lzcVar.r(System.currentTimeMillis(), str);
    }
}
