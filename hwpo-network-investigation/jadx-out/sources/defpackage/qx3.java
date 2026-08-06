package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qx3 implements kt8<File> {
    public final File t;

    public qx3(File file) {
        ov9.d(file, "Argument must not be null");
        this.t = file;
    }

    @Override // defpackage.kt8
    public final Class<File> c() {
        return this.t.getClass();
    }

    @Override // defpackage.kt8
    public final File get() {
        return this.t;
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return 1;
    }

    @Override // defpackage.kt8
    public final void a() {
    }
}
