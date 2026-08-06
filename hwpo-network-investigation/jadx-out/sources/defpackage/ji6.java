package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ji6 {
    public static final rlb a(qlb qlbVar, LocalDate localDate, Map<LocalDate, ? extends m21.a> map) {
        localDate.getClass();
        LocalDate localDateNow = LocalDate.now();
        List<LocalDate> list = qlbVar.a;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (LocalDate localDate2 : list) {
            arrayList.add(new zl2(localDate2, map.get(localDate2), xj5.a(localDate2, localDate), xj5.a(localDate2, localDateNow)));
        }
        return new rlb(((zl2) th1.y(arrayList)).a, arrayList);
    }
}
