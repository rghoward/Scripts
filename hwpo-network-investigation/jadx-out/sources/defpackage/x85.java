package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x85 extends f1 {
    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7b)) {
            return false;
        }
        x7b x7bVar = (x7b) obj;
        if (!x7bVar.f()) {
            return false;
        }
        boolean z = x7bVar instanceof x85;
        byte[] bArr = this.t;
        if (z) {
            return Arrays.equals(bArr, ((x85) x7bVar).t);
        }
        byte[] bArr2 = x7bVar.D().t;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.t);
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        byte[] bArr = this.t;
        messagePacker.packBinaryHeader(bArr.length);
        messagePacker.writePayload(bArr);
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.z;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final x85 D() {
        return this;
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: M */
    public final x85 D() {
        return this;
    }
}
