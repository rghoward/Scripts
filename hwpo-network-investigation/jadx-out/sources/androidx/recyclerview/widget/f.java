package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.sa1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final b0 a;
    public View e;
    public int d = 0;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                long j = this.a;
                return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
            }
            if (i < 64) {
                return Long.bitCount(((1 << i) - 1) & this.a);
            }
            return Long.bitCount(this.a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return ((1 << i) & this.a) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    public f(b0 b0Var) {
        this.a = b0Var;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.e0 e0VarO = RecyclerView.O(view);
        RecyclerView.f fVar = recyclerView.F;
        if (fVar != null && e0VarO != null) {
            fVar.o(e0VarO);
        }
        ArrayList arrayList = recyclerView.W;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.q) recyclerView.W.get(size)).c(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        RecyclerView.e0 e0VarO = RecyclerView.O(view);
        if (e0VarO != null) {
            if (!e0VarO.l() && !e0VarO.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(e0VarO);
                sa1.a(sb, recyclerView.B());
                return;
            } else {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "reAttach " + e0VarO);
                }
                e0VarO.j &= -257;
            }
        } else if (RecyclerView.W0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strB = recyclerView.B();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strB);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.f(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.e0 e0VarO = RecyclerView.O(childAt);
            if (e0VarO != null) {
                if (e0VarO.l() && !e0VarO.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(e0VarO);
                    sa1.a(sb, recyclerView.B());
                    return;
                } else {
                    if (RecyclerView.X0) {
                        Log.d("RecyclerView", "tmpDetach " + e0VarO);
                    }
                    e0VarO.a(256);
                }
            }
        } else if (RecyclerView.W0) {
            throw new IllegalArgumentException("No view at offset " + iF + recyclerView.B());
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a aVar = this.b;
            int iB = i - (i2 - aVar.b(i2));
            if (iB == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.e0 e0VarO = RecyclerView.O(view);
        if (e0VarO != null) {
            View view2 = e0VarO.a;
            RecyclerView recyclerView = this.a.a;
            int i = e0VarO.q;
            if (i != -1) {
                e0VarO.p = i;
            } else {
                e0VarO.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.R()) {
                view2.setImportantForAccessibility(4);
            } else {
                e0VarO.q = 4;
                recyclerView.O0.add(e0VarO);
            }
        }
    }

    public final void j(View view) {
        RecyclerView.e0 e0VarO;
        if (!this.c.remove(view) || (e0VarO = RecyclerView.O(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.a.a;
        int i = e0VarO.p;
        if (recyclerView.R()) {
            e0VarO.q = i;
            recyclerView.O0.add(e0VarO);
        } else {
            e0VarO.a.setImportantForAccessibility(i);
        }
        e0VarO.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
