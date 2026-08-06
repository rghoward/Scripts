package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x2d {
    public OutputStream a;
    public e3d b;

    public final void a(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) nr1.b(arrayList);
        if (outputStream instanceof e3d) {
            this.b = (e3d) outputStream;
            this.a = (OutputStream) arrayList.get(0);
        }
    }
}
