package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w6d extends h6d implements g6d {
    public final boolean A;
    public final Exception z;

    /* JADX WARN: Multi-variable type inference failed */
    public w6d(String str, g6d g6dVar, c7d c7dVar, boolean z, h7d h7dVar) {
        super("<missing root>:".concat(str), (d6d) g6dVar, c7d.a(c7dVar, b7d.f), h7dVar);
        this.z = g6dVar.f();
        this.A = z;
    }

    @Override // defpackage.i7d
    public final i7d V(String str, c7d c7dVar, h7d h7dVar) {
        AtomicReference atomicReference = m6d.a;
        return X(str, c7dVar, true, h7dVar);
    }

    @Override // defpackage.g6d
    public final w6d X(String str, c7d c7dVar, boolean z, h7d h7dVar) {
        boolean z2 = this.A;
        if (z && !z2) {
            AtomicReference atomicReference = m6d.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new w6d(str, this, c7dVar, z3, h7dVar);
    }

    @Override // defpackage.g6d
    public final Exception f() {
        return this.z;
    }

    @Override // defpackage.i7d
    public final c7d i() {
        return b7d.e;
    }

    public w6d(UUID uuid, String str, String str2, c7d c7dVar, Exception exc, h7d h7dVar) {
        super("<missing root>:".concat(str2), uuid, str, c7d.a(c7dVar, b7d.f), h7dVar);
        this.z = exc;
        this.A = false;
    }
}
