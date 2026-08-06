package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f5b<Data> implements kx6<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final kx6<wm4, Data> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements lx6<Uri, InputStream> {
        @Override // defpackage.lx6
        public final kx6<Uri, InputStream> d(i07 i07Var) {
            return new f5b(i07Var.a(wm4.class, InputStream.class));
        }
    }

    public f5b(kx6<wm4, Data> kx6Var) {
        this.a = kx6Var;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Uri uri, int i, int i2, xk7 xk7Var) {
        return this.a.a(new wm4(uri.toString()), i, i2, xk7Var);
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
