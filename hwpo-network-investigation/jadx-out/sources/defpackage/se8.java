package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class se8 {
    public static final ef8 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(se8.class, ec0.a);
        map2.remove(se8.class);
        map.put(mf1.class, xb0.a);
        map2.remove(mf1.class);
        map.put(roa.class, gc0.a);
        map2.remove(roa.class);
        map.put(ud6.class, ac0.a);
        map2.remove(ud6.class);
        map.put(pd6.class, zb0.a);
        map2.remove(pd6.class);
        map.put(zm4.class, yb0.a);
        map2.remove(zm4.class);
        map.put(i1a.class, fc0.a);
        map2.remove(i1a.class);
        a = new ef8(new HashMap(map), new HashMap(map2), ef8.a.a);
    }

    public abstract mf1 a();
}
