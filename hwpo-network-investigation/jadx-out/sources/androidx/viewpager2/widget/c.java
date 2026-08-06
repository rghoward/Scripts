package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aa0;
import defpackage.ga4;
import defpackage.pp2;
import defpackage.yt;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends RecyclerView.t {
    public androidx.viewpager2.widget.a a;
    public final ViewPager2 b;
    public final ViewPager2.k c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int a;
        public float b;
        public int c;
    }

    public c(ViewPager2 viewPager2) {
        this.b = viewPager2;
        ViewPager2.k kVar = viewPager2.C;
        this.c = kVar;
        this.d = (LinearLayoutManager) kVar.getLayoutManager();
        this.g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i) {
        androidx.viewpager2.widget.a aVar;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.U0();
            }
            d(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        a aVar2 = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            f();
            if (!this.k) {
                int i4 = aVar2.a;
                if (i4 != -1 && (aVar = this.a) != null) {
                    aVar.b(i4, 0.0f, 0);
                }
            } else if (aVar2.c == 0) {
                int i5 = this.h;
                int i6 = aVar2.a;
                if (i5 != i6) {
                    c(i6);
                }
            }
            d(0);
            e();
        }
        if (this.e == 2 && i == 0 && this.l) {
            f();
            if (aVar2.c == 0) {
                int i7 = this.i;
                int i8 = aVar2.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    c(i8);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.k = true;
        f();
        boolean z = this.j;
        a aVar = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.z.b.getLayoutDirection() == 1)) {
                        if (aVar.c != 0) {
                            i3 = aVar.a + 1;
                        }
                    }
                }
                i3 = aVar.a;
            } else if (aVar.c != 0) {
                i3 = aVar.a + 1;
            } else {
                i3 = aVar.a;
            }
            this.i = i3;
            if (this.h != i3) {
                c(i3);
            }
        } else if (this.e == 0) {
            int i4 = aVar.a;
            if (i4 == -1) {
                i4 = 0;
            }
            c(i4);
        }
        int i5 = aVar.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = aVar.b;
        int i6 = aVar.c;
        androidx.viewpager2.widget.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.b(i5, f, i6);
        }
        int i7 = aVar.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && aVar.c == 0 && this.f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i) {
        androidx.viewpager2.widget.a aVar = this.a;
        if (aVar != null) {
            aVar.c(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        androidx.viewpager2.widget.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        a aVar = this.g;
        aVar.a = -1;
        aVar.b = 0.0f;
        aVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[LOOP:2: B:64:0x013c->B:67:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b A[SYNTHETIC] */
    public final void f() {
        int top;
        int iW;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iU0 = linearLayoutManager.U0();
        a aVar = this.g;
        aVar.a = iU0;
        if (iU0 == -1) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        View viewR = linearLayoutManager.r(iU0);
        if (viewR == null) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        int i3 = ((RecyclerView.p) viewR.getLayoutParams()).b.left;
        int i4 = ((RecyclerView.p) viewR.getLayoutParams()).b.right;
        int i5 = ((RecyclerView.p) viewR.getLayoutParams()).b.top;
        int i6 = ((RecyclerView.p) viewR.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewR.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewR.getHeight() + i5 + i6;
        int width = viewR.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        int i8 = 1;
        ViewPager2.k kVar = this.c;
        if (i7 == 0) {
            top = (viewR.getLeft() - i3) - kVar.getPaddingLeft();
            if (this.b.z.b.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewR.getTop() - i5) - kVar.getPaddingTop();
        }
        int i9 = -top;
        aVar.c = i9;
        if (i9 >= 0) {
            aVar.b = height != 0 ? i9 / height : 0.0f;
            return;
        }
        int iW2 = linearLayoutManager.w();
        if (iW2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iW2, 2);
            for (int i10 = 0; i10 < iW2; i10++) {
                View viewV = linearLayoutManager.v(i10);
                if (viewV == null) {
                    aa0.c("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : yt.a;
                int[] iArr2 = iArr[i10];
                if (z) {
                    top2 = viewV.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewV.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i10];
                if (z) {
                    bottom = viewV.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewV.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ga4(i8));
            int i11 = 1;
            while (true) {
                if (i11 >= iW2) {
                    int[] iArr4 = iArr[0];
                    int i12 = iArr4[1];
                    int i13 = iArr4[0];
                    int i14 = i12 - i13;
                    if (i13 <= 0 && iArr[iW2 - 1][1] >= i14) {
                        if (linearLayoutManager.w() <= 1) {
                        }
                    }
                } else if (iArr[i11 - 1][1] == iArr[i11][0]) {
                    i11++;
                }
                iW = linearLayoutManager.w();
                for (int i15 = 0; i15 < iW; i15++) {
                    if (!yt.a(linearLayoutManager.v(i15))) {
                        aa0.c("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.w() <= 1) {
            iW = linearLayoutManager.w();
            while (i15 < iW) {
                if (!yt.a(linearLayoutManager.v(i15))) {
                    aa0.c("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        aa0.c(pp2.a(aVar.c, "Page can only be offset by a positive amount, not by "));
    }
}
