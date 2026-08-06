package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public final ArrayList a;
        public final int[] b;
        public final int[] c;
        public final androidx.recyclerview.widget.d.a d;
        public final int e;
        public final int f;
        public final boolean g;

        public d(androidx.recyclerview.widget.d.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int i;
            int i2;
            this.a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = aVar;
            androidx.recyclerview.widget.d dVar = androidx.recyclerview.widget.d.this;
            int size = dVar.t.size();
            this.e = size;
            int size2 = dVar.u.size();
            this.f = size2;
            this.g = true;
            c cVar = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar == null || cVar.a != 0 || cVar.b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(size, size2, 0));
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                c cVar2 = (c) obj;
                for (int i4 = 0; i4 < cVar2.c; i4++) {
                    int i5 = cVar2.a + i4;
                    int i6 = cVar2.b + i4;
                    int i7 = aVar.a(i5, i6) ? 1 : 2;
                    iArr[i5] = (i6 << 4) | i7;
                    iArr2[i6] = (i5 << 4) | i7;
                }
            }
            if (this.g) {
                int size4 = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size4) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    c cVar3 = (c) obj2;
                    while (true) {
                        i = cVar3.a;
                        if (i8 < i) {
                            if (iArr[i8] == 0) {
                                int size5 = arrayList.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size5; i11++) {
                                    c cVar4 = (c) arrayList.get(i11);
                                    while (true) {
                                        i2 = cVar4.b;
                                        if (i10 < i2) {
                                            if (iArr2[i10] == 0 && aVar.b(i8, i10)) {
                                                int i12 = aVar.a(i8, i10) ? 8 : 4;
                                                iArr[i8] = (i10 << 4) | i12;
                                                iArr2[i10] = i12 | (i8 << 4);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    i10 = cVar4.c + i2;
                                }
                            }
                            i8++;
                        }
                    }
                    i8 = cVar3.c + i;
                }
            }
        }

        public static f a(ArrayDeque arrayDeque, int i, boolean z) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.a == i && fVar.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z) {
                    fVar2.b--;
                } else {
                    fVar2.b++;
                }
            }
            return fVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public final int a;
        public int b;
        public final boolean c;

        public f(int i, boolean z, int i2) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public final int a() {
            return this.d - this.c;
        }

        public final int b() {
            return this.b - this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }
}
