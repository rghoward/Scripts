package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return yo1.a.f(cv2.h.f((cv2.h) Collections.max(list, new dv2()), (cv2.h) Collections.max(list2, new dv2()))).a(list.size(), list2.size()).b((cv2.h) Collections.max(list, new ev2()), (cv2.h) Collections.max(list2, new ev2()), new ev2()).e();
    }
}
