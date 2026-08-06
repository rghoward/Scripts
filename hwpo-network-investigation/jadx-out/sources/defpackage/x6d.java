package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x6d extends h6d {
    public static final x6d z;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        z = new x6d("<skip trace>", uuidRandomUUID, d6d.h(uuidRandomUUID), b7d.e, m6d.c());
    }

    @Override // defpackage.i7d
    public final i7d V(String str, c7d c7dVar, h7d h7dVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.i7d
    public final c7d i() {
        return b7d.e;
    }
}
