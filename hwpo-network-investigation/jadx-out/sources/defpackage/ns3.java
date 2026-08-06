package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ns3 {
    js3[] a();

    default js3[] b(Uri uri, Map<String, List<String>> map) {
        return a();
    }
}
