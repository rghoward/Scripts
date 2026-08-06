package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import defpackage.hf8;
import defpackage.iu1;
import defpackage.kc6;
import defpackage.m76;
import defpackage.mh4;
import defpackage.o85;
import defpackage.oh4;
import defpackage.u93;
import defpackage.uu1;
import defpackage.wp5;
import defpackage.wt8;
import defpackage.y0a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final u93 a = new u93(a.u);
    public static final y0a b = new y0a(b.u);
    public static final uu1 c = new uu1(e.u);
    public static final y0a d = new y0a(c.u);
    public static final y0a e = new y0a(d.u);
    public static final y0a f = new y0a(f.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<Configuration> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.a("LocalConfiguration");
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<Context> {
        public static final b u = new b(0);

        @Override // defpackage.mh4
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.a("LocalContext");
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<o85> {
        public static final c u = new c(0);

        @Override // defpackage.mh4
        public final o85 invoke() {
            AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<wt8> {
        public static final d u = new d(0);

        @Override // defpackage.mh4
        public final wt8 invoke() {
            AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements oh4<iu1, Resources> {
        public static final e u = new e(1);

        @Override // defpackage.oh4
        public final Resources invoke(iu1 iu1Var) {
            iu1 iu1Var2 = iu1Var;
            iu1Var2.o(AndroidCompositionLocals_androidKt.a);
            return ((Context) iu1Var2.o(AndroidCompositionLocals_androidKt.b)).getResources();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<View> {
        public static final f u = new f(0);

        @Override // defpackage.mh4
        public final View invoke() {
            AndroidCompositionLocals_androidKt.a("LocalView");
            throw null;
        }
    }

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final hf8<m76> getLocalLifecycleOwner() {
        return kc6.a;
    }
}
