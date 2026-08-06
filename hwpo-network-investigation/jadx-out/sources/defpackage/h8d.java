package defpackage;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h8d extends p8d implements g8d {
    public final /* synthetic */ j8d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8d(j8d j8dVar, Level level) {
        super(level);
        Objects.requireNonNull(j8dVar);
        this.i = j8dVar;
    }

    @Override // defpackage.p8d
    public final mzb c() {
        return mzb.b;
    }

    @Override // defpackage.p8d
    public final boolean d(y8d y8dVar) {
        ln4 ln4VarG = g();
        int iB1 = ln4VarG.b1();
        for (int i = 0; i < iB1; i++) {
            if (ln4VarG.d1(i).a == "eye3tag") {
                if (ln4VarG.g1(n8d.a) != null) {
                    break;
                }
                d9d d9dVar = n8d.i;
                if (ln4VarG.g1(d9dVar) != null) {
                    break;
                }
                h(d9dVar, n9d.SMALL);
                break;
            }
        }
        return super.d(y8dVar);
    }

    @Override // defpackage.p8d
    public final /* synthetic */ j8d e() {
        return this.i;
    }

    @Override // defpackage.p8d
    public final /* bridge */ /* synthetic */ h8d f() {
        return this;
    }
}
