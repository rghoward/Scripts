package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yw3 {
    public final xy3 a;

    public yw3(Context context, xy3 xy3Var) {
        xy3Var.getClass();
        this.a = xy3Var;
    }

    public final File a() throws IOException {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        str.getClass();
        File fileCreateTempFile = File.createTempFile("JPEG_" + str + "_", ".jpg", this.a.a());
        fileCreateTempFile.getClass();
        return fileCreateTempFile;
    }
}
