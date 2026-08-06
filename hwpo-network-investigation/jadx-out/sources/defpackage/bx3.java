package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bx3 implements fp5<File> {
    public final boolean a;

    public bx3(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fp5
    public final String a(File file, zk7 zk7Var) {
        File file2 = file;
        if (!this.a) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
