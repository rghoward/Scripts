package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oad extends cyb {
    public final Map b;

    public oad(ln4 ln4Var, ln4 ln4Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, ln4Var);
        d(linkedHashMap, ln4Var2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((d9d) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, ln4 ln4Var) {
        for (int i = 0; i < ln4Var.b1(); i++) {
            d9d d9dVarD1 = ln4Var.d1(i);
            Object obj = linkedHashMap.get(d9dVarD1);
            boolean z = d9dVarD1.c;
            Class cls = d9dVarD1.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(d9dVarD1, arrayList);
                }
                arrayList.add(cls.cast(ln4Var.e1(i)));
            } else {
                linkedHashMap.put(d9dVarD1, cls.cast(ln4Var.e1(i)));
            }
        }
    }

    @Override // defpackage.cyb
    public final void a(ead eadVar, y9d y9dVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            d9d d9dVar = (d9d) entry.getKey();
            Object value = entry.getValue();
            if (d9dVar.c) {
                eadVar.b(d9dVar, ((List) value).iterator(), y9dVar);
            } else {
                eadVar.a(d9dVar, value, y9dVar);
            }
        }
    }

    @Override // defpackage.cyb
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.cyb
    public final Set c() {
        return this.b.keySet();
    }
}
