package defpackage;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s78 implements fi8<Context, pf2<t78>> {
    public final String a;
    public final un8<t78> b;
    public final oh4<Context, List<ze2<t78>>> c;
    public final t72 d;
    public final Object e = new Object();
    public volatile p78 f;

    /* JADX WARN: Multi-variable type inference failed */
    public s78(String str, un8<t78> un8Var, oh4<? super Context, ? extends List<? extends ze2<t78>>> oh4Var, t72 t72Var) {
        this.a = str;
        this.b = un8Var;
        this.c = oh4Var;
        this.d = t72Var;
    }

    @Override // defpackage.fi8
    public final pf2<t78> a(Context context, ho5 ho5Var) {
        p78 p78Var;
        Context context2 = context;
        context2.getClass();
        ho5Var.getClass();
        p78 p78Var2 = this.f;
        if (p78Var2 != null) {
            return p78Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context2.getApplicationContext();
                    a82 df3Var = this.b;
                    oh4<Context, List<ze2<t78>>> oh4Var = this.c;
                    applicationContext.getClass();
                    List<ze2<t78>> listInvoke = oh4Var.invoke(applicationContext);
                    t72 t72Var = this.d;
                    final tr trVar = new tr(1, applicationContext, this);
                    listInvoke.getClass();
                    xx3 xx3Var = new xx3(u78.a, new vx3(0), new mh4() { // from class: r78
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            File file = (File) trVar.invoke();
                            String name = file.getName();
                            name.getClass();
                            if (!z2a.M('.', name, BuildConfig.FLAVOR).equals("preferences_pb")) {
                                qz1.a(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                                return null;
                            }
                            File absoluteFile = file.getAbsoluteFile();
                            absoluteFile.getClass();
                            return absoluteFile;
                        }
                    });
                    if (df3Var == null) {
                        df3Var = new df3();
                    }
                    this.f = new p78(new p78(new xf2(xx3Var, ws0.h(new af2(listInvoke, null)), df3Var, t72Var)));
                }
                p78Var = this.f;
                p78Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return p78Var;
    }
}
