package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h6d extends d6d {
    public final c7d y;

    public h6d(String str, d6d d6dVar, c7d c7dVar, h7d h7dVar) {
        super(str, d6dVar, h7dVar);
        xl7.g(c7dVar.c);
        this.y = c7dVar;
    }

    @Override // defpackage.i7d
    public final c7d g() {
        return c7d.a(this.y, i());
    }

    public h6d(String str, UUID uuid, String str2, c7d c7dVar, h7d h7dVar) {
        super(str, uuid, str2, h7dVar);
        xl7.g(c7dVar.c);
        this.y = c7dVar;
    }
}
