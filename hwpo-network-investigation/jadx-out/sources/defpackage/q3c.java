package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q3c {
    public static final q3c c = new q3c();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final t2c a = new t2c();

    public final t3c a(Class cls) {
        t3c m3cVar;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (t3c) obj;
        }
        t2c t2cVar = this.a;
        t2cVar.getClass();
        h4c h4cVar = u3c.a;
        if (!u1c.class.isAssignableFrom(cls)) {
            int i = h0c.a;
        }
        z2c z2cVarB = ((s2c) t2cVar.a).b(cls);
        if (z2cVarB.a()) {
            int i2 = h0c.a;
            h4c h4cVar2 = u3c.a;
            h1c h1cVar = i1c.a;
            m3cVar = new m3c(h4cVar2, z2cVarB.b());
        } else {
            int i3 = h0c.a;
            int i4 = n3c.a;
            int i5 = q2c.a;
            h4c h4cVar3 = u3c.a;
            h1c h1cVar2 = z2cVarB.c() + (-1) != 1 ? i1c.a : null;
            int i6 = y2c.a;
            m3cVar = l3c.A(z2cVarB, h4cVar3, h1cVar2);
        }
        t3c t3cVar = (t3c) concurrentHashMap.putIfAbsent(cls, m3cVar);
        return t3cVar != null ? t3cVar : m3cVar;
    }
}
