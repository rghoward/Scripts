package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lw {
    public static final iw a = new iw(BuildConfig.FLAVOR);

    public static final List a(iw iwVar, int i, int i2, jw jwVar) {
        List<iw.c<? extends iw.a>> list;
        if (i == i2 || (list = iwVar.t) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= iwVar.u.length()) {
            if (jwVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                iw.c<? extends iw.a> cVar = list.get(i3);
                if (((Boolean) jwVar.invoke(cVar.a)).booleanValue()) {
                    arrayList.add(cVar);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            iw.c<? extends iw.a> cVar2 = list.get(i3);
            if (jwVar != null ? ((Boolean) jwVar.invoke(cVar2.a)).booleanValue() : true) {
                int i4 = cVar2.b;
                int i5 = cVar2.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new iw.c((iw.a) cVar2.a, uh8.g(cVar2.b, i, i2) - i, uh8.g(i5, i, i2) - i, cVar2.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
