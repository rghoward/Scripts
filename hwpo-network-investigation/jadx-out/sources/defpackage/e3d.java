package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e3d extends g3d implements y2d {
    public final FileOutputStream t;
    public final File u;

    public e3d(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.t = fileOutputStream;
        this.u = file;
    }

    @Override // defpackage.y2d
    public final File a() {
        return this.u;
    }
}
