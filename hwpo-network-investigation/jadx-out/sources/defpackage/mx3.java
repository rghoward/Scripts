package defpackage;

import android.net.Uri;
import com.hwpo_training_app.R;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx3 implements n9, mi4 {
    public final /* synthetic */ kx3 t;

    public mx3(kx3 kx3Var) {
        this.t = kx3Var;
    }

    @Override // defpackage.n9
    public final void a(Object obj) {
        File file;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kx3 kx3Var = this.t;
        k55 k55Var = kx3Var.z;
        if (!zBooleanValue || (file = kx3Var.F) == null || file.length() == 0) {
            return;
        }
        long length = file.length();
        k55Var.getClass();
        if (length > 524288000) {
            bu8 bu8Var = kx3Var.A;
            k55Var.getClass();
            kx3Var.B.invoke(new kx3.c.a(bu8Var.b(R.string.video_file_is_too_big_error, 500)));
            return;
        }
        try {
            Uri uriFromFile = Uri.fromFile(file);
            kx3Var.B.invoke(new kx3.c.b(ws0.h(new rc9(hy3.t, uriFromFile, wy3.a(kx3Var.w, uriFromFile)))));
        } catch (Exception e) {
            e.printStackTrace();
            oh4<? super kx3.c, g2b> oh4Var = kx3Var.B;
            String message = e.getMessage();
            if (message == null) {
                message = "Error while picking video";
            }
            oh4Var.invoke(new kx3.c.a(message));
        }
    }

    @Override // defpackage.mi4
    public final di4<?> b() {
        return new pi4(1, this.t, kx3.class, "processCameraVideoRequest", "processCameraVideoRequest(Z)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n9) && (obj instanceof mi4)) {
            return xj5.a(b(), ((mi4) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
