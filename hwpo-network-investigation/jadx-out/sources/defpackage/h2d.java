package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h2d {
    public final k3d a;
    public final k95 b;
    public final ArrayList c;
    public final Uri d;

    public h2d(g2d g2dVar) {
        this.a = g2dVar.a;
        this.b = g2dVar.b;
        this.c = g2dVar.c;
        this.d = g2dVar.e;
    }

    public final ArrayList a(OutputStream outputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = f2d.u;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                u3d u3dVarB = ((v3d) obj).b();
                if (u3dVarB != null) {
                    arrayList3.add(u3dVarB);
                }
            }
            f2d f2dVar = !arrayList3.isEmpty() ? new f2d(outputStream, arrayList3) : null;
            if (f2dVar != null) {
                arrayList.add(f2dVar);
            }
        }
        Iterator<E> it = this.b.iterator();
        if (it.hasNext()) {
            ((w3d) it.next()).c((OutputStream) nr1.b(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
