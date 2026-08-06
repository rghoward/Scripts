package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class re8 {
    public static final ef8 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(re8.class, dc0.a);
        map2.remove(re8.class);
        map.put(pu6.class, cc0.a);
        map2.remove(pu6.class);
        map.put(ou6.class, bc0.a);
        map2.remove(ou6.class);
        a = new ef8(new HashMap(map), new HashMap(map2), ef8.a.a);
    }

    public abstract pu6 a();
}
