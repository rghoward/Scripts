package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements n {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ l(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.n, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.n, java.nio.file.LinkOption] */
    public static /* synthetic */ n a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof m) {
            return ((m) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof y ? j$.desugar.sun.nio.fs.g.d((y) openOption) : new l(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
