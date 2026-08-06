package defpackage;

import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z85 extends g1 implements x7b {
    public static final z85 u = new z85(true);
    public static final z85 v = new z85(false);
    public final boolean t;

    public z85(boolean z) {
        this.t = z;
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
        if (x7bVar.G()) {
            return this.t == x7bVar.n().t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t ? 1231 : 1237;
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packBoolean(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        return Boolean.toString(this.t);
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.v;
    }

    public final String toString() {
        return Boolean.toString(this.t);
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: N */
    public final z85 n() {
        return this;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final z85 n() {
        return this;
    }
}
