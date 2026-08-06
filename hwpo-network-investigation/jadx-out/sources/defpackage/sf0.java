package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 {
    public final ByteBuffer a = ByteBuffer.allocateDirect(500);
    public uf7.d b;

    public final void a(ArrayList arrayList) {
        uf7.d dVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((uf7.c) arrayList.get(i)).a == 1) {
                try {
                    dVar = new uf7.d((uf7.c) arrayList.get(i));
                } catch (uf7.b unused) {
                    dVar = null;
                }
                this.b = dVar;
            }
        }
    }
}
