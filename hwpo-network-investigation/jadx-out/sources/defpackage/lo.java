package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lo implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ lo u = new lo();

    public static final rl3 b(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        ml3 ml3Var = new ml3(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) u30.z(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            ml3Var.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) u30.z(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i4 = ml3Var.d;
                    List<Annotation>[] listArr = ml3Var.f;
                    List<Annotation> arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(1);
                        listArr[ml3Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        rl3 rl3Var = new rl3(str, enumArr);
        rl3Var.b = ml3Var;
        return rl3Var;
    }

    public static final int c(ob4 ob4Var, int i) {
        boolean z = xj5.b(ob4Var.t, ob4.v.t) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().N());
    }
}
