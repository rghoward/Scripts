package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u6d extends d6d implements g6d {
    public static final f6d z = new f6d();
    public final Exception y;

    public u6d(UUID uuid, String str, Exception exc, h7d h7dVar) {
        super("<missing root>", uuid, str, h7dVar);
        this.y = exc;
    }

    @Override // defpackage.i7d
    public final i7d V(String str, c7d c7dVar, h7d h7dVar) {
        AtomicReference atomicReference = m6d.a;
        return X(str, c7dVar, true, h7dVar);
    }

    @Override // defpackage.g6d
    public final w6d X(String str, c7d c7dVar, boolean z2, h7d h7dVar) {
        if (z2) {
            AtomicReference atomicReference = m6d.a;
        }
        return new w6d(str, this, c7dVar, z2, h7dVar);
    }

    @Override // defpackage.g6d
    public final Exception f() {
        return this.y;
    }

    @Override // defpackage.i7d
    public final c7d g() {
        return b7d.e;
    }
}
