package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class qy0 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends qy0 {
        @Override // defpackage.qy0
        public final List<? extends q21.a> a(Executor executor) {
            return Arrays.asList(new dp1(), new jq2(executor));
        }

        @Override // defpackage.qy0
        public final List<? extends g52.a> b() {
            return Collections.singletonList(new tk7());
        }
    }

    public List<? extends q21.a> a(Executor executor) {
        return Collections.singletonList(new jq2(executor));
    }

    public List<? extends g52.a> b() {
        return Collections.EMPTY_LIST;
    }
}
