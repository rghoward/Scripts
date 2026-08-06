package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d3d extends f3d implements y2d {
    public final File t;

    public d3d(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.t = file;
    }

    @Override // defpackage.y2d
    public final File a() {
        return this.t;
    }
}
