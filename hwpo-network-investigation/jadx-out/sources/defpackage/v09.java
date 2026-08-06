package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v09 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final u09 e;

    public v09(Map<String, ? extends Object> map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new u09(this);
    }

    public final void a(Object obj, String str) {
        str.getClass();
        this.a.put(str, obj);
        i37 i37Var = (i37) this.c.get(str);
        if (i37Var != null) {
            i37Var.setValue(obj);
        }
        i37 i37Var2 = (i37) this.d.get(str);
        if (i37Var2 != null) {
            i37Var2.setValue(obj);
        }
    }
}
