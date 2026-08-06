package defpackage;

import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p95 extends g1 implements x7b {
    public static final p95 t = new p95();

    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x7b) {
            return ((x7b) obj).B();
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packNil();
    }

    @Override // defpackage.x7b
    public final String j() {
        return "null";
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.u;
    }

    public final String toString() {
        return "null";
    }
}
