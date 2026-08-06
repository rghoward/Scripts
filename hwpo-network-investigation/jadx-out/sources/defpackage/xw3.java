package defpackage;

import android.webkit.MimeTypeMap;
import com.intercom.twig.BuildConfig;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xw3 implements lu3 {
    public final File a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<File> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            return new xw3((File) obj);
        }
    }

    public xw3(File file) {
        this.a = file;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) {
        String str = du7.u;
        File file = this.a;
        ax3 ax3Var = new ax3(du7.a.b(file), fy3.t, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        name.getClass();
        return new tw9(ax3Var, singleton.getMimeTypeFromExtension(z2a.M('.', name, BuildConfig.FLAVOR)), jf2.v);
    }
}
