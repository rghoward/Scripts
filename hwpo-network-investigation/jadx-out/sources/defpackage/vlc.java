package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vlc implements Runnable {
    public final /* synthetic */ z9c t;
    public final /* synthetic */ q1d u;
    public final /* synthetic */ zmc v;

    public vlc(zmc zmcVar, z9c z9cVar, q1d q1dVar) {
        this.t = z9cVar;
        this.u = q1dVar;
        this.v = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v9c v9cVar;
        zmc zmcVar = this.v;
        zmcVar.getClass();
        lzc lzcVar = zmcVar.b;
        z9c z9cVar = this.t;
        if ("_cmp".equals(z9cVar.t) && (v9cVar = z9cVar.u) != null) {
            Bundle bundle = v9cVar.t;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    lzcVar.b().l.b(z9cVar.toString(), "Event has been filtered ");
                    z9cVar = new z9c("_cmpx", v9cVar, z9cVar.v, z9cVar.w, z9cVar.x);
                }
            }
        }
        String str = z9cVar.t;
        ujc ujcVar = lzcVar.a;
        qzc qzcVar = lzcVar.g;
        lzc.U(ujcVar);
        q1d q1dVar = this.u;
        String str2 = q1dVar.t;
        yac yacVar = TextUtils.isEmpty(str2) ? null : (yac) ujcVar.k.c(str2);
        if (yacVar == null) {
            lzcVar.b().n.b(q1dVar.t, "EES not loaded for");
            lzcVar.W();
            lzcVar.j(z9cVar, q1dVar);
            return;
        }
        try {
            zyb zybVar = yacVar.c;
            lzc.U(qzcVar);
            HashMap mapU = qzc.U(z9cVar.u.v(), true);
            String strE = s7.e(str, oh7.f, oh7.a);
            if (strE == null) {
                strE = str;
            }
            if (yacVar.a(new zxb(strE, z9cVar.w, mapU))) {
                if (zybVar.b.equals(zybVar.a)) {
                    lzcVar.W();
                    lzcVar.j(z9cVar, q1dVar);
                } else {
                    lzcVar.b().n.b(str, "EES edited event");
                    lzc.U(qzcVar);
                    z9c z9cVarK = qzc.k(zybVar.b);
                    lzcVar.W();
                    lzcVar.j(z9cVarK, q1dVar);
                }
                if (zybVar.c.isEmpty()) {
                    return;
                }
                ArrayList arrayList = zybVar.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zxb zxbVar = (zxb) obj;
                    lzcVar.b().n.b(zxbVar.a, "EES logging created event");
                    lzc.U(qzcVar);
                    z9c z9cVarK2 = qzc.k(zxbVar);
                    lzcVar.W();
                    lzcVar.j(z9cVarK2, q1dVar);
                }
                return;
            }
        } catch (dcc unused) {
            lzcVar.b().f.c(q1dVar.u, str, "EES error. appId, eventName");
        }
        lzcVar.b().n.b(str, "EES was not applied to event");
        lzcVar.W();
        lzcVar.j(z9cVar, q1dVar);
    }
}
