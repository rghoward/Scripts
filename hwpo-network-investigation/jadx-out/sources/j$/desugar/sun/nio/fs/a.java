package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public Set a;
    public Map b;
    public boolean c;

    public final void a(String str, Object obj) {
        ((HashMap) this.b).put(str, obj);
    }

    public final boolean b(String str) {
        return this.c || ((HashSet) this.a).contains(str);
    }
}
