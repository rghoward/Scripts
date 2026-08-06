package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wr9 {
    public static final ur9 g = new ur9();
    public static final vr9 h = new vr9();
    public int d;
    public int e;
    public int f;
    public final a[] b = new a[5];
    public final ArrayList<a> a = new ArrayList<>();
    public int c = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public int a;
        public int b;
        public float c;
    }

    public final void a(float f, int i) {
        a aVar;
        int i2 = this.c;
        ArrayList<a> arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        a[] aVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            aVar = aVarArr[i4];
        } else {
            aVar = new a();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        aVar.a = i5;
        aVar.b = i;
        aVar.c = f;
        arrayList.add(aVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            a aVar2 = arrayList.get(0);
            int i8 = aVar2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    aVarArr[i9] = aVar2;
                }
            } else {
                aVar2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList<a> arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a aVar = arrayList.get(i3);
            i2 += aVar.b;
            if (i2 >= f) {
                return aVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((a) p51.b(1, arrayList)).c;
    }
}
