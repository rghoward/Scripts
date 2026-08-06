package defpackage;

import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.core.view.insets.a;
import androidx.core.view.insets.b;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qe8 implements u7a.c {
    public final ArrayList<a> a = new ArrayList<>();
    public final u7a b;
    public xd5 c;
    public xd5 d;
    public int e;
    public boolean f;

    public qe8(u7a u7aVar, ArrayList arrayList) {
        xd5 xd5Var = xd5.e;
        this.c = xd5Var;
        this.d = xd5Var;
        f(arrayList, false);
        f(arrayList, true);
        ArrayList<u7a.c> arrayList2 = u7aVar.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            d(u7aVar.c, u7aVar.d);
            e(u7aVar.e);
        }
        this.b = u7aVar;
    }

    @Override // u7a.c
    public final void a() {
        this.e++;
    }

    @Override // u7a.c
    public final void b() {
        int i = this.e;
        boolean z = i > 0;
        int i2 = i - 1;
        this.e = i2;
        if (z && i2 == 0) {
            g();
        }
    }

    @Override // u7a.c
    public final void c(int i, xd5 xd5Var, RectF rectF) {
        xd5 xd5Var2 = this.d;
        ArrayList<a> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = arrayList.get(size);
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                a.C0012a c0012a = aVar.b;
                if (!c0012a.d) {
                    c0012a.d = true;
                    a.C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
                    if (interfaceC0013a != null) {
                        ((b) interfaceC0013a).b.setVisibility(0);
                    }
                }
                if (i2 == 1) {
                    int i3 = xd5Var2.a;
                    if (i3 > 0) {
                        aVar.c(xd5Var.a / i3);
                    }
                    aVar.b(rectF.left);
                } else if (i2 == 2) {
                    int i4 = xd5Var2.b;
                    if (i4 > 0) {
                        aVar.c(xd5Var.b / i4);
                    }
                    aVar.b(rectF.top);
                } else if (i2 == 4) {
                    int i5 = xd5Var2.c;
                    if (i5 > 0) {
                        aVar.c(xd5Var.c / i5);
                    }
                    aVar.b(rectF.right);
                } else if (i2 == 8) {
                    int i6 = xd5Var2.d;
                    if (i6 > 0) {
                        aVar.c(xd5Var.d / i6);
                    }
                    aVar.b(rectF.bottom);
                }
            }
        }
    }

    @Override // u7a.c
    public final void d(xd5 xd5Var, xd5 xd5Var2) {
        this.c = xd5Var;
        this.d = xd5Var2;
        g();
    }

    @Override // u7a.c
    public final void e(int i) {
        ArrayList<a> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).a(i);
        }
    }

    public final void f(List<a> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            aVar.getClass();
            if ((aVar instanceof ei1) == z) {
                qe8 qe8Var = aVar.e;
                if (qe8Var != null) {
                    throw new IllegalStateException(aVar + " (" + (i + 1) + AgentHeaderCreator.AGENT_DIVIDER + size + ") is already controlled by " + qe8Var + " but is still added to " + this);
                }
                aVar.e = this;
                this.a.add(aVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e A[PHI: r7
      0x007e: PHI (r7v6 int) = (r7v5 int), (r7v9 int), (r7v11 int), (r7v13 int) binds: [B:48:0x00ec, B:40:0x00c6, B:32:0x00a0, B:23:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public final void g() {
        int i;
        xd5 xd5VarC;
        ArrayList<a> arrayList = this.a;
        xd5 xd5Var = xd5.e;
        xd5 xd5VarA = xd5Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = arrayList.get(size);
            xd5 xd5Var2 = this.c;
            xd5 xd5Var3 = this.d;
            aVar.c = xd5Var2;
            a.C0012a c0012a = aVar.b;
            aVar.d = xd5Var3;
            if (!c0012a.c.equals(xd5VarA)) {
                c0012a.c = xd5VarA;
                a.C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
                if (interfaceC0013a != null) {
                    b bVar = (b) interfaceC0013a;
                    FrameLayout.LayoutParams layoutParams = bVar.a;
                    layoutParams.leftMargin = xd5VarA.a;
                    layoutParams.topMargin = xd5VarA.b;
                    layoutParams.rightMargin = xd5VarA.c;
                    layoutParams.bottomMargin = xd5VarA.d;
                    bVar.b.setLayoutParams(layoutParams);
                }
            }
            int i2 = aVar.a;
            if (i2 == 1) {
                i = aVar.c.a;
                int i3 = aVar.d.a;
                if (c0012a.a != i3) {
                    c0012a.a = i3;
                    a.C0012a.InterfaceC0013a interfaceC0013a2 = c0012a.i;
                    if (interfaceC0013a2 != null) {
                        b bVar2 = (b) interfaceC0013a2;
                        FrameLayout.LayoutParams layoutParams2 = bVar2.a;
                        layoutParams2.width = i3;
                        bVar2.b.setLayoutParams(layoutParams2);
                    }
                }
                if (aVar instanceof ei1) {
                    xd5VarC = xd5.c(i, 0, 0, 0);
                } else {
                    xd5VarC = xd5Var;
                }
            } else if (i2 == 2) {
                i = aVar.c.b;
                int i4 = aVar.d.b;
                if (c0012a.b != i4) {
                    c0012a.b = i4;
                    a.C0012a.InterfaceC0013a interfaceC0013a3 = c0012a.i;
                    if (interfaceC0013a3 != null) {
                        b bVar3 = (b) interfaceC0013a3;
                        FrameLayout.LayoutParams layoutParams3 = bVar3.a;
                        layoutParams3.height = i4;
                        bVar3.b.setLayoutParams(layoutParams3);
                    }
                }
                if (aVar instanceof ei1) {
                    xd5VarC = xd5.c(0, i, 0, 0);
                } else {
                    xd5VarC = xd5Var;
                }
            } else if (i2 == 4) {
                i = aVar.c.c;
                int i5 = aVar.d.c;
                if (c0012a.a != i5) {
                    c0012a.a = i5;
                    a.C0012a.InterfaceC0013a interfaceC0013a4 = c0012a.i;
                    if (interfaceC0013a4 != null) {
                        b bVar4 = (b) interfaceC0013a4;
                        FrameLayout.LayoutParams layoutParams4 = bVar4.a;
                        layoutParams4.width = i5;
                        bVar4.b.setLayoutParams(layoutParams4);
                    }
                }
                if (aVar instanceof ei1) {
                    xd5VarC = xd5.c(0, 0, i, 0);
                } else {
                    xd5VarC = xd5Var;
                }
            } else if (i2 != 8) {
                xd5VarC = xd5Var;
                i = 0;
            } else {
                i = aVar.c.d;
                int i6 = aVar.d.d;
                if (c0012a.b != i6) {
                    c0012a.b = i6;
                    a.C0012a.InterfaceC0013a interfaceC0013a5 = c0012a.i;
                    if (interfaceC0013a5 != null) {
                        b bVar5 = (b) interfaceC0013a5;
                        FrameLayout.LayoutParams layoutParams5 = bVar5.a;
                        layoutParams5.height = i6;
                        bVar5.b.setLayoutParams(layoutParams5);
                    }
                }
                if (aVar instanceof ei1) {
                    xd5VarC = xd5.c(0, 0, 0, i);
                } else {
                    xd5VarC = xd5Var;
                }
            }
            boolean z = i > 0;
            if (c0012a.d != z) {
                c0012a.d = z;
                a.C0012a.InterfaceC0013a interfaceC0013a6 = c0012a.i;
                if (interfaceC0013a6 != null) {
                    ((b) interfaceC0013a6).b.setVisibility(z ? 0 : 8);
                }
            }
            float f = 0.0f;
            aVar.b(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            aVar.c(f);
            xd5VarA = xd5.a(xd5VarA, xd5VarC);
        }
    }
}
