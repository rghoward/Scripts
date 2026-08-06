package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zs2 implements on8 {
    public final Context a;
    public final gs2 b;

    public zs2(Context context) {
        this.a = context;
        this.b = new gs2(context);
    }

    @Override // defpackage.on8
    public final k[] a(Handler handler, d.b bVar, d.b bVar2, d.b bVar3, d.b bVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        pn6.c cVar = new pn6.c(context);
        gs2 gs2Var = this.b;
        cVar.c = gs2Var;
        cVar.d = 5000L;
        cVar.e = handler;
        cVar.f = bVar;
        cVar.g = 50;
        xl7.r(!cVar.b);
        Handler handler2 = cVar.e;
        xl7.r((handler2 == null && cVar.f == null) || !(handler2 == null || cVar.f == null));
        cVar.b = true;
        arrayList.add(new pn6(cVar));
        dq2.d dVar = new dq2.d(context);
        xl7.r(!dVar.d);
        dVar.d = true;
        if (dVar.c == null) {
            dVar.c = new dq2.f(new s80[0]);
        }
        da0 da0Var = dVar.f;
        zp2 zp2Var = dVar.g;
        if (da0Var == null) {
            if (zp2Var == null) {
                dVar.g = new zp2(context);
            }
            if (dVar.e == null) {
                dVar.e = dq2.c.a;
            }
            da0.a aVar = new da0.a(context);
            u70 u70Var = context != null ? null : dVar.b;
            Context context2 = aVar.a;
            if (context2 == null) {
                aVar.d = u70Var;
            }
            zp2 zp2Var2 = dVar.g;
            aVar.b = zp2Var2;
            aVar.c = dVar.e;
            if (zp2Var2 == null) {
                aVar.b = new zp2(context2);
            }
            dVar.f = new da0(aVar);
        } else {
            xl7.r(zp2Var == null);
            xl7.r(dVar.e == null);
        }
        arrayList.add(new bn6(this.a, gs2Var, handler, bVar2, new dq2(dVar)));
        arrayList.add(new oja(bVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new av6(bVar4, looper));
        }
        arrayList.add(new p31());
        arrayList.add(new j85(new lq0.a(context)));
        return (k[]) arrayList.toArray(new k[0]);
    }

    @Override // defpackage.on8
    public final void b(k kVar) {
        kVar.getClass();
    }
}
