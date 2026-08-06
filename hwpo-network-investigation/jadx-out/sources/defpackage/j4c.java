package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j4c extends l4c {
    @Override // defpackage.l4c
    public final void j(Object obj, long j, byte b) {
        if (m4c.f) {
            m4c.b(obj, j, b);
        } else {
            m4c.c(obj, j, b);
        }
    }

    @Override // defpackage.l4c
    public final boolean l(long j, Object obj) {
        return m4c.f ? m4c.n(j, obj) : m4c.o(j, obj);
    }

    @Override // defpackage.l4c
    public final void n(Object obj, long j, boolean z) {
        if (m4c.f) {
            m4c.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            m4c.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.l4c
    public final float p(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // defpackage.l4c
    public final void r(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.l4c
    public final double s(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.l4c
    public final void t(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
