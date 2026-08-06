package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx3 implements n9, mi4 {
    public final /* synthetic */ kx3 t;

    public lx3(kx3 kx3Var) {
        this.t = kx3Var;
    }

    @Override // defpackage.n9
    public final void a(Object obj) {
        kx3 kx3Var;
        File file;
        if (((Boolean) obj).booleanValue() && (file = (kx3Var = this.t).F) != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStreamA = kx3Var.x.a(Uri.fromFile(file));
                File fileA = kx3Var.y.a();
                byteArrayOutputStreamA.writeTo(new FileOutputStream(fileA));
                Uri uriFromFile = Uri.fromFile(fileA);
                kx3Var.B.invoke(new kx3.c.b(ws0.h(new rc9(hy3.t, uriFromFile, wy3.a(kx3Var.w, uriFromFile)))));
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
                oh4<? super kx3.c, g2b> oh4Var = kx3Var.B;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error while picking photo";
                }
                oh4Var.invoke(new kx3.c.a(message));
                g2b g2bVar = g2b.a;
            }
        }
    }

    @Override // defpackage.mi4
    public final di4<?> b() {
        return new pi4(1, this.t, kx3.class, "processCameraRequest", "processCameraRequest(Z)V", 0);
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
