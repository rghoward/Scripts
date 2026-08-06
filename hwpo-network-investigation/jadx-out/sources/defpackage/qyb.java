package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qyb implements hyb {
    public final Level a;
    public final Set b;
    public final ead c;

    public qyb(Level level, Set set, ead eadVar) {
        this.a = level;
        this.b = set;
        this.c = eadVar;
    }

    @Override // defpackage.hyb
    public final l4c a(String str) {
        return new syb(str, this.a, this.b, this.c);
    }
}
