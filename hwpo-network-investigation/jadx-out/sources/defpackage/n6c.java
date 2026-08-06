package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n6c implements m6c {
    public static final xza a = new xza(t4c.c, 6);

    @Override // defpackage.m6c
    public final boolean a() {
        return ((Boolean) a.a(0, "measurement.test.boolean_flag", false).get()).booleanValue();
    }

    @Override // defpackage.m6c
    public final long b() {
        return ((Long) a.b(1, -1L, "measurement.test.cached_long_flag").get()).longValue();
    }

    @Override // defpackage.m6c
    public final double c() {
        xza xzaVar = a;
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) xzaVar.a;
        vxc vxcVar = (vxc) atomicReferenceArray.get(2);
        if (vxcVar == null) {
            uwc uwcVar = new uwc("measurement.test.double_flag", ((jxc) xzaVar.b).a);
            while (!atomicReferenceArray.compareAndSet(2, null, uwcVar)) {
                if (atomicReferenceArray.get(2) != null) {
                    vxcVar = (vxc) atomicReferenceArray.get(2);
                    vxcVar.getClass();
                }
            }
            vxcVar = uwcVar;
        }
        return ((Double) vxcVar.get()).doubleValue();
    }

    @Override // defpackage.m6c
    public final long d() {
        return ((Long) a.b(3, -2L, "measurement.test.int_flag").get()).longValue();
    }

    @Override // defpackage.m6c
    public final long e() {
        return ((Long) a.b(4, -1L, "measurement.test.long_flag").get()).longValue();
    }

    @Override // defpackage.m6c
    public final String f() {
        return (String) a.c(5, "measurement.test.string_flag", "---").get();
    }
}
