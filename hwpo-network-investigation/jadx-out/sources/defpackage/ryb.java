package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ryb extends l4c {
    public final Level b;
    public final Set c;
    public final ead d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryb(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = syb.f;
        this.b = level;
        this.c = syb.f;
        this.d = syb.g;
    }

    @Override // defpackage.l4c
    public final boolean m(Level level) {
        return true;
    }

    @Override // defpackage.l4c
    public final void o(p8d p8dVar) {
        String strA = (String) p8dVar.g().g1(o9d.a);
        if (strA == null) {
            strA = (String) this.a;
        }
        if (strA == null) {
            x8d x8dVar = p8dVar.d;
            if (x8dVar == null) {
                aa0.c("cannot request log site information prior to postProcess()");
                return;
            }
            strA = x8dVar.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        syb.u(p8dVar, lyb.a(strA), this.b, this.c, this.d);
    }
}
