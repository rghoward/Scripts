package j$.io;

import j$.nio.file.Path;
import j$.nio.file.j;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FileRetargetClass {
    public static Path toPath(File file) {
        return j.a.b(file.getPath(), new String[0]);
    }
}
