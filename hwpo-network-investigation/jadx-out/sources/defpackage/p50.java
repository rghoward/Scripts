package defpackage;

import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 implements jac {
    public static final /* synthetic */ p50 t = new p50();

    public static final long b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static z6d d(String str) {
        boolean z;
        i7d i7dVarX;
        c7d c7dVar = b7d.e;
        h7d h7dVarC = m6d.c();
        i7d i7dVar = h7dVarC.b;
        if (i7dVar == x6d.z) {
            i7dVar = null;
            m6d.b(h7dVarC, null);
            z = true;
        } else {
            z = false;
        }
        if (i7dVar == null) {
            UUID uuidB = n6d.c.b();
            String strH = d6d.h(uuidB);
            f6d f6dVar = u6d.z;
            q95 q95Var = (q95) m6d.a.get();
            if (!q95Var.isEmpty()) {
                q95Var.forEach(new v6d());
            }
            i7dVarX = new w6d(uuidB, strH, str, c7dVar, f6dVar, h7dVarC);
        } else {
            i7dVarX = i7dVar instanceof g6d ? ((g6d) i7dVar).X(str, c7dVar, false, h7dVarC) : i7dVar.V(str, c7dVar, h7dVarC);
        }
        m6d.b(h7dVarC, i7dVarX);
        return new z6d(i7dVarX, z);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().b());
    }
}
