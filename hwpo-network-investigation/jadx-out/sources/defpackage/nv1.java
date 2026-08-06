package defpackage;

import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final gv1 c;
    public final gv1 d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public nv1(Executor executor, gv1 gv1Var, gv1 gv1Var2) {
        this.b = executor;
        this.c = gv1Var;
        this.d = gv1Var2;
    }

    public static HashSet a(gv1 gv1Var) {
        HashSet hashSet = new HashSet();
        b bVarC = gv1Var.c();
        if (bVarC != null) {
            Iterator<String> itKeys = bVarC.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
