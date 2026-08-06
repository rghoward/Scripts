package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p9c {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final v9c g;

    public p9c(tkc tkcVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        v9c v9cVar;
        a78.d(str2);
        a78.d(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.b(thc.o(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            v9cVar = new v9c(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.a("Param name can't be null");
                    it.remove();
                } else {
                    yzc yzcVar = tkcVar.i;
                    tkc.k(yzcVar);
                    Object objP = yzcVar.p(bundle2.get(next), next);
                    if (objP == null) {
                        thc thcVar3 = tkcVar.f;
                        tkc.m(thcVar3);
                        thcVar3.i.b(tkcVar.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        yzc yzcVar2 = tkcVar.i;
                        tkc.k(yzcVar2);
                        yzcVar2.x(bundle2, next, objP);
                    }
                }
            }
            v9cVar = new v9c(bundle2);
        }
        this.g = v9cVar;
    }

    public final p9c a(tkc tkcVar, long j) {
        return new p9c(tkcVar, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String string = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        ux1.b(sb, "Event{appId='", str, "', name='", str2);
        return w27.a(sb, "', params=", string, "}");
    }

    public p9c(tkc tkcVar, String str, String str2, String str3, long j, long j2, long j3, v9c v9cVar) {
        a78.d(str2);
        a78.d(str3);
        a78.g(v9cVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.c(thc.o(str2), thc.o(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = v9cVar;
    }
}
