package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0b implements Comparable<m0b> {
    public final byte t;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(m0b m0bVar) {
        return xj5.b(this.t & MessagePack.Code.EXT_TIMESTAMP, m0bVar.t & MessagePack.Code.EXT_TIMESTAMP);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0b) {
            return this.t == ((m0b) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.t);
    }

    public final String toString() {
        return String.valueOf(this.t & MessagePack.Code.EXT_TIMESTAMP);
    }
}
