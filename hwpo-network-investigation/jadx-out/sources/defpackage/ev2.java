package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        cv2.h hVar = (cv2.h) obj;
        cv2.h hVar2 = (cv2.h) obj2;
        boolean z = hVar.x;
        int i = hVar.C;
        Object objA = (z && hVar.A) ? cv2.k : cv2.k.a();
        hVar.y.getClass();
        yo1 yo1VarB = yo1.a.c(hVar.R, hVar2.R).b(Integer.valueOf(hVar.D), Integer.valueOf(hVar2.D), objA);
        if (hVar.N && hVar.P) {
            yo1VarB = yo1VarB.a(hVar.Q, hVar2.Q);
        }
        return yo1VarB.c(hVar.O, hVar2.O).b(Integer.valueOf(i), Integer.valueOf(hVar2.C), objA).e();
    }
}
