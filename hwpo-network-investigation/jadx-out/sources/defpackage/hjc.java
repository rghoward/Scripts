package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hjc extends nf6 {
    public final /* synthetic */ ujc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjc(ujc ujcVar) {
        super(20);
        this.g = ujcVar;
    }

    @Override // defpackage.nf6
    public final Object a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        a78.d(str);
        ujc ujcVar = this.g;
        ujcVar.h();
        a78.d(str);
        p8c p8cVar = ujcVar.b.c;
        lzc.U(p8cVar);
        d8c d8cVarO0 = p8cVar.o0(str);
        if (d8cVarO0 == null) {
            return null;
        }
        thc thcVar = ujcVar.a.f;
        tkc.m(thcVar);
        thcVar.n.b(str, "Populate EES config from database on cache miss. appId");
        ujcVar.o(str, ujcVar.p(str, d8cVarO0.a));
        hjc hjcVar = ujcVar.k;
        synchronized (hjcVar.c) {
            Set setEntrySet = hjcVar.b.a.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = hjcVar.b.a.entrySet();
            setEntrySet2.getClass();
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (yac) linkedHashMap.get(str);
    }
}
