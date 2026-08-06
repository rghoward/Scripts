package defpackage;

import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr {
    public static final int a(List<uh1> list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iG = ws0.g(list);
        for (int i2 = 1; i2 < iG; i2++) {
            if (uh1.d(list.get(i2).a) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] b(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = u7d.l(((uh1) list.get(i3)).a);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((uh1) list.get(i3)).a;
            if (uh1.d(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = u7d.l(uh1.b(0.0f, ((uh1) list.get(1)).a));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = u7d.l(uh1.b(0.0f, ((uh1) list.get(i3 - 1)).a));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = u7d.l(uh1.b(0.0f, ((uh1) list.get(i3 - 1)).a));
                    i4 += 2;
                    iArr2[i5] = u7d.l(uh1.b(0.0f, ((uh1) list.get(i3 + 1)).a));
                }
                i4 = i2;
            } else {
                iArr2[i4] = u7d.l(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] c(int i, List list, List list2) {
        if (i == 0) {
            if (list != null) {
                return th1.R(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long j = ((uh1) list2.get(i3)).a;
            float fFloatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / (list2.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (uh1.d(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static final void d(List<uh1> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            z90.a("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            z90.a("colors and colorStops arguments must have equal length.");
        }
    }
}
