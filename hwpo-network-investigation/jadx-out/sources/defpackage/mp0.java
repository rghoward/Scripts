package defpackage;

import j$.time.LocalDate;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 implements i2d {
    public static final if8 a = new if8();

    public static final LocalDate b(q09 q09Var, LocalDate localDate) {
        q09Var.getClass();
        if (localDate != null) {
            return localDate;
        }
        Long l = (Long) q09Var.a("com.hwpo_training_app.client.ui.bottom_tabs.workouts.WorkoutsViewModel.INITIAL_DATE");
        LocalDate localDateP = l != null ? yk2.p(l.longValue()) : null;
        return localDateP == null ? LocalDate.now() : localDateP;
    }

    public static final InputStream c(h2d h2dVar) throws IOException {
        InputStream inputStreamA = h2dVar.a.a(h2dVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamA);
        ArrayList arrayList2 = h2dVar.c;
        if (!arrayList2.isEmpty()) {
            int i = e2d.u;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                m3d m3dVarA = ((v3d) obj).a();
                if (m3dVarA != null) {
                    arrayList3.add(m3dVarA);
                }
            }
            e2d e2dVar = !arrayList3.isEmpty() ? new e2d(inputStreamA, arrayList3) : null;
            if (e2dVar != null) {
                arrayList.add(e2dVar);
            }
        }
        Iterator<E> it = h2dVar.b.iterator();
        if (it.hasNext()) {
            ((w3d) it.next()).b((InputStream) nr1.b(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
