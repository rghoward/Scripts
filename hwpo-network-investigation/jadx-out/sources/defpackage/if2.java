package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface if2 extends ef2 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        if2 a();
    }

    long c(of2 of2Var);

    void close();

    void d(yua yuaVar);

    Uri getUri();

    default Map<String, List<String>> k() {
        return Collections.EMPTY_MAP;
    }
}
