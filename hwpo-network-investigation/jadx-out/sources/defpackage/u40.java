package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import io.ably.lib.util.AgentHeaderCreator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 implements lu3 {
    public final Uri a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Uri> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            Uri uri = (Uri) obj;
            if (v.d(uri)) {
                return new u40(uri, zk7Var);
            }
            return null;
        }
    }

    public u40(Uri uri, zk7 zk7Var) {
        this.a = uri;
        this.b = zk7Var;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) {
        String strF = th1.F(th1.v(this.a.getPathSegments()), AgentHeaderCreator.AGENT_DIVIDER, null, null, null, 62);
        zk7 zk7Var = this.b;
        ni8 ni8Var = new ni8(ev6.c(zk7Var.a.getAssets().open(strF)));
        Context context = zk7Var.a;
        return new tw9(new nw9(ni8Var, new kd2(context, 1), new r40(strF)), v.b(MimeTypeMap.getSingleton(), strF), jf2.v);
    }
}
