package j$.util.stream;

import j$.desugar.sun.nio.fs.g;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return g.o(((List) obj).toArray());
    }
}
