package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final b a;
    public final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i;
            int i2;
            int i3;
            int i4 = this.a;
            int i5 = 2;
            if ((i4 & 7) != 0) {
                int i6 = this.d;
                int i7 = this.b;
                if (i6 > i7) {
                    i3 = 1;
                } else {
                    i3 = i6 == i7 ? 2 : 4;
                }
                if ((i3 & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 112) != 0) {
                int i8 = this.d;
                int i9 = this.c;
                if (i8 > i9) {
                    i2 = 1;
                } else {
                    i2 = i8 == i9 ? 2 : 4;
                }
                if (((i2 << 4) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 1792) != 0) {
                int i10 = this.e;
                int i11 = this.b;
                if (i10 > i11) {
                    i = 1;
                } else {
                    i = i10 == i11 ? 2 : 4;
                }
                if (((i << 8) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 28672) != 0) {
                int i12 = this.e;
                int i13 = this.c;
                if (i12 > i13) {
                    i5 = 1;
                } else if (i12 != i13) {
                    i5 = 4;
                }
                if (((i5 << 12) & i4) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i);

        int e(View view);
    }

    public i0(b bVar) {
        this.a = bVar;
        a aVar = new a();
        aVar.a = 0;
        this.b = aVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        b bVar = this.a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewD = bVar.d(i);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.b;
            aVar.b = iB;
            aVar.c = iC;
            aVar.d = iA;
            aVar.e = iE;
            if (i3 != 0) {
                aVar.a = i3;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i4 != 0) {
                aVar.a = i4;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.b;
        aVar.b = iB;
        aVar.c = iC;
        aVar.d = iA;
        aVar.e = iE;
        aVar.a = 24579;
        return aVar.a();
    }
}
