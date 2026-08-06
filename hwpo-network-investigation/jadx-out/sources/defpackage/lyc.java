package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lyc implements Runnable {
    public final /* synthetic */ lzc t;

    public lyc(lzc lzcVar, nzc nzcVar) {
        this.t = lzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lzc lzcVar = this.t;
        lzcVar.e().g();
        lzcVar.k = new djc(lzcVar);
        p8c p8cVar = new p8c(lzcVar);
        p8cVar.i();
        lzcVar.c = p8cVar;
        ujc ujcVar = lzcVar.a;
        t7c t7cVarF0 = lzcVar.f0();
        a78.g(ujcVar);
        t7cVarF0.d = ujcVar;
        xvc xvcVar = new xvc(lzcVar);
        xvcVar.i();
        lzcVar.i = xvcVar;
        z0c z0cVar = new z0c(lzcVar);
        z0cVar.i();
        lzcVar.f = z0cVar;
        urc urcVar = new urc(lzcVar);
        urcVar.i();
        lzcVar.h = urcVar;
        pxc pxcVar = new pxc(lzcVar);
        pxcVar.i();
        lzcVar.e = pxcVar;
        lzcVar.d = new nic(lzcVar);
        if (lzcVar.r != lzcVar.s) {
            lzcVar.b().f.c(Integer.valueOf(lzcVar.r), Integer.valueOf(lzcVar.s), "Not all upload components initialized");
        }
        lzcVar.m.set(true);
        lzcVar.b().n.a("UploadController is now fully initialized");
        lzcVar.e().g();
        p8c p8cVar2 = lzcVar.c;
        lzc.U(p8cVar2);
        p8cVar2.q();
        p8c p8cVar3 = lzcVar.c;
        lzc.U(p8cVar3);
        p8cVar3.g();
        p8cVar3.h();
        if (p8cVar3.R()) {
            ufc ufcVar = wfc.u0;
            if (((Long) ufcVar.a(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseX = p8cVar3.X();
                tkc tkcVar = p8cVar3.a;
                tkcVar.k.getClass();
                int iDelete = sQLiteDatabaseX.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(ufcVar.a(null))});
                if (iDelete > 0) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.n.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                }
            }
        }
        if (lzcVar.i.h.a() == 0) {
            tic ticVar = lzcVar.i.h;
            lzcVar.c().getClass();
            ticVar.b(System.currentTimeMillis());
        }
        lzcVar.N();
    }
}
