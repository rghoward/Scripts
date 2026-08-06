package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements uwa {
        @Override // defpackage.uwa
        public final Drawable b() {
            return null;
        }
    }

    public static final f50 a(k85 k85Var, b85 b85Var, oh4 oh4Var, nz1 nz1Var, jt1 jt1Var, int i) {
        e50 e50Var = f50.N;
        jt1Var.e(1645646697);
        if ((i & 8) != 0) {
            oh4Var = null;
        }
        if ((i & 16) != 0) {
            nz1Var = nz1.a.b;
        }
        jt1Var.e(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            k85 k85VarA = x6b.a(k85Var, jt1Var);
            c(k85VarA);
            jt1Var.e(1094691773);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new f50(k85VarA, b85Var);
                jt1Var.C(objF);
            }
            f50 f50Var = (f50) objF;
            jt1Var.H();
            f50Var.F = e50Var;
            f50Var.G = oh4Var;
            f50Var.H = nz1Var;
            f50Var.I = 1;
            f50Var.J = ((Boolean) jt1Var.F(me5.a)).booleanValue();
            f50Var.M.setValue(b85Var);
            f50Var.L.setValue(k85VarA);
            f50Var.d();
            jt1Var.H();
            Trace.endSection();
            jt1Var.H();
            return f50Var;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static void b(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + sk0.c("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final void c(k85 k85Var) {
        Object obj = k85Var.b;
        if (obj instanceof k85.a) {
            z90.a("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof l75) {
            b("ImageBitmap");
            throw null;
        }
        if (obj instanceof n85) {
            b("ImageVector");
            throw null;
        }
        if (obj instanceof es7) {
            b("Painter");
            throw null;
        }
        if (k85Var.c == null) {
            return;
        }
        z90.a("request.target must be null.");
    }
}
