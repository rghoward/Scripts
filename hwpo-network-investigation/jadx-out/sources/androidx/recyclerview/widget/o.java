package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.aa0;
import defpackage.yra;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public static final ThreadLocal<o> x = new ThreadLocal<>();
    public static final a y = new a();
    public long u;
    public long v;
    public final ArrayList<RecyclerView> t = new ArrayList<>();
    public final ArrayList<c> w = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i = cVar4.b - cVar3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.c - cVar4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                z90.a("Layout positions must be non-negative");
                return;
            }
            if (i2 < 0) {
                z90.a("Pixel distance must be non-negative");
                return;
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.G;
            if (recyclerView.F == null || oVar == null || !oVar.i) {
                return;
            }
            if (z) {
                if (!recyclerView.x.g()) {
                    oVar.j(recyclerView.F.f(), this);
                }
            } else if (!recyclerView.Q()) {
                oVar.i(this.a, this.b, recyclerView.B0, this);
            }
            int i = this.d;
            if (i > oVar.j) {
                oVar.j = i;
                oVar.k = z;
                recyclerView.v.n();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.e0 c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.y.h();
        for (int i2 = 0; i2 < iH; i2++) {
            RecyclerView.e0 e0VarO = RecyclerView.O(recyclerView.y.g(i2));
            if (e0VarO.c == i && !e0VarO.h()) {
                return null;
            }
        }
        RecyclerView.v vVar = recyclerView.v;
        if (j == Long.MAX_VALUE) {
            try {
                if (yra.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.W(false);
                Trace.endSection();
            }
        }
        recyclerView.V();
        RecyclerView.e0 e0VarL = vVar.l(i, j);
        if (e0VarL != null) {
            if (!e0VarL.g() || e0VarL.h()) {
                vVar.a(e0VarL, false);
            } else {
                vVar.i(e0VarL.a);
            }
        }
        return e0VarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.M) {
            if (RecyclerView.W0 && !this.t.contains(recyclerView)) {
                aa0.c("attempting to post unregistered view!");
                return;
            } else if (this.u == 0) {
                this.u = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.A0;
        bVar.a = i;
        bVar.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.t;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            b bVar = recyclerView3.A0;
            if (windowVisibility == 0) {
                bVar.b(recyclerView3, false);
                i += bVar.d;
            }
        }
        ArrayList<c> arrayList2 = this.w;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.A0;
                int iAbs = Math.abs(bVar2.b) + Math.abs(bVar2.a);
                for (?? r11 = z; r11 < bVar2.d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i4);
                    }
                    int[] iArr = bVar2.c;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    cVar2.a = z;
                    cVar2.b = iAbs;
                    cVar2.c = i5;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, y);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i6)).d) != null; i6++) {
            RecyclerView.e0 e0VarC = c(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j);
            if (e0VarC != null && e0VarC.b != null && e0VarC.g() && !e0VarC.h() && (recyclerView2 = e0VarC.b.get()) != null) {
                if (recyclerView2.a0 && recyclerView2.y.h() != 0) {
                    RecyclerView.v vVar = recyclerView2.v;
                    RecyclerView.l lVar = recyclerView2.j0;
                    if (lVar != null) {
                        lVar.j();
                    }
                    RecyclerView.o oVar = recyclerView2.G;
                    if (oVar != null) {
                        oVar.q0(vVar);
                        recyclerView2.G.r0(vVar);
                    }
                    vVar.a.clear();
                    vVar.g();
                }
                b bVar3 = recyclerView2.A0;
                bVar3.b(recyclerView2, true);
                if (bVar3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        RecyclerView.a0 a0Var = recyclerView2.B0;
                        RecyclerView.f fVar = recyclerView2.F;
                        a0Var.d = 1;
                        a0Var.e = fVar.f();
                        a0Var.g = false;
                        a0Var.h = false;
                        a0Var.i = false;
                        for (int i7 = 0; i7 < bVar3.d * 2; i7 += 2) {
                            c(recyclerView2, bVar3.c[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.t;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.v);
                }
            }
        } finally {
            this.u = 0L;
            Trace.endSection();
        }
    }
}
