package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx3 implements n9, mi4 {
    public final /* synthetic */ kx3 t;

    public nx3(kx3 kx3Var) {
        this.t = kx3Var;
    }

    @Override // defpackage.n9
    public final void a(Object obj) {
        List listT;
        hy3 hy3Var;
        List list = (List) obj;
        list.getClass();
        kx3 kx3Var = this.t;
        ContentResolver contentResolver = kx3Var.w;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        long jD = wy3.d(contentResolver, ((rc9) obj2).b);
                        kx3Var.z.getClass();
                        if (jD > 524288000) {
                            arrayList2.add(obj2);
                        }
                    }
                    Set<rc9> setX = th1.X(arrayList2);
                    Set<rc9> set = setX;
                    Set<rc9> setT = set instanceof Collection ? set : th1.T(set);
                    if (setT.isEmpty()) {
                        listT = th1.T(arrayList);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        while (i < size2) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            if (!setT.contains(obj3)) {
                                arrayList3.add(obj3);
                            }
                        }
                        listT = arrayList3;
                    }
                    if (!listT.isEmpty()) {
                        kx3Var.B.invoke(new kx3.c.b(listT));
                    }
                    kx3Var.a(setX);
                    return;
                }
                Uri uri = (Uri) it.next();
                String strB = wy3.b(contentResolver, uri);
                hy3.Companion.getClass();
                hy3 hy3Var2 = hy3.t;
                if (strB == null || strB.length() == 0) {
                    hy3Var = hy3.w;
                } else if (w2a.n(strB, AppearanceType.IMAGE, false)) {
                    hy3Var = hy3Var2;
                } else {
                    hy3Var = w2a.n(strB, "video", false) ? hy3.u : hy3.v;
                }
                int iOrdinal = hy3Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new ib7();
                    }
                    arrayList.add(new rc9(hy3Var, uri, wy3.a(contentResolver, uri)));
                } else {
                    kx3Var.x.a(uri).writeTo(new FileOutputStream(kx3Var.y.a()));
                    arrayList.add(new rc9(hy3Var2, uri, wy3.a(contentResolver, uri)));
                }
            }
        } catch (Exception e) {
            oh4<? super kx3.c, g2b> oh4Var = kx3Var.B;
            String message = e.getMessage();
            if (message == null) {
                message = "Error while picking photo";
            }
            oh4Var.invoke(new kx3.c.a(message));
        }
    }

    @Override // defpackage.mi4
    public final di4<?> b() {
        return new pi4(1, this.t, kx3.class, "processMultipleFilesRequest", "processMultipleFilesRequest(Ljava/util/List;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n9) && (obj instanceof mi4)) {
            return xj5.a(b(), ((mi4) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
