package defpackage;

import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c95 extends g1 implements xd7 {
    public final double t;

    public c95(double d) {
        this.t = d;
    }

    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x7b)) {
            return false;
        }
        x7b x7bVar = (x7b) obj;
        if (x7bVar.J()) {
            return this.t == x7bVar.r().t;
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.t);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packDouble(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        double d = this.t;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.x;
    }

    public final String toString() {
        return Double.toString(this.t);
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: P */
    public final c95 r() {
        return this;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final c95 r() {
        return this;
    }
}
