package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gxa implements fxa {
    public final Set<ag3> a;
    public final ef0 b;
    public final pxa c;

    public gxa(Set set, ef0 ef0Var, pxa pxaVar) {
        this.a = set;
        this.b = ef0Var;
        this.c = pxaVar;
    }

    @Override // defpackage.fxa
    public final hxa a(String str, ag3 ag3Var, nva nvaVar) {
        Set<ag3> set = this.a;
        if (set.contains(ag3Var)) {
            return new hxa(this.b, str, ag3Var, nvaVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", ag3Var, set));
    }
}
