package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements OpenOption {
    public final /* synthetic */ n a;

    public /* synthetic */ m(n nVar) {
        this.a = nVar;
    }

    public static /* synthetic */ OpenOption a(n nVar) {
        if (nVar == null) {
            return null;
        }
        if (nVar instanceof l) {
            return ((l) nVar).a;
        }
        if (nVar instanceof LinkOption) {
            return java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return nVar instanceof y ? j$.desugar.sun.nio.fs.g.d((y) nVar) : new m(nVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        n nVar = this.a;
        if (obj instanceof m) {
            obj = ((m) obj).a;
        }
        return nVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
