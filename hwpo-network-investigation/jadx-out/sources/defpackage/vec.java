package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vec extends rmc {
    public final /* synthetic */ t9a u;
    public final /* synthetic */ mkc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vec(mkc mkcVar, t9a t9aVar, t9a t9aVar2) {
        super(t9aVar);
        this.u = t9aVar2;
        this.v = mkcVar;
    }

    @Override // defpackage.rmc
    public final void a() {
        HashMap map;
        try {
            mkc mkcVar = this.v;
            wec wecVar = mkcVar.a.m;
            String str = mkcVar.b;
            Bundle bundle = new Bundle();
            HashMap map2 = qmc.a;
            synchronized (qmc.class) {
                map = qmc.a;
                map.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
            if (map.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
            }
            if (map.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
            }
            mkc mkcVar2 = this.v;
            t9a t9aVar = this.u;
            String str2 = mkcVar2.b;
            wecVar.j(str, bundle, new jic(mkcVar2, t9aVar));
        } catch (RemoteException e) {
            mkc mkcVar3 = this.v;
            nkc nkcVar = mkc.c;
            Object[] objArr = {mkcVar3.b};
            nkcVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", nkc.c(nkcVar.a, "error requesting in-app review for %s", objArr), e);
            }
            this.u.c(new RuntimeException(e));
        }
    }
}
